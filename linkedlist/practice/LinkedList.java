/**
 * LinkedList
 */
class LinkedList {

  Node head, tail;
  int length = 0;

  public void increaseLenght() {
    length++;
  }

  public void decreaseLength() {
    length--;
  }

  public void makeInitial(int value) {
    Node newNode = new Node(value);
    head = newNode;
    tail = newNode;
    increaseLenght();
  }

  public void makeEmpty() {
    head = null;
    tail = null;
    decreaseLength();
  }

  LinkedList(int value) {
    makeInitial(value);
  }

  public void printLists() {
    if (length == 0) {
      System.out.println("List is empty.");
    } else {
      Node temp = head;
      System.out.println();
      while (temp != null) {
        System.out.print(temp.value + " ");
        temp = temp.next;
      }
      System.out.println();
    }
  }

  public void append(int value) {
    if (length == 0) {
      makeInitial(value);
    } else {
      Node newNode = new Node(value);
      tail.next = newNode;
      tail = newNode;
      increaseLenght();
    }
  }

  public Node removeLast() {
    Node pre = head, temp = head;

    if (length == 0) return null;

    if (length == 1) {
      makeEmpty();
      return null;
    }

    while (temp.next != null) {
      pre = temp;
      temp = temp.next;
    }

    tail = pre;
    tail.next = null;
    decreaseLength();
    return temp;
  }

  public void prepand(int value) {
    if (length == 0) {
      makeInitial(value);
    } else {
      Node newNode = new Node(value);

      Node temp = head;
      head = newNode;
      head.next = temp;
      increaseLenght();
    }
  }

  public Node removeFirst() {
    Node temp = head;

    if (length == 0) return null;

    if (length == 1) {
      makeEmpty();
      return null;
    }

    head = temp.next;
    temp.next = null;
    decreaseLength();
    return temp;
  }

  public Node get(int index) {
    if (index < 0 || index > length) return null;

    if (index == 0) {
      return head;
    }

    if (index == length) {
      return tail;
    }

    Node temp = head;
    for (int i = 0; i < index; i++) {
      temp = temp.next;
    }

    return temp;
  }

  public boolean insert(int index, int value) {
    // checking is index is out of bound
    if (index < 0 || index > length) return false;

    if (index == 0) {
      prepand(value);
      return true;
    }

    if (index == length) {
      append(value);
      return true;
    }

    Node temp = head, prev = head;
    Node newNode = new Node(value);
    for (int i = 0; i <= index; i++) {
      if (i == index - 1) {
        prev = temp;
      }

      if (index == i) {
        prev.next = newNode;
        newNode.next = temp;
      }

      temp = temp.next;
    }

    increaseLenght();
    return true;
  }

  public boolean set(int index, int value) {
    if (index < 0 || index > length) return false;

    if (index == 0) {
      prepand(value);
      return true;
    }

    if (index == length) {
      append(value);
      return true;
    }

    Node temp = get(index);
    temp.value = value;

    return true;
  }

  public Node remove(int index) {
    if (index < 0 || index > length) return null;

    if (index == 0) return removeFirst();

    if (index == length) return removeLast();

    Node prev = get(index - 1);
    Node temp = prev.next;
    prev.next = temp.next;
    temp.next = null;
    decreaseLength();
    return temp;
  }
}
