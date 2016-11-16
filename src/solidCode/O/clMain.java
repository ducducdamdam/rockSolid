package solidCode.O;

public class clMain {
    public static void main(String[] Args){
        clCirculo circulo = new clCirculo();
        clCuadrado cuadrado = new clCuadrado();
        clDibujo dibujar = new clDibujo();
        dibujar.dibujar(circulo);
        dibujar.dibujar(cuadrado);
        
    }
    
}