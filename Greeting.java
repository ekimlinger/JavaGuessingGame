import javax.swing.JFrame;
import javax.swing.JLabel;

public class Greeting  {
  public static void main(String[] args) {
    int myNumber = 42;

    JFrame window = new JFrame();

    //Set window properties
    window.setVisible(true);
    window.setSize(800,500);
    window.setTitle("Evan's First Application");

    JLabel label = new JLabel();
    label.setText("My Label");
    window.add(label);
  }

}
