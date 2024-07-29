class Main {
  public static void printItems(int n) {
    System.out.println();
    for (int i = 0; i < n; i++) {
      System.out.printf("This line is running %dth times\n", i);
    }
  } 

  public static void main(String[] args) {
    printItems(6);
  }
}
