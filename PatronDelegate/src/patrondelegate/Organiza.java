/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrondelegate;

/**
 *
 * @author Jaime Sazo
 */
public class Organiza {
    public double calculaMayor(double a, double b){
        if (a > b)
         return a;
        else
               return b;
       }
     public double calculaMenor(double a, double b) {
        if (a < b)
          return a;
        else
         return b;
       }
}
