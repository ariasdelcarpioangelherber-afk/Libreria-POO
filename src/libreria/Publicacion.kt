package libreria

// --- INTERFAZ ---
// Define qué acciones debe tener un objeto que se puede prestar.
interface Prestable {
    fun prestar()
    fun devolver()
}

// --- CLASE ABSTRACTA ---
// Es la plantilla base para cualquier cosa que se publique.
abstract class Publicacion(
    val titulo: String,
    val autor: String,
    val paginas: Int
) {
    // Un método que todas las publicaciones tendrán.
    fun obtenerDescripcion() = "$titulo por $autor - $paginas páginas."
}

// --- CLASES CONCRETAS ---
// Un Libro es una Publicacion y también es Prestable.
class Libro(
    titulo: String,
    autor: String,
    paginas: Int,
    val genero: String
) : Publicacion(titulo, autor, paginas), Prestable {

    override fun prestar() {
        println("El libro '$titulo' ha sido prestado.")
    }

    override fun devolver() {
        println("El libro '$titulo' ha sido devuelto.")
    }
}

// Una Revista es una Publicacion, pero NO es Prestable.
class Revista(
    titulo: String,
    autor: String,
    paginas: Int,
    val numeroEdicion: Int
) : Publicacion(titulo, autor, paginas)