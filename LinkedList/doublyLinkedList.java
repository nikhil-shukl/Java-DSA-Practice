package LinkedList;

public class doublyLinkedList {
    public static void main(String[] args) {
        class Node {
            int data;
            Node next;
            Node back;

            Node(int data){
                this.data = data;
                this.next = null;
                this.back = null;
            }
        }

        // Node first = new Node(10);
        // Node second = new Node(20);
        // Node third = new Node(30);

        // first.next = second;
        // second.back = first;

        // second.next = third;
        // third.back = second;

        // Node temp = third;
        // while(temp != null){
        //     System.out.println(temp.data);
        //     temp = temp.back;
        // }

        Node head = null;
        Node tail = null;

        for(int i=10; i<=50; i+=10){

            Node newNode = new Node(i);
            if(head == null){
               head = newNode;
               tail = newNode;
            }else{
                tail.next = newNode;
                newNode.back = tail;
                tail = newNode;
            }
        }

        // insert at middle
        Node newNode = new Node(25);

        Node temp = head;
        while(temp.data != 20){
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.back = temp;

        temp.next.back = newNode;
        temp.next = newNode;
      
        // reverse doubly linked list

        Node current = head;
        
        while(current != null){
            Node swap = current.next;
            current.next = current.back;
            current.back = swap;

            current = current.back;
        }

        head = tail;

        Node temp2 = head;
        while(temp2 != null){
            System.out.println(temp2.data);
            temp2 = temp2.next;
        }

    }
}
