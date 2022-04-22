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
public class Cuadrado extends shape {
    protected double Lado;

    public Cuadrado(double lado) {
        this.Lado = lado;
    }

    public double getLado() {
        return Lado;
    }

    public void setLado(double lado) {
        this.Lado = lado;
    }
    //ponemos la area y perimetro del cuadrado
    public double area() {
        return Lado * Lado;
    }

    public double perimeter() {
        return Lado * 4;
    }
}
