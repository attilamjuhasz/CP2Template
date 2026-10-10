package com.example;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.*;        

public class HelloWorldSwing implements ActionListener {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */

    JButton button;
    JButton buttonTwo;
    JButton buttonThree;
    JLabel label;
    JMenuItem loadItem;
    Container pane;
    JLabel bestLabel;
    int i = 0;
    
    private void createAndShowGUI() {
        
        
        
        
        //Frame
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("This is my frame!");
        frame.setLayout(null);
        frame.setSize(400,200);
        frame.setResizable(true);

        //Button One
        button = new JButton("Press me");
        button.setFocusable(false);
        button.addActionListener(this);

        //Button Two
        buttonTwo = new JButton("No, press me!");
        buttonTwo.setFocusable(false);
        buttonTwo.addActionListener(this);

        //Button Three
        buttonThree = new JButton("I'm the obvious choice");
        buttonThree.setFocusable(false);
        buttonThree.addActionListener(this);

        //Menubar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Screens");
        loadItem = new JMenuItem("Switch");
        loadItem.addActionListener(this);
        fileMenu.add(loadItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        //Label
        label = new JLabel("Hello World");
        bestLabel = new JLabel("Attila is the best Java coder ever");
        

        pane = frame.getContentPane();
        pane.setLayout(new FlowLayout());
        pane.add(button);
        pane.add(buttonTwo);
        pane.add(buttonThree);
        pane.add(label);
        pane.add(bestLabel);
        bestLabel.setVisible(false);
        
        

        // //Button panel
        // JPanel panelB = new JPanel();
        // panelB.setBackground(Color.blue);
        // panelB.setBounds(0, 0, 200, 200);

        // //Label Panel
        // JPanel panelL = new JPanel();
        // panelL.setBackground(Color.red);
        // panelL.setBounds(200, 0, 200, 200);

        // //Part 1
        // label = new JLabel("Hello World");
        // panelL.add(label);

        // //Part 2
        // button = new JButton("Press me");
        // button.setFocusable(false);
        // panelB.add(button);

        // //Part 3
        // button.addActionListener(this);

        // //Adding panels
        // frame.add(panelL);
        // frame.add(panelB);

        //Display the window.f
        //frame.add(menuBar);
        frame.setVisible(true);
    }

    //Part 3
    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource()==button){
            label.setText("you did it!");
        }
        if (e.getSource()==buttonTwo){
            label.setText("You made the right choice");
        }
        if (e.getSource()==buttonThree){
            label.setText("This was not the obvious choice");
        }
        if (e.getSource()==loadItem){
            if (i%2==0){
                button.setVisible(false);
                buttonTwo.setVisible(false);
                buttonThree.setVisible(false);
                label.setVisible(false);
                bestLabel.setVisible(true);
            }
            else{
                button.setVisible(true);
                buttonTwo.setVisible(true);
                buttonThree.setVisible(true);
                label.setVisible(true);
                bestLabel.setVisible(false);

            }
            i++;
        }
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloWorldSwing gui = new HelloWorldSwing();
                gui.createAndShowGUI();
            }
        });
    }
}
