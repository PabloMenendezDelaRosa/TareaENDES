package Vectores;
import java.util.Scanner;

public class RotaElementosVectorCompleto {

	public static void main(String[] args) throws InterruptedException {
		//Escaner teclado
		Scanner teclado=new Scanner(System.in);
		boolean correcto=false;
		int tamano=0;
		//Introducci�n tama�o vector
		while (correcto==false) {
			System.out.println("Dame el tama�o del vector: ");
			tamano=teclado.nextInt();
			if (tamano>0) {
				correcto=true;
			}
			else {
				System.out.println("Numero invalido (no debe ser ni negativo ni 0)");
			}
		}
		//Creamos los vector
		int[] vector = new int[tamano];
		
		
									//Funci�n de cambio de posici�n
		
		
		//Creamos los valores de la funci�on
		int[] clon = new int[vector.length];
		int contAsignacion=0;
		int contCambio=vector.length;
		int contClon=0;
		int contEscribir=0;
		int posicion=0;
		int cambio=0;
		//Asignacion de valores aleatorios al vector
		while (contAsignacion<=((vector.length)-1)) {
			vector[contAsignacion]=(int)(Math.random()*10+1);
			System.out.printf(contAsignacion+"| "+vector[contAsignacion]+"\n");
			Thread.sleep(500);
			contAsignacion++;
		}
		//Asignacion de valores al clon
		while (contClon<=((vector.length)-1)) {
			clon[contClon]=vector[contClon];
			contClon++;
		}
		//Cambiar de posicion
		System.out.println("Avanzamos una posici�n su valor:");
		while (contCambio>=1) {
			if (contCambio==(vector.length)) {
				posicion=0;
				cambio=(vector.length-1);
			}
			else {
				posicion=contCambio;
				cambio=contCambio-1;
			}
			vector[posicion]=clon[cambio];
			contCambio--;
		}
		//Escribimos el vector cambiado
		while (contEscribir<=((vector.length)-1)) {
			System.out.printf(contEscribir+"| "+vector[contEscribir]+"\n");
			Thread.sleep(500);
			contEscribir++;
		}
	}

}
