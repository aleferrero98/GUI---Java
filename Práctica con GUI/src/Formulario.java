import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
   private JLabel  etiqueta1;
   private JLabel  etiqueta2;
   private JButton boton;

   public Formulario() {
       super("Mi primera aplicación");
       setLayout(null);     //setea las coordenadas en donde se ubica la interfaz en la pantalla
       etiqueta1 = new JLabel("Hola amiguitos");
       etiqueta2 = new JLabel("Este es mi primera Interfaz :')");
       etiqueta1.setBounds(10, 20, 200, 300);
       etiqueta2.setBounds(100,250,200,300);
       boton = new JButton("Cerrar");
       boton.setBounds(390,430,90,30);
       add(etiqueta1);
       add(etiqueta2);
       add(boton);
       boton.addActionListener(this);//el action listener va a estar a la espera de un evento
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//termina la aplicacion al cerrar la ventana
   }
   public void actionPerformed(ActionEvent e){
       if(e.getSource()==boton){
           System.exit(0);//cierra la app cuando se pulsa sobre boton
       }
   }
}
