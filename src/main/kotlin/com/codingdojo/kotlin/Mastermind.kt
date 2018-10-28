package com.codingdojo.kotlin

class Mastermind {
    fun compare(firstParam: String, secondParam: String): Pair<Int, Int> {
        val fpCharsWithout = firstParam.toCharArray()
        val spCharsWithout = secondParam.toCharArray()
        return Pair(countCommonChars(firstParam, secondParam),
                    countCommonCharsWithSameIndex(firstParam, secondParam))
    }

    fun countCommonChars(firstParam: String, secondParam: String): Int {
        var countCommonChars = 0
        firstParam.toCharArray().distinct().forEach {
            if(secondParam.toCharArray().distinct().contains(it)) countCommonChars++ else countCommonChars
        }
        return countCommonChars
    }

    fun countCommonCharsWithSameIndex(firstParam: String, secondParam: String): Int {
        var countCommonCharsWithSameIndex = 0
        firstParam.withIndex().forEach {
            if(secondParam.withIndex().equals(firstParam)) countCommonCharsWithSameIndex++ else countCommonCharsWithSameIndex
        }
        return countCommonCharsWithSameIndex
    }

}
