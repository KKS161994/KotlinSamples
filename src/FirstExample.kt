
fun main(args: Array<String>) {
    println("Hello kone")
    var smallValue: Int = Int.MAX_VALUE
    var bigValue: Int = Int.MIN_VALUE
    println("Big int "+smallValue)
    println("Small Int"+bigValue)
    println("Smalls $smallValue")
    var dblNum:Double = 1.111111111111111111111
    println(dblNum+dblNum)
    if(true is Boolean){
        println("true is boolean")
    }
    var letterGrade: Char = 'A'
    println("A is Char : ${letterGrade is Char}")

    println("Cast"+(2.14.toInt()))
    println("A to int "+('A'.toInt()))
    println("65 to Char "+(65.toChar()))
    val myName = "kone rocks"

    val longString = """This is a
        |long String""".trimMargin()
    println("Long string "+longString)
    println("Long String length "+longString.length)
    var smaller = longString
    println("Checkong equality "+longString.equals(smaller))
    println("Substring "+smaller.subSequence(0,5))
    println("Contains "+smaller.contains("This"))
}