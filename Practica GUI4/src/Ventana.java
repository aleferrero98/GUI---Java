import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{
    JButton boton;
    JTextField campoTexto;
    public Ventana(){
        super("Saludar persona");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0,0,450,100);

        JPanel panel= new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JLabel("Ingrese su nombre: "));
        campoTexto=new JTextField(15);
        panel.add(campoTexto);
        boton = new JButton("Saludar");
        panel.add(boton);
        boton.addActionListener(new EventoSaludo(campoTexto));

        Container cp= getContentPane();
        cp.add(panel, BorderLayout.CENTER);

    }
}
