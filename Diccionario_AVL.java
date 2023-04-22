import Model.AVLTree;

import java.util.ArrayList;

public class Diccionario_AVL implements Association{
    Model.AVLTree<Palabra> arbol = new AVLTree<Palabra>();
    readFile read = new readFile();
    @Override
    public void Guardar_en_arbol(ArrayList<Palabra> palabras_temp) {
        for (Palabra a:palabras_temp) {
            arbol.add(a);
        }
    }

    @Override
    public void imprimir_datos() {

    }

    ArrayList<String> Oracion_traducida = new ArrayList<>();
    @Override
    public void Traducir_oración(ArrayList<String> a) {
        Oracion_traducida.clear();
        for (String Palabra : a) {
            Palabra = Palabra.toLowerCase();
            //Que la palabra si este en el diccionario
            String palabra_a_buscar = Palabra;
            Palabra pa_temp = new Palabra(palabra_a_buscar, null);
            Palabra vv = arbol.get(pa_temp);
            Palabra traduccion_de_palabra = null;
            if (vv != null) {
                traduccion_de_palabra = arbol.get(pa_temp);
            } else if (Palabra.equals(".")) {
                traduccion_de_palabra = new Palabra("*", "*");
            }
            String traduc = traduccion_de_palabra.getSpanish();
            Oracion_traducida.add(traduc);
            //Que la palabra no este en el diccionario
        }
        //palabra.toLowerCase()
        System.out.println("\nOración traducida:");
        for (int i = 0; i < Oracion_traducida.size(); i++) {
            System.out.print(Oracion_traducida.get(i) + " ");
        }
    }
}
