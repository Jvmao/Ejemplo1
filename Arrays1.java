
public class Arrays1 {

	public static void main(String[] args) {
		//creación de un Array con números enteros//
		int[] calificacion = new int[10];
		float media;
		
		//Rellenamos los elementos del Array//Un Array es como un Vector//
		calificacion[0]=0;
		calificacion[1]=4;
		calificacion[2]=6;
		calificacion[3]=7;
		calificacion[4]=8;
		calificacion[5]=5;
		calificacion[6]=5;
		calificacion[7]=5;
		calificacion[8]=5;
		calificacion[9]=4;
		
		//Calcular la media del Array//
		//nombreArray.legnth, devuelve el número de los elementos del Array//
		media=0;
		for(int pos=0; pos < calificacion.length; pos++){
			media=media+calificacion[pos];
			System.out.println("Media: " +media);
		}
		 
		media=media/calificacion.length;
		System.out.println("Media: " +media);
	}

}
