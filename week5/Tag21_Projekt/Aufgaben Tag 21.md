
<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Schleifen</h3>
<br>

<p align="center">
  <img src="img/img.png" />
</p>

#### Beschreibung:

Willkommen zurück zu den Übungen an Tag 21. Heute geht es rund um die While-Schleife. Wir wünschen euch viel Spaß bei den Aufgaben.




#### Hinweise zur Bearbeitung:

- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Wichtige Materialien für heute:
  - [Handbuch: Schleifen → Verstehen → Programmfluss und Laufvariablen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.khc665cedvja)
  - [Handbuch: Schleifen → Implementieren → Laufvariablen implementieren](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.4b4isj8cze29)
  - [Handbuch: Schleifen → Implementieren → while-Schleife implementieren](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.hf34b5wgif84)
  - [Handbuch: Listen → Implementieren → Größe einer Liste lesen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.bvtmwoufzcex)
  - [Handbuch: Listen → Implementieren:MutableList → Wert in MutableList an Index ändern](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.x824jd5wl02t)

---

<details>
<summary> <b> Aufgabe 1 - Der Sinn einer Schleife </b> </summary>

Wir wollen ein Programm benutzen, das für uns in der Konsole von 1 bis 10 hochzählt.
Dazu haben wir zwei Funktionen in der Datei erstellt.

Schau dir die beiden Funktionen an und rufe sie nacheinander in main()-Funktion auf.   
Beantworte anschließend die Fragen unter der main()-Funktion in der Datei!

**Modul für die Aufgabe:** *Aufgabe01*  
**Datei für die Aufgabe:** *SinnDerSchleife.kt*

</details>

---

<details>
<summary> <b> Aufgabe 2 - Vorhersagen I </b> </summary>

Schau dir den Codeausschnitt an.
- Was wird hier ausgegeben?

Notiere dir deine Antwort. (z.B. in einem Kommentar)  
Führe dann den Code aus.
- Wird das ausgegeben, was du dir notiert hast?

```kotlin
fun main() {
  var i: Int = 0
  while (i < 5) {
    i++
  }
  println(i)
}
```

**Modul für die Aufgabe:** *Aufgabe02*  
**Datei für die Aufgabe:** *AbgabeText*

</details>

---

<details>
<summary> <b> Aufgabe 3 - Vorhersagen II</b> </summary>

Schau dir den Codeausschnitt an.
- Was wird hier ausgegeben?

Notiere dir deine Antwort. (z.B. in einem Kommentar)  
Führe dann den Code aus.
- Wird das ausgegeben, was du dir notiert hast?

```kotlin 
fun main() {
  var i: Int = 0
  while (i > 5) {
    i++
  }
  println(i)
}
```
**Modul für die Aufgabe:** *Aufgabe03*  
**Datei für die Aufgabe:** *AbgabeText*

</details>

---

<details>
<summary> <b> Aufgabe 4 - Code verstehen: Ergebnisse ausgeben </b> </summary>

Betrachtet den Code in der Datei SchleifenErgebnisDrucken und führt ihn aus.

Hier geht es darum, zu verstehen, dass Zwischenergebnisse innerhalb der Schleife sowie das Endergebnis außerhalb der Schleife weiterverwendet werden können.

Setzt einen Breakpoint und geht mit dem Debugger beide Schleifen Schritt für Schritt durch, um nachzuvollziehen, was genau beim Schleifendurchlauf geschieht.

Beantwortet danach die Fragen im Code.

**Modul für die Aufgabe:** *Aufgabe04*  
**Datei für die Aufgabe:** *SchleifenErgebnisDrucken*

</details>

---

<details>
<summary> <b> Aufgabe 5 - Code verstehen: Liste durchlaufen </b> </summary>

In dieser Aufgabe wird die Schleife benutzt, um jedes Element in einer Liste zu betrachten. Schaut euch den Code genau an und versteht, was passiert.

Ihr findet zudem eine Anleitung, wie man Schleifen implementiert.

Guckt euch den Code genau an und geht nochmal mit dem Debugger drüber, um jeden Schritt nachzuvollziehen und beantwortet die Verständnisfragen am Ende des Codes!

**Modul für die Aufgabe:** *Aufgabe05*  
**Datei für die Aufgabe:** *ListeDurchlaufen.kt*

</details>

---

<details>
<summary> <b> Aufgabe 6 - While-Schleife implementieren </b> </summary>

In dieser Aufgabe sollst du nun selber deine erste while-Schleife in main() erstellen.  
Schreibe ein Programm, dass absteigend die Zahlen von 100 bis 1 in der Konsole ausgibt.  
(Also 100, 99, 98, 97... 1.)

**Modul für die Aufgabe:** *Aufgabe06*  
**Datei für die Aufgabe:** *WhileSchleife.kt*

</details>

---

<details>
<summary> <b> Aufgabe 7 - Schleife “Liste lesen” entwerfen </b> </summary>

In dieser Aufgabe ist nur eine Liste vorgegeben. 
Du sollst jetzt eine while-Schleife erstellen, die jedes einzelne Element der Liste 
in der Konsole ausgibt.

**Modul für die Aufgabe:** *Aufgabe07*  
**Datei für die Aufgabe:** *ListeLesen.kt*

</details>

---

<details>
<summary> <b> Aufgabe 8 - Schleife “Liste manipulieren” entwerfen </b> </summary>

In dieser Aufgabe ist eine MutableList gegeben.  
Mithilfe einer while-Schleife sollst du jetzt 
jeden Wert aus der MutableList verdoppeln und wieder an der gleichen Stelle abspeichern.  
Gib dann die ganze MutableList aus.  
Haben sich die Werte verdoppelt?

**Modul für die Aufgabe:** *Aufgabe08*  
**Datei für die Aufgabe:** *ListeManipulieren*

</details>

---

<details>
<summary> <b> Aufgabe 9 - Jedes 2. Element der Liste </b> </summary>

Schreibe eine Funktion, die eine Liste erhält und eine MutableListe wieder zurückgibt.  
Lege in der Funktion eine MutableListe an.  
Füge jetzt mithilfe einer While-Schleife der neu angelegten MutableListe jedes 2. Element 
aus der als Parameter übergebenen Liste hinzu.  
Gib dann die MutableListe zurück.

Teste anschließend, ob die MutableListe auch wirklich nur jedes 2. Element aus der 
ursprünglichen Liste enthält.

Ein Beispiel:  
Parameter: List = [0, 1, 2, 3, 4, 5]  
Rückgabe: MutableList = [1, 3, 5]  

**Modul für die Aufgabe:** *Aufgabe09*  
**Datei für die Aufgabe:** *Filter*

</details>

---

<details>
<summary> <b> Aufgabe 10 - Liste rückwärts ausgeben </b> </summary>

In dieser Aufgabe ist eine List mit Elementen des Datentyps String gegeben. Vervollständige die Funktion namens "satzAusgabe", die eine List als Parameter übergeben bekommt und folgende Anweisungen ausführt:

1. folgendes in die Konsole printen: "Ursprünglicher Satz: $umgedrehterSatz"
2. mit Hilfe einer Schleife jedes Element von hinten nach vorne in einer neuen MutableListe(!) namens "lesbarerSatz" speichern
3. in die Konsole printen: "Korrekter Satz: $lesbarerSatz"

**Modul für die Aufgabe:** *Aufgabe10*  
**Datei für die Aufgabe:** *SatzKorrektAusgeben*

</details>

---
