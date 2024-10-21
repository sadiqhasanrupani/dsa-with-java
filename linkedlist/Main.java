class Main {

  public static void printResults(LinkedList linkedList) {
    linkedList.printItem();
    linkedList.getLength();
  }

  public static void main(String[] args) {
    // creating a Node of value 4.

    LinkedList linkedList = new LinkedList(4);
    // appending linkedlist
    linkedList.append(23);
    linkedList.append(3);
    linkedList.append(89);
    linkedList.append(23);

    printResults(linkedList);

    System.out.println();
    System.out.println(linkedList.removeLast());
    System.out.println(linkedList.removeLast());

    printResults(linkedList);

    linkedList.prepend(10);

    printResults(linkedList);

    System.out.println(linkedList.removeFirst());

    printResults(linkedList);

    System.out.println(
        "\nThe value on index " + 2 + " is " + linkedList.get(2).value);

    int[] appendlists = { 54, 23, 34 };
    int[] prependLists = { 5, 12, 314 };

    for (int i = 0; i < 3; i++) {
      linkedList.append(appendlists[i]);
      linkedList.append(prependLists[i]);
    }

    linkedList.set(2, 120);
    printResults(linkedList);
    linkedList.insert(2, 20);
    printResults(linkedList);

    System.out.println();
    System.out.println(linkedList.remove(4));

    printResults(linkedList);

    linkedList.append(20);
    linkedList.append(30);
    linkedList.append(40);
    linkedList.append(50);

    printResults(linkedList);

    linkedList.reverse();
    printResults(linkedList);
  }

}
