package ge.george.linkedlist;

import java.util.Optional;

public class Queue<K> {
    LinkedList<K> linkedList = new LinkedList<>();

    public void enqueue(K key) {
        linkedList.insertFirst(key);
    }

    public Optional<K> dequeue() {
        Optional<LinkedListNode<K>> last = linkedList.removeLast();
        return last.map(LinkedListNode::getKey);
    }

    public Boolean isEmpty() {
        return linkedList == null;

    }


    @Override
    public String toString() {
        return linkedList.toString().replaceFirst("LinkedList", "Queue");
    }
}
