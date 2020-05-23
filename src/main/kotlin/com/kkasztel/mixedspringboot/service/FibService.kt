package com.kkasztel.mixedspringboot.service

import com.kkasztel.mixedspringboot.Fib
import org.springframework.stereotype.Service

@Service
class FibService(val fib: Fib = Fib()) {

    fun calculateFibonacci(n: Int): Int = fib.calculate(n)
}