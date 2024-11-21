import datastructures.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList myList = new LinkedList(10);
        myList.append(30);
        myList.append(40);
        myList.append(50);
        myList.append(60);
        myList.append(70);
        myList.removeLast();
        myList.removeFirst();
        myList.printAll();
    }

}
