package ge.george;

import com.sun.source.tree.BinaryTree;
import ge.george.binarytree.BinarySearchTree;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String a= "GIO";
        String b = "ANA";
        System.out.println(a.compareTo(b));
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        for (int i : Arrays.asList(9,5,3,7,2,4,6,8)) {
            tree.insert(i);
        }
        System.out.println(tree);
        System.out.println(tree.maximum());
        System.out.println(tree.minimum());
        System.out.println(tree.contains(23));
        System.out.println(tree.successor(7));
        System.out.println(tree.predecessor(7));
    }

}


