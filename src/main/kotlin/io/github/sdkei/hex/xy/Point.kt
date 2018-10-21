package io.github.sdkei.hex.xy

data class Point(
        val x: Double,
        val y: Double
)

operator fun Point.unaryPlus() = this

operator fun Point.unaryMinus() =
        Point(-x, -y)

operator fun Point.plus(other: Point) =
        Point(this.x + other.x, this.y + other.y)

operator fun Point.minus(other: Point) =
        Point(this.x - other.x, this.y - other.y)

operator fun Point.times(scalar: Double) =
        Point(x * scalar, y * scalar)