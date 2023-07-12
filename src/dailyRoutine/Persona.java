package dailyRoutine;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Persona implements Alimentos {
	Scanner scanner = new Scanner(System.in);
	// creacion de los atributos 
	protected String nombre;
	private List<String> lista_pendientes;
	 
	// creacion del metodo getter
	public String getnombre () {
		return nombre;
	}
	// creacion del metodo constructor 
	public Persona(String nombre) {
		this.nombre = nombre ;
		lista_pendientes = new ArrayList<>();
	}
	// creacion de metodos de la superclase
	
	// interfaz comer
	public void comer() {
		System.out.println("tener una buena alimentacion puede ayudarte a mejorar tu rendimiento");
		System.out.println("Desayuno: Puedes incluir cereales integrales (avena, pan integral), frutas frescas, lácteos o alternativas vegetales (leche, yogur) y proteínas (huevos, mantequilla de nueces).");
		System.out.println("  ");
		System.out.println("Almuerzo y cena: Asegúrate de incluir una porción de proteína (carne, pescado, legumbres) junto con una porción de carbohidratos (arroz, pasta, patatas) y una buena cantidad de verduras y/o ensaladas. ");
		System.out.println("  ");
		System.out.println("Meriendas: Opta por opciones saludables como frutas, frutos secos, yogur o vegetales crudos con hummus.");
		System.out.println("  ");
		System.out.println("Postres: Si deseas tener un postre, elige opciones más saludables como frutas frescas, yogur natural o gelatina baja en calorías. ");
	    }
	//HACER LA CAMA
	public void hacerla_cama() {
		System.out.println("hacer la cama: ¿lograste el objetivo?. Responde con si o no");
		String respuesta = scanner.nextLine();
		if (respuesta.equals("si")) {
			System.out.println("felicidades"+" "+nombre+" " + "lograste la tarea");
		}else {
			System.out.println("mañana lo haras mejor");
		}
	    }
	// TOMAR AGUA
	public void tomar_agua() {
		System.out.println("tomar agua: ¿lograste el objetivo?. Responde con si o no");
		String respuesta = scanner.nextLine();
		if (respuesta.equals("si")) {
			System.out.println("felicidades"+" "+nombre+" " + "lograste la tarea");
		}else {
			System.out.println("mañana lo haras mejor");
		}
	    }
	// BAÑARSE 
	public void bañarse() {
		System.out.println("bañarse: ¿cumpliste el objetivo?. Responde con si o no");
		String respuesta = scanner.nextLine();
		if (respuesta.equals("si")) {
			System.out.println("felicidades"+" "+nombre+" " + "lograste la tarea");
		}else {
			System.out.println("mañana lo haras mejor");
		}
	    }
	//lista de pendientes 
	
	public void listaPendientes() {
		
		while (true) {
            String elemento = scanner.nextLine();
            if (elemento.equalsIgnoreCase("fin")) {
                break;
            }
            lista_pendientes.add(elemento);
        }
		System.out.println("tareas pendientes: "+ lista_pendientes);
		System.out.println("¿lograste completar todos los objetivos de la lista?. Responde con si o no");
		String respuesta = scanner.nextLine();
		
		if (respuesta.equals("si")) {
			System.out.println("felicidades"+" "+nombre+" " + "lograste la tarea");
		}else {
			System.out.println("mañana lo haras mejor");
		}
	    }
	}
// creacion de la subclase
class PersonaPro extends Persona implements Alimentos{
	Scanner scanner = new Scanner(System.in);
	// creacion de el metodo constructor 
	public PersonaPro(String nombre) {
		super(nombre);
		 
	}
	// hacar ejercicio 
	public void hacer_ejercicio() {
		System.out.println("hacer ejercicio:¿lograste el objetivo?. Responde con si o no");
		String respuesta = scanner.nextLine();
		if (respuesta.equals("si")) {
			System.out.println("felicidades"+" "+nombre+" " + "lograste la tarea");
		}else {
			System.out.println("mañana lo haras mejor");
		}
	    }
	// meditar
	public void meditar() {
		System.out.println("meditar: ¿lograste el objetivo?. Responde con si o no");
		String respuesta = scanner.nextLine();
		if (respuesta.equals("si")) {
			System.out.println("felicidades"+" "+nombre+" " + "lograste la tarea");
		}else {
			System.out.println("mañana lo haras mejor");
		}
	    }
	public void organizar_estudio () {
		List<String> materias = new ArrayList<>();
        List<String> importancia = new ArrayList<>();

        // Rellenar lista de materias
        while (true) {
            System.out.println("Ingrese el nombre de la materia (o 'fin' para finalizar):");
            String materia = scanner.nextLine();
            if (materia.equalsIgnoreCase("fin")) {
                break;
            }
            materias.add(materia);

            System.out.println("Ingrese la importancia de la materia:");
            String elemento = scanner.nextLine();
            importancia.add(elemento);
        }
     // Combinar listas en un array
        Object[][] combinedArray = new Object[materias.size()][2];
        for (int i = 0; i < materias.size(); i++) {
            combinedArray[i][0] = materias.get(i);
            combinedArray[i][1] = importancia.get(i);
        }

        // Ordenar array en función de la importancia (de mayor a menor)
        java.util.Arrays.sort(combinedArray, (a, b) -> {
            String importanciaA = (String) a[1];
            String importanciaB = (String) b[1];
            return Integer.compare(Integer.parseInt(importanciaB), Integer.parseInt(importanciaA));
        });

        // Imprimir el array combinado ordenado
        System.out.println("Prioridad de estudio:");
        for (Object[] elemento : combinedArray) {
            System.out.println(elemento[0] + " - " + elemento[1]);
        }
    }








       

		
	}

	
	
	

