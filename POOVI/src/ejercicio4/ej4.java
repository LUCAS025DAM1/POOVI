package ejercicio4;

import javax.swing.JOptionPane;

public class ej4 {

	public static void main(String[] args) {
		CalculadorarFachera calculadora = new CalculadorarFachera();

      
        String inputPrecio = JOptionPane.showInputDialog("Ingrese el precio unitario del producto:");
        String inputCantidad = JOptionPane.showInputDialog("Ingrese la cantidad de unidades:");
        
        double precioUnitario = Double.parseDouble(inputPrecio);
        int cantidad = Integer.parseInt(inputCantidad);
        
     
        double precioTotal = calculadora.calcularPrecioTotal(precioUnitario, cantidad);
        
        JOptionPane.showMessageDialog(null, "Precio total con descuento aplicado: euros" + precioTotal);
    }
}


