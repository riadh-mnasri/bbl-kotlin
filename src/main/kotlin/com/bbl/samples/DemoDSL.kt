package com.bbl.samples

fun main(){
    val listOfNames = listOf("toto", "titi", "tata")
    println(listOfNames should contain("toto"))
}

interface Matcher<T> {
    fun test(expression: T): Boolean
}

fun <T> contain(input: T): Matcher<Collection<T>> = object : Matcher<Collection<T>> {
    override fun test(collection: Collection<T>): Boolean {
        return collection.contains(input)
    }
}

infix fun <T> T.should(matcher: Matcher<T>): Boolean {
    return matcher.test(this)
}