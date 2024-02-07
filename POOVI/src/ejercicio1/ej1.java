package ejercicio1;

import javax.swing.JOptionPane;

public class ej1 {

	public static void main(String[] args) {
		CalculadoraImpuestos calculadora = new CalculadoraImpuestos(0.15);

        String input = JOptionPane.showInputDialog("Ingrese el precio del producto:");
      
        double precioProducto = Double.parseDouble(input);
       
        double impuesto = calculadora.calcularImpuesto(precioProducto);
        
        double precioFinal = calculadora.calcularPrecioFinal(precioProducto, impuesto);
        
        JOptionPane.showMessageDialog(null, "Precio del producto: $" + precioProducto + "\nImpuesto: $" + impuesto + "\nPrecio final: $" + precioFinal);
    }
}


