package com.mycompany.app;

import javax.swing.JFrame;
import javax.swing.JButton;
import com.mycompany.app.listeners.*;

public class GuiApp {
  public static final int WIDTH = 400;
  public static final int HEIGHT = 300;

  public static void main(String[] args) {
    /*
     * ========================================
     * CHAPTER 17: Buttons, Events and Other ...
     * ========================================
     */
    JFrame firstWindow = new JFrame("My first Window");
    firstWindow.setSize(WIDTH, HEIGHT);
    firstWindow.setVisible(true);
    firstWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton endButton = new JButton("Click to end program");
    endButton.addActionListener(new EndingListener());

    firstWindow.add(endButton);
    firstWindow.setVisible(true);
  }
}
