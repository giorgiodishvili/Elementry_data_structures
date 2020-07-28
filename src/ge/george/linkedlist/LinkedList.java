package ge.george.linkedlist;

import java.util.Iterator;
import java.util.Optional;

public class LinkedList<K> implements Iterable<K> {
    private LinkedListNode<K> head;
    private LinkedListNode<K> tail;

    public boolean isEmpty() {
        return head == null;
    }

    public LinkedListNode<K> getTail() {
        return tail;
    }

    public LinkedListNode<K> insertFirst(K key) {
        if (head == null) {
            head = new LinkedListNode<>(key);
            tail = head;
        } else {
            LinkedListNode<K> temp = new LinkedListNode<>(key);
            temp.setNext(head);
            this.head.setPrev(temp);
            this.head = temp;
        }
        return head;
    }

    public boolean delete(K key) {
        Optional<LinkedListNode<K>> search = search(key);
        if (search.isEmpty()) {
            return false;
        }
        LinkedListNode<K> next = search.get().getNext();
        LinkedListNode<K> prev = search.get().getPrev();
        if (prev != null) {
            prev.setNext(next);
        }
        if (next != null) {
            next.setPrev(prev);
        }
        return true;
    }

    public Optional<LinkedListNode<K>> search(K key) {
        if (head == null) {
            return Optional.empty();
        }
        LinkedListNode<K> temp = head;
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

    public Optional<LinkedListNode<K>> removeLast() {
        LinkedListNode<K> temp = tail;
        if (temp == null) return Optional.empty();
        ;
        if (temp == head) {
            tail = null;
            head = null;
            return Optional.of(temp);
        }
        tail = tail.getPrev();
        tail.setNext(null);
        temp.setPrev(null);
        return Optional.of(temp);
    }

    public Optional<LinkedListNode<K>> removeFirst() {
        LinkedListNode<K> temp = head;
        if (temp == null) return Optional.empty();
        ;
        if (temp == tail) {
            tail = null;
            head = null;
            return Optional.of(temp);
        }
        head = head.getNext();
        head.setPrev(null);
        temp.setNext(null);
        return Optional.of(temp);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LinkedList{");
        LinkedListNode<K> temp = head;
        while (temp != null) {
            sb.append(temp.getKey()).append(", ");
            temp = temp.getNext();
        }
        if (sb.indexOf(",") > 0) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public Iterator<K> iterator() {
        return new LinkedListIterator<>(head);
    }

    private static class LinkedListIterator<T> implements Iterator<T> {

        private LinkedListNode<T> linkedListNode;

        private LinkedListIterator(LinkedListNode<T> linkedListNode) {
            this.linkedListNode = linkedListNode;
        }

        @Override
        public boolean hasNext() {
            return linkedListNode != null;
        }

        @Override
        public T next() {
            T key = linkedListNode.getKey();
            linkedListNode = linkedListNode.getNext();
            return key;
        }
    }
}

