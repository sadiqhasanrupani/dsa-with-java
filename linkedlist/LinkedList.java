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

    if (temp == null) {
      System.out.print("null");
    } else {
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

  public Node remove() {
    Node pre = head, temp = head;

    // checking the condition if head and tail only having a single node.
    if (length == 1) {
      head = null;
      tail = null;
      length = length - 1;

      return null;
    } else if (length == 0) {
      return null;
    } else {
      // when their is multiple nodes present inside linkedlist.
      // todo: create two nodes; pre and temp, which will point towards head initially
      // todo: create a loop that will run until "temp" hits the null value.
      // todo: inside the loop check if temp.next != null if it is true then pre = temp;
      // todo: after the temp hits the null value, we point tail to pre's location
      // todo: then we null the tail's next and return the temp at the end,
      // before returning we have to -1 the length value means length - 1

      while (temp.next != null) {
        pre = temp;
        temp = temp.next;
      }

      tail = pre;
      tail.next = null;
      length = length - 1;
    }
    return temp;
  }

  public void prepend(int value) {
    // create node and set it to the value.
    Node newNode = new Node(value);

    if (length == 0) { // head and tail is equal to null
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }

    length++;
  }

  public Node removeFirst() {
    if (length == 0) return null;

    if (length == 1) {
      head = null;
      tail = null;

      length--;
      return null;
    }

    Node temp = head;
    head = temp.next;

    length--;
    return temp;
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
