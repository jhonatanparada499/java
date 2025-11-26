package com.mycompany.app.windows;

// graphical
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

// layout
import java.awt.BorderLayout;

// listeners
import com.mycompany.app.listeners.EndingListener;

public class MainWindow extends JFrame {
  public static final int WIDTH = 400;
  public static final int HEIGHT = 300;

  public MainWindow() {
    super();

    setSize(WIDTH, HEIGHT);
    setTitle("A title");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel label = new JLabel("Hello World");

    JButton endButton = new JButton("Click to end program");
    endButton.addActionListener(new EndingListener());

    add(endButton);
    add(label);
  }
}
