package ge.george.linkedlist;

import java.util.Optional;

public class Stack<K> {
    LinkedList<K> linkedList = new LinkedList<>();
    private Node<K> head;

    public Boolean isEmpty() {
        return linkedList == null;

    }

    public void push(K key) {
        linkedList.insertFirst(key);
    }

    public Optional<K> pop() {
        Optional<Node<K>> first = linkedList.removeFirst();
        return first.map(Node::getKey);
    }

    @Override
    public String toString() {
        return linkedList.toString().replaceFirst("LinkedList", "Stack");
    }

}

