package com.example.helloworld

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {
    @GetMapping("/sample")
    fun sample(): String {
        return "Hello, World!"
    }

    @PostMapping("/sample")
    fun samplePost(
        @RequestBody name: String,
    ): String {
        return "You sent: $name"
    }
}
