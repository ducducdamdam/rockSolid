package notSoSolid.L;

public class clMain {
    
    public static void calcularArea(clRectangulo rectangulo){
        System.out.println(rectangulo.getAlto()*rectangulo.getAncho());
    }
    
    public static void main(String[] Args){
        clCuadrado cuadrado = new clCuadrado();
        cuadrado.setAlto(5);
        cuadrado.setAncho(10);
        calcularArea(cuadrado);
    }
}
