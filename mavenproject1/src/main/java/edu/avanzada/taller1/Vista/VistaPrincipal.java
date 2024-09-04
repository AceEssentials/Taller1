/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.Vista;

/**
 *
 * @author JULIAN
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaPrincipal extends JFrame {

    private JTextField txtCedula, txtNombre, txtApellido, txtLibretaMilitar;
    private JComboBox<String> comboSituacion;
    private JButton btnInsertar, btnConsultar, btnCambiar;

    public VistaPrincipal() {
        // Configuración del JFrame
        setTitle("Gestión de Situación Militar");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        // Crear componentes
        txtCedula = new JTextField();
        txtNombre = new JTextField();
        txtApellido = new JTextField();
        txtLibretaMilitar = new JTextField();

        comboSituacion = new JComboBox<>(new String[]{"Reservista", "Remiso", "Aplazado", "Reclutado"});

        btnInsertar = new JButton("Insertar");
        btnConsultar = new JButton("Consultar");
        btnCambiar = new JButton("Cambiar");

        // Agregar componentes al JFrame
        add(new JLabel("Cédula:"));
        add(txtCedula);
        add(new JLabel("Nombre:"));
        add(txtNombre);
        add(new JLabel("Apellido:"));
        add(txtApellido);
        add(new JLabel("Libreta Militar:"));
        add(txtLibretaMilitar);
        add(new JLabel("Situación:"));
        add(comboSituacion);
        add(btnInsertar);
        add(btnConsultar);
        add(btnCambiar);

        // Mostrar la ventana
        setVisible(true);
    }

    // Getters para los componentes para ser usados por el controlador
    public String getCedula() {
        return txtCedula.getText();
    }

    public String getNombre() {
        return txtNombre.getText();
    }

    public String getApellido() {
        return txtApellido.getText();
    }

    public String getLibretaMilitar() {
        return txtLibretaMilitar.getText();
    }

    public String getSituacionSeleccionada() {
        return (String) comboSituacion.getSelectedItem();
    }

    public void setInsertarListener(ActionListener listener) {
        btnInsertar.addActionListener(listener);
    }

    public void setConsultarListener(ActionListener listener) {
        btnConsultar.addActionListener(listener);
    }

    public void setCambiarListener(ActionListener listener) {
        btnCambiar.addActionListener(listener);
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }
}
