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
    JLabel outputLabel = new JLabel();


    // place and size for components
    // setBounds(x position, y position, width, height) 700,525
    aButton.setBounds(116, 400, 100, 50);
    bButton.setBounds(232, 400, 100, 50);
    cButton.setBounds(348, 400, 100, 50);
    dButton.setBounds(464, 400, 100, 50);
    eButton.setBounds(580, 400, 100, 50);
    fButton.setBounds(116, 500, 100, 50);
    gButton.setBounds(232, 500, 100, 50);
    hButton.setBounds(348, 500, 100, 50);
    iButton.setBounds(464, 500, 100, 50);
    jButton.setBounds(580, 500, 100, 50);
    outputLabel.setBounds(100,100,1000,50);
    outputLabel.setFont(new Font("Arial", Font.PLAIN, 32));
    outputLabel.setForeground(Color.BLUE);
  
    // add components to JFrame f
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
    frame.add(outputLabel);

    
    // add event listener for button click
    aButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("The duck sat");}});
    bButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("the bird picked up the duck");}});
    cButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("the bird dropped the duck");}});
    dButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("the duck lived");}});
    eButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("the duck ate the bird");}});
    fButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("The Duck slow rised into the sky");}});
    gButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("The sun Colaped into a black hole");}});
    hButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("The duck then said");}});
    iButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("\"BOW TO ME MORTALS\"");}});
    jButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("the duck ate the bird");}});
    // make the frame visible
    frame.setVisible(true);
  }
}