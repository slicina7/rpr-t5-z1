package ba.unsa.etf.rpr;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student s=new StudentBuilder("ime_studenta","prezime_studenta").index(1234).ocjena(9).build();
        System.out.println(s);

    }
}
