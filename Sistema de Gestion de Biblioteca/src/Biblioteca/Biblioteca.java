package Biblioteca;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Biblioteca {
    private HashSet<Documento> documentos;
    private HashMap<String, Estudiante> registrosPrestamos;
    // código del documento --> Estudiante

    public Biblioteca() {
        documentos = new HashSet<>();
        registrosPrestamos = new HashMap<>();
    }

    public void agregarDocumento(Documento documento) {
        documentos.add(documento);
    }

    public boolean eliminarDocumento(String codigo) {
        for (Documento doc : documentos) {
            if (doc.getCodigo().equals(codigo)) {
                documentos.remove(doc);
                return true;
            }
        }
        return false;
    }

    public boolean prestarDocumento(String codigo, Estudiante estudiante) {
        for (Documento doc : documentos) {
            if (doc.getCodigo().equals(codigo) && doc.isDisponible()) {
                doc.setDisponible(false);
                registrosPrestamos.put(codigo, estudiante);
                return true;
            }
        }
        return false;
    }

    public boolean devolverDocumento(String codigo) {
        if (registrosPrestamos.containsKey(codigo)) {
            for (Documento doc:documentos) {
                if (doc.getCodigo().equals(codigo)) {
                    doc.setDisponible(true);
                    registrosPrestamos.remove(codigo);
                    return true;
                }
            }
        }
        return false;
    }

    public HashSet<Documento> encontrarDocumentosPrestadosA(Estudiante estudiante){
        HashSet<Documento> documentosPrestados = new HashSet<>();
        for (String codigo: registrosPrestamos.keySet()) {
            if (registrosPrestamos.get(codigo).equals(estudiante)){
                for (Documento doc:documentos){
                    if (doc.getCodigo().equals(codigo)){
                        documentosPrestados.add(doc);
                    }
                }
            }
        }
        return documentosPrestados;
    }

    public HashSet<Libro> encontrarLibrosPorAutor(String autor) {
        HashSet<Libro> librosPorAutor = new HashSet<>();
        for (Documento doc : documentos) {
            if (doc instanceof Libro && ((Libro) doc).getAutor().equals(autor)) {
                librosPorAutor.add((Libro) doc);
            }
        }
        return librosPorAutor;
    }

    public HashSet<Revista> encontrarRevistasPorEditor(String editor) {
        HashSet<Revista> revistasPorAutor = new HashSet<>();
        for (Documento doc : documentos) {
            if (doc instanceof Revista && ((Revista) doc).getEditor().equals(editor)) {
                revistasPorAutor.add((Revista) doc);
            }
        }
        return revistasPorAutor;
    }

    public void imprimirTodosLosDocumentos() {
        for (Documento doc : documentos) {
            System.out.println(doc);
        }
    }

    public void imprimirDocumentosPrestados() {
        for (String codigo : registrosPrestamos.keySet()) {
            for (Documento doc : documentos) {
                if (doc.getCodigo().equals(codigo)) {
                    System.out.println(doc + ", Prestado a: " + registrosPrestamos.get(codigo));
                }
            }
        }
    }

    public void imprimirEstadisticas() {
        int totalDocumentos = documentos.size();
        int totalLibros = 0;
        int totalRevistas = 0;
        int documentosPrestados = registrosPrestamos.size();
        int documentosDisponibles = (int) documentos.stream().filter(Documento::isDisponible).count();

        for (Documento doc : documentos) {
            if (doc instanceof Libro) {
                totalLibros++;
            } else if (doc instanceof Revista) {
                totalRevistas++;
            }
        }

        System.out.println("Total de documentos: " + totalDocumentos);
        System.out.println("Total de libros: " + totalLibros);
        System.out.println("Total de revistas: " + totalRevistas);
        System.out.println("Documentos prestados: " + documentosPrestados);
        System.out.println("Documentos disponibles: " + documentosDisponibles);
    }
}
