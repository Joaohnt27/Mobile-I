/* Exercício 5
 * Implemente a função tamanhoSeguro(texto: String?): Int que retorne o tamanho da string se ela não for nula ou 0 caso seja nula.
*/

fun main() {
    println(tamanhoSeguro("Kotlin")) // 6
    println(tamanhoSeguro(null))     // 0
}

fun tamanhoSeguro(texto: String?): Int {
    return texto?.length ?: 0
}
