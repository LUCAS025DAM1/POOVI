package ejercicio3;

public class ComprobadorEdadVotar {
	private final int mayoriaedad = 18;

    public boolean PuedeVotar(int edad) {
        return edad >= mayoriaedad;
    }
}
