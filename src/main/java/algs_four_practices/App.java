/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package algs_four_practices;

import java.util.Arrays;
import java.util.Set;

import edu.princeton.cs.algs4.Average;
import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.RandomSeq;
import edu.princeton.cs.algs4.Transaction;
import edu.princeton.cs.algs4.Vector;

import algs_four_practices.programming_model.*;
import algs_four_practices.data_abstraction.*;

public class App {

    /** ProgrammingModel 1.1 */
    private static final String RANDOM_SEQ = "RandomSeq";
    private static final String AVERAGE = "Average";

    private static final String RIGHT_TRIANGULE = "RightTriangule";
    private static final String TONE = "Tone";
    private static final String SCALE = "Scale";
    private static final String BINOMIAL = "Binomial";
    private static final String SATTOLO = "Sattolo";
    private static final String WGET = "Wget";
    private static final String BOUNCING_BALL = "BouncingBall";
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

    private static final Set<String> commandsAllowed = Set.of(
        /** ProgrammingModel 1.1 */
        RANDOM_SEQ,
        AVERAGE,

        RIGHT_TRIANGULE,
        TONE,
        SCALE,
        BINOMIAL,
        SATTOLO,
        WGET,
        BOUNCING_BALL,
        /** **/
        /** DataAbstraction 1.2 */
        COUNTER,
        DATE,
        TRANSACTION,
        VECTOR,

        FLIPS,
        FLIPS_MAX,
        ROLLS
        /** **/
    );

    private static class ActionArgs {
        public String action;
        public String[] args;

        public ActionArgs(String action, String[] args) {
            this.action = action;
            this.args = args;
        }

        public boolean is(String action) {
            return this.action.equals(action);
        }
    }

    public static void main(final String[] args) {
        try {
            ActionArgs actionArgs = processArgs(args);

            programmingModelPractices(actionArgs);
            dataAbstractionPractices(actionArgs);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static ActionArgs processArgs(String[] args) throws Exception {
        if (args.length < 1) {
            throw new Exception(
                "We need a command in the first argument (" + commandsAllowed.toString() + ")"
            );
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
     * @param actionArgs
     */
    public static void programmingModelPractices(ActionArgs actionArgs) {
        if (actionArgs.is(RANDOM_SEQ)) {
            RandomSeq.main(actionArgs.args);
        }

        if (actionArgs.is(AVERAGE)) {
            Average.main(actionArgs.args);
        }

        if (actionArgs.is(RIGHT_TRIANGULE)) {
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
    }

    /**
     * 1.2 Data Abstractions practices
     * @param actionArgs
     */
    public static void dataAbstractionPractices(ActionArgs actionArgs) {
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
}