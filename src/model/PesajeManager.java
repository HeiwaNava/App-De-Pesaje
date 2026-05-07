package model;

import java.util.ArrayList;
import java.util.List;



public class PesajeManager {

    private static PesajeManager instance;

    private List<Pesaje> lista = new ArrayList<>();
    private List<PesajeObserver> observers = new ArrayList<>();

    private PesajeManager() {}

    public static PesajeManager getInstance() {
        if (instance == null) {
            instance = new PesajeManager();
        }
        return instance;
    }

    public void agregarPesaje(Pesaje p) {
        lista.add(p);
        notificar();
    }

    public List<Pesaje> getLista() {
        return lista;
    }

    // OBSERVER
    public void addObserver(PesajeObserver obs) {
        observers.add(obs);
    }

    private void notificar() {
        for (PesajeObserver obs : observers) {
            obs.actualizar();
        }
    }
}
