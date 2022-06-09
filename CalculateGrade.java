import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

class CalculateGrade {
  public static void main(String[] args) {
    PrintWriter output = null;
    try {
      Scanner input = new Scanner(new File("./files/Score.txt"));
      output = new PrintWriter(new File("./files/Grade.txt"));
      String nisit = "";

      while (input.hasNext()) {
        nisit = input.nextLine();
        int pos = nisit.indexOf(" ");

        String _nisit = nisit.substring(0, pos); // หาตำแหน่งคะแนน
        String score = nisit.substring(pos, nisit.length()); // หาตำแหน่งคะแนน

        double _score = Double.parseDouble(score.trim());
        String grade = "";

        if (_score >= 80) {
          grade = "A";
        } else if (_score >= 70) {
          grade = "B";
        } else if (_score >= 60) {
          grade = "C";
        } else if (_score >= 50) {
          grade = "D";
        } else {
          grade = "F";
        }

        // System.out.println("นิสิตรหัส: " + _nisit + " ได้คะแนน " + score.trim() + "
        // เกรด " + grade);
        output.println("นิสิตรหัส: " + _nisit + " ได้คะแนน " + score.trim() + " เกรด " + grade);
      }
      output.close();
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }
}
