package io.github.sdkei.hex.xy

import io.github.sdkei.hex.core.ApexH
import io.github.sdkei.kotlin_jvm_utils.degToRad
import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.math.atan2
import kotlin.math.hypot
import kotlin.math.sqrt


class ApexHTest {

    @Test
    fun test_toPoint() {
        val delta = 1.0 / 0x1000000

        ApexH._4.toPoint().let {
            assertEquals(30.0.degToRad(), atan2(it.y, it.x), delta)
        }
        ApexH._6.toPoint().let {
            assertEquals(90.0.degToRad(), atan2(it.y, it.x), delta)
        }
        ApexH._8.toPoint().let {
            assertEquals(150.0.degToRad(), atan2(it.y, it.x), delta)
        }
        ApexH._10.toPoint().let {
            assertEquals(210.0.degToRad(), atan2(it.y, it.x), delta)
        }
        ApexH._0.toPoint().let {
            assertEquals(270.0.degToRad(), atan2(it.y, it.x), delta)
        }
        ApexH._2.toPoint().let {
            assertEquals(330.0.degToRad(), atan2(it.y, it.x), delta)
        }

        ApexH.values().map { it.toPoint() }.forEach {
            assertEquals(1.0 / 2.0 / sqrt(3.0) * 2.0, hypot(it.x, it.y), delta)
        }
    }
}