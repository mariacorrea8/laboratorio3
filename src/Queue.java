import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {

    Node<Item> first;

    private class Node<Item> {
        Item item;
        Node<Item> next;

        public Node(Item item) {
            this.item = item;
            this.next = null;
        }
    }

    public Queue() {
        first = null;
    }

    public void enqueue(Item item) {
        Node<Item> nuevo = new Node<Item>(item);
        if (isEmpty()) {
            first = nuevo;
        } else {
            Node<Item> tmp = first;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = nuevo;
        }
    }

    public Item dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            Node<Item> tmp = first;
            first = first.next;
            return tmp.item;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        Node<Item> tmp = first;
        int i = 0;
        while (tmp != null) {
            tmp = tmp.next;
            i++;
        }
        return i;
    }

    public void showQueue() {
        Node<Item> tmp = first;
        while (tmp != null) {
            System.out.println(tmp.item);
            tmp = tmp.next;
        }
    }

    public Iterator<Item> iterator() {
        return new ListIterator<Item>(first);
    }

    private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;

        public ListIterator(Node<Item> first) {
            this.current = first;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            if (!hasNext()) {
                return null;
            }
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}


