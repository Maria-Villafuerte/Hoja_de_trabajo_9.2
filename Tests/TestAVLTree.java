package Tests;
import static org.junit.Assert.*;
import org.junit.Test;

public class AVLTreeTest {

    @Test
    public void testInsert() {
        AVLTree<Integer> tree = new AVLTree<Integer>();
        tree.add(10);
        tree.add(20);
        tree.add(30);
        tree.add(40);
        assertEquals(Integer.valueOf(30), tree.get(30));
    }

    @Test
    public void testSearch() {
        AVLTree<String> tree = new AVLTree<String>();
        tree.add("apple");
        tree.add("banana");
        tree.add("orange");
        assertEquals("banana", tree.get("banana"));
    }
}
