class Method1 {
  public static void main(String[] args) {
    display("Hello World");
    display("JAVA Starter");
    plus(15, 96);
    fullName("หรอย", "หล่าว");
  }

  // การสร้าง Method
  static void display(String message) { // message คือ Parameter
    // กลุ่มคำสั่งที่อยากให้ทำงาน
    System.out.println(message);
  }

  static void plus(int a, int b) {
    int c = a + b;
    System.out.println("ผลบวก: " + c);
  }

  static void fullName(String firstName, String lastName) {
    System.out.println("ชือ: " + firstName);
    System.out.println("นามสกุล: " + lastName);
  }
}
