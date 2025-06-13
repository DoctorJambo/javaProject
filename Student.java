public class Student extends Person {

  private String favouriteSubject;

  public Student(int age, String name, String favouriteSubject) {
    super(age, name);
    this.favouriteSubject = favouriteSubject;
  }
}
