/* Exercício 4
 * Implemente a função fatorial(n: Int): Long que calcule o fatorial de n usando loop
*/

fun main() {
    println(fatorial(5)) // 120
}

fun fatorial (n: Int): Long {
    var resultado = 1L
    for (i in 1..n) {
        resultado *=i
    }
    return resultado
}
