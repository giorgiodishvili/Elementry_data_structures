package ge.george.problemsolve;

import ge.george.linkedlist.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Braces {
    public static String pairIndices(String s) {
        List<Memory> result = new ArrayList<>();
        Stack<Memory> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (check(c) == Type.OPEN) {
                Memory memory = new Memory();
                memory.open = c;
                memory.index1 = i+1;
                st.push(memory);
            }
            if (check(c)==Type.CLOSED){
                Memory memory = st.pop().get();
                memory.index2=i+1;
                result.add(memory);
            }
        }
        int[]arr = new int[s.length()];
        for (Memory m:result){
            arr[m.index1-1]=m.index2;
            arr[m.index2-1]=m.index1;
        }
        return Arrays.toString(arr);
    }
    
    public static boolean isCorrect(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (check(c) == Type.OPEN) st.push(c);
            if (check(c) == Type.CLOSED) {
                Optional<Character> pop = st.pop();

                if (pop.isEmpty() || !isPair(pop.get(), c)) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    private static boolean isPair(char start, char end) {
        return (start == '(' && end == ')')
                || (start == '{' && end == '}')
                || (start == '[' && end == ']');
    }

    private static Type check(char ch) {
        switch (ch) {
            case '(':
            case '{':
            case '[':
                return Type.OPEN;
            case ')':
            case '}':
            case ']':
                return Type.CLOSED;

            default:
                return Type.UNDEFINED;
        }

    }

    private enum Type {
        UNDEFINED, OPEN, CLOSED
    }
}
