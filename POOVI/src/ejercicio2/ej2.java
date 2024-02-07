package ejercicio2;

import javax.swing.JOptionPane;

public class ej2 {

	public static void main(String[] args) {
		 ConversorTemperatura conversor = new ConversorTemperatura();

	   
	        String input = JOptionPane.showInputDialog("Ingrese la temperatura en Celsius:");
	        
	       
	        double temperaturaCelsius = Double.parseDouble(input);
	        
	        double temperaturaFahrenheit = conversor.convertirCelsiusAFahrenheit(temperaturaCelsius);
	        
	     
	        JOptionPane.showMessageDialog(null, "Temperatura en Celsius: " + temperaturaCelsius + "\nTemperatura en Fahrenheit: " + temperaturaFahrenheit);
	    }
	}


