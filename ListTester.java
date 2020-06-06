public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);
        sll.add(6);
        sll.add(7);
        sll.add(8);
        sll.add(9);
        sll.add(10);
        sll.add(11);
        sll.add(12);
        // sll.add(3);
        // sll.add(4);
        // sll.add(10);
        // sll.add(5);
        // sll.add(15);
        // sll.add(2);
        // sll.add(3);
        // sll.add(4);
        // sll.add(10);
        // sll.add(5);
        // sll.add(15);
        // sll.add(2);
        sll.printValues();
        sll.remove();
        sll.remove();
        sll.printValues();
        sll.find(10);
        sll.removeAt(0);
        sll.printValues();
    }
}