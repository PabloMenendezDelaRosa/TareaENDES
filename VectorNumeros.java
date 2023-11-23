package Vectores;
public class VectorNumeros {

	public static void main(String[] args) throws InterruptedException {
		//crear vector
		int [] Vector;
		//Dimensionar vector (se puede hacer las dos cosas a la vez int [] VectorAgradable=new int[10]; 
		Vector=new int[10];
		//Dar valores al vector
		Vector[0]=30;
		Vector[1]=-2;
		Vector[4]=0;
		Vector[6]=14;
		Vector[8]=5;
		Vector[9]=120;
		//Bucle
		int cont=0;//Contador del bucle
		while (cont<=(Vector.length-1)) {
			System.out.printf("Vector["+cont+"]="+Vector[cont]+";\n");
			cont++;
			Thread.sleep(500);
		}
	}
}
