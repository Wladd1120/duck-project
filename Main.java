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
    JLabel outputLabel3 = new JLabel();


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
    outputLabel2.setBounds(100,100,1000,50);
    outputLabel2.setFont(new Font("Arial", Font.ITALIC, 32));
    outputLabel2.setForeground(Color.ORANGE);
    outputLabel3.setBounds(100,100,1000,50);
    outputLabel3.setFont(new Font("Arial", Font.BOLD, 32));
    outputLabel3.setForeground(Color.RED);

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
    frame.add(outputLabel3);

    // add event listener for button click
    // a button
    aButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        aButton.setBackground(Color.GRAY);
        }});
    aButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("The Duck Sat");
        }});

    aButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText(" ");
        }});

    aButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel3.setText(" ");
        }});
    //b button
    bButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        bButton.setBackground(Color.GRAY);
        }});

    bButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("The Duck waited");
        }});
    
    bButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText(" ");
        }});

    bButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel3.setText(" ");
        }});
    // c button
    cButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        cButton.setBackground(Color.GRAY);
        }});

    cButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText(" ");}});

    cButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText("A bird came and picked up the duck");
        }});
    
    cButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel3.setText(" ");}});
    // d button
    dButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        dButton.setBackground(Color.GRAY);
        }});

    dButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText(" ");
        }});

    dButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText("The bird sored High into the sky");
        }});
    
    dButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel3.setText(" ");
        }});
    // e button
    eButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        eButton.setBackground(Color.GRAY);
        }});

    eButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText(" ");
        }});

    eButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText("The Bird Droped The Duck");
        }});

    eButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel3.setText(" ");
        }});
    // f button
    fButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        fButton.setBackground(Color.GRAY);
        }});

    fButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText(" ");
        }});

    fButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText("The duck fell and landed with a thump and a crack");
        }});

    fButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel3.setText(" ");
        }});
    // g button
    gButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        gButton.setBackground(Color.GRAY);
        }});

    gButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("The duck got up with minnimal harm");
        }});

    gButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText(" ");
        }});

    gButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel3.setText(" ");
        }});
    // h button
    hButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        hButton.setBackground(Color.GRAY);
        }});

    hButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("The duck looks up");
        }});

    hButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText(" ");
        }});

    hButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel3.setText(" ");
        }});
    // i button
    iButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        iButton.setBackground(Color.GRAY);
        }});

    iButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText(" ");
        }});

    iButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText("The bird swooped down tro try and pick up the duck again");
        }});

    iButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel3.setText(" ");
        }});
    // j button
    jButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton.setBackground(Color.GRAY);
        }});

    jButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText(" ");
        }});

    jButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText(" ");
        }});
    
    jButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel3.setText("The ducks eyes go white");
        }});
    // k button
    kButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        kButton.setBackground(Color.GRAY);
        }});

    kButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText(" ");
        }});

    kButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText(" ");
        }});

    kButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel3.setText("The Duck Grabs the bird neck");
        }});
    // l button
    lButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        lButton.setBackground(Color.GRAY);
        }});

    lButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText(" ");
        }});
    
    lButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText(" ");
        }});

    lButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel3.setText(" The duck floats into the air");
        }});
    // m button
    mButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        mButton.setBackground(Color.GRAY);
        }});

    mButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText(" ");
        }});

    mButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText(" ");
        }});

    mButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel3.setText("A black hole forms behind the duck");
        }});
    // n button
    nButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        nButton.setBackground(Color.GRAY);
        }});
    
    nButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText(" ");
        }});

    nButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText(" ");
        }});

    nButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel3.setText("The duck reaches into the black hole");
        }});
    // o button
    oButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        oButton.setBackground(Color.GRAY);
        }});

    oButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText(" ");
        }});
    
    oButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText(" ");
        }});

    oButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel3.setText("The duck pulls out the singularty");
        }});
    // p button
    pButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        pButton.setBackground(Color.GRAY);
        }});

    pButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText(" ");
        }});
    
    pButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText(" ");
        }});

    pButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel3.setText("The Duck feeds the bird the singularity");
        }});
    // q button
    qButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        qButton.setBackground(Color.GRAY);
        }});

    qButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText(" ");
        }});
    qButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText(" ");
        }});

    qButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel3.setText("the bird dies while looking into the eyes of god");
        }});
    // r button
    rButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        rButton.setBackground(Color.GRAY);
        }});

    rButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText(" ");
        }});

    rButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText(" ");
        }});

    rButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel3.setText("The Duck Says");
        }});
    // s Button
    sButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        sButton.setBackground(Color.GRAY);
        }});

    sButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText(" ");
        }});

    sButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText(" ");
        }});

    sButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel3.setText("Mortals shall not interfere with the gods");
        }});
    // t button
    tButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        tButton.setBackground(Color.GRAY);
        }});

    tButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("The world returns to normal the duck is happy");
        }});

    tButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText(" ");
        }});
    tButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel3.setText(" ");
        }});


    frame.setVisible(true);
  }
}