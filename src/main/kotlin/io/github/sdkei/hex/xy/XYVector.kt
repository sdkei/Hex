package io.github.sdkei.hex.xy

import io.github.sdkei.hex.core.ApexH
import io.github.sdkei.hex.core.HexVectorH
import io.github.sdkei.hex.core.SideH
import kotlin.math.sqrt

private val DISTANCE_BETWEEN_CENTERS: Double = 1.0

private val DISTANCE_BETWEEN_CENTER_AND_SIDE: Double = DISTANCE_BETWEEN_CENTERS / 2.0
private val DISTANCE_BETWEEN_OPPOSITE_SIDES = DISTANCE_BETWEEN_CENTERS

private val DISTANCE_BETWEEN_OPPOSITE_APEXES: Double = DISTANCE_BETWEEN_OPPOSITE_SIDES / sqrt(3.0) * 2.0
private val DISTANCE_BETWEEN_APEXES: Double = DISTANCE_BETWEEN_OPPOSITE_SIDES / sqrt(3.0) * 1.0

private val DISTANCE_BETWEEN_MIDDLE_OF_SIDE_AND_APEX = DISTANCE_BETWEEN_APEXES / 2.0
private val DISTANCE_BETWEEN_CENTER_AND_APEX: Double = DISTANCE_BETWEEN_OPPOSITE_APEXES / 2.0

private val DISTANCE_BETWEEN_CENTER_AND_APEX_AND_MIDDLE_OF_SIDE =
        DISTANCE_BETWEEN_CENTER_AND_APEX + DISTANCE_BETWEEN_MIDDLE_OF_SIDE_AND_APEX

/**
 * A vector in XY 2-dimensional rectangular coordinates.
 *
 * This is immutable.
 */
data class XYVector(
        val x: Double,
        val y: Double
) {
    companion object {
        internal val OF_UNIT_HEX_VECTOR_1 = XYVector(
                +DISTANCE_BETWEEN_CENTER_AND_SIDE,
                -DISTANCE_BETWEEN_CENTER_AND_APEX_AND_MIDDLE_OF_SIDE)
        internal val OF_UNIT_HEX_VECTOR_3 = XYVector(
                +DISTANCE_BETWEEN_CENTERS,
                0.0)
        internal val OF_UNIT_HEX_VECTOR_5 = XYVector(
                +DISTANCE_BETWEEN_CENTER_AND_SIDE,
                +DISTANCE_BETWEEN_CENTER_AND_APEX_AND_MIDDLE_OF_SIDE)
        internal val OF_UNIT_HEX_VECTOR_7 = XYVector(
                -DISTANCE_BETWEEN_CENTER_AND_SIDE,
                +DISTANCE_BETWEEN_CENTER_AND_APEX_AND_MIDDLE_OF_SIDE)
        internal val OF_UNIT_HEX_VECTOR_9 = XYVector(
                -DISTANCE_BETWEEN_CENTERS,
                0.0)
        internal val OF_UNIT_HEX_VECTOR_11 = XYVector(
                -DISTANCE_BETWEEN_CENTER_AND_SIDE,
                -DISTANCE_BETWEEN_CENTER_AND_APEX_AND_MIDDLE_OF_SIDE)
    }
}

operator fun XYVector.unaryPlus() = this

operator fun XYVector.unaryMinus() =
        XYVector(-x, -y)

operator fun XYVector.plus(other: XYVector) =
        XYVector(this.x + other.x, this.y + other.y)

operator fun XYVector.minus(other: XYVector) =
        XYVector(this.x - other.x, this.y - other.y)

operator fun XYVector.times(scalar: Double) =
        XYVector(x * scalar, y * scalar)

operator fun XYVector.div(scalar: Double) =
        XYVector(x / scalar, y / scalar)

fun HexVectorH.toXYVector(): XYVector {
    val (_3, _5) = elementsOf(SideH._3, SideH._5)
    return XYVector.OF_UNIT_HEX_VECTOR_3 * _3.toDouble() +
            XYVector.OF_UNIT_HEX_VECTOR_5 * _5.toDouble()
}

/**
 * Returns [XYVector] which is from center of a hex to `this` apex.
 */
fun ApexH.toXYVector(): XYVector = when (this) {
    ApexH._0 -> XYVector(
            0.0,
            -DISTANCE_BETWEEN_CENTER_AND_APEX)
    ApexH._2 -> XYVector(
            +DISTANCE_BETWEEN_CENTER_AND_SIDE,
            -DISTANCE_BETWEEN_MIDDLE_OF_SIDE_AND_APEX)
    ApexH._4 -> XYVector(
            +DISTANCE_BETWEEN_CENTER_AND_SIDE,
            +DISTANCE_BETWEEN_MIDDLE_OF_SIDE_AND_APEX)
    ApexH._6 -> XYVector(
            0.0,
            +DISTANCE_BETWEEN_CENTER_AND_APEX)
    ApexH._8 -> XYVector(
            -DISTANCE_BETWEEN_CENTER_AND_SIDE,
            +DISTANCE_BETWEEN_MIDDLE_OF_SIDE_AND_APEX)
    ApexH._10 -> XYVector(
            -DISTANCE_BETWEEN_CENTER_AND_SIDE,
            -DISTANCE_BETWEEN_MIDDLE_OF_SIDE_AND_APEX)
}

/**
 * Returns a vector from center to middle of specific side of a hex.
 */
fun SideH.toXYVector(): XYVector = when (this) {
    SideH._1 -> XYVector.OF_UNIT_HEX_VECTOR_1
    SideH._3 -> XYVector.OF_UNIT_HEX_VECTOR_3
    SideH._5 -> XYVector.OF_UNIT_HEX_VECTOR_5
    SideH._7 -> XYVector.OF_UNIT_HEX_VECTOR_7
    SideH._9 -> XYVector.OF_UNIT_HEX_VECTOR_9
    SideH._11 -> XYVector.OF_UNIT_HEX_VECTOR_11
} / 2.0