package io.github.sdkei.hex.core

import org.junit.Assert.assertEquals
import org.junit.Test

class PseudoHexVectorHTest {
    @Test
    fun test_toHexVector() {
        assertEquals(HexVectorH.UNIT_3 * 0 + HexVectorH.UNIT_5 * 0,
                PseudoHexVectorH(0, 0).toHexVector())
        assertEquals(HexVectorH.UNIT_3 * 1 + HexVectorH.UNIT_5 * 0,
                PseudoHexVectorH(1, 0).toHexVector())
        assertEquals(HexVectorH.UNIT_3 * 2 + HexVectorH.UNIT_5 * 0,
                PseudoHexVectorH(2, 0).toHexVector())

        assertEquals(HexVectorH.UNIT_3 * 0 + HexVectorH.UNIT_5 * 1,
                PseudoHexVectorH(0, 1).toHexVector())
        assertEquals(HexVectorH.UNIT_3 * 1 + HexVectorH.UNIT_5 * 1,
                PseudoHexVectorH(1, 1).toHexVector())
        assertEquals(HexVectorH.UNIT_3 * 2 + HexVectorH.UNIT_5 * 1,
                PseudoHexVectorH(2, 1).toHexVector())

        assertEquals(HexVectorH.UNIT_3 * -1 + HexVectorH.UNIT_5 * 2,
                PseudoHexVectorH(0, 2).toHexVector())
        assertEquals(HexVectorH.UNIT_3 * 0 + HexVectorH.UNIT_5 * 2,
                PseudoHexVectorH(1, 2).toHexVector())
        assertEquals(HexVectorH.UNIT_3 * 1 + HexVectorH.UNIT_5 * 2,
                PseudoHexVectorH(2, 2).toHexVector())
    }

    @Test
    fun test_toPseudoHexVectorH() {
        assertEquals(PseudoHexVectorH(0, 0),
                (HexVectorH.UNIT_3 * 0 + HexVectorH.UNIT_5 * 0).toPseudoHexVector())
        assertEquals(PseudoHexVectorH(1, 0),
                (HexVectorH.UNIT_3 * 1 + HexVectorH.UNIT_5 * 0).toPseudoHexVector())
        assertEquals(PseudoHexVectorH(2, 0),
                (HexVectorH.UNIT_3 * 2 + HexVectorH.UNIT_5 * 0).toPseudoHexVector())

        assertEquals(PseudoHexVectorH(0, 1),
                (HexVectorH.UNIT_3 * 0 + HexVectorH.UNIT_5 * 1).toPseudoHexVector())
        assertEquals(PseudoHexVectorH(1, 1),
                (HexVectorH.UNIT_3 * 1 + HexVectorH.UNIT_5 * 1).toPseudoHexVector())
        assertEquals(PseudoHexVectorH(2, 1),
                (HexVectorH.UNIT_3 * 2 + HexVectorH.UNIT_5 * 1).toPseudoHexVector())

        assertEquals(PseudoHexVectorH(1, 1),
                (HexVectorH.UNIT_3 * 0 + HexVectorH.UNIT_5 * 2).toPseudoHexVector())
        assertEquals(PseudoHexVectorH(2, 1),
                (HexVectorH.UNIT_3 * 1 + HexVectorH.UNIT_5 * 2).toPseudoHexVector())
        assertEquals(PseudoHexVectorH(3, 1),
                (HexVectorH.UNIT_3 * 2 + HexVectorH.UNIT_5 * 2).toPseudoHexVector())
    }
}