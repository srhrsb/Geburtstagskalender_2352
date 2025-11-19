import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BirthdayDAO {


    private final String  SAVE_PATH = "saveData.csv";
    private final String SEPARATOR = ",";
    private final String NL = System.lineSeparator();

    private ArrayList<Birthday> birthdayList;

    public BirthdayDAO(){
        birthdayList = new ArrayList<>();
    }

    public void addBirthday( String name, String date){

        birthdayList.add( new Birthday( name, date) );
        System.out.println("Birthdaylist Size: " + birthdayList.size() );
    }

    public boolean deleteAll(){

        //ToDo: birthdaylist leeren
        if( birthdayList != null) {
            birthdayList.clear();
        }

        return true;
    }

    public void save() {

        FileWriter csv = null;
        try{
          csv = new FileWriter( SAVE_PATH );
          for( Birthday bday :  birthdayList  ){
              if(bday != null){
                  String line  = bday.getName() + SEPARATOR +bday.getDate() + NL;


              }
          }



        } catch( IOException e ) {
            throw new RuntimeException(e);
        }
    }



    public void load(){

    }
}
