
import java.util.NoSuchElementException;

/**
 * @version 1.0
 * @param <T> type of data found in the node
 **/
public class LinkedList<T> implements List<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    /**
     * Constructor for Linked List
     * Initialize head and size in here
     **/
    public LinkedList() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    /**
     * Getter for head instance
     * @return head value
     */
    public Node<T> getHead() {
        return head;
    }

    /**
     * Getter for tail instance
     * @return tail value
     */
    public Node<T> getTail() {
        Node<T> tailNode = head;
        int counter = 1;
        while (tailNode.getNext() != null) {
            tailNode = tailNode.getNext();
            counter++;
        }
        return tailNode;
    }

    @Override
    public void addAtIndex(T data, int index) {
        Node<T> newLinkedListNode = new Node<>(data, null);

        } else if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Your index is out of the list bounds");
        } else {
            if (index == 0 && size == 0) {
                this.head = newLinkedListNode;
                this.tail = newLinkedListNode;
            } else if (this.size == 0) {
                this.head = newLinkedListNode;
                this.tail = head;
            } else if (index == 0) {
                newLinkedListNode.setNext(head);
                this.head = newLinkedListNode;
            } else if (index == size) {
                this.tail.setNext(head);
                this.tail = newLinkedListNode;
            } else {
                Node<T> currentNode = this.head;
                Node<T> previousNode = null;
                int listIndex = 0;
                while (listIndex < index) {
                    previousNode = currentNode;
                    currentNode = currentNode.getNext();
                    listIndex++;
                }
                previousNode.setNext(new Node(data, currentNode));
            }
            this.size++;
        }
    }

    @Override
    public T getAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Your index is out of the list bounds");
        }
        Node<T> currentNode = this.head;
        int counter = 0;
        while (currentNode != null) {
            if (counter == index) {
                return currentNode.getData();
            }
            counter++;
            currentNode = currentNode.getNext();
        }
        return currentNode.getData();
    }


    @Override
    public T removeAtIndex(int index) {
        Node<T> currentListNode = this.head;
        int listIndex = 0;
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Your index is out of the list bounds");
        }
        while (listIndex < index) {
            if (listIndex == index - 1) {
                Node<T> nextNode;
                nextNode = currentListNode.getNext();
                currentListNode.setNext(nextNode.getNext());
                nextNode.setNext(null);
                listIndex++;
                this.size = this.size - 1;
            } else {
                listIndex++;
                currentListNode = currentListNode.getNext();
            }
        }
        T indexNodeInfo = getAtIndex(index);
        return indexNodeInfo;
    }


    @Override
    public T remove(T data) {
        if (data == null) {
            throw new IllegalArgumentException("You cannot remove null data from the list");
        } else if (this.head == null) {
            throw new NoSuchElementException("The data is not present in the list.");
        }
        Node currentNode = this.head;
        Node previousNode = null;
        while (currentNode != null && !currentNode.getData().equals(data)) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        if (currentNode == this.head && currentNode.getData().equals(data)) {
            Node<T> savedNodeInfo = head;
            head = head.getNext();
            size--;
            return savedNodeInfo.getData();
        } else if (currentNode == this.tail && currentNode.getData().equals(data)) {
            Node<T> saveNodeInfo = tail;
            previousNode.setNext(null);
            size--;
            return saveNodeInfo.getData();
        } else if (currentNode != null) {
            Node<T> updatedNodeInfo = currentNode;
            previousNode.setNext(currentNode.getNext());
            currentNode.setNext(null);
            size--;
            return updatedNodeInfo.getData();
        } else {
            throw new NoSuchElementException("The data is not present in the list.");
        }
    }

    @Override
    public void clear() {
        for (int i = 1; i < size; i++) {
            removeAtIndex(i);
        }
    }

    @Override
    public boolean isEmpty() {
        boolean i = true;
        if (head != null) {
            i = false;
        }
        return i;
    }

    @Override
    public int size() {
        return size;
    }

}
