import java.awt.*;
import javax.swing.*;
public class ButtonExample extends JFrame {
   private JPanel panel;
   public ButtonExample() {
      setTitle("JPanelBackgroundColor Test");
      panel = new JPanel();
      panel.add(new JLabel("Welcome to Tutorials Point"));
      panel.setBackground(Color.green);
      add(panel, BorderLayout.CENTER);
      setSize(375, 250);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
   }
   public static void main(String args[]) {
      new ButtonExample();
   }
}