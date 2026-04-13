public class ActionSpiel extends Videospiel {

    private String beschreibung;

    public ActionSpiel(String titel, String entwickler, int erscheinungsjahr, String beschreibung) {
        super(titel, entwickler, erscheinungsjahr);
        this.beschreibung = beschreibung;
    }

    @Override
    public String toString() {
        return beschreibung;
    }
}
