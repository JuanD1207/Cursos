package Modulo_1;


import javax.swing.*;

public class Variables {
    //variables o tipos de datos primitivos
   public static void Captura(){
       int entero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
       Double decimal=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el salario deseado"));
       Float decimalf=Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu ultimo salario"));
       String civil=JOptionPane.showInputDialog("Ingresa tu estado civil");
       if(civil.equals("soltero")){
           boolean estado=true;
       }else{
           boolean estado=false;
       }
       JOptionPane.showMessageDialog(null,"Datos ingresados:\n Edad:"+entero+"\n Salario anterior"+decimalf+"\nAplica para la vacante");
   }


    public static void main(String[] args) {
     Captura();
    }
}
