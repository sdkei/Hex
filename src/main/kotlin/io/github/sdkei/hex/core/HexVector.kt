package io.github.sdkei.hex.core

import kotlin.math.absoluteValue

/**
 * A vector which represent logical location (absolute or relative) of a hex.
 *
 * It can't be created by using constructor.
 * It is got by property (such as [HexVector.UNIT_1]) and operation (such as `+`, `-`).
 */
class HexVector private constructor(
        /** An element of 3 O'clock direction. */
        private val _3: Int,
        /** An element of 5 O'clock direction. */
        private val _5: Int
) {
    companion object {
        /** Zero vector. */
        val ZERO = HexVector(0, 0)

        /** Unit vector to 1 O'clock direction. */
        val UNIT_1 = HexVector(1, -1)
        /** Unit vector to 3 O'clock direction. */
        val UNIT_3 = HexVector(1, 0)
        /** Unit vector to 5 O'clock direction. */
        val UNIT_5 = HexVector(0, 1)
        /** Unit vector to 7 O'clock direction. */
        val UNIT_7 = HexVector(-1, 1)
        /** Unit vector to 9 O'clock direction. */
        val UNIT_9 = HexVector(-1, 0)
        /** Unit vector to 11 O'clock direction. */
        val UNIT_11 = HexVector(0, -1)

        /** Returns unit vector to specified side of `this`. */
        fun unitOf(side: Side): HexVector = when (side) {
            Side._1 -> UNIT_1
            Side._3 -> UNIT_3
            Side._5 -> UNIT_5
            Side._7 -> UNIT_7
            Side._9 -> UNIT_9
            Side._11 -> UNIT_11
        }
    }

    operator fun unaryPlus() = this

    operator fun unaryMinus() =
            HexVector(-_3, -_5)

    operator fun plus(other: HexVector) =
            HexVector(this._3 + other._3, this._5 + other._5)

    operator fun minus(other: HexVector) =
            HexVector(this._3 - other._3, this._5 - other._5)

    operator fun times(scalar: Int) =
            HexVector(_3 * scalar, _5 * scalar)

    /** The length (number of hexes) of this vector. */
    val length: Int
        get() = if (_3 * _5 >= 0) {
            (_3 + _5).absoluteValue
        } else {
            (_3 - _5).absoluteValue
        }

    /** Returns each value of specified elements. */
    fun elementsOf(one: Side, other: Side): Pair<Int, Int> {
        require(one != other) { "Arguments `one` and `other` must not be same. one and other: $one" }
        require(one.opposite != other) { "Arguments `one` and `other` must not be opposite. one: $one, other: $other" }

        TODO()
    }

    override fun toString(): String = "<$_3 to 3 o'clock direction, $_5 to 5 o'clock direction>"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as HexVector

        if (_3 != other._3) return false
        if (_5 != other._5) return false

        return true
    }

    override fun hashCode(): Int {
        var result = _3
        result = 31 * result + _5
        return result
    }
}
