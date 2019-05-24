import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {
    JLabel etiqueta1;
    JButton boton1;
    JTextField campoTexto;

    public Ventana(){
        super("app para saludar");
        setSize(400,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        etiqueta1=new JLabel("Nombre: ");
        campoTexto=new JTextField(20);
        boton1=new JButton("Saludar");
        add(etiqueta1);
        add(campoTexto);
        add(boton1);
        setResizable(false);
        setLocationRelativeTo(null);
        boton1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton1){
            System.out.println(campoTexto.getText());
        }
    }
}
