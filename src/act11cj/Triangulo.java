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
public class Triangulo extends shape {
     private double Base;
    private double Altura;

    public Triangulo(double Base, double Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }

    public void setBase(double Base, double Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }

    public double getBase() {
        return Base;
    }

    public double getAltura() {
        return Altura;
    }

    //ponemos la area y perimetro del Triangulo
    public double area() {
        return (Base * Altura) / 2.0;
    }

    public double perimeter() {
        return Base * 3.0;
    }

}
