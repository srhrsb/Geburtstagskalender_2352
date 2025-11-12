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

    public void save(){

    }

    public void load(){

    }
}
