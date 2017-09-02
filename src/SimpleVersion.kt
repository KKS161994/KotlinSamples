
 fun main(args: Array<String>) {

     val language = if (args.size == 0) "EN" else args[0]
     println(language)
     println(when (language) {
        "FR" -> "Fuck Radius"
         "EN" -> "Hello"
         else -> "Cant say"
     })
     Greeter("Babes").greet()
     Welcome("Kone").welcomeRemer()
     println(max(1,2))
     println(parseInt("1"))
     println("String length is is ${getStringLength("Hey Babes")}")
     var a:Int =125
     var sum:Int=0

        while(a>0){
            sum += a%10
            a /= 10

        }
     println("The sum generated using while is ${sum}")
     val myInts = intArrayOf(1, 1, 2, 3, 5, 8, 13, 21)
    for (i in myInts){
        print("  ${i}")
    }
     println()
     var y=10
     for (x in 1..y-1)
         println("${x}")
     var arrayList = arrayListOf<String>()
     arrayList.add("Priya")
     arrayList.add("Deva")
     arrayList.add("Shiva")
     if ("Shiva" in arrayList)
     println("Got shiva")
 }
 class Greeter(val name:String){
     fun greet(){
         println("Hello ${name}")
     }
 }
 class Welcome(val remer: String){
     fun welcomeRemer(){
         println("Welcome remer to this new world of ${remer}")
     }
 }
 fun max(a: Int,b: Int) = if(a>b) a else b
 fun parseInt(str: String): Int?{
     try{
         return str.toInt()
     }
     catch (e: NumberFormatException){
         print("One of the string is not an int")
     }
     return null
 }

 fun getStringLength(obj: Any): Int?{
     if(obj is String){
         return obj.length
     }
     else
         return null
 }