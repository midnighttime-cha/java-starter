import java.io.*;

class FileDemo1 {
  public static void main(String[] args) {
    File f = new File("./files/demo.txt");
    try {
      FileWriter writer = new FileWriter(f);
      BufferedWriter bw = new BufferedWriter(writer);

      bw.write("สวัสดีครับผม\n");
      bw.write("เขียนโปรแกรมภาษา JAVA เบื้องต้น");
      bw.close();

      System.out.println("เขียนไฟล์เรียบร้อย");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
