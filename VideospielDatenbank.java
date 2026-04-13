import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VideospielDatenbank {

    public static void main(String[] args) {
        List<Videospiel> spiele = new ArrayList<>();

        // TODO 1: CSV-Datei mit BufferedReader öffnen
        try (BufferedReader br = new BufferedReader(new FileReader("videospiele.csv"))) {
            String line;
            boolean ersteZeile = true;

            while ((line = br.readLine()) != null) {
                if (ersteZeile) {
                    ersteZeile = false;
                    continue; // Header überspringen
                }

                // TODO 2: Zeile in Spalten aufteilen (6 Spalten!)
                // Tipp: split(",", -1) damit leere Felder nicht verschwinden
                String[] daten = line.split(/* TODO: Argument hier */);

                // TODO 3: Die einzelnen Werte aus dem Array extrahieren
                String titel = /* TODO */;
                String entwickler = /* TODO */;
                int jahr = /* TODO: Integer.parseInt(...) */;
                String typ = /* TODO */;
                String beschreibungRpg = /* TODO */;
                String beschreibungAction = /* TODO */;

                Videospiel spiel = null;

                // TODO 4: Je nach "typ" das richtige Objekt erzeugen
                if (typ.equals("Action") /* && zusätzliche Prüfung */) {
                    // TODO: ActionSpiel-Objekt erstellen
                } else if (typ.equals("RPG") /* && zusätzliche Prüfung */) {
                    // TODO: Rollenspiel-Objekt erstellen
                }

                if (spiel != null) {
                    spiele.add(spiel);
                }
            }
        } catch (IOException e) {
            System.err.println("Fehler beim Lesen der Datei: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Fehler beim Umwandeln einer Zahl: " + e.getMessage());
        }

        // Ausgabe (bereits fertig – Polymorphie!)
        System.out.println("=== Videospiel-Datenbank ===\n");
        for (Videospiel s : spiele) {
            System.out.println(s);   // ruft automatisch toString() auf
        }
    }
}
