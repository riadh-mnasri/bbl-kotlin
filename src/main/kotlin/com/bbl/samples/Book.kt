package com.bbl.samples

data class Book(val isbn: String, val name: String, val price: Int=-1){
   fun priceState(): String {
       return if (price < 40) "Good to buy !" else if (price > 40) "Expensive" else "Invalid price"
   }

    infix fun customPlus(bookToAdd: Book): Book{
        return Book(bookToAdd.isbn+isbn, bookToAdd.name+ " & "+name, bookToAdd.price+price)
    }
}
