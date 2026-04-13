# 🎮 Videospiel-Datenbank – Vererbung in Java

**Hausübung (HÜ) – Objektorientierte Programmierung**  
**Thema:** Vererbung mit abstrakter Basisklasse und CSV-Einlesen

---

## 📋 Aufgabenstellung

Es soll eine kleine Videospiel-Datenbank erstellt werden, die das Konzept der **Vererbung** und **abstrakten Klassen** in Java demonstriert.

- **Abstrakte Basisklasse:** `Videospiel`
- **Zwei konkrete Unterklassen:** `ActionSpiel` und `Rollenspiel`
- Daten werden aus einer CSV-Datei eingelesen und als passende Objekte instanziiert.
- Polymorphie wird genutzt, um alle Spiele einheitlich zu verarbeiten.

Die CSV-Datei enthält Action- und Rollenspiele mit Titel, Entwickler, Erscheinungsjahr, Typ und einem zusätzlichen Attribut.

---

## 🗂 Projektstruktur
videospiele-vererbung/
├── Videospiel.java              ← abstrakte Basisklasse
├── ActionSpiel.java             ← Unterklasse 1
├── Rollenspiel.java             ← Unterklasse 2
├── VideospielDatenbank.java     ← Hauptprogramm mit main()
├── videospiele.csv              ← Datenquelle
└── README.md                    ← diese Datei
text---

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
Action-Spiel 'Half-Life 2' von Valve (2004). Schwierigkeitsgrad: mittel.
Rollenspiel 'Baldur's Gate 3' von Larian Studios (2023). Spielwelt: Fantasy.
Action-Spiel 'Counter-Strike 2' von Valve (2023). Schwierigkeitsgrad: hoch.
Rollenspiel 'The Witcher 3: Wild Hunt' von CD Projekt Red (2015). Spielwelt: Fantasy.

✅ Erfüllte Anforderungen

✅ Eine abstrakte Klasse Videospiel mit abstrakter Methode getBeschreibung()
✅ Korrekte Vererbung mit super()-Aufruf
✅ Dynamisches Erzeugen der richtigen Unterklasse anhand des CSV-Felds typ
✅ Polymorphie über ArrayList<Videospiel>
✅ Sauberes Einlesen der CSV-Datei (BufferedReader)
✅ Getter-Methoden und überschriebene toString()


🔧 Bonus (optional)

Sortierung der Spiele nach Erscheinungsjahr
Einfache Fehlerbehandlung bei falschem typ oder fehlenden Daten


Abgabe:
Alle fünf Dateien (*.java + videospiele.csv) in einem ZIP-Archiv oder als Git-Repository abgeben.
Erstellt als Hausübung für den Unterricht
Viel Spaß beim Programmieren! 🎮
