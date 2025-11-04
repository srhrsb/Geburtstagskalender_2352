import javax.swing.*;

public class View extends JFrame {

     public View( int width, int height){
         setSize(width, height);
         setDefaultCloseOperation( EXIT_ON_CLOSE );
         createUI();
         show();
     }

     private void createUI(){

         JPanel topPanel = new JPanel();
         JButton btn = new JButton("Test");

         topPanel.add( btn );
         add(topPanel);


         //Hausaufgabe:
         // 1. Erzeugen Sie ein Textfeld oberhalb des Buttons
         // 2. Erzeugen Sie links neben dem Textfeld den Text "Name"

     }



}
