package com.kkasztel.mixedspringboot.model

data class Foo(val v: Int) {

    fun byTen(): Int = fiddle { it / 10 }

    fun fiddle(f: (Int) -> (Int)): Int = f(v)
}

fun Int.toFoo(): Foo = Foo(this)