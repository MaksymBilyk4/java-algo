package LinkedList;

public class LinkList {
    private Node head;
    private Node tail;

    public int indexOf(int value) {
        Node current = this.head;
        int i = 0;

        while (current != null) {
            if (current.value == value) {
                return i;
            }
            current = current.next;
            i++;
        }

        return -1;
    }

    public void add(int value) {
        Node node = new Node(value, null);

        if (this.head == null) {
            this.head = node;
            this.tail = this.head;
            return;
        }

        this.tail.next = node;
        this.tail = tail.next;
    }

    public int indexOfRec(int value) {
        return indexOfRec(value, this.head);
    }

    public int indexOfRec(int value, Node list) {
        if (list.value == value) return 0;
        if (list.next == null) return Integer.MIN_VALUE;
        return 1 + indexOfRec(value, list.next);
    }

    public void addRec(int value) {
        if (this.head == null) {
            this.head = new Node(value, null);
            return;
        }
        addRec(value, this.head);
    }

    public void addRec(int value, Node list) {
        if (list.next == null) {
            list.next = new Node(value, null);
            this.tail = list.next;
            return;
        }

        addRec(value, list.next);
    }

    public String toStringRec() {
        return toStringRec(this.head);
    }

    public String toStringRec(Node list) {
        if (list.next == null) {
            return String.valueOf(list.value);
        }

        return list.value + " - > " + toStringRec(list.next);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;

        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }

        return sb.toString();
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
