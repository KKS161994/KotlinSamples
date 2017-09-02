 fun main(args: Array<String>) {

     val language = if (args.size == 0) "EN" else args[0]
     println(language)
     println(when (language) {
        "FR" -> "Fuck Radius"
         "EN" -> "Hello"
         else -> "Cant say"
     })
     Greeter("Babes").greet()
 }
 class Greeter(val name:String){
     fun greet(){
         println("Hello ${name}")
     }
 }
//fun main(args: Array<String>) {
//    val language = if (args.size == 0) "EN" else args[0]
//    println(when (language) {
//        "EN" -> "Hello!"
//        "FR" -> "Salut!"
//        "IT" -> "Ciao!"
//        else -> "Sorry, I can't greet you in $language yet"
//    })
//}