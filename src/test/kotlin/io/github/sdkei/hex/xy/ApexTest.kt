package io.github.sdkei.hex.xy

import io.github.sdkei.hex.core.Apex
import io.github.sdkei.kotlin_jvm_utils.degToRad
import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.math.atan2
import kotlin.math.hypot
import kotlin.math.sqrt


class ApexTest {

    @Test
    fun test_toPoint() {
        val delta = 1.0 / 0x1000000

        Apex._3.toPoint().let {
            assertEquals(0.0.degToRad(), atan2(it.y, it.x), delta)
        }
        Apex._5.toPoint().let {
            assertEquals(60.0.degToRad(), atan2(it.y, it.x), delta)
        }
        Apex._7.toPoint().let {
            assertEquals(120.0.degToRad(), atan2(it.y, it.x), delta)
        }
        Apex._9.toPoint().let {
            assertEquals(180.0.degToRad(), atan2(it.y, it.x), delta)
        }
        Apex._11.toPoint().let {
            assertEquals(240.0.degToRad(), atan2(it.y, it.x), delta)
        }
        Apex._1.toPoint().let {
            assertEquals(300.0.degToRad(), atan2(it.y, it.x), delta)
        }

        Apex.values().map { it.toPoint() }.forEach {
            assertEquals(1.0 / 2.0 / sqrt(3.0) * 2.0, hypot(it.x, it.y), delta)
        }
    }
}