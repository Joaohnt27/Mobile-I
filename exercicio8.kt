/* Exercício 8
 * Crie uma classe Animal com método som(). Crie uma classe Gato que herde de Animal e sobrescreva som() para imprimir "Miau".
 * Crie um object chamado Fazenda que possua uma função emitirSons(animais: List<Animal>) que chame som() para cada animal.
*/

fun main() {
    val animais = listOf(Gato(), Gato(), Gato())
    Fazenda.emitirSons(animais)
    // Saída esperada:
    // Miau
    // Miau
    // Miau
}

open class Animal {
    open fun som() {
        println("Som genérico")
    }
}

class Gato : Animal() {
    override fun som() {
        println("Miau")
    }
}

object Fazenda {
    fun emitirSons(animais: List<Animal>) {
        animais.forEach { it.som() }
    }
}





