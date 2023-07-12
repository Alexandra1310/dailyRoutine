package dailyRoutine;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creacion de los objetos
  Persona persona1 = new Persona("Alejandro");
  PersonaPro persona2 = new PersonaPro("Alejandro");
  // todos los metodos de la superclase 
  System.out.println("hola"+" "+persona1.getnombre()+" " +"comprueba que tan buenx eres para cumplir los habitos mas comunes del dia a dia:");
  persona1.hacerla_cama();
  persona1.tomar_agua();
  persona1.bañarse();
  System.out.println("si deseas tener una alimentacion saludable te ofrecemos algunas ideas");
  persona1.comer();
  System.out.println("   ");
  System.out.println("crea un a lista con los pendientes que tengas que hacer durante el dia");
  persona1.listaPendientes();
  // metodos de la subclase
  System.out.println("hola"+" "+persona1.getnombre()+" "+"comprueba que tan buenx eres para cumplir los habitos mas comunes del dia dia:");
  persona2.hacer_ejercicio();
  persona2.meditar();
  System.out.println("organiza tu tiempo de estudio teniendo encuenta la importancia de cada materia segun tu criterio");
  persona2.organizar_estudio();

  
	}

}
