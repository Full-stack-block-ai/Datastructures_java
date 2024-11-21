package datastructures;

/**
 * A simple singly linked list implementation. Supports basic operations such as
 * appending, prepending, and removing nodes from both ends.
 */
public class LinkedList {
    private Node head;  // First node of the list
    private Node tail;  // Last node of the list
    private int size;   // Number of nodes in the list

    /**
     * Node represents an element in the linked list with a value and a link to the next node.
     */
    class Node {
        int value;      // Data held by the node
        Node next;      // Pointer to the next node in the list

        /**
         * Initializes a node with a specific value.
         */
        public Node(int value) {
            this.value = value;
        }
    }

    /**
     * Initializes the linked list with a single node.
     */
    public LinkedList(int value) {
        head = tail = new Node(value);
        size = 1;
    }

    /**
     * Returns the first node of the list.
     */
    public Node getHead() {
        return head;
    }

    /**
     * Returns the last node of the list.
     */
    public Node getTail() {
        return tail;
    }

    /**
     * Returns the total number of nodes in the list.
     */
    public int getSize() {
        return size;
    }

    /**
     * Prints all node values in the list to the console.
     */
    public void printAll() {
        Node temp = head;
        while (temp != null) {
            System.out.print("Value: " + temp.value + "\n");
            temp = temp.next;
        }
    }

    /**
     * Adds a node to the end of the list with a specific value.
     */
    public void append(int value) {
        Node newNode = new Node(value);
        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    /**
     * Removes the last node from the list and returns its value.
     * Returns -1 if the list is empty.
     */
    public int removeLast() {
        if (size == 0) {
            return -1;
        }

        int removedValue = tail.value;
        if (size == 1) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
        }
        size--;
        return removedValue;
    }

    /**
     * Adds a node to the front of the list with a specific value.
     */
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (size == 0) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    /**
     * Removes the first node of the list and returns it.
     * Returns null if the list is empty.
     */
    public Node removeFirst() {
        if (size == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }
        return temp;
    }
}
