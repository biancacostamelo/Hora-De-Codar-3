fun main(){
    var n1: Int
    var n2: Int
    var media: Int

    println("Digite o primeiro numero: ")
    n1 = readLine()!!.toInt()

    println("Digite o segundo numero: ")
    n2 = readLine()!!.toInt()

    //executar enquanto n1 for maior que n2
    while(n1 > n2){
        println("\nDigite o primeiro numero novamente!\n")
        n1 = readLine()!!.toInt()
    }

    //calcular a media
    media = (n1 + n2) / 2
    println("\nA média de $n1 e $n2 é: " + media)


    var i = n1
    while(i < n2 + 1){
        print("$i, ")
        i++
    }

}