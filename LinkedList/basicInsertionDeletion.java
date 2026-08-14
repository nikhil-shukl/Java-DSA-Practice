package LinkedList;

public class basicInsertionDeletion {
    public static void main(String[] args) {
    class Node{
      int data;
      Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
   } 

  Node head = null;
  Node tail = null;

  for(int i=10; i<=40; i+=10){
    Node newNode = new Node(i);

    if(head == null){
        head = newNode;
        tail = newNode;
    }else{
        tail.next = newNode;
        tail = newNode;
    }
  }

  Node middle = new Node(25);
  Node temp = head;

  while(temp.data != 20){
      temp = temp.next;
  }
   middle.next = temp.next;
   temp.next = middle;
   
   // for delete value from beginning

    head = head.next;

    // for delete last 
   Node temp2 = head;
   while(temp2.next.next != null){
    temp = temp.next;
   }

   temp.next = null;

   // dellete any middle element
   Node temp3 = head;

   while(temp3.next.data != 20){
    temp3 = temp3.next;
   }

    temp3.next = temp3.next.next;

   }
}
