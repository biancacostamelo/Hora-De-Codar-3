fun main () {
    var soma = 0
    var i = 15
    var media: Int

    while(i < 101){
        print("$i, " )
        soma = soma + i
        i++
    }
    media = soma / 85
    println("\nA media é: " + media)
}