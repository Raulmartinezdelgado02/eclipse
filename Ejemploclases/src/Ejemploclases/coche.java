package Ejemploclases;

public class coche {

	String marca;
	String modelo;
	
coche(){
	marca="Ford";
	modelo="Focus";
}

coche (String mar, String mod){
	marca=mar;
	modelo=mod;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}
}