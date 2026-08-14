package LinkedList;

public class basic {
   public static void main(String[] args) {
    class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
   } 
//    Node n1 = new Node(10);
//    Node n2 = new Node(20);
//    Node n3 = new Node(30);
//    Node n4 = new Node(40);

//    n1.next = n2;
//    n2.next = n3;
//    n3.next = n4;

//    Node temp = n1;

//    while(temp != null){
//     System.out.println(temp.data);
//     temp = temp.next;
//    }

//    System.out.println(n1.data +"->"+n1.next);

  Node head = null;
  Node tail = null;

  for(int i=1; i<=4; i++){
    Node newNode = new Node(i);

    if(head == null){
        head = newNode;
        tail = newNode;
    }else{
        tail.next = newNode;
        tail = newNode;
    }
  }

  // Node temp = head;
  // while(temp != null){
  //   System.out.println(temp.data);
  //   temp = temp.next;
  // }

  Node newNode = new Node(5);
  newNode.next = head;
  head = newNode;

  // Node temp = head;
  // while(temp != null){
  //   System.out.println(temp.data);
  //   temp = temp.next;
  // }

  // now add new node at last
    Node last = new Node(6);
    Node temp = head;
    while(temp.next != null){
      temp = temp.next;
    }
    temp.next = last;

    // but we have tail so we dont need loop
    // Node last2 = new Node(7);
    // tail.next = last2;
    // tail = last2;

      Node temp2 = head;
       while(temp2 != null){
       System.out.println(temp2.data);
       temp2 = temp2.next;
     }
   }
}
