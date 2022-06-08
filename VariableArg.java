class VariableArg {
  public static void main(String[] args) {
    summation(10, 20);
    summation(10, 20, 56);
    summation(10, 74, 89, 24, 631, 45);
  }

  public static void summation(int a, int b) {
    int sum = a + b;
    System.out.println("ผลรวม = " + sum);
  }

  public static void summation(int a, int b, int c) {
    int sum = a + b + c;
    System.out.println("ผลรวม = " + sum);
  }

  public static void summation(int a, int b, int c, int d) {
    int sum = a + b + c + d;
    System.out.println("ผลรวม = " + sum);
  }

  public static void summation(int... number) { // arg รับเป็น Array แบบไม่ทราบ Parameter
    int sum = 0;
    for (int i = 0; i < number.length; i++) {
      sum += number[i];
    }
    System.out.println("ผลรวม = " + sum);
  }
}
