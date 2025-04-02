package Biblioteca;

import java.util.HashSet;

public class SistemaGestionBiblioteca {
    public static void main(String[] args) {
        // instancia de biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // instancias de libros
        Libro libro1 = new Libro("El Quijote", "001", true, "Miguel de Cervantes", "978-3-16-148410-0", 500);
        Libro libro2 = new Libro("Cien años de soledad", "002", true, "Gabriel García Márquez", "978-3-16-148410-1", 400);
        Libro libro3 = new Libro("1984", "003", true, "George Orwell", "978-0-452-28423-4", 328);
        Libro libro4 = new Libro("Todos los cuentos", "004", true, "Gabriel García Márquez", "978-3-16-456781-0", 250);
        biblioteca.agregarDocumento(libro1);
        biblioteca.agregarDocumento(libro2);
        biblioteca.agregarDocumento(libro3);
        biblioteca.agregarDocumento(libro4);

        // instancias de revistas
        Revista revista1 = new Revista("National Geographic", "R001", true, "National Geographic Society", 1, "1234-5678", "Mensual");
        Revista revista2 = new Revista("Time", "R002", true, "Time Inc.", 2, "2345-6789", "Semanal");
        biblioteca.agregarDocumento(revista1);
        biblioteca.agregarDocumento(revista2);

        // instancias de estudiante
        Estudiante estudiante1 = new Estudiante("Alisson Quijano", "20245233");
        Estudiante estudiante2 = new Estudiante("Melisa Rivas", "20245687");
        Estudiante estudiante3 = new Estudiante("Alejandra Arriola", "20241387");

        // tomar prestado
        biblioteca.prestarDocumento("001", estudiante1);
        biblioteca.prestarDocumento("002", estudiante2);
        biblioteca.prestarDocumento("003", estudiante3);

        // prueba: imprimir el estado de los doc en la biblioteca
        System.out.println("Documentos en la biblioteca: ");
        biblioteca.imprimirTodosLosDocumentos();
        System.out.println("---------------------------------");

        // prueba: imprimir documentos prestados
        System.out.println("Documentos prestados: ");
        biblioteca.imprimirDocumentosPrestados();
        System.out.println("---------------------------------");

        // devolver un libro
        biblioteca.devolverDocumento("003");

        // imprimir estadísticas de la biblioteca
        System.out.println("Estadística de la biblioteca: ");
        biblioteca.imprimirEstadisticas();
        System.out.println("---------------------------------");

        // encontrar libros por autor
        HashSet<Libro> librosPorAutor = biblioteca.encontrarLibrosPorAutor("Gabriel García Márquez");
        System.out.println("Libros de Gabriel García Márquez: ");
        for (Libro libro : librosPorAutor) {
            System.out.println(libro);
        }
        System.out.println("---------------------------------");

        // encontrar revistas por editor
        HashSet<Revista> revistasPorEditor = biblioteca.encontrarRevistasPorEditor("Time Inc.");
        System.out.println("\nRevistas de Editor Desconocido:");
        for (Revista revista : revistasPorEditor) {
            System.out.println(revista);
        }
        System.out.println("---------------------------------");

        // estado final de la biblioteca
        System.out.println("\nEstado final de la biblioteca:");
        biblioteca.imprimirTodosLosDocumentos();
        System.out.println("---------------------------------");
    }
}
