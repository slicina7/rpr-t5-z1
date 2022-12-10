package ba.unsa.etf.rpr;

public class StudentBuilder{
        private final String ime;
        private final String prezime;
        private int index=0;
        private double ocjena=0;

        public StudentBuilder(String ime, String prezime) {
            this.ime = ime;
            this.prezime = prezime;

        }
        public Student build(){
            return new Student(this);
        }
        public StudentBuilder index(int index) {
            this.index = index;
            return this;
        }
        StudentBuilder ocjena(double ocjena) {
            this.ocjena = ocjena;
            return this;
        }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getIndex() {
        return index;
    }

    public double getOcjena() {
        return ocjena;
    }
}
