package linkedlist;

class Main {

  public static void main(String[] args) {
    //^ creating a Node of value 4.
    LinkedList linkedList = new LinkedList(4);
    // appending linkedlist
    linkedList.append(23);
    linkedList.append(3);
    linkedList.append(89);
    linkedList.append(23);

    linkedList.getHead();
    linkedList.getTail();
    linkedList.getLength();
    linkedList.printItem();
  }
}
