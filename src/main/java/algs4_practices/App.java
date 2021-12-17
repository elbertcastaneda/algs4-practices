/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package algs4_practices;

import java.util.Arrays;
import java.util.Set;

import edu.princeton.cs.algs4.Average;
import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.RandomSeq;
import edu.princeton.cs.algs4.Transaction;
import edu.princeton.cs.algs4.Vector;

import algs4_practices.programming_model.*;
import algs4_practices.bags_queues_and_stacks.*;
import algs4_practices.data_abstraction.*;

public class App {

    /** ProgrammingModel 1.1 */
    private static final String RANDOM_SEQ = "RandomSeq";
    private static final String AVERAGE = "Average";

    private static final String RIGHT_TRIANGLE = "RightTriangle";
    private static final String TONE = "Tone";
    private static final String SCALE = "Scale";
    private static final String BINOMIAL = "Binomial";
    private static final String SATTOLO = "Sattolo";
    private static final String WGET = "Wget";
    private static final String BOUNCING_BALL = "BouncingBall";
    private static final String INDEX_OF = "IndexOf";
    /** **/

    /** DataAbstraction 1.2 */
    private static final String COUNTER = "Counter";
    private static final String DATE = "Date";
    private static final String TRANSACTION = "Transaction";
    private static final String VECTOR = "Vector";

    private static final String FLIPS = "Flips";
    private static final String FLIPS_MAX = "FlipsMax";
    private static final String ROLLS = "Rolls";
    /** **/

    /** DataAbstraction 1.2 */
    private static final String STATS = "Stats";
    /** **/

    private static final Set<String> commandsAllowed = Set.of(
        /** ProgrammingModel 1.1 */
        RANDOM_SEQ,
        AVERAGE,

        RIGHT_TRIANGLE,
        TONE,
        SCALE,
        BINOMIAL,
        SATTOLO,
        WGET,
        BOUNCING_BALL,
        INDEX_OF,
        /** **/

        /** DataAbstraction 1.2 */
        COUNTER,
        DATE,
        TRANSACTION,
        VECTOR,

        FLIPS,
        FLIPS_MAX,
        ROLLS,
        /** **/

        /** Bags,Queues, and Stacks 1.3 */
        STATS
        /** **/
    );

    private static class ActionArgs {
        private String action;
        private String[] args;

        public ActionArgs(final String action, final String[] args) {
            this.action = action;
            this.args = args;
        }

        public boolean is(final String action) {
            return this.action.equals(action);
        }
    }

    public static void main(final String[] args) {
        try {
            final ActionArgs actionArgs = processArgs(args);

            programmingModelPractices(actionArgs);
            dataAbstractionPractices(actionArgs);
            bagsQueuesAndStacksPractices(actionArgs);
        } catch (final Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static ActionArgs processArgs(final String[] args) throws Exception {
        if (args.length < 1) {
            throw new Exception("We need a command in the first argument (" + commandsAllowed.toString() + ")");
        }

        final String action = args[0];

        if (!commandsAllowed.contains(action)) {
            throw new Exception("The commands supported are: " + commandsAllowed.toString());
        }

        final String[] args2Action = Arrays.copyOfRange(args, 1, args.length);

        return new ActionArgs(action, args2Action);
    }

    /**
     * 1.1 Programming Model practices
     *
     * @param actionArgs
     */
    public static void programmingModelPractices(final ActionArgs actionArgs) {
        if (actionArgs.is(RANDOM_SEQ)) {
            RandomSeq.main(actionArgs.args);
        }

        if (actionArgs.is(AVERAGE)) {
            Average.main(actionArgs.args);
        }

        if (actionArgs.is(RIGHT_TRIANGLE)) {
            RightTriangle.main();
        }

        if (actionArgs.is(TONE)) {
            Tone.main(actionArgs.args);
        }

        if (actionArgs.is(SCALE)) {
            Scale.main(actionArgs.args);
        }

        if (actionArgs.is(BINOMIAL)) {
            Binomial.main(actionArgs.args);
        }

        if (actionArgs.is(SATTOLO)) {
            Sattolo.main(actionArgs.args);
        }

        if (actionArgs.is(WGET)) {
            Wget.main(actionArgs.args);
        }

        if (actionArgs.is(BOUNCING_BALL)) {
            BouncingBall.main(actionArgs.args);
        }

        if (actionArgs.is(INDEX_OF)) {
            IndexOf.main(actionArgs.args);
        }
    }

    /**
     * 1.2 Data Abstractions practices
     *
     * @param actionArgs
     */
    public static void dataAbstractionPractices(final ActionArgs actionArgs) {
        if (actionArgs.is(COUNTER)) {
            Counter.main(actionArgs.args);
        }

        if (actionArgs.is(DATE)) {
            Date.main(actionArgs.args);
        }

        if (actionArgs.is(TRANSACTION)) {
            Transaction.main(actionArgs.args);
        }

        if (actionArgs.is(VECTOR)) {
            Vector.main(actionArgs.args);
        }

        if (actionArgs.is(FLIPS)) {
            Flips.main(actionArgs.args);
        }

        if (actionArgs.is(FLIPS_MAX)) {
            FlipsMax.main(actionArgs.args);
        }

        if (actionArgs.is(ROLLS)) {
            Rolls.main(actionArgs.args);
        }
    }

    /**
     * 1.3 Bags, Queues, and Stacks
     *
     * @param actionArgs
     */
    public static void bagsQueuesAndStacksPractices(final ActionArgs actionArgs) {
        if (actionArgs.is(STATS)) {
            Stats.main(actionArgs.args);
        }
    }
}