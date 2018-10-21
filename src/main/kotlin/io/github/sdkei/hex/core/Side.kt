package io.github.sdkei.hex.core

import io.github.sdkei.kotlin_jvm_utils.cyclicNext
import io.github.sdkei.kotlin_jvm_utils.cyclicPrev

/**
 * A side (edge) of a hex.
 */
enum class Side {
    /** A side of 1 O'clock direction. */
    _1,
    /** A side of 3 O'clock direction. */
    _3,
    /** A side of 5 O'clock direction. */
    _5,
    /** A side of 7 O'clock direction. */
    _7,
    /** A side of 9 O'clock direction. */
    _9,
    /** A side of 11 O'clock direction. */
    _11,
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
val Side.unitVector: HexVector
    get() = HexVector.unitOf(this)