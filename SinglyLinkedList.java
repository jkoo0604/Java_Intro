public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    
    public void remove() {
        // remove last node
        if (head == null) {
            System.out.println("Empty list");
        } else {
            Node counter = head;
            Node counternext = counter.next;
            if (counternext == null) {
                head = null;
            } else {

                while (counternext.next != null) {
                    counter=counter.next;
                    counternext=counternext.next;
                }
                counter.next = null;            
            }
        }
    }

    public void printValues() {
        // print values of each node in order
        if (head == null) {
            System.out.println("Empty list");
        } else {
            Node counter = head;
            while (counter.next != null) {
                System.out.println("Value: " + counter.value);
                counter = counter.next;
            }
            System.out.println("Value: " + counter.value);

        }

    }

    public Node find(int lookupint) {
        // return first node ith the value in the parameter
        if (head == null) {
            return null;
        } else {
            Node runner = head;
            int counter = 0;
            while (runner != null) {
                if (runner.value == lookupint) {
                    System.out.println(counter);
                    return runner;
                }
                counter++;
                runner = runner.next;
            }
        }
        return null;
    }

    public void removeAt(int lookupint) {
        // remove node after n nodes (if n=0, remove the first node)
        if (head == null) {
            System.out.println("Empty list");
        } else if (lookupint == 0) {
            Node runner = head;
            if (runner.next == null) {
                head = null;
            } else {
                head = runner.next;
                runner = null;
            }
        } else {
            Node currentnode = head;
            Node nextnode = currentnode.next;
            int counter = 0;
            while (counter < lookupint) {
                if (nextnode == null) {
                    return;
                }
                if (counter+1 == lookupint) {
                    currentnode.next = nextnode.next;
                    nextnode = null;
                    return;
                } else {
                    counter++;
                    currentnode = currentnode.next;
                    nextnode =  nextnode.next;
                }
            }
        }

    }

}