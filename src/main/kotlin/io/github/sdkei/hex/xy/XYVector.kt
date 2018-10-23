package io.github.sdkei.hex.xy

import io.github.sdkei.hex.core.ApexH
import kotlin.math.sqrt

private val DISTANCE_BETWEEN_ADJACENT_HEXES: Double = 1.0
private val DISTANCE_BETWEEN_CENTER_AND_SIDE: Double = DISTANCE_BETWEEN_ADJACENT_HEXES / 2.0
private val DISTANCE_BETWEEN_OPPOSITE_SIDE = DISTANCE_BETWEEN_ADJACENT_HEXES
private val DISTANCE_BETWEEN_OPPOSITE_APEXES: Double = DISTANCE_BETWEEN_OPPOSITE_SIDE / sqrt(3.0) * 2.0
private val DISTANCE_BETWEEN_CENTER_AND_APEX: Double = DISTANCE_BETWEEN_OPPOSITE_APEXES / 2.0
private val DISTANCE_BETWEEN_APEXES: Double = DISTANCE_BETWEEN_OPPOSITE_SIDE / sqrt(3.0) * 1.0
private val DISTANCE_BETWEEN_MIDDLE_OF_SIDE_AND_APEX = DISTANCE_BETWEEN_APEXES / 2.0

/**
 * A vector in XY 2-dimensional rectangular coordinates.
 *
 * This is immutable.
 */
data class XYVector(
        val x: Double,
        val y: Double
)

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

/**
 * Returns [XYVector] which is from center of a hex to `this` apex.
 */
fun ApexH.toXYVector(): XYVector {
    return when (this) {
        ApexH._0 -> XYVector(0.0, -DISTANCE_BETWEEN_CENTER_AND_APEX)
        ApexH._2 -> XYVector(+DISTANCE_BETWEEN_CENTER_AND_SIDE, -DISTANCE_BETWEEN_MIDDLE_OF_SIDE_AND_APEX)
        ApexH._4 -> XYVector(+DISTANCE_BETWEEN_CENTER_AND_SIDE, +DISTANCE_BETWEEN_MIDDLE_OF_SIDE_AND_APEX)
        ApexH._6 -> XYVector(0.0, +DISTANCE_BETWEEN_CENTER_AND_APEX)
        ApexH._8 -> XYVector(-DISTANCE_BETWEEN_CENTER_AND_SIDE, +DISTANCE_BETWEEN_MIDDLE_OF_SIDE_AND_APEX)
        ApexH._10 -> XYVector(-DISTANCE_BETWEEN_CENTER_AND_SIDE, -DISTANCE_BETWEEN_MIDDLE_OF_SIDE_AND_APEX)
    }
}