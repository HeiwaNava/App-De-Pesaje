package src.controller;

import src.model.Pesaje;
import src.model.PesajeManager;

public class PesajeController {

    private PesajeManager manager = PesajeManager.getInstance();

    public void registrarPesaje(String producto, double peso) {
        Pesaje p = new Pesaje(peso, producto);
        manager.agregarPesaje(p);
    }
}