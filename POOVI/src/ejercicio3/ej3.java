package ejercicio3;

import javax.swing.JOptionPane;

public class ej3 {

	public static void main(String[] args) {
		 ComprobadorEdadVotar comprobador = new ComprobadorEdadVotar();

	        
	        String input = JOptionPane.showInputDialog("Ingrese su edad:");
	        
	       
	        int edad = Integer.parseInt(input);
	        
	 
	        boolean esElegible = comprobador.PuedeVotar(edad);
	        

	        if (esElegible) {
	            JOptionPane.showMessageDialog(null, "Enhorabuena! Puedes votar e irte a las cariñosas XDDD");
	        } else {
	            JOptionPane.showMessageDialog(null, "Usted todavía debe ver Peppa Pig");
	        }
	    }
	}
