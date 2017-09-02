import java.util.Arrays.copyOfRange

fun main(args: Array<String>){
    var myArray = arrayOf(1,1.23,"Doug")
    println(myArray.get(2))
    println(myArray.contains("Doug"))
    println(myArray.size)
    var partArray = myArray.copyOfRange(0,2)

    println("The sum is ${sum(2,3)}");
    println("The diff is ${diff(5,3)}")
    println("The maximum of ${maxOf(5,3)}")
    var b:String?
    b = null
    //Null saftey
    println(b?.length)
    val l = b?.length?:-1
    //NPE--Null Pointer exception
   // val ld = b!!.length

    val ab: Int? = 's' as? Int
    println("Ab value is "+ab)
}
fun sum(a: Int, b: Int): Int{
    return a + b
}
fun diff(a: Int, b: Int) = a-b
fun maxOf(a: Int,b: Int) = if(a>b) a else b