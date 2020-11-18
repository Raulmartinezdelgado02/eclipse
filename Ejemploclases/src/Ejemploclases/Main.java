package Ejemploclases;

public class Main {

	public static void main(String[] args) {
		Persona Raul = new Persona();
		Raul.setNombre("Raul");
		System.out.println("El nombre de esta persona es: "+Raul.getNombre());
		
		Raul.setApellidos("Martinez Delgado");
		System.out.println("Los apellidos de esta persona es: "+Raul.getApellidos());
		
		Raul.setNif("12345678A");
		System.out.println("El nif de esta persona es: "+Raul.getNif());
}
}
