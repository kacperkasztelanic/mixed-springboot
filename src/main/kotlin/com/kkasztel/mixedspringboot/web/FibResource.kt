package com.kkasztel.mixedspringboot.web

import com.kkasztel.mixedspringboot.model.Foo
import com.kkasztel.mixedspringboot.model.toFoo
import com.kkasztel.mixedspringboot.service.FibService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/kotlin/fib")
class FibResource(@Autowired val fibService: FibService) {

    @GetMapping("/calculate")
    fun calculate(@RequestParam n: Int): Foo = fibService.calculateFibonacci(n).toFoo()
}