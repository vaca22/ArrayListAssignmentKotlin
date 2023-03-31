package com.vaca.arraylistassignmentkotlin

import android.util.Log
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
        val gg=ArrayList<Int>()
        gg.add(1)
        gg.add(2)
        gg.add(3)
        println(gg.size.toString())
        val hh = gg
        hh.removeAt(0)
        println(gg.size.toString())
        println("vaca")
    }
}