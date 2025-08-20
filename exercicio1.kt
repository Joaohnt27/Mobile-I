/* Exercício 1
 * Declare variáveis para armazenar nome (String), idade (Int) e altura (Double).
 Implemente a função informacoes() que retorne uma string formatada no estilo:
 "Nome: X, Idade: Y, Altura: Z m"
*/

fun main() {
    println(informacoes("João Henrique", 21, 1.80))
    // Saída esperada: Nome: João Henrique, Idade: 21, Altura: 1.80 m
}


fun informacoes (nome: String, idade: Int, altura: Double): String {
    return "Nome: $nome, idade: $idade, altura: $altura"
}

/* OU:
fun informacoes (nome: String, idade: Int, altura: Double) = "Nome: $nome, idade: $idade, altura: $altura"
*/
