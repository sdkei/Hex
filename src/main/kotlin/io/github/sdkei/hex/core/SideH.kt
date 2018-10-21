package io.github.sdkei.hex.core

import io.github.sdkei.kotlin_jvm_utils.cyclicNext
import io.github.sdkei.kotlin_jvm_utils.cyclicPrev

/**
 * A side (edge) of a hex which aligns horizontally.
 */
enum class SideH {
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

val SideH.clockwise: SideH
    get() = this.cyclicNext
val SideH.counterClockwise: SideH
    get() = this.cyclicPrev
val SideH.opposite: SideH
    get() = this.cyclicNext(3)
val SideH.clockwiseApex: ApexH
    get() = ApexH.values().let { it[this.ordinal] }
val SideH.counterClockwiseApex: ApexH
    get() = this.clockwiseApex.cyclicPrev
val SideH.unitVector: HexVectorH
    get() = HexVectorH.unitOf(this)