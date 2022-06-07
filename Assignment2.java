import java.util.Scanner;

class Assignment2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("ป้อนจำนวนเต็ม: ");
    int number1 = sc.nextInt();

    // % number % 2 ลงตัว => คู่
    // % number % 2 ไม่ลงตัว => คี่
    String result = "";

    if (number1 % 2 == 0) {
      result = number1 + " เป็นเลขคู่";
    } else {
      result = number1 + " เป็นเลขคี่";
    }

    System.out.println(result);
  }
}
