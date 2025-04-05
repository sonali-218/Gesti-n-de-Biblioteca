package Biblioteca;

import java.util.Objects;

public abstract class Documento {
    private String titulo;
    private String codigo; // identificador único
    private boolean disponible;

    // Constructor
    public Documento(String titulo, String codigo, boolean disponible) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.disponible = disponible;
    }

    // Getter
    public String getTitulo() {
        return titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Setter
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Implementar equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Documento)) return false;
        Documento documento = (Documento) obj;
        return codigo.equals(documento.codigo);
    }

    // Implementar hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    // toString
    @Override
    public String toString() {
        return String.format("Título: " + titulo + ", Código: " + codigo + ", Disponible: " + disponible);
    }

    // Método abstracto que cada subclase debe implementar
    public abstract String getTipoDocumento();
}
