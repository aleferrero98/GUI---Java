//https://www.youtube.com/watch?v=E3_3bF_q64k
//https://www.youtube.com/watch?v=VOGula26mMM
//https://www.youtube.com/watch?v=6PMMn62pf78
public class Main {

    public static void main(String[] args) {
        Formulario formulario=new Formulario();
        formulario.setBounds(0,0,500,500);//ancho y altura de la interfaz en pixeles
        formulario.setVisible(true); //quiero que mi interfaz se vea--->true
        formulario.setLocationRelativeTo(null);//sin importar las coordenadas arriba te coloca la ventana centrada
        formulario.setResizable(false);//false: no deja que el usuario pueda cambiar el tamaño de la ventana
    }
}
