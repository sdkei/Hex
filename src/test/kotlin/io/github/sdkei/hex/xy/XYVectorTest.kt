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
    fun test_XYVector_toHexVectorH() {

        // around HexVector.UNIT_1
        run {
            // around 0 O'clock apex
            assertEquals(HexVectorH.UNIT_1,
                    XYVector(0.5, -1.443).toHexVectorH())
            assertEquals(HexVectorH.UNIT_1 + HexVectorH.UNIT_11,
                    XYVector(0.4999, -1.444).toHexVectorH())
            assertEquals(HexVectorH.UNIT_1 + HexVectorH.UNIT_1,
                    XYVector(0.5, -1.444).toHexVectorH())

            // around 2 O'clock apex
            assertEquals(HexVectorH.UNIT_1,
                    XYVector(0.9999, -1.154).toHexVectorH())
            assertEquals(HexVectorH.UNIT_1 + HexVectorH.UNIT_1,
                    XYVector(0.9999, -1.155).toHexVectorH())
            assertEquals(HexVectorH.UNIT_1 + HexVectorH.UNIT_3,
                    XYVector(1.0, -1.154).toHexVectorH())

            // around 4 O'clock apex
            assertEquals(HexVectorH.UNIT_1,
                    XYVector(0.9999, -0.578).toHexVectorH())
            assertEquals(HexVectorH.UNIT_1 + HexVectorH.UNIT_3,
                    XYVector(1.0, -0.578).toHexVectorH())
            assertEquals(HexVectorH.UNIT_1 + HexVectorH.UNIT_5,
                    XYVector(0.9999, -0.577).toHexVectorH())

            // around 6 O'clock apex
            assertEquals(HexVectorH.UNIT_1,
                    XYVector(0.5, -0.289).toHexVectorH())
            assertEquals(HexVectorH.UNIT_1 + HexVectorH.UNIT_5,
                    XYVector(0.5, -0.288).toHexVectorH())
            assertEquals(HexVectorH.UNIT_1 + HexVectorH.UNIT_7,
                    XYVector(0.4999, -0.288).toHexVectorH())

            // around 8 O'clock apex
            assertEquals(HexVectorH.UNIT_1,
                    XYVector(0.0, -0.578).toHexVectorH())
            assertEquals(HexVectorH.UNIT_1 + HexVectorH.UNIT_7,
                    XYVector(0.0, -0.577).toHexVectorH())
            assertEquals(HexVectorH.UNIT_1 + HexVectorH.UNIT_9,
                    XYVector(-0.0001, -0.578).toHexVectorH())

            // around 10 O'clock apex
            assertEquals(HexVectorH.UNIT_1,
                    XYVector(0.0, -1.154).toHexVectorH())
            assertEquals(HexVectorH.UNIT_1 + HexVectorH.UNIT_9,
                    XYVector(-0.0001, -1.154).toHexVectorH())
            assertEquals(HexVectorH.UNIT_1 + HexVectorH.UNIT_11,
                    XYVector(0.0, -1.155).toHexVectorH())
        }

        // around HexVector.UNIT_3
        run {
            // around 0 O'clock apex
            assertEquals(HexVectorH.UNIT_3,
                    XYVector(1.0, -0.577).toHexVectorH())
            assertEquals(HexVectorH.UNIT_3 + HexVectorH.UNIT_11,
                    XYVector(0.9999, -0.578).toHexVectorH())
            assertEquals(HexVectorH.UNIT_3 + HexVectorH.UNIT_1,
                    XYVector(1.0, -0.578).toHexVectorH())

            // around 2 O'clock apex
            assertEquals(HexVectorH.UNIT_3,
                    XYVector(1.4999, -0.288).toHexVectorH())
            assertEquals(HexVectorH.UNIT_3 + HexVectorH.UNIT_1,
                    XYVector(1.4999, -0.289).toHexVectorH())
            assertEquals(HexVectorH.UNIT_3 + HexVectorH.UNIT_3,
                    XYVector(1.5, -0.288).toHexVectorH())

            // around 4 O'clock apex
            assertEquals(HexVectorH.UNIT_3,
                    XYVector(1.4999, 0.288).toHexVectorH())
            assertEquals(HexVectorH.UNIT_3 + HexVectorH.UNIT_3,
                    XYVector(1.5, 0.288).toHexVectorH())
            assertEquals(HexVectorH.UNIT_3 + HexVectorH.UNIT_5,
                    XYVector(1.4999, 0.289).toHexVectorH())

            // around 6 O'clock apex
            assertEquals(HexVectorH.UNIT_3,
                    XYVector(1.0, 0.577).toHexVectorH())
            assertEquals(HexVectorH.UNIT_3 + HexVectorH.UNIT_5,
                    XYVector(1.0, 0.578).toHexVectorH())
            assertEquals(HexVectorH.UNIT_3 + HexVectorH.UNIT_7,
                    XYVector(0.9999, 0.578).toHexVectorH())

            // around 8 O'clock apex
            assertEquals(HexVectorH.UNIT_3,
                    XYVector(0.5, 0.288).toHexVectorH())
            assertEquals(HexVectorH.UNIT_3 + HexVectorH.UNIT_7,
                    XYVector(0.5, 0.289).toHexVectorH())
            assertEquals(HexVectorH.UNIT_3 + HexVectorH.UNIT_9,
                    XYVector(0.4999, 0.288).toHexVectorH())

            // around 10 O'clock apex
            assertEquals(HexVectorH.UNIT_3,
                    XYVector(0.5, -0.288).toHexVectorH())
            assertEquals(HexVectorH.UNIT_3 + HexVectorH.UNIT_9,
                    XYVector(0.4999, -0.288).toHexVectorH())
            assertEquals(HexVectorH.UNIT_3 + HexVectorH.UNIT_11,
                    XYVector(0.5, -0.289).toHexVectorH())
        }

        // around HexVector.UNIT_5
        run {
            // around 0 O'clock apex
            assertEquals(HexVectorH.UNIT_5,
                    XYVector(0.5, 0.289).toHexVectorH())
            assertEquals(HexVectorH.UNIT_5 + HexVectorH.UNIT_11,
                    XYVector(0.4999, 0.288).toHexVectorH())
            assertEquals(HexVectorH.UNIT_5 + HexVectorH.UNIT_1,
                    XYVector(0.5, 0.288).toHexVectorH())

            // around 2 O'clock apex
            assertEquals(HexVectorH.UNIT_5,
                    XYVector(0.9999, 0.578).toHexVectorH())
            assertEquals(HexVectorH.UNIT_5 + HexVectorH.UNIT_1,
                    XYVector(0.9999, 0.577).toHexVectorH())
            assertEquals(HexVectorH.UNIT_5 + HexVectorH.UNIT_3,
                    XYVector(1.0, 0.578).toHexVectorH())

            // around 4 O'clock apex
            assertEquals(HexVectorH.UNIT_5,
                    XYVector(0.9999, 1.154).toHexVectorH())
            assertEquals(HexVectorH.UNIT_5 + HexVectorH.UNIT_3,
                    XYVector(1.0, 1.154).toHexVectorH())
            assertEquals(HexVectorH.UNIT_5 + HexVectorH.UNIT_5,
                    XYVector(0.9999, 1.155).toHexVectorH())

            // around 6 O'clock apex
            assertEquals(HexVectorH.UNIT_5,
                    XYVector(0.5, 1.443).toHexVectorH())
            assertEquals(HexVectorH.UNIT_5 + HexVectorH.UNIT_5,
                    XYVector(0.5, 1.444).toHexVectorH())
            assertEquals(HexVectorH.UNIT_5 + HexVectorH.UNIT_7,
                    XYVector(0.4999, 1.444).toHexVectorH())

            // around 8 O'clock apex
            assertEquals(HexVectorH.UNIT_5,
                    XYVector(0.0, 1.154).toHexVectorH())
            assertEquals(HexVectorH.UNIT_5 + HexVectorH.UNIT_7,
                    XYVector(0.0, 1.155).toHexVectorH())
            assertEquals(HexVectorH.UNIT_5 + HexVectorH.UNIT_9,
                    XYVector(-0.0001, 1.154).toHexVectorH())

            // around 10 O'clock apex
            assertEquals(HexVectorH.UNIT_5,
                    XYVector(0.0, 0.578).toHexVectorH())
            assertEquals(HexVectorH.UNIT_5 + HexVectorH.UNIT_9,
                    XYVector(-0.0001, 0.578).toHexVectorH())
            assertEquals(HexVectorH.UNIT_5 + HexVectorH.UNIT_11,
                    XYVector(0.0, 0.577).toHexVectorH())
        }

        // around HexVector.UNIT_7
        run {
            // around 0 O'clock apex
            assertEquals(HexVectorH.UNIT_7,
                    XYVector(-0.5, 0.289).toHexVectorH())
            assertEquals(HexVectorH.UNIT_7 + HexVectorH.UNIT_11,
                    XYVector(-0.5001, 0.288).toHexVectorH())
            assertEquals(HexVectorH.UNIT_7 + HexVectorH.UNIT_1,
                    XYVector(-0.5, 0.288).toHexVectorH())

            // around 2 O'clock apex
            assertEquals(HexVectorH.UNIT_7,
                    XYVector(-0.0001, 0.578).toHexVectorH())
            assertEquals(HexVectorH.UNIT_7 + HexVectorH.UNIT_1,
                    XYVector(-0.0001, 0.577).toHexVectorH())
            assertEquals(HexVectorH.UNIT_7 + HexVectorH.UNIT_3,
                    XYVector(-0.0, 0.578).toHexVectorH())

            // around 4 O'clock apex
            assertEquals(HexVectorH.UNIT_7,
                    XYVector(-0.0001, 1.154).toHexVectorH())
            assertEquals(HexVectorH.UNIT_7 + HexVectorH.UNIT_3,
                    XYVector(-0.0, 1.154).toHexVectorH())
            assertEquals(HexVectorH.UNIT_7 + HexVectorH.UNIT_5,
                    XYVector(-0.0001, 1.155).toHexVectorH())

            // around 6 O'clock apex
            assertEquals(HexVectorH.UNIT_7,
                    XYVector(-0.5, 1.443).toHexVectorH())
            assertEquals(HexVectorH.UNIT_7 + HexVectorH.UNIT_5,
                    XYVector(-0.5, 1.444).toHexVectorH())
            assertEquals(HexVectorH.UNIT_7 + HexVectorH.UNIT_7,
                    XYVector(-0.5001, 1.444).toHexVectorH())

            // around 8 O'clock apex
            assertEquals(HexVectorH.UNIT_7,
                    XYVector(-1.0, 1.154).toHexVectorH())
            assertEquals(HexVectorH.UNIT_7 + HexVectorH.UNIT_7,
                    XYVector(-1.0, 1.155).toHexVectorH())
            assertEquals(HexVectorH.UNIT_7 + HexVectorH.UNIT_9,
                    XYVector(-1.0001, 1.154).toHexVectorH())

            // around 10 O'clock apex
            assertEquals(HexVectorH.UNIT_7,
                    XYVector(-1.0, 0.578).toHexVectorH())
            assertEquals(HexVectorH.UNIT_7 + HexVectorH.UNIT_9,
                    XYVector(-1.0001, 0.578).toHexVectorH())
            assertEquals(HexVectorH.UNIT_7 + HexVectorH.UNIT_11,
                    XYVector(-1.0, 0.577).toHexVectorH())
        }

        // around HexVector.UNIT_9
        run {
            // around 0 O'clock apex
            assertEquals(HexVectorH.UNIT_9,
                    XYVector(-1.0, -0.577).toHexVectorH())
            assertEquals(HexVectorH.UNIT_9 + HexVectorH.UNIT_11,
                    XYVector(-1.0001, -0.578).toHexVectorH())
            assertEquals(HexVectorH.UNIT_9 + HexVectorH.UNIT_1,
                    XYVector(-1.0, -0.578).toHexVectorH())

            // around 2 O'clock apex
            assertEquals(HexVectorH.UNIT_9,
                    XYVector(-0.5001, -0.288).toHexVectorH())
            assertEquals(HexVectorH.UNIT_9 + HexVectorH.UNIT_1,
                    XYVector(-0.5001, -0.289).toHexVectorH())
            assertEquals(HexVectorH.UNIT_9 + HexVectorH.UNIT_3,
                    XYVector(-0.5, -0.288).toHexVectorH())

            // around 4 O'clock apex
            assertEquals(HexVectorH.UNIT_9,
                    XYVector(-0.5001, 0.288).toHexVectorH())
            assertEquals(HexVectorH.UNIT_9 + HexVectorH.UNIT_3,
                    XYVector(-0.5, 0.288).toHexVectorH())
            assertEquals(HexVectorH.UNIT_9 + HexVectorH.UNIT_5,
                    XYVector(-0.5001, 0.289).toHexVectorH())

            // around 6 O'clock apex
            assertEquals(HexVectorH.UNIT_9,
                    XYVector(-1.0, 0.577).toHexVectorH())
            assertEquals(HexVectorH.UNIT_9 + HexVectorH.UNIT_5,
                    XYVector(-1.0, 0.578).toHexVectorH())
            assertEquals(HexVectorH.UNIT_9 + HexVectorH.UNIT_7,
                    XYVector(-1.0001, 0.578).toHexVectorH())

            // around 8 O'clock apex
            assertEquals(HexVectorH.UNIT_9,
                    XYVector(-1.5, 0.288).toHexVectorH())
            assertEquals(HexVectorH.UNIT_9 + HexVectorH.UNIT_7,
                    XYVector(-1.5, 0.289).toHexVectorH())
            assertEquals(HexVectorH.UNIT_9 + HexVectorH.UNIT_9,
                    XYVector(-1.5001, 0.288).toHexVectorH())

            // around 10 O'clock apex
            assertEquals(HexVectorH.UNIT_9,
                    XYVector(-1.5, -0.288).toHexVectorH())
            assertEquals(HexVectorH.UNIT_9 + HexVectorH.UNIT_9,
                    XYVector(-1.5001, -0.288).toHexVectorH())
            assertEquals(HexVectorH.UNIT_9 + HexVectorH.UNIT_11,
                    XYVector(-1.5, -0.289).toHexVectorH())
        }

        // around HexVector.UNIT_11
        run {
            // around 0 O'clock apex
            assertEquals(HexVectorH.UNIT_11,
                    XYVector(-0.5, -1.443).toHexVectorH())
            assertEquals(HexVectorH.UNIT_11 + HexVectorH.UNIT_11,
                    XYVector(-0.5001, -1.444).toHexVectorH())
            assertEquals(HexVectorH.UNIT_11 + HexVectorH.UNIT_1,
                    XYVector(-0.5, -1.444).toHexVectorH())

            // around 2 O'clock apex
            assertEquals(HexVectorH.UNIT_11,
                    XYVector(-0.0001, -1.154).toHexVectorH())
            assertEquals(HexVectorH.UNIT_11 + HexVectorH.UNIT_1,
                    XYVector(-0.0001, -1.155).toHexVectorH())
            assertEquals(HexVectorH.UNIT_11 + HexVectorH.UNIT_3,
                    XYVector(0.0, -1.154).toHexVectorH())

            // around 4 O'clock apex
            assertEquals(HexVectorH.UNIT_11,
                    XYVector(-0.0001, -0.578).toHexVectorH())
            assertEquals(HexVectorH.UNIT_11 + HexVectorH.UNIT_3,
                    XYVector(0.0, -0.578).toHexVectorH())
            assertEquals(HexVectorH.UNIT_11 + HexVectorH.UNIT_5,
                    XYVector(-0.0001, -0.577).toHexVectorH())

            // around 6 O'clock apex
            assertEquals(HexVectorH.UNIT_11,
                    XYVector(-0.5, -0.289).toHexVectorH())
            assertEquals(HexVectorH.UNIT_11 + HexVectorH.UNIT_5,
                    XYVector(-0.5, -0.288).toHexVectorH())
            assertEquals(HexVectorH.UNIT_11 + HexVectorH.UNIT_7,
                    XYVector(-0.5001, -0.288).toHexVectorH())

            // around 8 O'clock apex
            assertEquals(HexVectorH.UNIT_11,
                    XYVector(-1.0, -0.578).toHexVectorH())
            assertEquals(HexVectorH.UNIT_11 + HexVectorH.UNIT_7,
                    XYVector(-1.0, -0.577).toHexVectorH())
            assertEquals(HexVectorH.UNIT_11 + HexVectorH.UNIT_9,
                    XYVector(-1.0001, -0.578).toHexVectorH())

            // around 10 O'clock apex
            assertEquals(HexVectorH.UNIT_11,
                    XYVector(-1.0, -1.154).toHexVectorH())
            assertEquals(HexVectorH.UNIT_11 + HexVectorH.UNIT_9,
                    XYVector(-1.0001, -1.154).toHexVectorH())
            assertEquals(HexVectorH.UNIT_11 + HexVectorH.UNIT_11,
                    XYVector(-1.0, -1.155).toHexVectorH())
        }
    }

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
