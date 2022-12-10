package ba.unsa.etf.rpr;

public class StudentBuilder{
        private final String ime;
        private final String prezime;
        private int index;
        private double ocjena;

        public StudentBuilder(String ime, String prezime) {
            this.ime = ime;
            this.prezime = prezime;

        }
        public StudentBuilder index(int index) {
            this.index = index;
            return this;
        }
        StudentBuilder ocjena(double ocjena) {
        this.ocjena = ocjena;
        return this;
        }
}
