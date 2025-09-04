package libreria

fun main() {
    println("Bienvenido a tu estante de libros virtual")

    // --- CREACIÓN DE OBJETOS ---
    val elQuijote = Libro(
        titulo = "Don Quijote de la Mancha",
        autor = "Miguel de Cervantes",
        paginas = 863,
        genero = "Novela"
    )

    val nationalGeographic = Revista(
        titulo = "National Geographic",
        autor = "Varios",
        paginas = 120,
        numeroEdicion = 255
    )

    // --- USO DE LOS OBJETOS ---
    println("\n--- Información de las publicaciones ---")
    println(elQuijote.obtenerDescripcion())
    println("Género: ${elQuijote.genero}")

    println(nationalGeographic.obtenerDescripcion())
    println("Edición N°: ${nationalGeographic.numeroEdicion}")


    println("\n--- Acciones ---")
    // Usamos los métodos de la interfaz Prestable
    elQuijote.prestar()
    elQuijote.devolver()

    // La revista no tiene el método prestar(), porque no implementa la interfaz.
    // nationalGeographic.prestar() // <-- Esta línea daría error.
}