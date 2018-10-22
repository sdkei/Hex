package io.github.sdkei.hex.core

import org.junit.Assert.assertEquals
import org.junit.Test

class HexVectorTest {

    @Test
    fun test_elementOf() {

        // UNIT_1

        assertEquals(1 to 0,
                HexVectorH.UNIT_1.elementsOf(SideH._1, SideH._3))
        assertEquals(1 to 0,
                HexVectorH.UNIT_1.elementsOf(SideH._1, SideH._5))
        assertEquals(1 to 0,
                HexVectorH.UNIT_1.elementsOf(SideH._1, SideH._9))
        assertEquals(1 to 0,
                HexVectorH.UNIT_1.elementsOf(SideH._1, SideH._11))

        assertEquals(0 to 1,
                HexVectorH.UNIT_1.elementsOf(SideH._3, SideH._1))
        assertEquals(1 to -1,
                HexVectorH.UNIT_1.elementsOf(SideH._3, SideH._5))
        assertEquals(0 to -1,
                HexVectorH.UNIT_1.elementsOf(SideH._3, SideH._7))
        assertEquals(1 to 1,
                HexVectorH.UNIT_1.elementsOf(SideH._3, SideH._11))

        assertEquals(0 to 1,
                HexVectorH.UNIT_1.elementsOf(SideH._5, SideH._1))
        assertEquals(-1 to 1,
                HexVectorH.UNIT_1.elementsOf(SideH._5, SideH._3))
        assertEquals(0 to -1,
                HexVectorH.UNIT_1.elementsOf(SideH._5, SideH._7))
        assertEquals(-1 to -1,
                HexVectorH.UNIT_1.elementsOf(SideH._5, SideH._9))

        assertEquals(-1 to 0,
                HexVectorH.UNIT_1.elementsOf(SideH._7, SideH._3))
        assertEquals(-1 to 0,
                HexVectorH.UNIT_1.elementsOf(SideH._7, SideH._5))
        assertEquals(-1 to 0,
                HexVectorH.UNIT_1.elementsOf(SideH._7, SideH._9))
        assertEquals(-1 to 0,
                HexVectorH.UNIT_1.elementsOf(SideH._7, SideH._11))

        assertEquals(0 to 1,
                HexVectorH.UNIT_1.elementsOf(SideH._9, SideH._1))
        assertEquals(-1 to -1,
                HexVectorH.UNIT_1.elementsOf(SideH._9, SideH._5))
        assertEquals(0 to -1,
                HexVectorH.UNIT_1.elementsOf(SideH._9, SideH._7))
        assertEquals(-1 to 1,
                HexVectorH.UNIT_1.elementsOf(SideH._9, SideH._11))

        assertEquals(0 to 1,
                HexVectorH.UNIT_1.elementsOf(SideH._11, SideH._1))
        assertEquals(1 to 1,
                HexVectorH.UNIT_1.elementsOf(SideH._11, SideH._3))
        assertEquals(0 to -1,
                HexVectorH.UNIT_1.elementsOf(SideH._11, SideH._7))
        assertEquals(1 to -1,
                HexVectorH.UNIT_1.elementsOf(SideH._11, SideH._9))

        // UNIT_3

        assertEquals(0 to 1,
                HexVectorH.UNIT_3.elementsOf(SideH._1, SideH._3))
        assertEquals(1 to 1,
                HexVectorH.UNIT_3.elementsOf(SideH._1, SideH._5))
        assertEquals(0 to -1,
                HexVectorH.UNIT_3.elementsOf(SideH._1, SideH._9))
        assertEquals(1 to -1,
                HexVectorH.UNIT_3.elementsOf(SideH._1, SideH._11))

        assertEquals(1 to 0,
                HexVectorH.UNIT_3.elementsOf(SideH._3, SideH._1))
        assertEquals(1 to 0,
                HexVectorH.UNIT_3.elementsOf(SideH._3, SideH._5))
        assertEquals(1 to 0,
                HexVectorH.UNIT_3.elementsOf(SideH._3, SideH._7))
        assertEquals(1 to 0,
                HexVectorH.UNIT_3.elementsOf(SideH._3, SideH._11))

        assertEquals(1 to 1,
                HexVectorH.UNIT_3.elementsOf(SideH._5, SideH._1))
        assertEquals(0 to 1,
                HexVectorH.UNIT_3.elementsOf(SideH._5, SideH._3))
        assertEquals(1 to -1,
                HexVectorH.UNIT_3.elementsOf(SideH._5, SideH._7))
        assertEquals(0 to -1,
                HexVectorH.UNIT_3.elementsOf(SideH._5, SideH._9))

        assertEquals(0 to 1,
                HexVectorH.UNIT_3.elementsOf(SideH._7, SideH._3))
        assertEquals(-1 to 1,
                HexVectorH.UNIT_3.elementsOf(SideH._7, SideH._5))
        assertEquals(0 to -1,
                HexVectorH.UNIT_3.elementsOf(SideH._7, SideH._9))
        assertEquals(-1 to -1,
                HexVectorH.UNIT_3.elementsOf(SideH._7, SideH._11))

        assertEquals(-1 to 0,
                HexVectorH.UNIT_3.elementsOf(SideH._9, SideH._1))
        assertEquals(-1 to 0,
                HexVectorH.UNIT_3.elementsOf(SideH._9, SideH._5))
        assertEquals(-1 to 0,
                HexVectorH.UNIT_3.elementsOf(SideH._9, SideH._7))
        assertEquals(-1 to 0,
                HexVectorH.UNIT_3.elementsOf(SideH._9, SideH._11))

        assertEquals(-1 to 1,
                HexVectorH.UNIT_3.elementsOf(SideH._11, SideH._1))
        assertEquals(0 to 1,
                HexVectorH.UNIT_3.elementsOf(SideH._11, SideH._3))
        assertEquals(-1 to -1,
                HexVectorH.UNIT_3.elementsOf(SideH._11, SideH._7))
        assertEquals(0 to -1,
                HexVectorH.UNIT_3.elementsOf(SideH._11, SideH._9))

        // UNIT_5

        assertEquals(-1 to 1,
                HexVectorH.UNIT_5.elementsOf(SideH._1, SideH._3))
        assertEquals(0 to 1,
                HexVectorH.UNIT_5.elementsOf(SideH._1, SideH._5))
        assertEquals(-1 to -1,
                HexVectorH.UNIT_5.elementsOf(SideH._1, SideH._9))
        assertEquals(0 to -1,
                HexVectorH.UNIT_5.elementsOf(SideH._1, SideH._11))

        assertEquals(1 to -1,
                HexVectorH.UNIT_5.elementsOf(SideH._3, SideH._1))
        assertEquals(0 to 1,
                HexVectorH.UNIT_5.elementsOf(SideH._3, SideH._5))
        assertEquals(1 to 1,
                HexVectorH.UNIT_5.elementsOf(SideH._3, SideH._7))
        assertEquals(0 to -1,
                HexVectorH.UNIT_5.elementsOf(SideH._3, SideH._11))

        assertEquals(1 to 0,
                HexVectorH.UNIT_5.elementsOf(SideH._5, SideH._1))
        assertEquals(1 to 0,
                HexVectorH.UNIT_5.elementsOf(SideH._5, SideH._3))
        assertEquals(1 to 0,
                HexVectorH.UNIT_5.elementsOf(SideH._5, SideH._7))
        assertEquals(1 to 0,
                HexVectorH.UNIT_5.elementsOf(SideH._5, SideH._9))

        assertEquals(1 to 1,
                HexVectorH.UNIT_5.elementsOf(SideH._7, SideH._3))
        assertEquals(0 to 1,
                HexVectorH.UNIT_5.elementsOf(SideH._7, SideH._5))
        assertEquals(1 to -1,
                HexVectorH.UNIT_5.elementsOf(SideH._7, SideH._9))
        assertEquals(0 to -1,
                HexVectorH.UNIT_5.elementsOf(SideH._7, SideH._11))

        assertEquals(-1 to -1,
                HexVectorH.UNIT_5.elementsOf(SideH._9, SideH._1))
        assertEquals(0 to 1,
                HexVectorH.UNIT_5.elementsOf(SideH._9, SideH._5))
        assertEquals(-1 to 1,
                HexVectorH.UNIT_5.elementsOf(SideH._9, SideH._7))
        assertEquals(0 to -1,
                HexVectorH.UNIT_5.elementsOf(SideH._9, SideH._11))

        assertEquals(-1 to 0,
                HexVectorH.UNIT_5.elementsOf(SideH._11, SideH._1))
        assertEquals(-1 to 0,
                HexVectorH.UNIT_5.elementsOf(SideH._11, SideH._3))
        assertEquals(-1 to 0,
                HexVectorH.UNIT_5.elementsOf(SideH._11, SideH._7))
        assertEquals(-1 to 0,
                HexVectorH.UNIT_5.elementsOf(SideH._11, SideH._9))

        // UNIT_7

        assertEquals(-1 to 0,
                HexVectorH.UNIT_7.elementsOf(SideH._1, SideH._3))
        assertEquals(-1 to 0,
                HexVectorH.UNIT_7.elementsOf(SideH._1, SideH._5))
        assertEquals(-1 to 0,
                HexVectorH.UNIT_7.elementsOf(SideH._1, SideH._9))
        assertEquals(-1 to 0,
                HexVectorH.UNIT_7.elementsOf(SideH._1, SideH._11))

        assertEquals(0 to -1,
                HexVectorH.UNIT_7.elementsOf(SideH._3, SideH._1))
        assertEquals(-1 to 1,
                HexVectorH.UNIT_7.elementsOf(SideH._3, SideH._5))
        assertEquals(0 to 1,
                HexVectorH.UNIT_7.elementsOf(SideH._3, SideH._7))
        assertEquals(-1 to -1,
                HexVectorH.UNIT_7.elementsOf(SideH._3, SideH._11))

        assertEquals(0 to -1,
                HexVectorH.UNIT_7.elementsOf(SideH._5, SideH._1))
        assertEquals(1 to -1,
                HexVectorH.UNIT_7.elementsOf(SideH._5, SideH._3))
        assertEquals(0 to 1,
                HexVectorH.UNIT_7.elementsOf(SideH._5, SideH._7))
        assertEquals(1 to 1,
                HexVectorH.UNIT_7.elementsOf(SideH._5, SideH._9))

        assertEquals(1 to 0,
                HexVectorH.UNIT_7.elementsOf(SideH._7, SideH._3))
        assertEquals(1 to 0,
                HexVectorH.UNIT_7.elementsOf(SideH._7, SideH._5))
        assertEquals(1 to 0,
                HexVectorH.UNIT_7.elementsOf(SideH._7, SideH._9))
        assertEquals(1 to 0,
                HexVectorH.UNIT_7.elementsOf(SideH._7, SideH._11))

        assertEquals(0 to -1,
                HexVectorH.UNIT_7.elementsOf(SideH._9, SideH._1))
        assertEquals(1 to 1,
                HexVectorH.UNIT_7.elementsOf(SideH._9, SideH._5))
        assertEquals(0 to 1,
                HexVectorH.UNIT_7.elementsOf(SideH._9, SideH._7))
        assertEquals(1 to -1,
                HexVectorH.UNIT_7.elementsOf(SideH._9, SideH._11))

        assertEquals(0 to -1,
                HexVectorH.UNIT_7.elementsOf(SideH._11, SideH._1))
        assertEquals(-1 to -1,
                HexVectorH.UNIT_7.elementsOf(SideH._11, SideH._3))
        assertEquals(0 to 1,
                HexVectorH.UNIT_7.elementsOf(SideH._11, SideH._7))
        assertEquals(-1 to 1,
                HexVectorH.UNIT_7.elementsOf(SideH._11, SideH._9))

        // UNIT_9

        assertEquals(0 to -1,
                HexVectorH.UNIT_9.elementsOf(SideH._1, SideH._3))
        assertEquals(-1 to -1,
                HexVectorH.UNIT_9.elementsOf(SideH._1, SideH._5))
        assertEquals(0 to 1,
                HexVectorH.UNIT_9.elementsOf(SideH._1, SideH._9))
        assertEquals(-1 to 1,
                HexVectorH.UNIT_9.elementsOf(SideH._1, SideH._11))

        assertEquals(-1 to 0,
                HexVectorH.UNIT_9.elementsOf(SideH._3, SideH._1))
        assertEquals(-1 to 0,
                HexVectorH.UNIT_9.elementsOf(SideH._3, SideH._5))
        assertEquals(-1 to 0,
                HexVectorH.UNIT_9.elementsOf(SideH._3, SideH._7))
        assertEquals(-1 to 0,
                HexVectorH.UNIT_9.elementsOf(SideH._3, SideH._11))

        assertEquals(-1 to -1,
                HexVectorH.UNIT_9.elementsOf(SideH._5, SideH._1))
        assertEquals(0 to -1,
                HexVectorH.UNIT_9.elementsOf(SideH._5, SideH._3))
        assertEquals(-1 to 1,
                HexVectorH.UNIT_9.elementsOf(SideH._5, SideH._7))
        assertEquals(0 to 1,
                HexVectorH.UNIT_9.elementsOf(SideH._5, SideH._9))

        assertEquals(0 to -1,
                HexVectorH.UNIT_9.elementsOf(SideH._7, SideH._3))
        assertEquals(1 to -1,
                HexVectorH.UNIT_9.elementsOf(SideH._7, SideH._5))
        assertEquals(0 to 1,
                HexVectorH.UNIT_9.elementsOf(SideH._7, SideH._9))
        assertEquals(1 to 1,
                HexVectorH.UNIT_9.elementsOf(SideH._7, SideH._11))

        assertEquals(1 to 0,
                HexVectorH.UNIT_9.elementsOf(SideH._9, SideH._1))
        assertEquals(1 to 0,
                HexVectorH.UNIT_9.elementsOf(SideH._9, SideH._5))
        assertEquals(1 to 0,
                HexVectorH.UNIT_9.elementsOf(SideH._9, SideH._7))
        assertEquals(1 to 0,
                HexVectorH.UNIT_9.elementsOf(SideH._9, SideH._11))

        assertEquals(1 to -1,
                HexVectorH.UNIT_9.elementsOf(SideH._11, SideH._1))
        assertEquals(0 to -1,
                HexVectorH.UNIT_9.elementsOf(SideH._11, SideH._3))
        assertEquals(1 to 1,
                HexVectorH.UNIT_9.elementsOf(SideH._11, SideH._7))
        assertEquals(0 to 1,
                HexVectorH.UNIT_9.elementsOf(SideH._11, SideH._9))

        // UNIT_11

        assertEquals(1 to -1,
                HexVectorH.UNIT_11.elementsOf(SideH._1, SideH._3))
        assertEquals(0 to -1,
                HexVectorH.UNIT_11.elementsOf(SideH._1, SideH._5))
        assertEquals(1 to 1,
                HexVectorH.UNIT_11.elementsOf(SideH._1, SideH._9))
        assertEquals(0 to 1,
                HexVectorH.UNIT_11.elementsOf(SideH._1, SideH._11))

        assertEquals(-1 to 1,
                HexVectorH.UNIT_11.elementsOf(SideH._3, SideH._1))
        assertEquals(0 to -1,
                HexVectorH.UNIT_11.elementsOf(SideH._3, SideH._5))
        assertEquals(-1 to -1,
                HexVectorH.UNIT_11.elementsOf(SideH._3, SideH._7))
        assertEquals(0 to 1,
                HexVectorH.UNIT_11.elementsOf(SideH._3, SideH._11))

        assertEquals(-1 to 0,
                HexVectorH.UNIT_11.elementsOf(SideH._5, SideH._1))
        assertEquals(-1 to 0,
                HexVectorH.UNIT_11.elementsOf(SideH._5, SideH._3))
        assertEquals(-1 to 0,
                HexVectorH.UNIT_11.elementsOf(SideH._5, SideH._7))
        assertEquals(-1 to 0,
                HexVectorH.UNIT_11.elementsOf(SideH._5, SideH._9))

        assertEquals(-1 to -1,
                HexVectorH.UNIT_11.elementsOf(SideH._7, SideH._3))
        assertEquals(0 to -1,
                HexVectorH.UNIT_11.elementsOf(SideH._7, SideH._5))
        assertEquals(-1 to 1,
                HexVectorH.UNIT_11.elementsOf(SideH._7, SideH._9))
        assertEquals(0 to 1,
                HexVectorH.UNIT_11.elementsOf(SideH._7, SideH._11))

        assertEquals(1 to 1,
                HexVectorH.UNIT_11.elementsOf(SideH._9, SideH._1))
        assertEquals(0 to -1,
                HexVectorH.UNIT_11.elementsOf(SideH._9, SideH._5))
        assertEquals(1 to -1,
                HexVectorH.UNIT_11.elementsOf(SideH._9, SideH._7))
        assertEquals(0 to 1,
                HexVectorH.UNIT_11.elementsOf(SideH._9, SideH._11))

        assertEquals(1 to 0,
                HexVectorH.UNIT_11.elementsOf(SideH._11, SideH._1))
        assertEquals(1 to 0,
                HexVectorH.UNIT_11.elementsOf(SideH._11, SideH._3))
        assertEquals(1 to 0,
                HexVectorH.UNIT_11.elementsOf(SideH._11, SideH._7))
        assertEquals(1 to 0,
                HexVectorH.UNIT_11.elementsOf(SideH._11, SideH._9))
    }
}