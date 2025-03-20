package co.edu.konradlorenz.model;

public class Alerta {
    private static int contador = 0;
    private int id;
    private String tipo;
    private String descripcion;

    public Alerta(String tipo, String descripcion) {
        this.id = ++contador;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }
}
