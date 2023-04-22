
import java.util.ArrayList;
import java.util.Scanner;



public class UI {
    static readFile read = new readFile();
    static Scanner sc = new Scanner(System.in);
    static Association RBT = Diccionario_Factory.crearArbol(1);
    static Association SPLAY = Diccionario_Factory.crearArbol(2);
    static Association AVL = Diccionario_Factory.crearArbol(3);
    static ArrayList<String> total = new ArrayList<>();
    static ArrayList<String> oracion_temp = read._readfile2("src\\Archivo_de_Oración_a_traducir.txt");



    
    public static void main(String[] args) {

        oracion_temp=read.split(oracion_temp, " ");
        System.out.println("\n¡Bienvenidos a un diccionario inglés - español!");
        //System.out.println("En este momento se leera el archivo de código...");
        total = read._readfile("src\\Archivo_de_Palabras.txt");
        System.out.println("Las palabras se han guardado en el diccionario");
        ArrayList<Palabra> aa  = new ArrayList<>();
        aa= read.crear_palabras(aa);
        boolean salir = false;
        RBT.Guardar_en_arbol(aa);
        AVL.Guardar_en_arbol(aa);
        SPLAY.Guardar_en_arbol(aa);
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
                    System.out.println("\nCon qué tipo de estructura de datos?");
                    System.out.println("\t  1.) Red Black ");
                    System.out.println("\t  2.) Splay");
                    System.out.println("\t  3.) ALV");
                    int pp = sc.nextInt();
                    if (pp ==1){
                        RBT.imprimir_datos();
                        } else if (pp ==2){
                        SPLAY.imprimir_datos();
                        }else if (pp ==3){
                        AVL.imprimir_datos();
                    }
                    break;
                case 2:
                    System.out.println("\nCon qué tipo de estructura de datos?");
                    System.out.println("\t  1.) Red Black ");
                    System.out.println("\t  2.) Splay");
                    System.out.println("\t  3.) ALV");
                    int pop = sc.nextInt();
                    if (pop ==1){
                        RBT.Traducir_oración(oracion_temp);
                    } else if (pop ==2){
                        SPLAY.Traducir_oración(oracion_temp);
                    }else if (pop ==3){
                        AVL.Traducir_oración(oracion_temp);
                    }
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
}
}


