
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Macias
 */
public class holaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float perimetro;
        float area;
        Cuadrilatero c;
        System.out.println("Elija una operacion: \n 1. Cuadrado \n 2. Rectangulo");
        Scanner entra=new Scanner(System.in);
        int opc=entra.nextInt();
        
        if(opc==1){
            System.out.println("Has elegido cuadrado");
            System.out.println("Ingresa el lado de tu cuadrado: ");
            c=new Cuadrilatero(entra.nextInt());
        }
        else if(opc==2){
            System.out.println("Has elegido Rectangulo");
            System.out.println("Ingresa los lados de tu rectangulo: ");
            c=new Cuadrilatero(entra.nextInt(),entra.nextInt());
        }
        else{
            c=new Cuadrilatero(0);
        }
        
        perimetro=c.getPerimetro();
        area=c.getArea();
        
        System.out.println("Perimetro: "+perimetro);
        System.out.println("Area: "+area);
    }
    
}
