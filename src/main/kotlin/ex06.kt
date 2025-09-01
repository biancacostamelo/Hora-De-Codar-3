fun main() {
    var cont = 0
    var opcao: Int

    do {
        println("Digite a primeira nota: ")
        val nota1 = readLine()!!.toDouble()

        println("Digite a segunda nota: ")
        val nota2 = readLine()!!.toDouble()

        val media = (nota1 + nota2) / 2
        println("A média é $media\n")

        if (media >= 9.5) {
            println("APROVADO\n")
            cont++
        } else {
            println("REPROVADO\n")
        }

        println("Calcular a média de outro aluno? [1]: Sim / [2]: Não")
        opcao = readLine()!!.toInt()

    } while (opcao == 1)

    println("A quantidade de alunos aprovados é: $cont")
    println("Finalizado")
}
