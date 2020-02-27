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

    /**
     * Removes middle element with one traverse only.
     * @return SinglyLinkedList
     */
    public SinglyLinkedList removeMiddleElement()
    {

        // linked list is empty
        if (head == null) {
            return null;
        }

        // linked list with one element only
        if (head.next == null) {
            return null;
        }

        Node slowPointer = head;    // this will point to the middle element
        Node fastPointer = head;

        // search for the middle element
        if (head != null)
        {
            while (fastPointer != null && fastPointer.next != null)
            {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next.next;
            }
        }

        // remove the middle element by copy and reconnect
        Node tempNode = slowPointer.next;
        slowPointer.data = tempNode.data;
        slowPointer.next = tempNode.next;
        return this;
    }

}
