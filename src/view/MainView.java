package view;

import controller.PesajeController;
import model.Pesaje;
import model.PesajeManager;
import model.PesajeObserver;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame implements PesajeObserver {

    private JTextField txtProducto;
    private JTextField txtPeso;
    private JTextArea areaLista;

    private PesajeController controller;

    public MainView() {

        controller = new PesajeController();
        PesajeManager.getInstance().addObserver(this);

        setTitle("Sistema de Pesaje");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelTop = new JPanel(new GridLayout(3,2));

        panelTop.add(new JLabel("Producto:"));

        txtProducto = new JTextField();
        panelTop.add(txtProducto);

        panelTop.add(new JLabel("Peso (kg):"));

        txtPeso = new JTextField();
        panelTop.add(txtPeso);

        JButton btnAgregar = new JButton("Registrar");
        panelTop.add(btnAgregar);

        add(panelTop, BorderLayout.NORTH);

        areaLista = new JTextArea();
        add(new JScrollPane(areaLista), BorderLayout.CENTER);

        btnAgregar.addActionListener(e -> registrar());

        setVisible(true);
    }

    private void registrar() {

        try {

            String producto = txtProducto.getText();
            double peso = Double.parseDouble(txtPeso.getText());

            controller.registrarPesaje(producto, peso);

            txtProducto.setText("");
            txtPeso.setText("");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Datos inválidos");
        }
    }

    @Override
    public void actualizar() {

        areaLista.setText("");

        for (Pesaje p : PesajeManager.getInstance().getLista()) {

            areaLista.append(p.toString() + "\n");
        }
    }
}