package com.company;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyWindow extends JFrame {

    private JButton btnClikHere = new JButton("Clik Here");
    private JButton btnClickThere = new JButton("Click There");

    public MyWindow() {
        super("My First Swing Application");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(600, 400));
        this.setLocationRelativeTo(null);


        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(new BorderLayout());

        contentPane.add(createToolBar(), BorderLayout.NORTH);

        JScrollPane westComponent = new JScrollPane(new JTree());
        westComponent.setPreferredSize(new Dimension(200, 0));

        contentPane.add(westComponent, BorderLayout.WEST);

        JCheckBox chkItsYou = new JCheckBox("ItsYou");
        contentPane.add(chkItsYou, BorderLayout.SOUTH);

        JTextArea txtContent = new JTextArea("The Content");
        JScrollPane scrContent = new JScrollPane(txtContent);
        contentPane.add(scrContent);

        //contentPane.add(createRightPanel(contentPane), BorderLayout.EAST);
        String[] couleurs = new String[]{"rouge", "vert", "bleu", "gris", "jaune"};
        JComboBox menuDeroulant = new JComboBox(couleurs);
        contentPane.add(menuDeroulant,BorderLayout.EAST);


        contentPane.add(createStatusBar(), BorderLayout.SOUTH);


        btnClikHere.addActionListener((event)->System.out.println("btnClikHere Cliked"));
        btnClikHere.addMouseListener(new MouseAdapter() {
                                         @Override
                                         public void mouseEntered(MouseEvent e) {
                                             btnClikHere.setForeground(Color.GREEN);

                                         }

                                         @Override
                                         public void mouseExited(MouseEvent e) {
                                             btnClikHere.setBackground(Color.RED);

                                         }
                                     }
        );

        //contentPane.add(btnClikHere);



        btnClickThere.addActionListener((event)->System.out.println("btnClickThere Clicked"));
        btnClickThere.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                btnClickThere.setForeground(Color.BLUE);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnClickThere.setForeground(Color.BLACK);

            }
        });
        //contentPane.add(btnClickThere);


    }

    private void btnClikHereListener (ActionEvent event) {
        //btnClikHere.setText("Click!");
        System.out.println("btnClikHere Clicked");
    }


    private JToolBar createToolBar() {
        JToolBar toolBar = new JToolBar();

        JButton btnClikHere = new JButton("Click Here");
        toolBar.add(btnClikHere);

        JButton btnClickThere = new JButton("Click There");
        toolBar.add(btnClickThere);

        JCheckBox chkItsYou = new JCheckBox("ItsYou");
        toolBar.add(chkItsYou);

        JTextField txtYourName = new JTextField("Your name?");
        txtYourName.setPreferredSize(new Dimension(140,30));
        toolBar.add(txtYourName);

        btnClikHere.addActionListener((event)->System.out.println("btnClikHere Cliked"));
        btnClikHere.addMouseListener(new MouseAdapter() {
                                         @Override
                                         public void mouseEntered(MouseEvent e) {
                                             btnClikHere.setForeground(Color.GREEN);

                                         }

                                         @Override
                                         public void mouseExited(MouseEvent e) {
                                             btnClikHere.setForeground(Color.BLACK);

                                         }
                                     }
        );

        toolBar.add(btnClikHere);



        btnClickThere.addActionListener((event)->System.out.println("btnClickThere Clicked"));
        btnClickThere.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                btnClickThere.setForeground(Color.BLUE);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnClickThere.setForeground(Color.BLACK);

            }
        });
        toolBar.add(btnClickThere);

        return toolBar;

    }

    private JPanel createStatusBar() {
        JPanel statusBar = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JLabel lblStatus1 = new JLabel("Message 1");
        lblStatus1.setPreferredSize(new Dimension(100, 30));
        statusBar.add(lblStatus1);

        JLabel lblStatus2 = new JLabel("Message 2");
        lblStatus2.setPreferredSize(new Dimension(100, 30));
        statusBar.add(lblStatus2);

        JLabel lblStatus3 = new JLabel("Message 3");
        lblStatus3.setPreferredSize(new Dimension(100, 30));
        statusBar.add(lblStatus3);

        return statusBar;

    }

    private JPanel createRightPanel(JPanel panel) {
        String[] couleurs = {"rouge","vert","bleu","gris","jaune"};
        JComboBox menuDeroulant = new JComboBox(couleurs);
        panel.add(menuDeroulant);

        return panel;

    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());


        //start my window
        MyWindow MyWindow = new MyWindow();
        MyWindow.setVisible(true);




    }
}
