package io.github.sdkei.hex.xy

import io.github.sdkei.hex.core.ApexH
import io.github.sdkei.hex.core.HexVectorH
import io.github.sdkei.kotlin_jvm_utils.degToRad
import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.math.atan2
import kotlin.math.hypot
import kotlin.math.sqrt


class XYVectorTest {

    @Test
    fun test_HexVector_toXYVector() {
        val delta = 1.0 / 0x1000000

        listOf(
                HexVectorH.UNIT_1,
                HexVectorH.UNIT_3,
                HexVectorH.UNIT_5,
                HexVectorH.UNIT_7,
                HexVectorH.UNIT_9,
                HexVectorH.UNIT_11)
                .map { it.toXYVector() }
                .forEachIndexed { index, xyVector ->
                    assertEquals(1.0, hypot(xyVector.x, xyVector.y), delta)

                    assertEquals((-60.0 + 60.0 * index).degToRad(), atan2(xyVector.y, xyVector.x), delta)
                }
    }

    @Test
    fun test_ApexH_toXYVector() {
        val delta = 1.0 / 0x1000000

        ApexH._4.toXYVector().let {
            assertEquals(30.0.degToRad(), atan2(it.y, it.x), delta)
        }
        ApexH._6.toXYVector().let {
            assertEquals(90.0.degToRad(), atan2(it.y, it.x), delta)
        }
        ApexH._8.toXYVector().let {
            assertEquals(150.0.degToRad(), atan2(it.y, it.x), delta)
        }
        ApexH._10.toXYVector().let {
            assertEquals(210.0.degToRad(), atan2(it.y, it.x), delta)
        }
        ApexH._0.toXYVector().let {
            assertEquals(270.0.degToRad(), atan2(it.y, it.x), delta)
        }
        ApexH._2.toXYVector().let {
            assertEquals(330.0.degToRad(), atan2(it.y, it.x), delta)
        }

        ApexH.values().map { it.toXYVector() }.forEach {
            assertEquals(1.0 / 2.0 / sqrt(3.0) * 2.0, hypot(it.x, it.y), delta)
        }
    }
}