/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        clase uno abstracta llamada Figura; con atributos:
        características y área; la clase debe tener un método
        abstracto calcular_area.
        - clase llamada Triángulo (hereda de Figura); con
        atributos: base y altura.
        - clase llamada Rombo (hereda de Figura) con atributo: diagonal_menor y 
        diagonal mayor.
        - clase llamada Cuadrado (hereda Figura) con: atributos: lado.
        - clase Ejecutor, que permite generar:
            4 objetos de tipo Cuadrado
            3 objetos de tipo Rombo
            5 objeto de Triángulo 
            Comprobar el concepto del polimorfismo.
         */

        // inicio de la solución
        double b, a = 0;
        
        ArrayList<Figura> figuras = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un lado del Cuadrado: ");
            b = sc.nextDouble();
            a = b;
            figuras.add(new Cuadrado(b, a));
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la diagonal_menor: ");
            b = sc.nextDouble();
            System.out.println("Ingrese la diagonal mayor: ");
            a = sc.nextDouble();
            figuras.add(new Rombo(b, a));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la base: ");
            b = sc.nextDouble();
            System.out.println("Ingrese la altura: ");
            a = sc.nextDouble();
            figuras.add(new Triangulo(b, a));
        }

        // proceso para comprobar el polimorfismo
        for (int i = 0; i < figuras.size(); i++) {
            // 1.  
            figuras.get(i).calcular_area();
            
            System.out.printf("Datos de Figura\n"
                    + "%s\n",
                    figuras.get(i));
        }
    }
}
