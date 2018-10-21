package io.github.sdkei.hex.core

import io.github.sdkei.kotlin_jvm_utils.cyclicNext
import io.github.sdkei.kotlin_jvm_utils.cyclicPrev

/**
 * An apex of a hex which aligns horizontally.
 */
enum class ApexH {
    /** An apex of 0 O'clock direction. */
    _0,
    /** An apex of 2 O'clock direction. */
    _2,
    /** An apex of 4 O'clock direction. */
    _4,
    /** An apex of 6 O'clock direction. */
    _6,
    /** An apex of 8 O'clock direction. */
    _8,
    /** An apex of 10 O'clock direction. */
    _10,
    ;
}

val ApexH.clockwise: ApexH
    get() = this.cyclicNext
val ApexH.counterClockwise: ApexH
    get() = this.cyclicPrev
val ApexH.opposite: ApexH
    get() = this.cyclicNext(3)
val ApexH.clockwiseSide: SideH
    get() = this.counterClockwiseSide.cyclicNext
val ApexH.counterClockwiseSide: SideH
    get() = SideH.values().let { it[this.ordinal] }