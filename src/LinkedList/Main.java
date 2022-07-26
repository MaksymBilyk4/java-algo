package LinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addRec(1);
        list.addRec(2);
        list.addRec(3);

        System.out.println(list.indexOfRec(3));
        System.out.println(list.indexOfRec(2));
        System.out.println(list.indexOfRec(1));
        System.out.println(list.indexOfRec(22));
        System.out.println(list);
        System.out.println(list.toStringRec());
    }
}
