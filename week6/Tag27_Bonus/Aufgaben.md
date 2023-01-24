
<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Objektorientierte Programmierung</h3>
<br>



#### Beschreibung:

- Willkommen bei den Bonusaufgaben! Hier sollst du jetzt weiter mit Klassen und Instanzen arbeiten.

#### Hinweise zur Bearbeitung:

- Die Aufgaben beinhalten eine Klassen- sowie eine Maindatei
- Um die Fehler wegzubekommen, schreibt als Erstes die Klassen Person und RaceCar mit den richtigen Konstruktoren
- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Wichtige Materialien für heute:
  - [Handbuch: Objektorientierte Programmierung (OOP) → Nachschlagen → Best Practice: Name für Klasse entwerfen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.d8lnnw7x9ec3)
  - [Handbuch: Objektorientierte Programmierung (OOP) → Nachschlagen → Best Practice: Name für Instanz-Variable entwerfen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.gxj2gu539y2v)
  - [Handbuch: Objektorientierte Programmierung (OOP)  → Implementieren → Klasse + Eigenschaften implementieren, instanzieren und nutzen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.vyyp38n6yw1d)


---


<details>
<summary><b>Aufgabe 1 - Einstieg</b></summary>

Gegeben ist eine Klasse `Book` schaue sie dir an. Bücher haben die zwei Eigenschaften Titel und Seitenzahl.

In der Main Funktion wurden 3 Bücher instanziiert und in eine veränderbare Liste hinterlegt.

Zuallererst wurde die Ausgangsliste mittels For-Schleife und Punktnotation ausgegeben. Das heisst, dass jedes Buch in der Liste mit dem Titel und der Seitenzahl ausgegeben wurde.

Danach wurde die Bücherliste nach der Seitenzahl ihrer Bücher sortiert und wieder ausgegeben.


Als Letztes soll die Liste nach Buchtitel sortiert und ausgegeben werden. Schreibe den Code weiter. Du kannst dich am Codeblock der Seitenzahlsortierung orientieren.


**Datei für die Aufgabe:** *Book.kt* 

</details>

---


<details>
<summary><b>Aufgabe 2 - Langsam aber sicher gut dabei</b></summary>

Erstelle für diese Aufgabe eine Klasse `Person`, die die Eigenschaften Name, Alter und Körpergröße(in cm) hat.
Um bei einer Achterbahn mitfahren zu dürfen, muss eine Person mindestens 12 Jahre alt und 155 cm groß sein.

In der Main Funktion sind 3 Personen schon instanziiert worden.
Erstelle eine Liste von Personen und hinterlege die drei vorgegeben Personen in die Liste.

Erstelle nun eine weitere Funktion `darfMitFahren` die eine Person als Parameter annimmt und einen Boolean Wert zurückgibt. In dieser Funktion wird geprüft, ob die Person auf der Achterbahn mitfahren darf oder nicht. Bedenke eine Person darf nur mitfahren, wenn diese MINDESTENS 12 Jahre alt ist UND MINDESTENS 155cm groß ist. 

Nun geh wieder in die Main-Funktion und prüfe jede einzelne Person innerhalb der Liste mit Hilfe der zuvor erstellen Funktion `darMitFahren` und gib jeweils den Namen aus und ob die Person mitfahren darf oder nicht.

Gib dann für jede Person das Ergebnis auf der Konsole aus.

**Datei für die Aufgabe:** *Person.kt*

</details>

---


<details>
<summary><b>Aufgabe 3 - Schwieriger für die Leute die knobeln wollen </b></summary>

In dieser Aufgabe sollst eine Klasse `RaceCar` implementieren, welche die Eigenschaften Modell und Geschwindigkeit hat.
Im Konstruktor soll für die Geschwindigkeit ein zufälliger Wert zwischen 170 und 200 zugewiesen werden.

Erstelle dann eine Funktion `werIstSchneller`, die als Parameter zwei RaceCars annimmt und das schnellere RaceCar zurückgibt. In dieser Funktion wird die Geschwindigkeit zweier RaceCars verglichen und das schnellere wird zurückgegeben.

In der Main-Funktion wurden 8 RaceCars instanziiert. Erstelle eine Mutablelist und hinterlege alle RaceCars in die Liste.
Nun sollst du ein Rennturnier veranlassen.
Dazu soll RaceCar1 und RaceCar2 antreten danach
RaceCar2 und RaceCar3,
RaceCar3 und RaceCar4 etc.

Das Ergebnis könnte so aussehen:

    Das Rennen Nr: 1
    Rennen zwischen BMW und & Audi hat gewonnen: BMW
    Das Rennen Nr: 2
    Rennen zwischen Audi und & Opel hat gewonnen: Audi
    Das Rennen Nr: 3
    Rennen zwischen Opel und & Mercedes hat gewonnen: Mercedes
    Das Rennen Nr: 4
    Rennen zwischen Mercedes und & Fiat hat gewonnen: Mercedes
    Das Rennen Nr: 5
    Rennen zwischen Fiat und & Ferrari hat gewonnen: Ferrari
    Das Rennen Nr: 6
    Rennen zwischen Ferrari und & Lambo hat gewonnen: Ferrari
    Das Rennen Nr: 7
    Rennen zwischen Lambo und & Mitsubishi hat gewonnen: Lambo
    Das Rennen ist vorbei








**Datei für die Aufgabe:** *RaceCar.kt*

</details>








