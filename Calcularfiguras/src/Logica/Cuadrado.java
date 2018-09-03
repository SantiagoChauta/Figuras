package Logica;

public class Cuadrado extends Figuras {
    public void getdatos(float valor1){
        base=valor1;
    }
    @Override
    public void calcularperimetro() {
        System.out.println("El perimetro del cuadrado es "+ (base*4));
    }

    @Override
    public void Calculararea() {
        System.out.println("El area del cuadrado es "+ (this.base*base)); 
    }
    
}
