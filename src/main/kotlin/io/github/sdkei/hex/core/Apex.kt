package io.github.sdkei.hex.core

import io.github.sdkei.kotlin_jvm_utils.cyclicNext
import io.github.sdkei.kotlin_jvm_utils.cyclicPrev

/**
 * An apex of a hex.
 */
enum class Apex {
    /** An apex of 1 O'clock direction. */
    _1,
    /** An apex of 3 O'clock direction. */
    _3,
    /** An apex of 5 O'clock direction. */
    _5,
    /** An apex of 7 O'clock direction. */
    _7,
    /** An apex of 9 O'clock direction. */
    _9,
    /** An apex of 11 O'clock direction. */
    _11,
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