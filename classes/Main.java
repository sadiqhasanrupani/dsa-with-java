package classes;

class Main {

  public static void main(String[] args) {
    Cookie cookie = new Cookie("green");
    cookie.setColor("blue");

    System.out.println("Cookie color is: " + cookie.getColor());
  }
}
