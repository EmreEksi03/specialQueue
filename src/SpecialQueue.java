
class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}
class SinglyLinkedList<T> {

    private Node<T> head;
    private int size;
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public boolean remove(T data) {
        if (head == null) {
            return false;
        }

        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return true;
        }

        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void printInReverse() {
        printInReverseRecursive(head);
    }

    private void printInReverseRecursive(Node<T> node) {
        if (node == null) {
            return;
        }

        printInReverseRecursive(node.next);
        System.out.print(node.data + " -> ");
    }


    public T getLast() {
        if (head == null) {
            throw new IllegalStateException("The list is empty.");
        }

        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }

        return current.data;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("SinglyLinkedList: ");

        Node<T> current = head;
        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(" -> ");
            }
            current = current.next;
        }

        return result.toString();
    }

}
    public class SpecialQueue<E> {
    public int anlikIndex = 0;
    public SinglyLinkedList<E>  list = new SinglyLinkedList<>();
    public void enqueue(E ... a){
        for (E x : a) {
            list.add(x);
        }
    }
    public E dequeue(){
        E temp = list.get(anlikIndex);
        anlikIndex += 1;
        return temp;
    }
    public String toString() {
        return list.toString();
    }
}
