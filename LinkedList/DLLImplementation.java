
public class DLLImplementation {
     public static void main(String[] args) {
          System.out.println("Doubly Linked List Implementation");
          DLLNode<Integer> node = new DLLNode<>();
          DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
          dll.insertAtEnd(10);
          dll.insertAtEnd(897);
          dll.insertAtFront(90);
          dll.insertAtEnd(91);
          dll.insertAtFront(100);
          dll.insertAtPos(69, 1);
          dll.printLL();
          System.out.println(dll.searchData(91));
          dll.printLL();
     }
}

/*
 * P - Primary type
 * S - Secondary or above LinkedList type passed to DLLNode
 */
class DoublyLinkedList<P> {
     DLLNode<P> head;

     /*
      * Constructor Overloading
      */
     DoublyLinkedList() {
          this.head = null;
     }

     DoublyLinkedList(DLLNode<P> node) {
          this.head = node;
     }

     /*
      * Insertion
      */
     public void insertAtFront(P data) {
          // ll empty
          DLLNode<P> newNode = new DLLNode<>(data);
          if (head == null) {
               head = newNode;
               return;
          }
          head.prev = newNode;
          newNode.next = head;
          head = newNode;
     }

     public void insertAtEnd(P data) {
          DLLNode<P> newNode = new DLLNode<>(data);
          if (head == null) {
               head = newNode;
               return;
          }
          DLLNode<P> temp = head;
          while (temp.next != null) {
               temp = temp.next;
          }
          temp.next = newNode;
          newNode.prev = temp;
     }

     public void insertAtPos(P data, int pos) {
          if (pos == 0) {
               this.insertAtFront(data);
               return;
          }
          DLLNode<P> newNode = new DLLNode<>(data);
          DLLNode<P> temp = head;
          while (pos > 0 && temp.next != null) {
               temp = temp.next;
               pos--;
          }
          if (pos > 0) {
               System.out.println("This position is not present in the LinkedList");
               return;
          }
          DLLNode<P> prev = temp.prev;
          prev.next = newNode;
          newNode.prev = prev;
          temp.prev = newNode;
          newNode.next = temp;
     }

     /*
      * Deletion
      */
     public void deleteAtFront() {
          if (head == null) {
               System.out.println("LL empty can't delete");
               return;
          }
          DLLNode<P> temp = head.next;
          if (temp == null) {
               // one single node present
               head = null;
               return;
          }
          temp.prev = null;
          head.next = null;
          head = temp;
     }

     public void deleteAtEnd() {
          if (head == null) {
               System.out.println("LL empty can't delete");
               return;
          }
          DLLNode<P> temp = head;
          while (temp.next != null) {
               temp = temp.next;
          }
          if (temp == head) {
               head = null;
          }
          DLLNode<P> prev = temp.prev;
          prev.next = null;
          temp.prev = null;
     }

     public void deleteAtPos(int pos) {
          if (head == null) {
               System.out.println("LL empty can't delete");
               return;
          }
          if (pos == 0) {
               this.deleteAtFront();
               return;
          }
          DLLNode<P> temp = head;
          while (pos > 0 && temp.next != null) {
               temp = temp.next;
               pos--;
          }
          if (pos > 0) {
               System.out.println("This position is not present in the LL");
               return;
          }
          DLLNode<P> prev = temp.prev;
          DLLNode<P> next = temp.next;
          prev.next = next;
          temp.prev = null;
          if (next != null) {
               // to handle the last position node deletion case also as next will be null
               next.prev = prev;
               temp.next = null;
          }
     }

     /*
      * Update
      */
     public void updateData(int pos, P data) {
          if (head == null) {
               System.out.println("LL empty can't delete");
               return;
          }
          DLLNode<P> temp = head;
          while (pos > 0 && temp.next != null) {
               temp = temp.next;
               pos--;
          }
          if (pos > 0) {
               System.out.println("This position is not present in the LL");
               return;
          }
          temp.data = data;
     }

     /*
      * Search
      */
     public boolean searchData(P target) {
          if (head == null) {
               System.out.println("LL empty can't delete");
               return false;
          }
          DLLNode<P> temp = head;
          while (temp.next != null) {
               if (temp.data == target)
                    return true;
               temp = temp.next;
          }
          return temp.data == target;
     }

     /*
      * Print LL
      */
     public void printLL() {
          if (head == null) {
               System.out.println("Linked List is empty");
               return;
          }
          DLLNode<P> temp = head;
          while (temp.next != null) {
               System.out.print(temp.data + " ");
               temp = temp.next;
          }
          System.out.println(temp.data);
     }
}

class DLLNode<S> {
     DLLNode<S> prev;
     S data;
     DLLNode<S> next;

     DLLNode() {
          this.prev = null;
          this.next = null;
     }

     DLLNode(S s) {
          this.prev = null;
          this.data = s;
          this.next = null;
     }

     DLLNode(DLLNode<S> p, S d, DLLNode<S> n) {
          this.prev = p;
          this.data = d;
          this.next = n;
     }

}
