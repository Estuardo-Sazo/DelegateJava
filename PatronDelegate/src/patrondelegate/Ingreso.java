/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrondelegate;

import javax.swing.JOptionPane;

/**
 *
 * @author Jaime Sazo
 */
public class Ingreso extends OperacionesMatematicas {
    Organiza miOrganiza;
    double mayor,menor;
    public Ingreso()
    {
     miOrganiza=new Organiza();
    }
    
    public void ingresar() 
        {
         try {
         numero1=5;
         numero2=20;
         
         mayor=miOrganiza.calculaMayor(numero1, numero2);
        
         menor=miOrganiza.calculaMenor(numero1, numero2);

         System.out.println("La division entre:" + ""+mayor+"/"+menor+" =  "+dividir(mayor, menor));

         } catch (Exception e) {
        System.out.println( "Error en el ingreso de datos");
         }
        } 
}
