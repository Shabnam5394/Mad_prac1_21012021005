fun main(){
    print("Enter the Number:")
    val a= readLine()!!.toInt()
    println(if(a%2==0) "$a is even" else "$a is odd")
    }