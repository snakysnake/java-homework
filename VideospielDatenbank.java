import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VideospielDatenbank {

    public static void main(String[] args) {
        List<Videospiel> spiele = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("videospiele.csv"))) {
            String line;
            boolean ersteZeile = true;

            while ((line = br.readLine()) != null) {
                if (ersteZeile) {
                    ersteZeile = false;
                    continue;
                }

                String[] daten = line.split(",", -1); // -1 damit leere Felder nicht verschwinden
                if (daten.length < 6) continue;

                String titel = daten[0].trim();
                String entwickler = daten[1].trim();
                int jahr = Integer.parseInt(daten[2].trim());
                String typ = daten[3].trim();
                String beschreibungRpg = daten[4].trim();
                String beschreibungAction = daten[5].trim();

                Videospiel spiel = null;

                if (typ.equals("Action") && !beschreibungAction.isEmpty()) {
                    spiel = new ActionSpiel(titel, entwickler, jahr, beschreibungAction);
                } else if (typ.equals("RPG") && !beschreibungRpg.isEmpty()) {
                    spiel = new Rollenspiel(titel, entwickler, jahr, beschreibungRpg);
                }

                if (spiel != null) {
                    spiele.add(spiel);
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Fehler: " + e.getMessage());
        }

        System.out.println("=== Videospiel-Datenbank ===\n");
        for (Videospiel s : spiele) {
            System.out.println(s);        // ruft automatisch toString() auf!
        }
    }
}
