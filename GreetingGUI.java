/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.gui;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
/**
 *
 * @author Leo
 */
public class GreetingGUI extends JFrame{
    
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAndSurnamePnl;
    private JPanel greetingAreaPnl;
    private JPanel btnPnl;
    private JPanel mainPnl;
    private JPanel headingPnl;
    
    //Label
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel headingLbl;
    
    //TextField
    private JTextField nameTxtField;
    private JTextField surnameTxtField;
    
    //TextArea
    private JTextArea greetingsTxtArea;
    
    //buttons
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
            
    
    
    public GreetingGUI()
    {
      //configure the GUI
        setLayout(new BorderLayout());
        setTitle("Greetings GUI");
        setSize(750,600);
        setBackground(Color.yellow);
        
        //create the panels
        namePnl = new JPanel(new FlowLayout());
        surnamePnl= new JPanel(new FlowLayout());
        
        nameAndSurnamePnl = new JPanel(new GridLayout(2,1));
       // greetingAreaPnl = new JPanel(new FlowLayout());
        //greetingAreaPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Greetings"));
        
        btnPnl= new JPanel(new FlowLayout());
        mainPnl= new JPanel( new BorderLayout());
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        //Label
        headingLbl = new JLabel("Greetings");
        nameLbl = new JLabel("Name: ");
        surnameLbl= new JLabel("Surname: ");
        
        //Create The text Field
        nameTxtField= new JTextField(20);
        surnameTxtField= new JTextField(20);
        
        //create the Text Area
       /* greetingsTxtArea= new JTextArea(20, 30);
        greetingsTxtArea.setEditable(false);
        greetingsTxtArea.setText("Hello [name]  [surname]");*/
        
        //create the buttons
        greetBtn= new JButton("Greet");
        clearBtn= new JButton("Clear");
        exitBtn= new JButton("Exit");
        
        //add the name label to the name panel
        namePnl.add(nameLbl);
        namePnl.add(nameTxtField);
        
        //add the surname to the surname panel
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtField);
        
        //add the collective to the name and surname panel
        nameAndSurnamePnl.add(namePnl);
        nameAndSurnamePnl.add(surnamePnl);
        
        //add the greeting text area to the greeting panel
        //greetingAreaPnl.add(greetingsTxtArea);
        
        //add the buttons to the butons panel
        btnPnl.add(greetBtn);
        btnPnl.add(clearBtn);
        btnPnl.add(exitBtn);
        
        //add all the panels to the main panel
       // mainPnl.add(greetingAreaPnl,BorderLayout.CENTER);
        mainPnl.add(nameAndSurnamePnl,BorderLayout.CENTER);
        
        mainPnl.add(btnPnl,BorderLayout.SOUTH);
        
        //add the main panel to the frame panel
        add(headingPnl,BorderLayout.NORTH);
        add(mainPnl,BorderLayout.CENTER);
        
        //set the frame too be Visible
        setVisible(true);
        
        
        
        
    }
}
