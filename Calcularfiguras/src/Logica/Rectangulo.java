
package Logica;
public class Rectangulo extends Figuras{
    public void getdatos(float valor1,float valor2){
        this.base=valor1;
        this.altura=valor2;
    }
    @Override
    public void Calculararea() {
        System.out.println("El area del rectangulo es "+ (this.base*this.altura));
    }

    @Override
    public void calcularperimetro() {
        System.out.println("El perimetro del rectangulo es "+ (this.base*2+2*this.altura));
    }
    
}
