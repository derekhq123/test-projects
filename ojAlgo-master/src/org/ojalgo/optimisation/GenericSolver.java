/*
 * Copyright 1997-2017 Optimatika
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.ojalgo.optimisation;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

import org.ojalgo.ProgrammingError;
import org.ojalgo.access.Access1D;
import org.ojalgo.access.Access2D;
import org.ojalgo.matrix.store.MatrixStore;
import org.ojalgo.netio.BasicLogger;

public abstract class GenericSolver implements Optimisation.Solver, Serializable {

    public static abstract class Builder<B extends Builder<?, ?>, S extends GenericSolver> {

        public Builder() {
            super();
        }

        public final S build() {
            return this.doBuild(new Optimisation.Options());
        }

        public final S build(final Optimisation.Options options) {
            ProgrammingError.throwIfNull(options);
            return this.doBuild(options);
        }

        public abstract int countConstraints();

        public abstract int countVariables();

        public abstract S doBuild(Optimisation.Options options);

    }

    public final Optimisation.Options options;

    private final AtomicInteger myIterationsCount = new AtomicInteger(0);
    private long myResetTime;
    private State myState = State.UNEXPLORED;

    @SuppressWarnings("unused")
    public GenericSolver() {
        this(new Optimisation.Options());
    }

    /**
     */
    public GenericSolver(final Optimisation.Options solverOptions) {

        super();

        ProgrammingError.throwIfNull(solverOptions);

        options = solverOptions;
    }

    public Optimisation.Result buildResult() {

        final MatrixStore<Double> tmpSolution = this.extractSolution();
        final double tmpValue = this.evaluateFunction(tmpSolution);
        final Optimisation.State tmpState = this.getState();

        return new Optimisation.Result(tmpState, tmpValue, tmpSolution);
    }

    public final int countIterations() {
        return myIterationsCount.get();
    }

    public final long countTime() {
        return System.currentTimeMillis() - myResetTime;
    }

    public final void debug(final String descripttion, final Access2D<?> matrix) {
        if (options.debug_appender != null) {
            options.debug_appender.printmtrx(descripttion, matrix, options.print);
        }
    }

    public final void debug(final String messagePattern, final Object... arguments) {
        if (options.debug_appender != null) {
            options.debug_appender.println(messagePattern, arguments);
        }
    }

    public final void error(final String messagePattern, final Object... arguments) {
        BasicLogger.error(messagePattern, arguments);
    }

    public abstract double evaluateFunction(final Access1D<?> solution);

    /**
     * Should be able to feed this to {@link #evaluateFunction(Access1D)}.
     */
    public abstract MatrixStore<Double> extractSolution();

    public final State getState() {
        return myState;
    }

    /**
     * Should be called after a completed iteration. The iterations count is not "1" untill the first
     * iteration is completed.
     */
    public final int incrementIterationsCount() {
        return myIterationsCount.incrementAndGet();
    }

    public final boolean isDebug() {
        return (options.debug_appender != null) && (options.debug_solver.isAssignableFrom(this.getClass()));
    }

    /**
     * Should be called at the start of an iteration (before it actually starts) to check if you should abort
     * instead. Will return false if either the iterations count or the execution time has reached their
     * respective limits.
     */
    public final boolean isIterationAllowed() {

        final int tmpIterations = this.countIterations();
        final long tmpTime = this.countTime();

        final boolean tmpIterationOk = tmpIterations < options.iterations_abort;
        final boolean tmpTimeOk = tmpTime < options.time_abort;

        //        if (this.isDebug()) {
        //            this.logDebug("Iterations OK? {} {} < {}", tmpIterationOk, tmpIterations, options.iterations_abort);
        //            this.logDebug("Time OK? {} {} < {}", tmpTimeOk, tmpTime, options.time_abort);
        //        }

        return tmpTimeOk && tmpIterationOk;
    }

    public final void resetIterationsCount() {
        myIterationsCount.set(0);
        myResetTime = System.currentTimeMillis();
    }

    public final void setState(final State aState) {
        myState = aState;
    }

}
