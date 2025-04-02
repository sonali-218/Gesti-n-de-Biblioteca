package Biblioteca;

class Revista extends Documento{
    private String editor;
    private int numeroEdicion;
    private String issn;
    private String periodicidad; // mensual, semanal, etc.

    // Constructor
    public Revista(String titulo, String codigo, boolean disponible, String editor, int numeroEdicion, String issn, String periodicidad) {
        super(titulo, codigo, disponible);
        this.editor = editor;
        this.numeroEdicion = numeroEdicion;
        this.issn = issn;
        this.periodicidad = periodicidad;
    }

    // Getter
    public String getEditor() {
        return editor;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public String getIssn() {
        return issn;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    // Setter
    public void setEditor(String editor) {
        this.editor = editor;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    @Override
    public String getTipoDocumento() {
        return "Revista";
    }

    @Override
    public String toString() {
        return super.toString() + "Editor: " + editor + ", Edición: " + numeroEdicion + ", ISSN: " + issn + ", Periodicidad: " + periodicidad;
    }
}
