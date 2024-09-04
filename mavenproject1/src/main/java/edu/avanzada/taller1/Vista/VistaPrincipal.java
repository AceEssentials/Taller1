package edu.avanzada.taller1.Vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VistaPrincipal extends JFrame {
    private JTextField txtCedula, txtNombre, txtApellido, txtLibretaMilitar;
    private JComboBox<String> comboSituacion;
    private JButton btnInsertar, btnConsultar, btnCambiar;

    public VistaPrincipal() {
        // Configuración del JFrame
        setTitle("Gestión de Situación Militar");
        setSize(550, 350); // Aumentamos el tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        getRootPane().setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Crear componentes
        txtCedula = new JTextField(20); // Aumentamos el tamaño de los campos de texto
        txtNombre = new JTextField(20);
        txtApellido = new JTextField(20);
        txtLibretaMilitar = new JTextField(20);
        comboSituacion = new JComboBox<>(new String[]{"Reservista", "Remiso", "Aplazado", "Reclutado"});
        btnInsertar = new JButton("Insertar");
        btnConsultar = new JButton("Consultar");
        btnCambiar = new JButton("Cambiar");

        // Agregar componentes al JFrame
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 10, 10);
        c.anchor = GridBagConstraints.EAST;
        add(new JLabel("Cédula:"), c);
        c.gridx = 1;
        add(txtCedula, c);

        c.gridx = 0;
        c.gridy = 1;
        add(new JLabel("Nombre:"), c);
        c.gridx = 1;
        add(txtNombre, c);

        c.gridx = 0;
        c.gridy = 2;
        add(new JLabel("Apellido:"), c);
        c.gridx = 1;
        add(txtApellido, c);

        c.gridx = 0;
        c.gridy = 3;
        add(new JLabel("Libreta Militar:"), c);
        c.gridx = 1;
        add(txtLibretaMilitar, c);

        c.gridx = 0;
        c.gridy = 4;
        add(new JLabel("Situación:"), c);
        c.gridx = 1;
        add(comboSituacion, c);

        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 2;
        c.anchor = GridBagConstraints.CENTER;
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(btnInsertar);
        buttonPanel.add(btnConsultar);
        buttonPanel.add(btnCambiar);
        add(buttonPanel, c);

        // Mostrar la ventana
        setVisible(true);
    }

    public String getCedulaText() {
        return txtCedula.getText();
    }

    public String getNombreText() {
        return txtNombre.getText();
    }

    public String getApellidoText() {
        return txtApellido.getText();
    }

    public String getLibretaMilitarText() {
        return txtLibretaMilitar.getText();
    }

    public String getSituacionSeleccionada() {
        return (String) comboSituacion.getSelectedItem();
    }

    public void setInsertarButtonListener(ActionListener listener) {
        btnInsertar.addActionListener(listener);
    }

    public void setConsultarButtonListener(ActionListener listener) {
        btnConsultar.addActionListener(listener);
    }

    public void setCambiarButtonListener(ActionListener listener) {
        btnCambiar.addActionListener(listener);
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }
}