package ge.george.linkedlist;

public class LinkedListNode<K> {
    private LinkedListNode<K> prev;
    private LinkedListNode<K> next;
    private K key;

    public LinkedListNode() {
    }

    public LinkedListNode(K key) {
        setKey(key);
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setNext(LinkedListNode<K> next) {
        this.next = next;
    }

    public void setPrev(LinkedListNode<K> prev) {
        this.prev = prev;
    }

    public K getKey() {
        return key;
    }

    public LinkedListNode<K> getNext() {
        return next;
    }

    public LinkedListNode<K> getPrev() {
        return prev;
    }
}

