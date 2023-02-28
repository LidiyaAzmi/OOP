public class Marks {
    // Section A: marks
    private float marks[];
    private int numdata;
    
    //constructor
    public Marks(int numdat)
    {
        createData(numdat);
    }

    // Section B: operation
    public void createData(int numdat) {
        marks = new float[numdat];   // an array
        for (int i=0; i<numdat; i++) {
            marks[i] =  0;
        }
        numdata = numdat;
    }

    public float calcAvg() {
        float sum =0;
        for (int i=0; i<numdata; i++) {
            sum += marks[i];
        }
        float avg = sum / numdata;
        return avg;
    }

    public void setMark(int mark, int index) {
        /*if (mark < 0)
        {
            throw new Exception("Error. Wrong input.");
        }*/
        this.marks[index]=mark;
    }
    public float getMark(int index) {
        return marks[index];
    }
}
