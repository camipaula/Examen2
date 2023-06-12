import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainForm extends JFrame {

    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JTextField textIngresoNombre;
    private JButton ingresarPlatoButton;
    private JTextArea textAIngresoPlatos;
    private JButton QuemarDatosButton;
    private JTextField textIngresoPrecio;
    private JTextField textIngresoCalorias;
    private JTextField textIngresoPreparacion;
    private JButton buscarModifButton;
    private JButton modificarModifButton;
    private JTextField textoModifPrecio;
    private JTextField textoModifCalorias;
    private JTextField textoModifPreparacion;
    private JTextArea textAModif;
    private JButton ButtonBuscarEliminar;
    private JTextField textNombreEliminar;
    private JTextArea textAEliminar;
    private JButton eliminarButton;
    private JComboBox comboBoxOrder;
    private JButton mostrarButton;
    private JTextArea textAMostrar;
    private JButton buscarButton;
    private JTextField textBuscarPlatoOrden;
    private JTextField textNombreModif;

    public mainForm() {

        Menu m=new Menu();
        modificarModifButton.setEnabled(false);
        eliminarButton.setEnabled(false);

        ingresarPlatoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (m.agregarPlato(new Plato(textIngresoNombre.getText(),Double.parseDouble(textIngresoPrecio.getText()),Double.parseDouble(textIngresoCalorias.getText()),Integer.parseInt(textIngresoPreparacion.getText())))){
                    JOptionPane.showMessageDialog(null,"Se ha agregado un plato correctamente");
                    textAIngresoPlatos.setText(m.toString());
                } else {
                    JOptionPane.showMessageDialog(null,"Llene todos los espacios correctamente");
                }
            }
        });
        QuemarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            m.QuemarDatos();
            JOptionPane.showMessageDialog(null,"Se han quemado los datos");
            QuemarDatosButton.setEnabled(false);
            textAIngresoPlatos.setText(m.toString());
            }
        });
        buscarModifButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textNombreModif.getText()!=null){
                Plato p = m.buscarNombre(textNombreModif.getText());
                if (p!=null) {
                    modificarModifButton.setEnabled(true);
                    textoModifPrecio.setText(String.valueOf(p.getPrecio()));
                    textoModifCalorias.setText(String.valueOf(p.getValorCalórico()));
                    textoModifPreparacion.setText(String.valueOf(p.getTiempoDePreparación()));
                    textoModifPrecio.setEditable(true);
                    textoModifCalorias.setEditable(true);
                    textoModifPreparacion.setEditable(true);

                } else {
                    JOptionPane.showMessageDialog(null,"No se encontó el plato");
                }
            }else {
                    JOptionPane.showMessageDialog(null,"Ingrese el nombre del plato a busacr");
                }
            }

        });
        modificarModifButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m.modificar(textNombreModif.getText(),Double.parseDouble(textoModifPrecio.getText()),Double.parseDouble(textoModifCalorias.getText()),Integer.parseInt(textoModifPreparacion.getText()));
                textAModif.setText(m.toString());
                textoModifPrecio.setText("");
                textoModifCalorias.setText("");
                textoModifPreparacion.setText("");
                textoModifPrecio.setEditable(false);
                textoModifCalorias.setEditable(false);
                textoModifPreparacion.setEditable(false);

            }
        });
        ButtonBuscarEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textNombreEliminar.getText()!=null){
                    Plato p = m.buscarNombre(textNombreEliminar.getText());
                    if (p!=null) {
                        eliminarButton.setEnabled(true);
                        textAEliminar.setText(p.toString());
                    } else {
                        JOptionPane.showMessageDialog(null,"No se encontó el plato");
                    }
                }else {
                    JOptionPane.showMessageDialog(null,"Ingrese el nombre del plato a busacr");
                }
            }

        });
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m.eliminar(textNombreEliminar.getText());
                textAEliminar.setText("Plato eliminado");
            }
        });
        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }



    //Get mainPanel
    public JPanel getMainPanel() {
        return mainPanel;
    }
}
