package Vectores;

public class CuadradoCubo {

	public static void main(String[] args) throws InterruptedException {
		//Creamos los vectores
		int[] numero=new int[20];
		int[] cuadrado=new int[20];
		int[] cubo=new int[20];
		//Creamos los contadores
		int contNumero=0;
		int contCuadrado=0;
		int contCubo=0;
		int contMostrar=0;
		//Damos valores al array numero
		//System.out.println("Damos valores al array numero");
		while (contNumero<=19) {
			numero[contNumero]=(int)(Math.random()*101);
			//System.out.printf(contNumero+". "+numero[contNumero]+"\n");
			//Thread.sleep(500);
			contNumero++;
		}
		//Damos valores al array cuadrado
		//System.out.println("Damos valores al array cuadrado");
		while (contCuadrado<=19) {
			cuadrado[contCuadrado]=(numero[contCuadrado]*numero[contCuadrado]);
			//System.out.printf(contCuadrado+". "+cuadrado[contCuadrado]+"\n");
			//Thread.sleep(500);
			contCuadrado++;
	}
		//Damos valores al array cubo
		//System.out.println("Damos valores al array cubo");
		while (contCubo<=19) {
			cubo[contCubo]=(numero[contCubo]*numero[contCubo]*numero[contCubo]);
			//System.out.printf(contCubo+". "+cubo[contCubo]+"\n");
			//Thread.sleep(500);
			contCubo++;
	}
		//Escribimos el resultado
		while (contMostrar<=19) {
			System.out.printf((contMostrar+1)+"| Numero="+numero[contMostrar]+"\tCuadrado="+cuadrado[contMostrar]+"\tCubo="+cubo[contMostrar]+"\n");
			contMostrar++;
				
		}
	}
}
