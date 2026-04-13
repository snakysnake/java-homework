public class Rollenspiel extends Videospiel {

    private String beschreibung;

    public Rollenspiel(String titel, String entwickler, int erscheinungsjahr, String beschreibung) {
        super(titel, entwickler, erscheinungsjahr);
        this.beschreibung = beschreibung;
    }

    @Override
    public String toString() {
        return beschreibung;
    }
}
