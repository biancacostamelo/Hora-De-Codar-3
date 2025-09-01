fun main(){
    var num1: Int
    var num2: Int

    println("Digite um valor: ")
    num1 = readLine()!!.toInt()

    println("Digite o segundo numero: ")
    num2 = readLine()!!.toInt()

    while(num2 <= 0){
        println("Digite um valor maior que 0: ")
        num2 = readLine()!!.toInt()
    }
    println("A divisão é: " + num1 / num2)
}
