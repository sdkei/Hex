package io.github.sdkei.hex.xy

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