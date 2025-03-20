package co.edu.konradlorenz.model;

import java.util.ArrayList;
import java.util.List;

public class AlertasBancarias implements Alertas {
    private List<Alerta> listaAlertas;

    public AlertasBancarias() {
        this.listaAlertas = new ArrayList<>();
    }

    @Override
    public void registrarAlerta(String tipo, String descripcion) {
        listaAlertas.add(new Alerta(tipo, descripcion));
    }

    @Override
    public List<Alerta> revisarAlertas() {
        return new ArrayList<>(listaAlertas);
    }

    @Override
    public void tomarAccion(int idAlerta, String accion) {
        for (Alerta alerta : listaAlertas) {
            if (alerta.getId() == idAlerta) {
                System.out.println("Acción tomada en la alerta " + idAlerta + ": " + accion);
                return;
            }
        }
        System.out.println("No se encontró la alerta con ID " + idAlerta);
    }
}