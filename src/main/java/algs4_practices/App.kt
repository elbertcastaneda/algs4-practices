package algs4_practices

import edu.princeton.cs.algs4.Average
import edu.princeton.cs.algs4.Counter
import edu.princeton.cs.algs4.Date
import edu.princeton.cs.algs4.RandomSeq
import edu.princeton.cs.algs4.Transaction
import edu.princeton.cs.algs4.Vector
import algs4_practices.programming_model.*
import algs4_practices.bags_queues_and_stacks.*
import algs4_practices.data_abstraction.*

private const val RANDOM_SEQ = "RandomSeq"
private const val AVERAGE = "Average"
private const val RIGHT_TRIANGLE = "RightTriangle"
private const val TONE = "Tone"
private const val SCALE = "Scale"
private const val BINOMIAL = "Binomial"
private const val SATTOLO = "Sattolo"
private const val WGET = "Wget"
private const val BOUNCING_BALL = "BouncingBall"
private const val INDEX_OF = "IndexOf"
private const val COUNTER = "Counter"
private const val DATE = "Date"
private const val TRANSACTION = "Transaction"
private const val VECTOR = "Vector"
private const val FLIPS = "Flips"
private const val FLIPS_MAX = "FlipsMax"
private const val ROLLS = "Rolls"
private const val STATS = "Stats"

private val commandsAllowed = setOf(
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
    COUNTER,
    DATE,
    TRANSACTION,
    VECTOR,
    FLIPS,
    FLIPS_MAX,
    ROLLS,
    STATS
)

private data class ActionArgs(val action: String, val args: Array<String>) {
    fun isAction(action: String) = this.action == action
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ActionArgs

        if (action != other.action) return false
        if (!args.contentEquals(other.args)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = action.hashCode()
        result = 31 * result + args.contentHashCode()
        return result
    }
}

fun main(args: Array<String>) {
    try {
        val actionArgs = processArgs(args)

        programmingModelPractices(actionArgs)
        dataAbstractionPractices(actionArgs)
        bagsQueuesAndStacksPractices(actionArgs)
    } catch (e: Exception) {
        println(e.message)
    }
}

@Throws(Exception::class)
private fun processArgs(args: Array<String>): ActionArgs {
    if (args.isEmpty()) {
        throw Exception("We need a command in the first argument (${commandsAllowed.joinToString()})")
    }

    val action = args[0]

    if (!commandsAllowed.contains(action)) {
        throw Exception("The commands supported are: ${commandsAllowed.joinToString()}")
    }

    val args2Action = args.copyOfRange(1, args.size)

    return ActionArgs(action, args2Action)
}

/**
 * 1.1 Programming Model practices
 */
private fun programmingModelPractices(actionArgs: ActionArgs) {
    when {
        actionArgs.isAction(RANDOM_SEQ) -> RandomSeq.main(actionArgs.args)
        actionArgs.isAction(AVERAGE) -> Average.main(actionArgs.args)
        actionArgs.isAction(RIGHT_TRIANGLE) -> RightTriangle.main()
        actionArgs.isAction(TONE) -> Tone.main(actionArgs.args)
        actionArgs.isAction(SCALE) -> Scale.main(actionArgs.args)
        actionArgs.isAction(BINOMIAL) -> Binomial.main(actionArgs.args)
        actionArgs.isAction(SATTOLO) -> Sattolo.main(actionArgs.args)
        actionArgs.isAction(WGET) -> Wget.main(actionArgs.args)
        actionArgs.isAction(BOUNCING_BALL) -> BouncingBall.main(actionArgs.args)
        actionArgs.isAction(INDEX_OF) -> IndexOf.main(actionArgs.args)
    }
}

/**
 * 1.2 Data Abstractions practices
 */
private fun dataAbstractionPractices(actionArgs: ActionArgs) {
    when {
        actionArgs.isAction(COUNTER) -> Counter.main(actionArgs.args)
        actionArgs.isAction(DATE) -> Date.main(actionArgs.args)
        actionArgs.isAction(TRANSACTION) -> Transaction.main(actionArgs.args)
        actionArgs.isAction(VECTOR) -> Vector.main(actionArgs.args)
        actionArgs.isAction(FLIPS) -> Flips.main(actionArgs.args)
        actionArgs.isAction(FLIPS_MAX) -> FlipsMax.main(actionArgs.args)
        actionArgs.isAction(ROLLS) -> Rolls.main(actionArgs.args)
    }
}

/**
 * 1.3 Bags, Queues, and Stacks
 */
private fun bagsQueuesAndStacksPractices(actionArgs: ActionArgs) {
    if (actionArgs.isAction(STATS)) {
        Stats.main(actionArgs.args)
    }
}
