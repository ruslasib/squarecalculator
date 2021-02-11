import java.io.*;

public class FileInOutTraining {

  public static void main(String[] args) {
    FileInOutTraining training = new FileInOutTraining();
    training.writeToFile();
    training.readFromFile();
  }

  public void writeToFile() {
    try {
      FileWriter writer = new FileWriter("InOut.txt");
      BufferedWriter bw = new BufferedWriter(writer);
      for (int i = 1; i <=10; i++) {
        bw.write("Line " + i + "\n");
      }
      bw.close();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public void readFromFile() {
    try {
      BufferedReader br = new BufferedReader(new FileReader("InOut.txt"));
      String str = null;
      while ((str = br.readLine()) != null) {
        System.out.println(str);
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
