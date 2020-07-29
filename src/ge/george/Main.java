package ge.george;

import com.sun.source.tree.BinaryTree;
import ge.george.binarytree.BinarySearchTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
//        for (int i : Arrays.asList(9,5,3,7,2,4,6,8)) {
//            tree.insert(i);
//        }

        List<Person> list = new ArrayList<>();
        list.add(new Person("10","Giorg",1));
        list.add(new Person("09","asdfg",2));
        list.add(new Person("08","Misha",3));
        list.add(new Person("06","Nika",4));
        list.add(new Person("07","Gio",5));
        list.add(new Person("05","Gsdfio",6));
        list.add(new Person("04","Giosdf",7));
        list.add(new Person("03","Giowwer",8));
        list.add(new Person("02","SOSO",9));
        PeopleFunction a = new PeopleFunction();
        a.setData(list);
        System.out.println(a.findPersonByPersonalID("03"));
        System.out.println(a.getPersonOlderThan(5));
        // a.print();

//        System.out.println(tree);
//        System.out.println(tree.maximum());
//        System.out.println(tree.minimum());
//        System.out.println(tree.contains(23));
//        System.out.println(tree.successor(7));
//        System.out.println(tree.predecessor(7));
    }

}


