class MethodReturn {
  public static void main(String[] args) {
    connectServer(200);
  }

  public static void connectServer(int ping) {
    System.out.println("แสดงค่า Ping = " + ping);
    if (ping > 100) {
      return;
    }
    System.out.println("เชื่อมต่อ Server...");
  }
}
