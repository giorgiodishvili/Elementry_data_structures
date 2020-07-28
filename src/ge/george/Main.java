package ge.george;

import com.sun.source.tree.BinaryTree;
import ge.george.binarytree.BinarySearchTree;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree1;
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        for (int i : Arrays.asList(6, 5, 2, 5, 7, 0)) {
            tree.insert(i);
        }
        System.out.println(tree);
        System.out.println(tree.maximum());
        System.out.println(tree.minimum());
        System.out.println(tree.contains(23));

    }

}


