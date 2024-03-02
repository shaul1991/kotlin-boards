package com.example.helloworld

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SampleTests : FunSpec({
    test("Sample test") {
        val result = 1 + 1
        result shouldBe 2
    }
})
