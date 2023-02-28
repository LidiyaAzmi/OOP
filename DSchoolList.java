import java.lang.reflect.Array;
import java.util.ArrayList;

public class DSchoolList
{
    //data section
    ArrayList<School> schools = new ArrayList<>();
    
    //operation
    public void addSchoolList(School sek)
    {
        schools.add(sek);
    }
    
    public void display()
    {
        for (int i=0; i<schools.size(); i++)
        {
            System.out.print("School: " + schools.get(i).getName());
        }
    }
}