
public class LLImplementation {
     public static void main(String[] args) {
          System.out.println("LinkedList Implementation");
          /*
           * KEEP AN EYE ON GENERICS
           */
          // create a node
          ListNode<Integer> a = new ListNode<>(10, null);
          // create a ll starting from above node or can be kept empty
          LinkedList ll = new LinkedList();
          // LinkedList ll2 = new LinkedList(a);
          // System.out.println(ll2.head.getNodeValue());
          ll.insertAtFront(20);
          // ll.insertAtFront(1000);
          // ll.insertAtFront(400);
          // ll.insertAtEnd(90);
          // ll.insertAtEnd(-90);
          // ll.insertAtMiddle(78, 7);
          // System.out.println(ll.head.getNodeValue());
          ll.printLL();
          ll.deleteFront();
          // ll.deleteEnd();
          // ll.deleteAtPos(2);
          // ll.updateDataInLL(1, 500);
          // ll.updateDataInLL(0, 89);
          // ll.updateDataInLL(4, 69);
          ll.printLL();
     }
}

/*
 * A LinkedList will only have information about it head node only
 */
class LinkedList {
     ListNode<Integer> head;
     int size;

     /*
      * Constructor Overloading
      */
     LinkedList() {
          this.head = null;
          this.size = 0;
     }

     LinkedList(ListNode<Integer> node) {
          this.head = node;
          this.size = 1;
     }

     public void insertAtFront(int data) {
          // if LL is empty
          ListNode<Integer> node = new ListNode<>(data);
          if (this.head == null) {
               head = node;
               size++;
               return;
          }
          node.next = head;
          this.head = node;
          size++;
     }

     public void insertAtEnd(int data) {
          // if LL is empty
          ListNode<Integer> node = new ListNode<>(data);
          if (this.head == null) {
               head = node;
               size++;
               return;
          }
          ListNode<Integer> temp = head;
          while (temp.next != null) {
               temp = temp.next;
          }
          // insert
          temp.next = node;
          size++;
     }

     public void insertAtMiddle(int d, int pos) {
          if (pos == 0) {
               this.insertAtFront(d);
               return;
          }
          ListNode<Integer> temp = head;
          ListNode<Integer> node = new ListNode<>(d);
          while (pos > 1 && temp.next != null) {
               temp = temp.next;
               pos--;
          }
          if (pos <= 1) {
               // means that reached pos-1
               node.next = temp.next;
               temp.next = node;
               size++;
          } else {
               System.out.println("This position doesn't exist on the linkedList");
          }
     }

     public void deleteFront() {
          // if ll empty
          if (head == null) {
               // do nothing
               return;
          }
          ListNode<Integer> temp = head; // created for dereferencing purpose.
          head = head.next;
          temp.next = null; // dereference the previous head pointer to the next node
          // garbage collector automatically deallocates unreferenced memory allocations.
     }

     public void deleteEnd() {
          // if ll empty
          if (head == null) {
               // do nothing
               return;
          }
          ListNode<Integer> temp = head;
          ListNode<Integer> prev = null;
          while (temp.next != null) {
               prev = temp;
               temp = temp.next;
          }
          if (prev == null) {
               // only one node present in LL , i.e head
               this.deleteFront();
               return;
          }
          // make 2nd last node null
          prev.next = null;
     }

     public void deleteAtPos(int pos) {
          if (pos == 0) {
               this.deleteFront();
               return;
          }
          ListNode<Integer> temp = head;
          ListNode<Integer> prev = null;
          // go to pos node
          while (pos > 0 && temp.next != null) {
               prev = temp;
               temp = temp.next;
               pos--;
          }
          if (pos > 0 || prev == null) {
               System.out.println("This position doesn't exist in LL");
               return;
          }
          // do these steps
          prev.next = temp.next;
          temp.next = null; // dereferencing all pointer
     }

     public void updateDataInLL(int pos, int newdata) {
          ListNode<Integer> temp = this.head;
          while (pos > 0 && temp.next != null) {
               temp = temp.next;
               pos--;
          }
          if (pos == 0)
               temp.dataValue = newdata;
          else
               System.out.println("This position node doesn't exist in the LL");
     }

     public boolean searchNode(int target) {
          if (head == null) {
               System.out.println("Linked List Empty");
               return false;
          }
          ListNode<Integer> temp = head;
          while (temp.next != null) {
               if (temp.dataValue == target)
                    return true;
               temp = temp.next;
          }
          return temp.dataValue == target;
     }

     public void printLL() {
          ListNode<Integer> temp = head;
          if (head == null) {
               System.out.println("LinkedList Empty");
               return;
          }
          while (temp.next != null) {
               System.out.print(temp.getNodeValue() + " ");
               temp = temp.next;
          }
          System.out.println(temp.getNodeValue());
     }
}

/*
 * Node will have a data value and a reference to the next node
 * So, two data members
 */
class ListNode<T> {
     public T dataValue;
     ListNode<T> next;

     /*
      * Constructor OverLoading to Achieve this optional kind of parameter on
      * creation of node
      * PS: Default parameters stuff won't work in Java
      */
     ListNode() {
          this.next = null;
     }

     ListNode(T val) {
          this.dataValue = val;
          this.next = null;
     }

     ListNode(T value, ListNode<T> nextNode) {
          this.dataValue = value;
          this.next = nextNode;
     }

     public T getNodeValue() {
          return this.dataValue;
     }
}
