/**
 * @author Regina Ivanna Gomez
 * @version 1.0
 * This class represents the Nodes
 * @param <T> This describes my type parameter
 */
public class Node<T> {
    private T data;
    private Node<T> next;

    /**
     * @param data what is stored in the node
     * @param next is a pointer to the following node
     **/
    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    /**
     * @param data what is stored in the node
     */
    public Node(T data) {
        this(data, null);
    }

    /**
     * @return the data in the node
     **/
    public T getData() {
        return this.data;
    }

    /**
     * @return the next node
     **/
    public Node<T> getNext() {
        return this.next;
    }

    /**
     * @param data sets the data
     **/
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @param next sets next node
     **/
    public void setNext(Node<T> next) {
        this.next = next;
    }
}