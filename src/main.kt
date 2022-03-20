import jdk.swing.interop.LightweightFrameWrapper

/*
1.Create a class called Human with these attributes: name, age, weight. It has
the following functions:
-eat(foodWeight: Int) :Prints “I am eating {foodWeight}kgs of food”
and increments the human’s weight by the weight of the food eaten
(3 points)
-
-speak(speech: String) :Prints the string passed toit                (2
points)
-birthday( ) :Increments the human’s age by 1(2
points)
Create an instance of this human class and invoke all its functions
2.Create a data class User with these fields: firstName, lastName, email,
phoneNumber, password. Create an instance of User  and print out any 2
attributes */
fun main() {
    var mtu=Human("Shiro",28,"72kg")
    mtu.weight
    mtu.eat(3)
    var x =mtu.speak("I am Kenyan")
    println(x)
    var y=mtu.birthday()
    println(y)
    var yeye= User("Riana","Okello","rianaokello@gmail.com",100,"saido")
    println(yeye.lastname)
    println(yeye.email)
}
class Human( var name:String, var age:Int, var weight:String) {

fun eat(foodWeight:Int) :String {
    weight+= foodWeight
println("I am eating $foodWeight kgs of food")
  return weight
}
    fun speak(speech:String) :String {
        return speech
    }
    fun birthday(): Int{
        var newage= (age+1)
return newage

    }
}

data class User(var firstName:String,var lastname:String,var email:String,var phonenumber:Int,var password:String)