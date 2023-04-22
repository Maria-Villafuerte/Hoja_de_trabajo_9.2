package Tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SplayTTest {

    @Test
    void testAddAndGet() {
        SplayT<Integer> splayTree = new SplayT<>();

        // Insertar algunos valores
        splayTree.add(5);
        splayTree.add(3);
        splayTree.add(7);

        // Verificar que se hayan insertado correctamente
        assertEquals(3, splayTree.count());
        assertEquals(5, splayTree.get(5));
        assertEquals(3, splayTree.get(3));
        assertEquals(7, splayTree.get(7));

        // Verificar que al buscar un valor que no existe, se retorne null
        assertNull(splayTree.get(2));
    }
}
