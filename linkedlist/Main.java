class Main {

  public static void printResults(LinkedList linkedList) {
    linkedList.printItem();
    linkedList.getLength();
  }

  public static void main(String[] args) {
    //^ creating a Node of value 4.
    LinkedList linkedList = new LinkedList(4);
    // appending linkedlist
    linkedList.append(23);
    linkedList.append(3);
    linkedList.append(89);
    linkedList.append(23);

    printResults(linkedList);

    System.out.println();
    System.out.println(linkedList.remove());
    System.out.println(linkedList.remove());

    printResults(linkedList);

    linkedList.prepend(10);

    printResults(linkedList);

    System.out.println();
    System.out.println(linkedList.removeFirst());
    System.out.println(linkedList.removeFirst());

    printResults(linkedList);
  }
}
