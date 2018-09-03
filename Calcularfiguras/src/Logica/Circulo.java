
package Logica;

import static java.lang.Math.PI;

public class Circulo extends Figuras {

     public void getdatos(float valor1){
        radio=valor1;
    }
    @Override
    public void calcularperimetro() {
        System.out.println("El perimetro del circulo es: "+ (2*radio*PI));
    }

    @Override
    public void Calculararea() {
        System.out.println("El área del circulo es: "+ (PI*radio*radio));  
    }
    
}
