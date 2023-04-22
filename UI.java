
import java.util.ArrayList;
import java.util.Scanner;



public class UI {
    static readFile read = new readFile();
    static Scanner sc = new Scanner(System.in);
    Association RBT = Diccionario_Factory.crearArbol(1);
    Association gato = Diccionario_Factory.crearArbol(2);
    static ArrayList<String> total = new ArrayList<>();
    static ArrayList<String> oracion_temp = read._readfile2("src\\Archivo_de_Oración_a_traducir.txt");
    static Palabra par_tem = new Palabra("a", "s");
    


    
    public static void main(String[] args) {
        System.out.println(par_tem);
        /*
        oracion_temp=read.split(oracion_temp, " ");
        System.out.println("\n¡Bienvenidos a un diccionario inglés - español!");
        //System.out.println("En este momento se leera el archivo de código...");
        total = read._readfile("src\\Archivo_de_Palabras.txt");
        System.out.println("Las palabras se han guardado en el diccionario");
        boolean salir = false;
        while (!salir) {
            // display menu and get user input
            System.out.println("\nAhora qué desea hacer?");
            System.out.println("\t  1.) Desplegar las palabras ");
            System.out.println("\t  2.) Traducir una oración");
            System.out.println("\t  3.) Salir");
            int opcion_de_menu = sc.nextInt();

            switch (opcion_de_menu) {
                case 1:
                    //Palabras
                    ArrayList<Palabra> aa  = new ArrayList<>();
                    read.crear_palabras(aa);
                    System.out.println();
                    break;
                case 2:
                    //1. Español 2.ingles 3. Frances

                    break;
                case 3:
                    System.out.println("\nEl programa ha terminado\n");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
             
    }
*/
}
}


