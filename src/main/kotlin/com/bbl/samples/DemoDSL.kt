package com.bbl.samples

fun main(){
    val listOfNames = listOf("toto", "titi", "tata")
    println(listOfNames should contain("toto"))

    contain("toto")(listOfNames)

    println("Hello" should isNotNull())
    println("Hello".should(isNotNull()))
}

interface Matcher<T> {
    fun test(expression: T): Boolean
}

fun <T> contain(input: T)= { collection: Collection<T> -> collection.contains(input) }

fun <T> isNotNull() = { v: T  -> v != null}

infix fun <T> T.should(matcher: (T) -> Boolean): Boolean {
    return matcher(this)
}