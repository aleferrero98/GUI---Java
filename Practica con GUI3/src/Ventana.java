import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {
    JButton boton1;
    JButton boton2;
    JTextField campoNombre, campoDNI, campoDia, campoMes, campoAnio;
    String nombre, dni, dia, mes, anio;



    public Ventana(){
        super("Añadir usuario");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0,0,350,150);

        //Panel Fecha
        JPanel panelFecha = new JPanel();
        panelFecha.setLayout(new FlowLayout());
        campoDia=new JTextField(2);
        campoMes=new JTextField(2);
        campoAnio=new JTextField(4);
        panelFecha.add(campoDia);
        panelFecha.add(new JLabel("/"));
        panelFecha.add(campoMes);
        panelFecha.add(new JLabel("/"));
        panelFecha.add(campoAnio);

        //Panel de Datos
        JPanel panelDatos = new JPanel();
        GridLayout gl = new GridLayout(3,2,0,5);
        panelDatos.setLayout(gl);
        panelDatos.add(new JLabel("Nombre: "));
        campoNombre=new JTextField(10);
        panelDatos.add(campoNombre);
        panelDatos.add(new JLabel("DNI: "));
        campoDNI=new JTextField(10);
        panelDatos.add(campoDNI);
        panelDatos.add(new JLabel("Fecha de nacimiento: "));
        panelDatos.add(panelFecha);

        //Panel de botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 15,5));
        boton1=new JButton("Aceptar");
        boton2=new JButton("Cancelar");
        panelBotones.add(boton1);
        panelBotones.add(boton2);
        boton1.addActionListener(this);
        boton2.addActionListener(this);

        Container cp= getContentPane();
        cp.add(panelDatos, BorderLayout.CENTER);
        cp.add(panelBotones,BorderLayout.SOUTH);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton2){
            System.exit(0);
        }else if(e.getSource()==boton1){
            nombre=campoNombre.getText();
            dni= campoDNI.getText();
            dia=campoDia.getText();
            mes=campoMes.getText();
            anio=campoAnio.getText();
            System.out.println("Nombre: "+nombre);
            System.out.println("DNI: "+dni);
            System.out.println("Fecha de nacimiento: "+dia+"/"+mes+"/"+anio);
        }
    }
}
