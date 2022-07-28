package Graphs;

import java.util.LinkedList;
import java.util.List;

public class Tree {

    private Node root;

    public static class Node {
        private int value;
        private List<Node> children;

        public Node(int value, List<Node> children) {
            this.value = value;
            this.children = children;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public List<Node> getChildren() {
            return children;
        }

        public void setChildren(List<Node> children) {
            this.children = children;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", children=" + children.size() +
                    '}';
        }
    }

    public Tree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    @Override
    public String toString() {
        return toStringRec(root);
    }

    public String toStringRec(Node node) {
        if (node.getChildren() == null) {
            return String.valueOf(node.value);
        }

        StringBuilder sb = new StringBuilder(String.valueOf(node.value + ""));

        for (Node child: node.getChildren()) {
            sb.append(toStringRec(child)).append(" ");
        }

        return sb.toString();
    }

    public LinkedList<Integer> getPath(int value) {
        LinkedList<Integer> path = new LinkedList<>();
        fillPath(root, value, path);
        return path;
    }

    public void fillPath (Node node, int value, LinkedList<Integer> path) {

    }
}
