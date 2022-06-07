import java.util.Scanner;

class Method2 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("กรุณาป้อนเงินเดือน: ");
    double salary = kb.nextDouble();
    System.out.println("เงินเดือน: " + salary);

    double bonus = getBonus();
    salary += bonus;
    System.out.println("เงินเดือน + โบนัส = " + salary);
  }

  static String getIp() {
    // ถ้่า Method มี Variable Type แสดงสว่าจะมีการ return ค่าออกจาก Method
    return "127.0.0.1";
  }

  static Double getBonus() {
    // ถ้่า Method มี Variable Type แสดงสว่าจะมีการ return ค่าออกจาก Method
    return 5000.02;
  }

  static void fullName() {
    // ถ้่า Method มี void แสดงสว่าจะไม่มีการ return ค่าใดๆ ออกจาก Method
  }
}
