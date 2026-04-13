import java.util.Objects;

public abstract class Videospiel {

    private String titel;
    private String entwickler;
    private int erscheinungsjahr;

    public Videospiel(String titel, String entwickler, int erscheinungsjahr) {
        this.titel = titel;
        this.entwickler = entwickler;
        this.erscheinungsjahr = erscheinungsjahr;
    }

    // Getter
    public String getTitel() {
        return titel;
    }

    public String getEntwickler() {
        return entwickler;
    }

    public int getErscheinungsjahr() {
        return erscheinungsjahr;
    }

    // Abstrakte Methode – muss in den Unterklassen implementiert werden
    public abstract String getBeschreibung();

    @Override
    public String toString() {
        return titel + " (" + erscheinungsjahr + ")";
    }
}
