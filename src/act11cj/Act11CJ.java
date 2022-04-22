/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act11cj;

import java.util.Scanner;

/**
 *
 * @author alexm
 */
public class Act11CJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     Scanner scanner = new Scanner(System.in);
     int select = -1; //se le pone -1 para salir del programa
     int select1 = 0; // se le pone un 0 para regresar al menu
     double circulo1 = 0;
     double lados = 0;
     double base = 0;
     double altura = 0;
    
     //Si la opcion elegida es igual a 0 se saldra del programa
        while (select !=0){
            try{
                System.out.println("Bienvenido a la calculadora\n" +
                        "seleccione una opcion:\n1.-Sacar area" +
                        "\n2.-Sacar perimetro\n" +
                        "0.-Salir");
                select = Integer.parseInt(scanner.nextLine());
                switch (select){
                    case 1:
                        do {
                            System.out.println("\nCalcular el area\n" +
                                    "seleccione una opcion:\n1.-Ciruculo" +
                                    "\n2.-Triangulo\n" +
                                    "3.-Cuadrado\n" +
                                    "0.-Regresar al menú");
                            select1 = Integer.parseInt(scanner.nextLine());
                            switch (select1) {
                                case 1:
                                    System.out.println("Ingrese el Radio");
                                    circulo1 = scanner.nextDouble();
                                    Circulo circulo = new Circulo(circulo1);
                                    System.out.println("PI vale: " + Circulo.PI);
                                    System.out.println("El area es: " + circulo.area() + "\n");
                                    break;
                                case 2:
                                    System.out.println("Ingrese la base: ");
                                    base = scanner.nextDouble();
                                    System.out.println("Ingrese la altura: ");
                                    altura = scanner.nextDouble();
                                    Triangulo triangulo =  new Triangulo(base,altura);
                                    System.out.println("El area es: " + triangulo.area() + "\n");
                                    break;
                                case 3:
                                    System.out.println("Ingrese el Lado");
                                    lados = scanner.nextDouble();
                                    Cuadrado cuadrado = new Cuadrado(lados);
                                    System.out.println("El area es: " + cuadrado.area() + "\n");
                                    break;
                                case 0:
                                    System.out.println("");
                                    break;
                                default:
                                    System.out.println("Opción no válida\n");
                                    break;
                            }
                            break;
                        }while (select1 != 0);
                        break;
                    case 2:
                        do {
                            System.out.println("\nCalcular el perimetro\n" +
                                    "seleccione una opcion:\n1.-Ciruculo" +
                                    "\n2.-Triangulo\n" +
                                    "3.-Cuadrado\n"+
                                    "0.-Regresar al menú");
                            select1 = Integer.parseInt(scanner.nextLine());
                            switch (select1) {
                                case 1:
                                    System.out.println("Ingrese el Radio");
                                    circulo1 = scanner.nextDouble();
                                    Circulo circulo = new Circulo(circulo1);
                                    System.out.println("El diametro es: " + circulo.getDiameter());
                                    System.out.println("El perimetro es: " + circulo.perimeter() + "\n");
                                    break;
                                case 2:
                                    System.out.println("Ingrese el lado: ");
                                    base = scanner.nextDouble();
                                    Triangulo triangulo =  new Triangulo(base,altura);
                                    System.out.println("El perimetro es: " + triangulo.perimeter() + "\n");
                                    break;
                                case 3:
                                    System.out.println("Ingrese el Lado");
                                    lados = scanner.nextDouble();
                                    Cuadrado cuadrado = new Cuadrado(lados);
                                    System.out.println("El perimetro es: " + cuadrado.perimeter() + "\n");
                                    break;
                                case 0:
                                    System.out.println("");
                                    break;
                                default:
                                    System.out.println("Opción no válida\n");
                                    break;
                            }
                        }while (select1 != 0);
                        break;
                    case 0:
                        System.out.println("Sigue Aprendiendo");
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            }catch (Exception e){
              System.out.println("Error\n");
            }
        
    }
    }
}
