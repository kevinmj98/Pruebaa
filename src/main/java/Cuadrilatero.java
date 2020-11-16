/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Macias
 */
public class Cuadrilatero {
    private float lado1;
    private float lado2;
    
    public Cuadrilatero(float lado1){
        this.lado1=lado1;
        this.lado2=lado1;
    }
    
    public Cuadrilatero(float lado1, float lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }
    
    public float getPerimetro(){
        float perimetro;
        perimetro=(this.lado1+this.lado2)*2;
        
        return perimetro;
    }
    
    public float getArea(){
        float area;
        area=this.lado1*this.lado2;
        
        return area;
    }
}
