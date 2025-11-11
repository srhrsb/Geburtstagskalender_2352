import java.awt.event.ActionEvent;

public class Controller {

    private View mainView;
    private BirthdayDAO dao;

    public Controller(){
        //ToDo: mainView erzeugen

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
        String name = mainView.getNameText();
        String date = mainView.getDateText();

        //2. Daten validieren (Daten auf Zulässigkeit prüfen)
        if(name.length() < 2 ){
            //ToDo: Info Dialog anzeigen
            return;
        }

        if(date.length() < 2 ){
            //ToDo: Info Dialog anzeigen
            return;
        }

        //Hier wissen wir, dass die Daten valide sind
        //3. vom DAO die addBirthday-Methoden nutzen
        dao.addBirthday( name, date);

    }

    private void onClickDeleteThis( ActionEvent event ){
        System.out.println( event.getActionCommand() );
    }

    private void onClickDeleteAll(ActionEvent event){
        System.out.println( event.getActionCommand() );
    }

    private void onClickLoad(ActionEvent event){
        System.out.println( event.getActionCommand() );
    }
}
