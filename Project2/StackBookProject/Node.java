
/**
 * Write a description of class Node here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Node<T> {
    private T data;
    private Node<T> link;

    public Node(T d, Node<T> l) {
        data = d;
        link = l;
    }

    public Node<T> getLink() { return link; }

    public T getData() { return data; }

    public void setLink(Node<T> l) { link = l; }

    public void setData(T d) { data = d; }
}

