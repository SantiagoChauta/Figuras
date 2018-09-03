
package javaapplication6;

import Logica.Circulo;
import Logica.Cuadrado;
import Logica.Rectangulo;
import Logica.Triangulo;
import java.util.Scanner;

public class JavaApplication6 {

    public static void main(String[] args) {
        float base,altura,radio;
        int figura;
        Scanner sc= new Scanner(System.in);
        Rectangulo R= new Rectangulo();
        Circulo c= new Circulo();
        Cuadrado cu=new Cuadrado();
        Triangulo T = new Triangulo();
        System.out.println("¿Que figura desea calcular?");
        System.out.println("1.Circulo\n2.Rectangulo\n3.Triangulo\n4.Cuadrado");
        figura=sc.nextInt();
        switch (figura)
        {
            case 1: 
                System.out.println("Ingrese el radio del circulo");
                radio=sc.nextFloat();
                c.getdatos(radio);
                c.calcularperimetro();
                c.Calculararea();
                break;
            case 2:
                System.out.println("Ingrese la base del rectangulo");
                base=sc.nextFloat();
                System.out.println("Infrese la altura del rectangulo");
                altura=sc.nextFloat();
                R.getdatos(base, altura);
                R.calcularperimetro();
                R.Calculararea();
                break;
            case 3:
                System.out.println("Ingrese la base del triangulo");
                base=sc.nextFloat();
                System.out.println("Ingrese la altura del triangulo");
                altura=sc.nextFloat();
                T.getdatos(base, altura);
                T.calcularperimetro();
                T.Calculararea();
                break;
            case 4:
                System.out.println("Ingrese la base del cuadrado");
                base=sc.nextFloat();
                cu.getdatos(base);
                cu.calcularperimetro();
                cu.Calculararea();
                break;
        }
    }
    
}
