public class Diccionario_Factory {
    public static Association crearArbol(int tipo) {
        if (tipo==1) {
            return new Diccionario_RBT();
        } else if (tipo==2) {
            return new Diccionario_SplayT();
        }else if (tipo==3) {
            return new Diccionario_AVL();
        } else {
            return null;
        }
    }
}
