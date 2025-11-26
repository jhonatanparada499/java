package com.mycompany.app.windows;

// graphis
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

// layouts
import java.awt.BorderLayout;
import java.awt.FlowLayout;

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
    setLayout(new BorderLayout());

    JPanel bottomPanel = new JPanel();
    bottomPanel.setLayout(new FlowLayout());

    JLabel label = new JLabel("Hello World");

    JButton endButton = new JButton("Click to end program");
    endButton.addActionListener(new EndingListener());

    bottomPanel.add(label);
    bottomPanel.add(endButton);

    add(bottomPanel, BorderLayout.SOUTH);
  }
}
