import java.awt.event.ActionEvent;

public class Controller {

    //Konstanten
    private final int  MIN_NAME_LENGTH = 2;

    //Felder
    private View mainView;
    private BirthdayDAO dao;

    public Controller(){





        this.mainView = new View( 600, 180);
        System.out.println(mainView);
        this.dao = new BirthdayDAO();

        //EventListener zuweisen
        this.mainView.addSaveHandler( this::onClickSave );
        this.mainView.addDeleteThisHandler( this::onClickDeleteThis );
        this.mainView.addDeleteAllHandler( this::onClickDeleteAll );
        this.mainView.addLoadHandler( this::onClickLoad );
    }

    private void onClickSave(ActionEvent event){
        System.out.println( event.getActionCommand() );

        //Vorgehensweise:
        //1. Daten holen (Namen, Geburtsdatum)
        String  name= mainView.getNameText();
        String date = mainView.getDateText();

        //2. Daten validieren (Daten auf Zulässigkeit prüfen)
        if(name.trim().length() < MIN_NAME_LENGTH ){
            mainView.showErrorDialog("Fehler", "Der Name ist ungültig, " +
                    "er muss länger als 1 Zeichen sein");
            return;
        }

        if(date.trim().length() < 2 ){
            mainView.showErrorDialog("Fehler", "Das Datum ist ungültig, " +
                    "es muss länger als 1 Zeichen sein");
            return;
        }

        //Hier wissen wir, dass die Daten valide sind
        //3. vom DAO die addBirthday-Methoden nutzen
        dao.addBirthday( name, date);

        //ToDo: Info Erfolgsmeldung
        mainView.showInfoDialog("Info","Neuer Geburtstag wurde eingetragen");
    }

    private void onClickDeleteThis( ActionEvent event ){
        System.out.println( event.getActionCommand() );
    }

    private void onClickDeleteAll(ActionEvent event){
        System.out.println( event.getActionCommand() );

        //Todo: 1. Löschmethode des DAO verwenden
        //Todo: 2. Erfolgsmeldung prüfen und entsprechende
        //         Meldungen zurückgeben





    }

    private void onClickLoad(ActionEvent event){
        System.out.println( event.getActionCommand() );
    }
}
