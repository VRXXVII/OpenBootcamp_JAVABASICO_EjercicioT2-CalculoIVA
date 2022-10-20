package EjercicioTema2;
import java.util.Scanner;

public class FuncionPrecioIVA {


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double precioProducto, IVAEntero, precioFinal;

        System.out.println("Introduce el precio del producto: ");
        precioProducto = lector.nextDouble();

        System.out.println("Introduce el % de IVA:");
        IVAEntero = lector.nextDouble();

        precioFinal = calculaIVA(IVAEntero, precioProducto) + precioProducto;
        System.out.println("El precio (IVA incluido) es de: " + precioFinal);

    }

    public static double calculaIVA (double IVA, double precio){
        double IVAFinal;
        IVAFinal = precio * IVA/100;
        return IVAFinal;
    }
}
