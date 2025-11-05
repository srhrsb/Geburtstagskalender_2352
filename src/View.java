import javax.swing.*;

import javax.swing.border.EmptyBorder;
import java.awt.*;

public class View extends JFrame {

    private JButton saveBtn;
    private JTextField nameTf, birthdayTf;

     public View( int width, int height){
         setSize(width, height);
         setDefaultCloseOperation( EXIT_ON_CLOSE );
         createUI();
         show();
     }

     private void createUI(){
         //3 Panel für die Inhalte erzeugen
         JPanel topPanel = new JPanel();
         JPanel centerPanel = new JPanel();
         JPanel bottomPanel = new JPanel();

         //Inhalte UI-Elemente als Objekte erzeugen
         JLabel headline = new JLabel("Neuen Geburtstag anlegen");

         JLabel nameLabel = new JLabel("Name eingeben");
         nameTf = new JTextField();

         JLabel birthdayLabel = new JLabel("Geburtstag eingeben");
         birthdayTf = new JTextField();

         saveBtn = new JButton("Speichern");

         //Layout festlegen für die Panel
         centerPanel.setLayout( new GridLayout( 2, 2, 5, 5 ));
         centerPanel.setBorder( new EmptyBorder(5,5,5,5) );

         //befüllen des Toppanels
         topPanel.add( headline );

         //befüllen des Centerpanels
         centerPanel.add( nameLabel );
         centerPanel.add( nameTf );
         centerPanel.add( birthdayLabel );
         centerPanel.add( birthdayTf );

         //befüllen des Bottompanels
         bottomPanel.add( saveBtn );

         // panel dem jframe hinzufügen
         add(topPanel, BorderLayout.NORTH);
         add(centerPanel, BorderLayout.CENTER);
         add(bottomPanel, BorderLayout.SOUTH);


         //Hausaufgabe:
         // Fügen Sie 3 weitere Button hinzu "Dieses Löschen", "Alles Löschen", "Laden"
         // neben dem vorhandenen Speichern-Button


     }



}
