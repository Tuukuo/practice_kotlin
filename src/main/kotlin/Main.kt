fun main() {
    //No1.
    removeb("Barnie bakes brown bagels and buns")

    //No2.
    println( sumCountAverage(arrayOf(10,20,30)))

    //No3.
    sphereVolume(22.0)

    //No4.
    println(isPalindrome("MADAM"))

}
//No1.  Write and invoke a function that given the string "Barnie bakes brown bagles and burns " Prints out a list of all
//the other words and characters making up the string excluding all the possible occurences of the letter b.
fun removeb(sen:String){
    var sentence=sen.lowercase().split('b')
    println(sentence)
}

//No2.Write and invoke one function that takes in an array of integers and returns these 3 values: sum count and average
data class Calc(var sum:Int,var count:Int, var average:Double)

fun sumCountAverage(numbers:Array<Int>):Calc{
    var a=numbers.sum()
    var b=numbers.count()
    var c=numbers.average()
    var result=Calc(a,b,c)
    return (result)
}

//No3.
//The volume of a sphere is calculated using the formula below
//
//write and invoke a function that is capable of accurately calculating the volume of any sphere given its radius .
 //Use 3.14159
fun sphereVolume(r:Double){
    val pi=3.1456
    val num=4/3
    val vol=pi * num * r * r * r
    println(vol)
}
//No4.
// A palindrome is a sring that reads the same forwards and backwards e.g madam,wow,kayak,. Write and invoke a function:
//     isPalindrome(word:String):Boolean
//that takes in a single word and returns true or false on depending whether the word is a palindrome

fun  isPalindrome(word:String):Boolean{
    var name=word.reversed()
    var result=word==name
    return result

}



