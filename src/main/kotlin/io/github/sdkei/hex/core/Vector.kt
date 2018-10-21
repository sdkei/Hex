package io.github.sdkei.hex.core

import kotlin.math.absoluteValue

/**
 * An vector which represent absolute or relative position of a hex.
 *
 * It can't be created by using constructor.
 * It is got by property (such as [Vector.UNIT_0]) and operation (such as `+`, `-`).
 */
class Vector private constructor(
        /** An element of 0 O'clock. */
        private val _0: Int,
        /** An element of 2 O'clock. */
        private val _2: Int
) {
    companion object {
        /** Zero vector. */
        val ZERO = Vector(0, 0)

        /** Unit vector to 0 O'clock direction. */
        val UNIT_0 = Vector(1, 0)
        /** Unit vector to 2 O'clock direction. */
        val UNIT_2 = Vector(0, 1)
        /** Unit vector to 4 O'clock direction. */
        val UNIT_4 = Vector(-1, 1)
        /** Unit vector to 6 O'clock direction. */
        val UNIT_6 = Vector(-1, 0)
        /** Unit vector to 8 O'clock direction. */
        val UNIT_8 = Vector(0, -1)
        /** Unit vector to 10 O'clock direction. */
        val UNIT_10 = Vector(1, -1)

        /** Returns unit vector to specific side. */
        fun unitOf(side: Side): Vector = when (side) {
            Side._0 -> UNIT_0
            Side._2 -> UNIT_2
            Side._4 -> UNIT_4
            Side._6 -> UNIT_6
            Side._8 -> UNIT_8
            Side._10 -> UNIT_10
        }
    }

    operator fun plus(other: Vector) =
            Vector(this._0 + other._0, this._2 + other._2)

    operator fun minus(other: Vector) =
            Vector(this._0 - other._0, this._2 - other._2)

    operator fun times(scalar: Int) =
            Vector(_0 * scalar, _2 * scalar)

    /** The length (number of hexes) of this vector. */
    val length: Int
        get() = if (_0 * _2 >= 0) {
            (_0 + _2).absoluteValue
        } else {
            (_0 - _2).absoluteValue
        }

    /** Returns each value of specified elements. */
    fun elementsOf(one: Side, other: Side): Pair<Int, Int> {
        require(one != other) { "Arguments `one` and `other` must not be same." }
        require(one.opposite != other) { "Arguments `one` and `other` must not be opposite." }

        TODO()
    }

    override fun toString(): String = "<$_0 to 0 o'clock direction, $_2 to 2 o'clock direction>"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Vector

        if (_0 != other._0) return false
        if (_2 != other._2) return false

        return true
    }

    override fun hashCode(): Int {
        var result = _0
        result = 31 * result + _2
        return result
    }
}
