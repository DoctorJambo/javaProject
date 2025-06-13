public class Main {
  public static void main(String[] args) {

    System.out.println("hello world");

    for (int i = 0; i < 100; i += 2) {
      System.out.println("aboba");
    }

    Student bob = new Student(12,"Bob","Math");
    System.out.println(bob);

    seyHi();
  }

  public static void seyHi() {
    System.out.println("hello");
    System.out.println("hello Aboba");
  }
}