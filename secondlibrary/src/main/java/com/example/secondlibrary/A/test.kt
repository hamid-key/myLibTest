package com.example.secondlibrary.A

import com.example.secondlibrary.SecondTestClass
import kotlin.math.abs

fun main() {
    var a = doubleArrayOf(14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0)
    println(newAvg(a, 90.0))
}

fun printerError(s: String): String {
    return s.filterNot { it in 'a'..'m' }.let {
        "${it.length}/${s.length}"
    }
}

fun nbYear(pp0:Int, percent:Double, aug:Int, p:Int):Int {
    // your code
    var year = 0
    var sum = pp0.toDouble()
    while (sum < p){
        sum += (sum * percent/100) + aug
        ++year
    }
    return year
}

fun people(busStops: Array<Pair<Int, Int>>) : Int {
    return busStops.unzip().let {
        it.first.sum() - it.second.sum()
    }
}

fun mxdiflg(a1:Array<String>, a2:Array<String>):Int {
    if (a1.isEmpty() || a2.isEmpty()) return -1
    val maxa1 = a1.maxOf { it.length }
    val mina1 = a1.minOf { it.length }
    val maxa2 = a2.maxOf { it.length }
    val mina2 = a2.minOf { it.length }
    return if (Math.abs(maxa1 - mina2) > Math.abs(maxa2 - mina1))
        Math.abs(maxa1 - mina2)
    else
        Math.abs(maxa2 - mina1)
}

fun dbSort(a:Array<Any>):Array<Any> {
    val list = mutableListOf<Any>()
    list.add(a.filterIsInstance<Int>().sorted())
    list.add(a.filterIsInstance<String>().sorted())
    return list.toTypedArray()
}

fun newAvg(a:DoubleArray, navg:Double):Long {
    return a.average().toLong()
}