public class Rollenspiel extends Videospiel {

    private String spielwelt;

    public Rollenspiel(String titel, String entwickler, int erscheinungsjahr, String spielwelt) {
        super(titel, entwickler, erscheinungsjahr);
        this.spielwelt = spielwelt;
    }

    public String getSpielwelt() {
        return spielwelt;
    }

    @Override
    public String getBeschreibung() {
        // TODO: Hier die geforderte Beschreibung zurückgeben
        return null; // Platzhalter – bitte ersetzen!
    }
}
