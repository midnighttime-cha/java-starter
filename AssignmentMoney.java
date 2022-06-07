import java.util.Scanner;

class AssignmentMoney {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("รับเงินจากลูกค้า: ");
    int money1 = sc.nextInt();

    System.out.print("ป้อนจำนวนเงินที่ชำระ: ");
    int money2 = sc.nextInt();

    int money = money1 - money2;

    System.out.println("ต้องทอนเงินให้ลูกค้า = " + money + " บาท");

    if (money >= 1000) {
      System.out.println("แบงค์ 1000 บาท = " + (money / 1000) + " ใบ");
      money %= 1000;
    }
    if (money >= 500) {
      System.out.println("แบงค์ 500 บาท = " + (money / 500) + " ใบ");
      money %= 500;
    }
    if (money >= 100) {
      System.out.println("แบงค์ 100 บาท = " + (money / 100) + " ใบ");
      money %= 100;
    }
    if (money >= 50) {
      System.out.println("แบงค์ 50 บาท = " + (money / 50) + " ใบ");
      money %= 50;
    }
    if (money >= 20) {
      System.out.println("แบงค์ 20 บาท = " + (money / 20) + " ใบ");
      money %= 20;
    }
    if (money >= 10) {
      System.out.println("เหรียญ 10 บาท = " + (money / 10) + " เหรียญ");
      money %= 10;
    }
    if (money >= 5) {
      System.out.println("เหรียญ 5 บาท = " + (money / 5) + " เหรียญ");
      money %= 5;
    }
    if (money >= 2) {
      System.out.println("เหรียญ 2 บาท = " + (money / 2) + " เหรียญ");
      money %= 2;
    }
    if (money >= 1) {
      System.out.println("เหรียญ 1 บาท = " + (money / 1) + " เหรียญ");
      money %= 1;
    }

    System.out.println("เศษ = " + money);
  }
}
