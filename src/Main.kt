//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    index()
    sentence("Mercy" ,22)
    wordlength("AkiraChix")
    names("Mercy")
    names("Chemtai")
    isEven(31)
    println(school())
    temperaturevalue(37.5)


    var fullname="Mercy Chmetai"
    println(fullname)

    var age = 22
    println(age)

    val phoneNumber = "0729486424"
    println(phoneNumber)

    var weight = 60.5F
    println(weight)

    val citizen:Boolean = true
    val nonCitizen:Boolean = false
    println(citizen)
    println(nonCitizen)
    }


 fun index(){
     var school = "AkiraChix"
     println(school[0]+ ""+ school[2]+""+school[3])

 }
fun  sentence(x:String,y:Int ):String{
    var sentence = "Hi,my name is $x and I am $y years old"
    println(sentence)
    return sentence
}
fun wordlength(word:String):Int{
          println(word.length)
    return word.length
}
fun names(name:String) {
    if (name == "Mercy") {
        println("That's Me!")
    } else {
        println("I don't Know who that is")
    }
}
fun isEven(value:Int):Boolean {
    var output = value%2 == 0
    println(output)
    return output

}
fun school(){
    var string9 = "AkiraChix"
    println(string9.slice(2..5))
}
fun temperaturevalue(temperature:Double){
    var message = "The temperature is $temperature degrees Celsius."
    println(message)
}
