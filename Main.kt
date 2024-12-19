fun main() {
    val sel = menu()
    when (sel) {
        1 -> area_cuadrado()
        2 -> area_circulo()
        3 -> area_triangulo()
        else -> println("Opción no definida!")
    }
}

fun menu(): Int {
    println("=======================")
    println("Calculadora de áreas")
    println("1) Calcular el área de un cuadrado")
    println("2) Calcular el área de un círculo")
    println("3) Calcular el área de un triángulo")
    println("=======================")
    print("Selecciona una opción: ")
    
    return readLine()?.toIntOrNull() ?: -1 // Devuelve -1 si la entrada no es válida
}

fun area_cuadrado() {
    print("Ingrese el valor de un lado: ")
    val lado = readLine()?.toFloatOrNull()
    if (lado != null && lado > 0) {
        val area = lado * lado
        println("=======================")
        println("El área del cuadrado es $area")
    } else {
        println("Entrada no válida.")
    }
}

fun area_circulo() {
    print("Ingrese el radio del círculo: ")
    val radio = readLine()?.toFloatOrNull()
    if (radio != null && radio > 0) {
        val area = Math.PI * (radio * radio)
        println("=======================")
        println("El área del círculo es ${"%.2f".format(area)}")
    } else {
        println("Entrada no válida.")
    }
}

fun area_triangulo() {
    print("Ingrese la base del triángulo: ")
    val base = readLine()?.toFloatOrNull()
    print("Ingrese la altura del triángulo: ")
    val altura = readLine()?.toFloatOrNull()

    if (base != null && altura != null && base > 0 && altura > 0) {
        val area = (base * altura) / 2
        println("=======================")
        println("El área del triángulo es $area")
    } else {
        println("Entrada no válida.")
    }
}