package libreria

fun main() {
    println("📚 Bienvenido a tu estante de libros virtual 📚")

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


    println("\n--- Publicaciones en el estante ---")
    println(elQuijote.obtenerDescripcion())
    println(nationalGeographic.obtenerDescripcion())


    println("\n--- Simulación de préstamos para '${elQuijote.titulo}' ---")

    elQuijote.prestar()
    elQuijote.devolver()


}