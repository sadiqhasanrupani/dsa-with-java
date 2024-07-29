package linkedlist;

class LinkedList {

  // creating head, tail and length
  private Node head;
  private Node tail;
  private int length;

  // initializing constructor
  public LinkedList(int value) {
    // creating a new node
    Node newNode = new Node(value);
    // pointing the new node to head and tail and setting length to 1
    // at the initial stage.
    head = newNode;
    tail = newNode;
    length = 1;
  }

  public void printItem() {
    // storing the head data into temp
    Node temp = head;
    // looping till the temp.next ==
    System.out.print("\nTotal nodes present: ");

    while (temp != null) {
      // Print the current node's value
      System.out.print(temp.value);
      // Move to the next node
      temp = temp.next;
      // Print a comma if there are more nodes
      if (temp != null) {
        System.out.print(",");
      }
    }
    System.out.println();
  }

  // append method
  public void append(int value) {
    Node newNode = new Node(value);
    // checking if head and tail both are null
    if (length == 0) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
    length++;
  }

  public void remove(int value) {
    // checking the condition if head and tail only having a single node.
    if (length == 1) {
      head = null;
      tail = null;
    } else {}
  }

  public void getHead() {
    System.out.println("Head: " + head.value);
  }

  public void getTail() {
    System.out.println("Tail: " + tail.value);
  }

  public void getLength() {
    System.out.println("Length: " + length);
  }
}
