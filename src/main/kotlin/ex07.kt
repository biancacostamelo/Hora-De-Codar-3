fun main(){
    var i = 0
    var num: Int?
    var media: Int
    var soma = 0

    while (i < 6){
        println("Escreva uma nota (de 0 a 10): ")
        num = readLine()!!.toIntOrNull()

        if (num == null || num < 0 || num > 10){
            println("Escreva um numero válido (entre 0 e 10)")
            num = readLine()!!.toIntOrNull()

            soma = soma + num!!
        } else {
            soma = soma + num!!
        }
        i++
    }

    media = soma / 6
    println("A media das notas é $media")
}