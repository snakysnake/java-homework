# 🎮 Videospiel-Datenbank – Vererbung in Java

**Hausübung (HÜ) – Objektorientierte Programmierung**  
**Thema:** Vererbung mit abstrakter Basisklasse, `toString()`-Überschreibung und CSV-Einlesen

---

## 📋 Aufgabenstellung

Es soll eine kleine Videospiel-Datenbank erstellt werden, die das Konzept der **Vererbung** und **abstrakten Klassen** in Java demonstriert.

- **Abstrakte Basisklasse:** `Videospiel` (mit abstrakter `toString()`-Methode)
- **Zwei konkrete Unterklassen:** `ActionSpiel` und `Rollenspiel`
- Daten werden aus einer CSV-Datei eingelesen.
- Jede Zeile enthält **fertige Beschreibungen** in den Spalten `beschreibung_rpg` und `beschreibung_action`.
- Die Unterklassen speichern nur die passende fertige Beschreibung und geben sie über `toString()` zurück.
- Polymorphie wird genutzt (`System.out.println(spiel)` ruft automatisch die richtige `toString()` auf).

---

## 🚀 Ausführen

### Voraussetzungen
- Java 8 oder höher installiert
- Alle Dateien im **gleichen Ordner**

### Kompilieren und starten

```bash
# 1. Kompilieren
javac *.java

# 2. Programm starten
java VideospielDatenbank

📊 Erwartete Ausgabe
text=== Videospiel-Datenbank ===

Action-Spiel 'Doom' von id Software (1993). Schwierigkeitsgrad: hoch.
Rollenspiel 'The Elder Scrolls V: Skyrim' von Bethesda Game Studios (2011). Spielwelt: Fantasy.
```

✅ Erfüllte Anforderungen

✅ Eine abstrakte Klasse Videospiel mit abstrakter toString()-Methode
✅ Korrekte Vererbung mit super()-Aufruf
✅ Dynamisches Erzeugen der richtigen Unterklasse anhand des CSV-Felds typ
✅ Jede Unterklasse speichert und gibt die fertige Beschreibung aus der CSV zurück
✅ Polymorphie über ArrayList<Videospiel> und System.out.println(s)
✅ Sauberes Einlesen der CSV-Datei (BufferedReader)


➕ Zusätzliche kurze Aufgabe
Kurze Zusatzaufgabe (optional, +2 Punkte):
Erweitere die main-Methode in VideospielDatenbank.java so, dass die Spiele nach Erscheinungsjahr aufsteigend sortiert werden, bevor sie ausgegeben werden.
Tipp: Verwende Collections.sort() mit einem Comparator (oder List.sort()), der auf getErscheinungsjahr() zugreift.

🔧 Bonus (optional)

Ausgabe einer kurzen Statistik (z. B. „Geladen: 30 Action-Spiele und 26 Rollenspiele“)
