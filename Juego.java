/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author anton
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // TODO code application logic here
        Random rand = new Random();
        int  n = rand.nextInt(10) + 1;
        int num;
             
        Scanner teclado= new Scanner(System.in);

        for(int i=4;i>-1;i--){
            System.out.println("Escriba un numero entre 1 y 10");
            num=teclado.nextInt();
            if(num==n){
                System.out.println("Has ganado");
                break;
            }
            else if(i>0) {
            System.out.println("Error, el numero no es correcto, te quedan: " +
                i + " intentos ");
           
            }
            
            if(i==0){
                System.out.println("Has agotado tus intentos");
                break;
            }
        }
    }
    
}
    
    

