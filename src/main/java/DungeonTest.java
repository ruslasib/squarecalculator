import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DungeonTest {

  public static void main(String[] args) {
    DungeonGame d = new DungeonGame();

    try {
      FileOutputStream fos = new FileOutputStream("dg.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(d);
      oos.close();
      System.out.println(d.getX() + d.getY() + d.getZ());
    } catch (Exception e) {
      e.printStackTrace();
    }

    try {
      FileInputStream fis = new FileInputStream("dg.ser");
      ObjectInputStream ois = new ObjectInputStream(fis);
      d = (DungeonGame) ois.readObject();
      ois.close();
      System.out.println(d.getX() + d.getY() + d.getZ());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
