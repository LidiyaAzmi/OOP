public class Main {
    // Application code
    public static void main(String args[]) {
        School sk1 = new School();

        // Direct access to attributes is not a good practices
        sk1.setName("SK Satu");

        Address addr = new Address();
        addr.setStreet("Jalan 2");
        addr.setDistrict("JB");
        addr.setPostcode("30021");
        addr.setState("Johor");
        sk1.setAddress(addr);

        System.out.println("Name of school is "+ sk1.getName());

        Marks marks = new Marks(100);
        //marks.createData(100);

        //where error might timbul
        marks.setMark(90, 0);
        
        //error message
        /*catch (Exception ex)
        {
            System.out.println("Mark is incorrect");
        }*/
        marks.setMark(52, 1);
        marks.setMark(93, 2);
        float mark = marks.getMark(0);
        System.out.println("Marks for student 0 is " + mark);
        
        //SchoolList
        DSchoolList dsek = new DSchoolList();
        
        School sek = new School();
        sek.setName("St Patrick");
        dsek.addSchoolList(sek);
        
        School sek2 = new School();
        sek2.setName("Woodsville");
        dsek.addSchoolList(sek2);
        
        dsek.display();
    }
}
