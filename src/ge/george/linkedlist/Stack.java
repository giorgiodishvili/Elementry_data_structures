package ge.george.linkedlist;

import java.util.Optional;

public class Stack<K> {
    LinkedList<K> linkedList = new LinkedList<>();

    public Boolean isEmpty() {
       return linkedList.isEmpty();
    }


    public void push(K key) {
        linkedList.insertFirst(key);
    }
    public Optional<K> pop() {
        Optional<LinkedListNode<K>> first = linkedList.removeFirst();
        return first.map(LinkedListNode::getKey);
    }

    @Override
    public String toString() {
        return linkedList.toString().replaceFirst("LinkedList", "Stack");
    }

}

