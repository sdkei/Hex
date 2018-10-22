package io.github.sdkei.hex.core

/**
 * Absolute logical location of a hex,
 * which aligns horizontally,
 * on pseudo hex plane represented by 2-dimensional array.
 *
 * ```
 * ↓y x→
 * 0  |0|1|2|3|_
 * 1  _|0|1|2|3|
 * 2  |0|1|2|3|_
 * 3  _|0|1|2|3|
 * ```
 */
data class PseudoHexH(
        val x: Int,
        val y: Int
)

fun PseudoHexH.toHexVector(): HexVectorH =
        HexVectorH.UNIT_3 * (x - y / 2) +
                HexVectorH.UNIT_5 * y

fun HexVectorH.toPseudoHex(): PseudoHexH {
    val (_3, _5) = elementsOf(SideH._3, SideH._5)
    return PseudoHexH(
            _3 + _5 / 2,
            _5)
}