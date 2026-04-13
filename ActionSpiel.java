public class ActionSpiel extends Videospiel {

    private String schwierigkeitsgrad;

    public ActionSpiel(String titel, String entwickler, int erscheinungsjahr, String schwierigkeitsgrad) {
        super(titel, entwickler, erscheinungsjahr);
        this.schwierigkeitsgrad = schwierigkeitsgrad;
    }

    public String getSchwierigkeitsgrad() {
        return schwierigkeitsgrad;
    }

    @Override
    public String getBeschreibung() {
        // TODO: Hier die geforderte Beschreibung zurückgeben
        return null; // Platzhalter – bitte ersetzen!
    }
}
