import java.util.Scanner;

class InputTutorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("ป้อนชื่อของคุณ: ");
    String name = sc.nextLine(); // รันค่า String จากแป้นพิมพ์ => name

    System.out.print("ป้อนปีเกิด พ.ศ.: ");
    int year = sc.nextInt(); // รับค่า Integer จากแป้นพิมพ์

    int age = 2565 - year;

    System.out.println("ชื่อของคุณ คือ : " + name);
    System.out.println("ปีเกิด : " + year);
    System.out.println("อายุ : " + age);
  }
}
