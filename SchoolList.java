public class SchoolList
{
    //data Security
    private School[] sekolah;
    private int currentnum; //counts num of schools
    
    public SchoolList()
    {
        sekolah = new School[10];
        currentnum = 0;
    }
    
    //operations
    public void addSchool(School sek)
    {
        sekolah[currentnum] = sek;
    }
    
    public static void main (String args[])
    {
        SchoolList moelist = new SchoolList();
        moelist.addSchool(new School()); //new school creates new school object
    }
}