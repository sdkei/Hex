package io.github.sdkei.hex.core

import io.github.sdkei.kotlin_jvm_utils.cyclicNext
import io.github.sdkei.kotlin_jvm_utils.cyclicPrev

/**
 * An apex of a hex.
 */
enum class Apex {
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

val Apex.clockwise: Apex
    get() = this.cyclicNext
val Apex.counterClockwise: Apex
    get() = this.cyclicPrev
val Apex.opposite: Apex
    get() = this.cyclicNext(3)
val Apex.clockwiseSide: Side
    get() = this.counterClockwiseSide.cyclicNext
val Apex.counterClockwiseSide: Side
    get() = Side.values().let { it[this.ordinal] }