//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main (){
    ejercicio1()
    ejercicio2()
    ejercicio3()
    ejercicio4()
    ejercicio5()
    ejercicio6()
    ejercicio7()
    ejercicio8()
    ejercicio9()
}

fun ejercicio1() {
    // ejercicio 1 suma
    val suma = 5.plus(7).plus(3)
    println("Ejercicio 1 - La suma es: $suma")
}
fun ejercicio2() {
    // ejercicio 2 resta
    val resta =5.minus(3)
    println("Ejercicio 2 - La resta es: $resta")
}
fun ejercicio3() {
    // ejercicio 3 multiplicacion
    val multiplicacion =6.times(8)
    println("Ejercicio 3 - La multiplicacion es:$multiplicacion")

}

fun ejercicio4() {
    // ejercicio 4 verificar si el numero es par o impar
    val numero = 7
    if (numero % 2 == 0){
        println("Ejercicio 4 ->$numero es par")
    }else{
        println("Ejercicio 4 ->$numero es impar")
    }

}

fun ejercicio5() {
    // Lista de países y capitales
    val paises = mapOf(
        "Colombia" to "Bogotá",
        "Argentina" to "Buenos Aires",
        "México" to "Ciudad de México",
        "España" to "Madrid",
        "Japón" to "Tokio"
    )
    println("lista de paises y capitales:")
    for ((pais,capitales) in paises ) {
        println("Ejercicio 5 $pais -> $capitales")
    }



}
//Función contatenar nombre y edad
fun concatenar(nombre: String, edad: Int): String {
    return "Hola, $nombre. Tienes $edad años."
}

fun ejercicio6() {
    val mensaje = concatenar("Juan", 18)
    println("Ejercicio 6 - $mensaje")
}

fun ejercicio7() {
    //Expresión When (clasificar número)
    // Definir el número que vamos a clasificar
    val numero = -3

    // Expresión when
    when {
        numero < 0 -> println("ejercicio 7 - Negativo")
        numero == 0 -> println("ejercicio 7 - Cero")
        numero > 0 -> println("ejercicio 7 -Positivo")

}




}

fun ejercicio8() {
    //Comparación de dos números
    val a = 20
    val b = 15
    if (a == b){
        println("ejercicio 8 - los numeros son iguales")
    }else if (a > b){
        println("ejercicio 8 - $a es mayor que $b")
    }else{
        println("ejercicio 8 - $b es menor que $a")
    }

}

fun ejercicio9() {
    //Multiplicar elementos de una lista por 2

        val lista = listOf(2, 4, 6, 8, 10)
        val nuevaLista = lista.map { it * 2 }
        println("ejercicio 9 - Lista original: $lista")
        println("ejercicio 9 - Lista multiplicada: $nuevaLista")
}