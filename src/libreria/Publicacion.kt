package libreria

// interfaz tiene una propiedad para saber el estado.
interface Prestable {
    // Cada clase que implemente la interfaz
    // valor inicial.
    var estaPrestado: Boolean

    fun prestar()
    fun devolver()
}

// --- CLASE ABSTRACTA ---
abstract class Publicacion(
    val titulo: String,
    val autor: String,
    val paginas: Int
) {
    fun obtenerDescripcion() = "$titulo por $autor - $paginas páginas."
}

//  nueva interfaz.
class Libro(
    titulo: String,
    autor: String,
    paginas: Int,
    val genero: String
) : Publicacion(titulo, autor, paginas), Prestable {

    // Implementación de la propiedad de la interfaz.
    // Por defecto, un libro nuevo no está prestado.
    override var estaPrestado: Boolean = false

    // Lógica mejorada en los métodos.
    override fun prestar() {
        if (estaPrestado) {
            println("-> ERROR: El libro '$titulo' ya se encuentra prestado.")
        } else {
            estaPrestado = true
            println(" El libro '$titulo' ha sido prestado con éxito.")
        }
    }

    override fun devolver() {
        if (estaPrestado) {
            estaPrestado = false
            println("El libro '$titulo' ha sido devuelto correctamente.")
        } else {
            println("-> ERROR: El libro '$titulo' no estaba prestado, no se puede devolver.")
        }
    }
}

// --- CLASE REVISTA (SIN CAMBIOS) ---
class Revista(
    titulo: String,
    autor: String,
    paginas: Int,
    val numeroEdicion: Int
) : Publicacion(titulo, autor, paginas)