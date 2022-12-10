package ba.unsa.etf.rpr;

public class Student {
    private final String ime;
    private final String prezime;
    private final int index;
    private final double ocjena;
    public Student(StudentBuilder builder){
        ime=builder.getIme();
        prezime= builder.getPrezime();
        index= builder.getIndex();
        ocjena= builder.getOcjena();
    }
    public String toString(){
        return ime+" "+prezime+" ima ocjenu "+ocjena;
    }
}
