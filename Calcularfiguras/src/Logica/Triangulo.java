/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author Estudiantes
 */
public class Triangulo extends Figuras{
    private double lado3;
    private double hipo;
    public void getdatos(float valor1,float valor2){
        base=valor1;
        altura=valor2;
    }
    public void tercerlado(){
        this.hipo = pow(this.base,2)+pow(this.altura,2);
        this.lado3 = sqrt(this.hipo);
    }
    @Override
    public void calcularperimetro() {
        tercerlado();
        System.out.println("El perimetro del triangulo es "+ (base+altura+this.lado3));    }

    @Override
    public void Calculararea() {
        System.out.println("El area del triangulo es "+ (base*altura));
    }
    
    
}
