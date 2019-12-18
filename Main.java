import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
  public static void main(String[] args) {

    // A JFrame is a window where we can design our UI
    JFrame frame = new JFrame("My app");
    frame.setSize(1000, 1000);
    frame.setLayout(null);

    // create a Button and a Label
    JButton aButton = new JButton("a");
    JButton bButton = new JButton("b");
    JButton cButton = new JButton("c");
    JButton dButton = new JButton("d");
    JButton eButton = new JButton("e");
    JButton fButton = new JButton("f");
    JButton gButton = new JButton("g");
    JButton hButton = new JButton("h");
    JButton iButton = new JButton("i");
    JButton jButton = new JButton("j");
    JButton kButton = new JButton("k");
    JButton lButton = new JButton("l");
    JButton mButton = new JButton("m");
    JButton nButton = new JButton("n");
    JButton oButton = new JButton("o");
    JButton pButton = new JButton("p");
    JButton qButton = new JButton("q");
    JButton rButton = new JButton("r");
    JButton sButton = new JButton("s");
    JButton tButton = new JButton("t");
    JLabel outputLabel = new JLabel();
    JLabel outputLabel2 = new JLabel();


    // place and size for components
    // setBounds(x position, y position, width, height) 700,525
    aButton.setBounds(116, 300, 100, 50);
    bButton.setBounds(232, 300, 100, 50);
    cButton.setBounds(348, 300, 100, 50);
    dButton.setBounds(464, 300, 100, 50);
    eButton.setBounds(580, 300, 100, 50);
    fButton.setBounds(116, 350, 100, 50);
    gButton.setBounds(232, 350, 100, 50);
    hButton.setBounds(348, 350, 100, 50);
    iButton.setBounds(464, 350, 100, 50);
    jButton.setBounds(580, 350, 100, 50);
    kButton.setBounds(116, 400, 100, 50);
    lButton.setBounds(232, 400, 100, 50);
    mButton.setBounds(348, 400, 100, 50);
    nButton.setBounds(464, 400, 100, 50);
    oButton.setBounds(580, 400, 100, 50);
    pButton.setBounds(116, 450, 100, 50);
    qButton.setBounds(232, 450, 100, 50);
    rButton.setBounds(348, 450, 100, 50);
    sButton.setBounds(464, 450, 100, 50);
    tButton.setBounds(580, 450, 100, 50);
    outputLabel.setBounds(100,100,1000,50);
    outputLabel.setFont(new Font("Arial", Font.PLAIN, 32));
    outputLabel.setForeground(Color.BLUE);
    outputLabel2.setBounds(100,200,1000,50);
    outputLabel2.setFont(new Font("Arial", Font.PLAIN, 32));
    outputLabel2.setForeground(Color.RED);

    frame.add(aButton);
    frame.add(bButton);
    frame.add(cButton);
    frame.add(dButton);
    frame.add(eButton);
    frame.add(fButton);
    frame.add(gButton);
    frame.add(hButton);
    frame.add(iButton);
    frame.add(jButton);
    frame.add(kButton);
    frame.add(lButton);
    frame.add(mButton);
    frame.add(nButton);
    frame.add(oButton);
    frame.add(pButton);
    frame.add(qButton);
    frame.add(rButton);
    frame.add(sButton);
    frame.add(tButton);
    frame.add(outputLabel);
    frame.add(outputLabel2);

   

    
    // add event listener for button click
    aButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("");
        }});

    bButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText("");
        }});

    cButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("");
        }});

    dButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText("");
        }});

    eButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("");
        }});

    fButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText("");
        }});

    gButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("");
        }});

    hButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText("");
        }});

    iButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("");
        }});

    jButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText("");
        }});

    kButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("");
        }});

    lButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText("");
        }});

    mButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("");
        }});

    nButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText("");
        }});

    oButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("");
        }});

    pButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("");
        }});

    qButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("");
        }});

    rButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("");
        }});

    sButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("");
        }});

    tButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("");
        }});


    frame.setVisible(true);
  }
}