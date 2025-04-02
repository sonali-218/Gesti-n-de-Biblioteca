package Biblioteca;

import java.util.Objects;

class Estudiante {
    private String nombre;
    private String carnet;

    // Constructor
    public Estudiante(String nombre, String carnet) {
        this.nombre = nombre;
        this.carnet = carnet;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Estudiante that = (Estudiante) obj;
        return Objects.equals(carnet, that.carnet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carnet);
    }

    @Override
    public String toString() {
        return String.format("Nombre: " + nombre + ", Carnet: " + carnet);
    }
}
