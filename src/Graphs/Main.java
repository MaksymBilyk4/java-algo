package Graphs;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tree.Node root = new Tree.Node(2, new ArrayList<>());

        Tree.Node nine = new Tree.Node(9, new ArrayList<>());
        nine.getChildren().add(new Tree.Node(2, null));

        Tree.Node twelve = new Tree.Node(12, new ArrayList<>());
        twelve.getChildren().addAll(List.of(
                new Tree.Node(1, null),
                new Tree.Node(7, null),
                new Tree.Node(2, null)
        ));

        Tree.Node eight = new Tree.Node(8, null);

        Tree.Node ninetyNight = new Tree.Node(99, new ArrayList<>());
        ninetyNight.getChildren().addAll(List.of(
                new Tree.Node(44, null),
                new Tree.Node(11, null)
        ));

        Tree.Node ten = new Tree.Node(10, new ArrayList<>());
        ten.getChildren().addAll(List.of(
                new Tree.Node(55, null),
                new Tree.Node(87, null)
        ));

        root.getChildren().addAll(List.of(
            nine, twelve, eight, ninetyNight, ten
        ));

        Tree tree = new Tree(root);
        System.out.println(tree);
    }
}
