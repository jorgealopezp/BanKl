package co.edu.konradlorenz.model;

public class Valor {
    private int id;
    private String nombre;

    public Valor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
