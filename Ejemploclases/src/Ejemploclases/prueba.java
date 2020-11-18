package Ejemploclases;

public class prueba {

		public static void main(String[] args) {
			coche c1;
			coche c2;
			c1=new coche();
			c2=new coche("Renault", "Scenic");
			System.out.println("La marca del coche 1 es: "+c1.getMarca());
			System.out.println("El modelo del coche 1 es: "+c1.getModelo());
			System.out.println("La marca del coche 2 es: "+c2.getMarca());
			System.out.println("El modelo del coche 2 es: "+c2.getModelo());
			c1.setMarca("Opel");
			c1.setModelo("Astra");
			c2.setMarca("Peugeot");
			c2.setModelo("308");
			System.out.println("Ahora la marca del coche 1 es: "
			+c1.getMarca());
			System.out.println("Ahora el modelo del coche 1 es: "
			+c1.getModelo());
			System.out.println("Ahora la marca del coche 2 es: "
			+c2.getMarca());
			System.out.println("Ahora el modelo del coche 2 es: "
			+c2.getModelo());
		}
}