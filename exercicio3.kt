/* Exercício 3
 * Implemente a função classificarNota(nota: Double): String que retorne:
- "Aprovado" se a nota for >= 6.0
- "Recuperação" se estiver entre 4.0 e 5.9
- "Reprovado" caso contrário.
*/

fun main() {
    println(classificarNota(7.5)) // Aprovado
    println(classificarNota(5.0)) // Recuperação
    println(classificarNota(3.0)) // Reprovado
}

fun classificarNota(nota: Double) = when {
        nota >= 6 -> "Aprovado :)"
        nota >= 4 -> "Recuperação :/"
        else -> "Reprovado :C"
}
