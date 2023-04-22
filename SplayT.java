import java.util.Comparator;

import structure5.SplayTree;
/**
 * @author MAAG
 *
 */
public class SplayT<T extends Comparable<T>> implements edu.uvg.ht9.Map<T> {

    private SplayTree<T> miArbolInterno;

    public SplayT() {
        miArbolInterno = new SplayTree<T>();
    }

    public SplayT(Comparator<T> comparador) {
        miArbolInterno = new SplayTree<T>(comparador);
    }

    @Override
    public void add(T value) {
        miArbolInterno.add(value);

    }

    @Override
    public T get(T key) {

        return miArbolInterno.get(key);
    }

    @Override
    public T remove(T key) {

        return miArbolInterno.remove(key);
    }

    @Override
    public int count() {
        return miArbolInterno.size();
    }

    @Override
    public boolean isEmpty() {
        return miArbolInterno.isEmpty();
    }

    public SplayTree<T> getInternalTree(){
        return miArbolInterno;
    }
}