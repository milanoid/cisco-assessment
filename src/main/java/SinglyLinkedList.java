public class SinglyLinkedList {

    SinglyLinkedList.Node head;

    public class Node {
        int data;
        SinglyLinkedList.Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public SinglyLinkedList push(int newData) {
        SinglyLinkedList.Node newNode = new SinglyLinkedList.Node(newData);
        newNode.next = head;
        head = newNode;
        return this;
    }

    public boolean isElementWithDataPresent(int dataToSearch) {
        // traverse and check
        Node pointer = head;

        if (head != null)
        {
            while (pointer != null)
            {
                if (pointer.data == dataToSearch) {
                    return true;
                }
                pointer = pointer.next;
            }
        }
        return false;
    }
}
