public class Node<T> {
    private T value;
    private Node<T> left;
    private Node<T> right;
    private int height;

    public Node(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.height = 1;
    }
}