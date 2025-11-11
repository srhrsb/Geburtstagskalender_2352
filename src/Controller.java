import java.awt.event.ActionEvent;

public class Controller {

    private View mainView;

    public Controller(){
        //ToDo: mainView erzeugen

        this.mainView = new View( 600, 180);
        System.out.println(mainView);

        //EventListener zuweisen
        this.mainView.addSaveHandler( this::onClickSave );
        this.mainView.addDeleteThisHandler( this::onClickDeleteThis );
        this.mainView.addDeleteAllHandler( this::onClickDeleteAll );
        this.mainView.addLoadHandler( this::onClickLoad );
    }

    private void onClickSave(ActionEvent event){
        System.out.println( event.getActionCommand() );
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
