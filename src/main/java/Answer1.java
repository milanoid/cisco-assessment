public class Answer1 {


    /**
     * Removes middle element with one traverse only.
     * @return SinglyLinkedList
     */
    public static SinglyLinkedList removeMiddleElement(SinglyLinkedList list)
    {

        // linked list is empty
        if (list.head == null) {
            return null;
        }

        // linked list with one element only
        if (list.head.next == null) {
            return null;
        }

        SinglyLinkedList.Node slowPointer = list.head;    // this will point to the middle element
        SinglyLinkedList.Node fastPointer = list.head;

        // search for the middle element
        if (list.head != null)
        {
            while (fastPointer != null && fastPointer.next != null)
            {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next.next;
            }
        }

        // remove the middle element by copy and reconnect
        SinglyLinkedList.Node tempNode = slowPointer.next;
        slowPointer.data = tempNode.data;
        slowPointer.next = tempNode.next;
        return list;
    }
}
