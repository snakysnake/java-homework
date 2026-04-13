import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VideospielDatenbank {

    public static void main(String[] args) {
        List<Videospiel> spiele = new ArrayList<>();

        // TODO: Datei einlesen und Objekte erzeugen
        try (BufferedReader br = new BufferedReader(new FileReader("videospiele.csv"))) {
            String line;
            boolean ersteZeile = true;

            while ((line = br.readLine()) != null) {
                if (ersteZeile) {
                    ersteZeile = false; // Header überspringen
                    continue;
                }

                String[] daten = line.split(",");
                if (daten.length < 5) continue; // ungültige Zeile

                String titel = daten[0].trim();
                String entwickler = daten[1].trim();
                int jahr = Integer.parseInt(daten[2].trim());
                String typ = daten[3].trim();
                String zusatz = daten[4].trim();

                Videospiel spiel = null;

                if (typ.equals("Action")) {
                    // TODO: ActionSpiel-Objekt erzeugen
                } else if (typ.equals("RPG")) {
                    // TODO: Rollenspiel-Objekt erzeugen
                }

                if (spiel != null) {
                    spiele.add(spiel);
                }
            }
        } catch (IOException e) {
            System.err.println("Fehler beim Lesen der CSV-Datei: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Fehler beim Umwandeln des Jahres: " + e.getMessage());
        }

        // Ausgabe aller Spiele (Polymorphie)
        System.out.println("=== Videospiel-Datenbank ===\n");
        for (Videospiel s : spiele) {
            System.out.println(s.getBeschreibung());
        }
    }
}
