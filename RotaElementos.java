package Vectores;

public class RotaElementos {

	public static void main(String[] args) throws InterruptedException {
		//Creamos el vector
		int[] vector = new int[10];
		int[] clon = new int[10];
		//Creamos el contador primario
		int contAsignacion=0;
		int contCambio=10;
		int contClon=0;
		int contEscribir=0;
		int posicion=0;
		int cambio=0;
		//Asignacion de valores aleatorios al vector
		while (contAsignacion<=9) {
			vector[contAsignacion]=(int)(Math.random()*10+1);
			System.out.printf(contAsignacion+"| "+vector[contAsignacion]+"\n");
			Thread.sleep(500);
			contAsignacion++;
		}
		//Asignacion de valores al clon
		while (contClon<=9) {
			clon[contClon]=vector[contClon];
			contClon++;
		}
		//Cambiar de posicion
		System.out.println("Avanzamos una posición su valor:");
		while (contCambio>=1) {
			if (contCambio==10) {
				posicion=0;
				cambio=9;
			}
			else {
				posicion=contCambio;
				cambio=contCambio-1;
			}
			vector[posicion]=clon[cambio];
			contCambio--;
		}
		//Escribimos el vector cambiado
		while (contEscribir<=9) {
			System.out.printf(contEscribir+"| "+vector[contEscribir]+"\n");
			Thread.sleep(500);
			contEscribir++;
		}
	}

}
