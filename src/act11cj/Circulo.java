/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act11cj;

/**
 *
 * @author alexm
 */
public class Circulo extends shape{
    public static final double PI = 3.141592;

    protected double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    public double getDiameter() {
        return radio * 2;
    }

    //ponemos la area y perimetro del Circulo
    public double area() {
        return PI * radio * radio;
    }

    public double perimeter() {
        return PI * getDiameter();
    }
    
}
