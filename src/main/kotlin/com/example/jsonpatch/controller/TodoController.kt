package com.example.jsonpatch.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class TodoController {

    @GetMapping("/")
    fun hello(): Mono<String> {
        return Mono.just("hello")
    }

}