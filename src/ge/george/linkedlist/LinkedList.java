package ge.george.linkedlist;

import java.util.Optional;

public class LinkedList<K>{
    private Node<K> head;

    public Node<K> insert(K key) {
        if (head == null) {
            head = new Node<>(key);

        } else {
            Node<K> temp = new Node<>(key);
            temp.setNext(head);
            this.head.setPrev(temp);
            this.head = temp;

        }

        return head;
    }

    public boolean delete(K key) {
        Optional<Node<K>> search = search(key);
        if (search.isEmpty()) {
            return false;
        }

        Node<K> next = search.get().getNext();
        Node<K> prev = search.get().getPrev();
        if (prev != null) {
            prev.setNext(next);
        }
        if (next != null) {
            next.setPrev(prev);
        }


        return true;
    }


    public Optional<Node<K>> search(K key) {

        if (head == null) {
            return Optional.empty();
        }
        Node<K> temp = head;
        while (temp.getNext() != null) {
            if (temp.getKey().equals(key)) {
                break;
            }
            temp = temp.getNext();
        }
        if (!temp.getKey().equals(key)) {
            return Optional.empty();
        }

        return Optional.of(temp);
    }
}
