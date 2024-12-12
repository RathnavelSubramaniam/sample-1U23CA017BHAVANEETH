import java.util.Scanner;

class sample1 {
  public static void main(String[] args) {
    Scanner Kittan = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

    String name = Kittan.nextLine();
    int age = Kittan.nextInt();
    double salary = Kittan.nextDouble();

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}