package io.github.sdkei.hex.core

import org.junit.Assert.assertEquals
import org.junit.Test

class PseudoHexHTest {
    @Test
    fun test_toHexVector() {
        assertEquals(HexVectorH.UNIT_3 * 0 + HexVectorH.UNIT_5 * 0,
                PseudoHexH(0, 0).toHexVector())
        assertEquals(HexVectorH.UNIT_3 * 1 + HexVectorH.UNIT_5 * 0,
                PseudoHexH(1, 0).toHexVector())
        assertEquals(HexVectorH.UNIT_3 * 2 + HexVectorH.UNIT_5 * 0,
                PseudoHexH(2, 0).toHexVector())

        assertEquals(HexVectorH.UNIT_3 * 0 + HexVectorH.UNIT_5 * 1,
                PseudoHexH(0, 1).toHexVector())
        assertEquals(HexVectorH.UNIT_3 * 1 + HexVectorH.UNIT_5 * 1,
                PseudoHexH(1, 1).toHexVector())
        assertEquals(HexVectorH.UNIT_3 * 2 + HexVectorH.UNIT_5 * 1,
                PseudoHexH(2, 1).toHexVector())

        assertEquals(HexVectorH.UNIT_3 * -1 + HexVectorH.UNIT_5 * 2,
                PseudoHexH(0, 2).toHexVector())
        assertEquals(HexVectorH.UNIT_3 * 0 + HexVectorH.UNIT_5 * 2,
                PseudoHexH(1, 2).toHexVector())
        assertEquals(HexVectorH.UNIT_3 * 1 + HexVectorH.UNIT_5 * 2,
                PseudoHexH(2, 2).toHexVector())
    }

    @Test
    fun test_toPseudoHexVectorH() {
        assertEquals(PseudoHexH(0, 0),
                (HexVectorH.UNIT_3 * 0 + HexVectorH.UNIT_5 * 0).toPseudoHex())
        assertEquals(PseudoHexH(1, 0),
                (HexVectorH.UNIT_3 * 1 + HexVectorH.UNIT_5 * 0).toPseudoHex())
        assertEquals(PseudoHexH(2, 0),
                (HexVectorH.UNIT_3 * 2 + HexVectorH.UNIT_5 * 0).toPseudoHex())

        assertEquals(PseudoHexH(0, 1),
                (HexVectorH.UNIT_3 * 0 + HexVectorH.UNIT_5 * 1).toPseudoHex())
        assertEquals(PseudoHexH(1, 1),
                (HexVectorH.UNIT_3 * 1 + HexVectorH.UNIT_5 * 1).toPseudoHex())
        assertEquals(PseudoHexH(2, 1),
                (HexVectorH.UNIT_3 * 2 + HexVectorH.UNIT_5 * 1).toPseudoHex())

        assertEquals(PseudoHexH(1, 2),
                (HexVectorH.UNIT_3 * 0 + HexVectorH.UNIT_5 * 2).toPseudoHex())
        assertEquals(PseudoHexH(2, 2),
                (HexVectorH.UNIT_3 * 1 + HexVectorH.UNIT_5 * 2).toPseudoHex())
        assertEquals(PseudoHexH(3, 2),
                (HexVectorH.UNIT_3 * 2 + HexVectorH.UNIT_5 * 2).toPseudoHex())
    }
}