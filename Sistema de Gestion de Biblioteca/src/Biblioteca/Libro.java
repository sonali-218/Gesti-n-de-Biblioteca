package Biblioteca;

class Libro extends Documento {
    private String autor;
    private String isbn;
    private int numeroPaginas;

    // Constructor
    public Libro(String titulo, String codigo, boolean disponible, String autor, String isbn, int numeroPaginas) {
        super(titulo, codigo, disponible);
        this.autor = autor;
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
    }

    // Getters
    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    // Setters
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String getTipoDocumento() {
        return "Libro";
    }

    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor + ", ISBN: " + isbn + ", Cantidad de páginas: " + numeroPaginas;
    }
}
