import java.util.ArrayList;

public class BirthdayDAO {

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

    public void save(){

    }

    public void load(){

    }
}
