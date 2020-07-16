package ge.george;

import ge.george.linkedlist.Queue;
import ge.george.linkedlist.Stack;

import java.util.Deque;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(452);
        st.push(1256);
        st.push(1232);
        st.push(12123);
        st.push(128987);
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st);

        Queue<Integer> q = new Queue<>();
        q.enqueue(123);
        q.enqueue(2);
        q.enqueue(23);
        q.enqueue(12);
        System.out.println(q);
        System.out.println( q.dequeue());
        System.out.println( q.dequeue());
        System.out.println(q);

    }
}
