public class SinglyLinkedList {
    private  ListNode head;// instance variable to hold the list node

    private static class ListNode {
        private int data; // Generic type
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    ///  Find the length of linked list

    public  int lengthOfLinkedList(){
        if(head == null){
            return  0;
        }
        int count = 0;
        ListNode current = head;
        while(current != null){
            count ++;
            current = current.next;
        }

        return count;
    }

 ///  insert in the beginni
 public void insertAtStart(int value){
     ListNode newListNode = new ListNode(value);
     newListNode.next = head;
     head = newListNode;
 }
 // insert at the end of a linked list
    public void insertAtEnd(int value){
     ListNode newListNode = new ListNode(value);
     if(head == null){
         head = newListNode;
         return;
     }
     ListNode current = new ListNode(value);
         while (newListNode != current.next){
             current = current.next;
         }
       current.next = newListNode;
    }

///  Display Linked list
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data +" -->");
            current = current.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
//        sll.head = new ListNode(10);
//        ListNode second = new ListNode(8);
//        ListNode third = new ListNode(4);
//        ListNode fourth = new ListNode(1);
//
//        // Now we will connect them together to form a chain
//        sll.head.next = second; // 10 --> 8
//        second.next = third; // 10 --> 8 --> 4
//        third.next = fourth; // 10 --> 8 --> 4 -->1 --> null
        sll.insertAtStart(7);
        sll.display();
        //System.out.println("Length "+ sll.lengthOfLinkedList());;

    }
}
