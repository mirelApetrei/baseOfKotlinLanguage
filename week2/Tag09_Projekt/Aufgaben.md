<h1>

</h1>

#### Beschreibung:

Heute haben wir das Thema Maps kennengelernt.

Das Wort Maps kommt dabei nicht von Google Maps, sondern kommt aus der englischen 
Sprache und steht für Abbildungen. In einer Abbildung zeigt etwas
(z.B. ein Schlüssel) auf etwas anderes (z.B. einem Wert).

Am Besten schauen wir uns Mal ein paar Beispiele an.


#### Hinweise zur Bearbeitung:

- Löse die Aufgaben programmatisch (D.h. schreibe Code, um auf die Lösung zu kommen).
- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Wenn ihr Hilfe braucht, könnt ihr euch am Code aus der Aufgabe 1 orientieren
oder jederzeit die Tutoren fragen.
- Viel Erfolg und natürlich viel Spaß!

---

<details>
<summary> <b> Aufgabe 1 - Map Beispiele </b> </summary>

Heute hast du in der Vorlesung Maps und MutableMaps kennengelernt.
Eine Map ist eine Anordnung von Paaren (englisch: entry).
Ein Paar besteht dabei aus einem Schlüssel (englisch: key) und einem Wert (englisch: value).  
- Schaue dir die Datei in Aufgabe1 an.

**Modul für die Aufgabe:** *Aufgabe1*  
**Datei für die Aufgabe:** *01_MapBeispiele.kt*

</details>

---

<details>
<summary> <b> Aufgabe 2 - Map selber erstellen </b> </summary>

In dieser Aufgabe üben wir das Erstellen von Maps.  
Wenn ihr Hilfe braucht, schaut euch an, wie eine Map bzw. 
eine MutableMap in Aufgabe1 erstellt wurde.  
Ansonsten könnt ihr jederzeit die Tutoren fragen.
Das Erstellen der Maps ist sehr ähnlich zu Listen.

- Schaue dir die Datei und erledige die Aufgabe in der Datei.



**Modul für die Aufgabe:** *Aufgabe2*  
**Datei für die Aufgabe:** *2_MapsAnlegen.kt*


</details>

---

<details>
<summary> <b> Aufgabe 3 - MutableMap </b> </summary>


a) Erstelle eine Map über Waren und ihren Preisen.
- Erstelle eine Map, der Schlüssel ist vom Typ String und
  der Wert ist vom Typ Double.
- Die Map soll initial (also zu Beginn) mit folgenden Paaren gefüllt sein:  
  "Schokolade" -> 1.99  
  "Banane" -> 0.29  
  "Yoghurt" -> 0.49  
  "Müsli" -> 2.99

b) Erstelle eine MutableMap über Personennamen und ihren Lieblingstieren.
- Erstelle eine Map, der Schlüssel ist vom Typ String und
  der Wert ist vom Typ String.
- Die Map soll initial mit folgenden Paaren gefüllt sein:  
  "Berta" -> "Hunde"  
  "Frank" -> "Katzen"  
  "Luis" -> "Mäuse"  
  "Sylvia" -> "Eulen"

c) Erstelle eine Map über Hausnummern und der Hausfarbe.
- Erstelle eine Map, der Schlüssel ist vom Typ Int und 
  der Wert ist vom Typ String.
- Die Map soll initial mit folgenden Paaren gefüllt sein:  
  12 -> "Rot"  
  45 -> "Blau"  
  23 -> "Gelb"  
  28 -> "Grün"  

**Modul für die Aufgabe:** *Aufgabe3*  
**Datei für die Aufgabe:** *3_MapsAnlegen.kt*
</details>


---

<details>
<summary> <b> Aufgabe 4 - Werte erhalten </b>
</summary>

In dieser Aufgabe geht es darum, wie man Werte aus einer Map erhält.
Oftmals hat man einen Schlüssel (key) gegeben und möchte den Wert (value) 
haben, auf den der Schlüssel zeigt.

a) Gegeben ist folgende Map:  
Die Map mappt von Person zu ihrem Lieblingstier.
    
    val personZuHaustier: Map<String, String> = mapOf( 
      "Berta" -> "Hunde"  
      "Frank" -> "Katzen"  
      "Luis" -> "Mäuse"  
      "Sylvia" -> "Eulen"
      "Hans" -> "Fau"
    )

- Verwende die Funktion get() oder die Index[] Schreibweise, 
wie in Aufgabe 1 oder in der Vorlesung gezeigt.
  - Was ist das Lieblingstier von Frank?
  - Was ist das Lieblingstier von Sylvia?
  - Was ist das Lieblingstier von Hans?
  
b) Gegeben ist folgende Map:  
Die Map mappt von Hausnummer zu Hausfarbe.

12 -> "Rot"  
45 -> "Blau"  
23 -> "Gelb"  
28 -> "Grün"  
36 -> "Lila"  
92 -> "Rosa"  

- Erstelle eine geeignete Map mit den genannten Paaren.
- Lese den Wert aus der Map aus und weise ihn einer Variable zu,   
gib dann die Variable in der Konsole aus.
- Verwende in deiner Lösung die Funktion get() oder die Index[] Schreibweise.
  - Welche Hausfarbe hat das Haus mit der Nummer 28? 
  - Welche Hausfarbe hat das Haus mit der Nummer 45?
  - Welche Hausfarbe hat das Haus mit der Nummer 92?
  - Welche Hausfarbe hat das Haus mit der Nummer 12?



**Modul für die Aufgabe:** *Aufgabe4*  
**Datei für die Aufgabe:** *4_WerteAbfragen.kt*

</details>

---

<details>
<summary> <b> Aufgabe 5 - Werte hinzufügen </b>
</summary>

a) Gegeben ist folgende MutableMap:  
Die MutableMap mappt von Person zu ihrem Lieblingstier.

    val personZuHaustier: MutableMap<String, String> = mapOf( 
      "Berta" -> "Hunde"  
      "Frank" -> "Katzen"  
      "Luis" -> "Mäuse"  
      "Sylvia" -> "Eulen"
      "Hans" -> "Fau"
    )

- Füge der MutableMap die folgenden Paare hinzu, verwendet dazu eine Funktion 
oder Schreibweise aus der Vorlesung.
  - "Tim" -> "Schildkröte"
  - "Fabian" -> "Papagei"
  - "Jannik" -> "Schlange"

b)   
Was passiert, wenn du der MutableMap das Paar "Luis" -> "Mäuse" hinzufügst?  
Was passiert, wenn du der MutableMap das Paar "Bernd" -> "Igel" hinzufügst?

c)

- Erstelle eine passende MutableMap. Die MutableMap hat initial (zu Begin) folgende Paare:


    1 -> 2.5  
    2 -> 5.0  
    3 -> 7.5  
    4 -> 10.0


- Füge dann der Map folgende weitere Paare hinzu:


    10 -> 10.1
    25 -> 45.23
    99 -> 259.46

**Modul für die Aufgabe:** *Aufgabe5*  
**Datei für die Aufgabe:** *5_WerteHinzufügen.kt*

</details>

---
<details>
<summary> <b> Aufgabe 6 - Werte ändern </b>
</summary>

Wir können auch die Werte bereits vorhandener Paare ändern.
Schreibe deine Lösungen in die Datei für diese Aufgabe.

a) Gegeben ist folgende MutableMap:  
Die MutableMap mappt von einer Person zu ihrem Lieblingstier.

    val personZuHaustier: MutableMap<String, String> = mapOf( 
      "Berta" -> "Hunde"  
      "Frank" -> "Katzen"  
      "Luis" -> "Mäuse"  
      "Sylvia" -> "Eulen"
      "Hans" -> "Fau"
    )

- Verwende für die folgenden Teilaufgaben eine passende Funktion oder Schreibweise aus der Vorlesung.
  - Ändere den Wert des Paares "Berta" -> "Hunde" zu "Berta" -> "Esel"
  - Ändere den Wert des Paares "Sylvia" -> "Eulen" zu "Sylvia" -> "Pferde"
  - Ändere den Wert des Paares "Frank" -> "Katzen" zu "Frank" -> "Spechte"
  - Ändere den Wert des Paares "Luis" -> "Mäuse" zu "Luis" -> "Spechte"

b) Fragen:
- Kann eine Map oder MutableMap diese zwei Paare enthalten?  
    "Berta" -> "Hunde"    
    "Berta" -> "Hunde"
  - Falls nein, ändere nur einen Schlüssel oder nur einen Wert, 
  sodass eine Map oder MutableMap beide Paare enthalten kann.

**Modul für die Aufgabe:** *Aufgabe6*  
**Datei für die Aufgabe:** *6_WerteHinzufügen.kt*
</details>

---
<details>
<summary> <b> Aufgabe 7 - Paare löschen </b>
</summary>

In dieser Aufgabe geht es um das Löschen von Paaren in Maps.

Gegeben ist folgende MutableMap:  
Die MutableMap mappt von einer Person zu ihrem Lieblingstier.

"Berta" -> "Hunde"  
"Frank" -> "Katzen"  
"Luis" -> "Mäuse"  
"Sylvia" -> "Eulen"  
"Hans" -> "Fau"

a)
- Verwende für die folgenden Teilaufgaben eine Funktion oder Schreibweise aus der Vorlesung.
  - Verwende den Schlüssel "Frank", um das Paar "Frank" -> "Katzen" aus der MutableMap zu löschen.
  - Verwende den Schlüssel "Hans", um das Paar "Hans" -> "Fau" aus der MutableMap zu löschen.
    - Gebe die MutableMap aus. Die MutableMap sollte jetzt nur noch aus den folgenden Einträgen bestehen:  
        
      "Berta" -> "Hunde"  
      "Luis" -> "Mäuse"  
      "Sylvia" -> "Eulen"

b)
- Verwende jetzt den Schlüssel "Luis" und den Wert "Mäuse" um das Paar 
"Luis" -> "Mäuse" aus der MutableMap zu entfernen.  
Weise den Rückgabewert einer Variable zu und gib diese Variable in der Konsole aus.
  - Es sollte true ausgegeben werden. Stimmt das?

- Verwende jetzt die Funktion remove(schlüssel, wert) aus der Vorlesung 
(in der Vorlesung dargestellt als remove(key, value)) mit folgenden 
Schlüssel "Frank" und Wert "Mäuse". Weise den Rückgabewert einer Variable zu und gib 
diese Variable in der Konsole aus.
  - Was wird ausgegeben? Und wieso?



Bonusfrage - Wiederholung:

Wie wir wissen, können wir die Paare einer Map nicht verändern.
Da sie vom Typ Map und nicht vom Typ MutableMap ist.
- Was hast du letzte Woche gelernt, das du tun kannst, um eine veränderbare Kopie 
einer Map zu erhalten?

**Modul für die Aufgabe:** *Aufgabe7*  
**Datei für die Aufgabe:** *7_PaareLöschen.kt*
</details>
