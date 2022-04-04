package com.example.practicekotlin.controller

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/book")
    fun hello(model:Model): BookResponse {

        var book = BookResponse("책","작가님", "출판사", 24000)
        println("책 제목 : ${book.title}")

        return book
    }

    @GetMapping("/list")
    fun list(): List<String> {
        return listOf("a", "b", "c")
    }
}