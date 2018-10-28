package com.codingdojo.kotlin

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class MastermindTest {

    @Test
    internal fun should_coffee_and_juice_strings_have_one_letter_in_common_and_in_the_right_position() {
        val firstParam = "coffee"
        val secondParam = "juice"
        val matermind = Mastermind()
        Assertions.assertThat(matermind.compare(firstParam, secondParam)).isEqualTo(Pair(1, 1))
    }

    @Test
    internal fun should_coffee_and_tea_strings_have_one_letter_in_common_and_zero_in_the_right_position() {
        val firstParam = "coffee"
        val secondParam = "tea"
        val matermind = Mastermind()
        Assertions.assertThat(matermind.compare(firstParam, secondParam)).isEqualTo(Pair(1, 0))
    }

}