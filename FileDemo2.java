import java.io.*;

class FileDemo2 {
  public static void main(String[] args) {
    File file = new File("./files/demo.txt");

    try {
      FileReader reader = new FileReader(file);
      BufferedReader br = new BufferedReader(reader);

      String message;

      while ((message = br.readLine()) != null) {
        System.out.println(message);
      }
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("หาไฟล์ไม่เจอ");
    }
  }
}
