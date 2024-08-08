package practice;

class Main {

  public static void main(String[] args) {
    LinkedList list1 = new LinkedList(10);
    list1.append(20);
    list1.printLists();

    list1.removeLast();
    list1.printLists();

    list1.prepand(40);
    list1.prepand(50);
    list1.printLists();

    System.out.println(list1.removeFirst());
    list1.printLists();

    list1.prepand(550);
    list1.prepand(60);
    list1.printLists();

    System.out.println(list1.insert(2, 55));
    list1.printLists();

    System.out.println(list1.insert(3, 65));
    list1.printLists();

    System.out.println(list1.set(4, 786));
    list1.printLists();

    System.out.println(list1.remove(4));
    list1.printLists();
  }
}
