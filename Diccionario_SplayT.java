import java.util.ArrayList;
import java.util.Comparator;

public class Diccionario_SplayT implements Association{
    SplayT<Palabra> arbol = new SplayT<Palabra>();
    readFile read = new readFile();
    ArrayList<String> Espanol_Temp_en_cont = read.Espanol_Temp;
    ArrayList<String> Ingles_Temp_en_cont  = read.Ingles_Temp;
    ArrayList<String> Tipo_Palabra_Temp_en_cont = read.Tipo_Palabra_Temp;
    @Override
    public void Guardar_en_arbol() {
       // arbol.add();
    }

    @Override
    public void imprimir_datos() {

    }

    @Override
    public void Traducir_oración() {

    }
}
