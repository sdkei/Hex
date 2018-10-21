package io.github.sdkei.hex.core

import io.github.sdkei.kotlin_jvm_utils.cyclicNext
import io.github.sdkei.kotlin_jvm_utils.cyclicPrev

/**
 * A side (edge) of a hex.
 */
enum class Side {
    /** A side of 0 O'clock direction. */
    _0,
    /** A side of 2 O'clock direction. */
    _2,
    /** A side of 4 O'clock direction. */
    _4,
    /** A side of 6 O'clock direction. */
    _6,
    /** A side of 8 O'clock direction. */
    _8,
    /** A side of 10 O'clock direction. */
    _10,
    ;
}

val Side.clockwise: Side
    get() = this.cyclicNext
val Side.counterClockwise: Side
    get() = this.cyclicPrev
val Side.opposite: Side
    get() = this.cyclicNext(3)
val Side.clockwiseApex: Apex
    get() = Apex.values().let { it[this.ordinal] }
val Side.counterClockwiseApex: Apex
    get() = this.clockwiseApex.cyclicPrev
val Side.unitVector: Vector
    get() = Vector.unitOf(this)