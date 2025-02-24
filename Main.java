class Node {
   int data;
   Node next; 

   Node(int d) {
       data = d;
       next = null;
   }

   // Function to insert at the beginning of the linked list
   static Node insertAtBegin(Node head, int data) {
       Node nn = new Node(data);
       if (head == null) return nn;  // If list is empty, return the new node as head
       nn.next = head;
       return nn;  // Return the new head
   }

   // Function to insert at the end of the linked list
   static Node insertAtEnd(Node head, int data) {
       Node nn = new Node(data);
       if (head == null) return nn;  // If list is empty, return the new node as head
       Node temp = head;
       while (temp.next != null) {  // Traverse to the end of the list
           temp = temp.next;
       }
       temp.next = nn;  // Attach the new node at the end
       return head;  // Return the original head
   }
   
   // Function to insert at a specific position in the linked list
   static Node insertAtMiddle(Node head, int data, int pos) {
       Node nn = new Node(data);
       if (pos == 0) {
           return insertAtBegin(head, data);  // Insert at the beginning if position is 0
       }
       Node temp = head;
       int i = 0;
       
       // Traverse to the position before the desired position
       while (i < pos - 1 && temp != null && temp.next != null) {
           temp = temp.next;
           i++;
       }
       
       // Insert the node at the middle position
       if (i == pos - 1 && temp != null) {
           nn.next = temp.next;
           temp.next = nn;
       }
       return head;
   }

   // Function to delete from the beginning of the linked list
   static Node deleteAtBegin(Node head) {
       if (head == null) return null; // If list is empty, return null
       return head.next; // Move head to the next node
   }


   //function to delete from end of the linked list
   static Node deleteAtEnd(Node head) {
      if (head == null || head.next == null) {
          return null; // If the list is empty or has only one node, return null
      }
      Node temp = head;
      while (temp.next.next != null) { // Traverse to the second-last node
          temp = temp.next;
      }
      temp.next = null; // Remove reference to the last node
      return head;
  }

  static Node deleteAtMiddle(Node head, int pos) {

   if (pos == 0) {
       return deleteAtBegin(head);  // Insert at the beginning if position is 0
   }
   Node temp = head;
   int i = 0;
   
   // Traverse to the position before the desired position
   while (i < pos - 1 && temp != null && temp.next != null) {
       temp = temp.next;
       i++;
   }
   
   // Insert the node at the middle position
   if (i == pos - 1 && temp != null) {
       temp.next = temp.next.next;
   }
   return head;
}



















   // Function to print the linked list
   static void print(Node head) {
       Node temp = head;
       while (temp != null) {
           System.out.print(temp.data +  "     ");
           temp = temp.next;  // Move to the next node
       }
       System.out.println("NULL");
   }
}

public class Main {
   public static void main(String[] args) {
       Node head = null;

       // Inserting nodes at the beginning
       head = Node.insertAtBegin(head, 10);
       head = Node.insertAtBegin(head, 20);

       // Inserting nodes at the end
       head = Node.insertAtEnd(head, 40);
       head = Node.insertAtEnd(head, 50);
       
       // Inserting node at a specific position
       head = Node.insertAtMiddle(head, 30, 2);  // Insert 30 at position 2
       
       // Printing the linked list
       System.out.println("Linked List before deletion:");
       Node.print(head);

       // Deleting the first node
       head = Node.deleteAtBegin(head);
       head = Node.deleteAtMiddle(head, 1);
       head = Node.deleteAtEnd(head);
       
       
       // Printing the linked list after deletion
       System.out.println("Linked List after deleting first node:");
       Node.print(head);
   }
}
