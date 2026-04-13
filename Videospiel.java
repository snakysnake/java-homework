public abstract class Videospiel {

    private String titel;
    private String entwickler;
    private int erscheinungsjahr;

    public Videospiel(String titel, String entwickler, int erscheinungsjahr) {
        this.titel = titel;
        this.entwickler = entwickler;
        this.erscheinungsjahr = erscheinungsjahr;
    }

    public String getTitel() {
        return titel;
    }

    public String getEntwickler() {
        return entwickler;
    }

    public int getErscheinungsjahr() {
        return erscheinungsjahr;
    }

    // Jetzt abstract → die Unterklassen müssen toString() implementieren
    @Override
    public abstract String toString();
}
