/* Exercício 2
 * Implemente a função paresAteN(n: Int): List<Int> que retorne uma lista com todos os números pares de 0 até n (inclusive).
*/

fun main() {
    println(paresAteN(10))
    // Saída esperada: [0, 2, 4, 6, 8, 10]
}

fun paresAteN (n: Int): List<Int> {
    val mlist = mutableListOf<Int>()
    for(i in 0 .. n){
        if(i%2 == 0){
            mlist.add(i)
        }
    }
    return mlist
}

/* OU
for (i in 0 .. n step 2){
    mlist.add(i)
}*/
