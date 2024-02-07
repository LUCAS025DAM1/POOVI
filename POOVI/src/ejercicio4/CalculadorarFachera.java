package ejercicio4;

public class CalculadorarFachera {
	private final double elporcentaje = 10; 

  
    public double calcularPrecioTotal(double precioUnitario, int cantidad) {
        double precioTotal = precioUnitario * cantidad;
      
        if (cantidad > 5) {
            double descuento = (precioTotal * elporcentaje) / 100;
            precioTotal -= descuento;
        }
        return precioTotal;
    }
}
