
<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">For Schleifen</h3>


#### Beschreibung:

Willkommen zurück zu den Übungen an Tag 22! 
Heute hast du eine besondere Form der While-Schleife, die Do-While-Schleife 
und die For-Schleife kennengelernt.
Die Anwendung dieser Schleifen wirst du heute üben.






#### Hinweise zur Bearbeitung:

- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Wichtige Materialien für heute:
  - [Handbuch: Schleifen → Implementieren → for-i Schleife implementieren](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.grptvljftk48)
  - [Handbuch: Schleifen → Verstehen → Schleifen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.6sfgr2lqqnys)
  - [Handbuch: Listen → Implementieren → Größe einer Liste lesen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.bvtmwoufzcex)
  - [Handbuch: Listen → Implementieren:MutableList → Wert in MutableList an Index ändern](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.x824jd5wl02t)

---

<details>
<summary> <b> Aufgabe 1 - Vorhersagen </b> </summary>

Schau dir den Codeausschnitt an.
- Was wird hier ausgegeben?

Notiere dir deine Antwort. (z.B. in einem Kommentar)  
Führe dann den Code aus.
- Wird das ausgegeben, was du dir notiert hast?

```kotlin
fun main() {
    var ergebnis: Int = 0
    var i: Int = 0
    do {
        ergebnis += i
        i++
    } while (i <= 5)
    println(i)
}
```

**Modul für die Aufgabe** *Aufgabe01*  
**Datei für die Aufgabe** *Vorhersagen.kt*  



</details>

---

<details>
<summary> <b> Aufgabe 2 - For-Schleife 1 bis 100 </b> </summary>

Erstelle eine For-Schleife, die alle Ganzzahlen von 1 bis einschließlich 100 in der Konsole ausgibt.

In der Konsole sollte dann folgendes zu sehen sein:  
1  
2  
3  
...  
100

**Modul für die Aufgabe** *Aufgabe02*  
**Datei für die Aufgabe** *ForLoopTillHundred.kt*

</details>




---

<details>
<summary> <b> Aufgabe 3 - Do-While 1 bis 100 </b> </summary>

Erstelle eine Do-While-Schleife, die alle Ganzzahlen von 1 bis einschließlich 100 in der Konsole ausgibt.

In der Konsole sollte dann folgendes zu sehen sein:  
1  
2  
3  
...  
100

**Modul für die Aufgabe** *Aufgabe03*  
**Datei für die Aufgabe** *DoWhileLoopTillHundred.kt*

</details>

---

<details>
<summary> <b> Aufgabe 4 - Listeninhalte ausgeben mit Schleifen </b> </summary>

Gib den Inhalt der Liste fruits einmal mithilfe einer For-Schleife und einmal mithilfe einer 
Do-While-Schleife in der Konsole aus.

Du darfst nicht die ganze Liste einfach als Parameter der println()-Funktion übergeben, 
sondern sollst mithilfe der Schleifen durch die Elemente der Liste durchgehen und diese ausgeben.

- Das ist verboten: `println(fruits)`

In der Konsole sollte dann folgendes ausgegeben werden:

    Strawberry  
    Apple  
    Banana  
    Lemon  
    Strawberry  
    Apple  
    Banana  
    Lemon  

**Modul für die Aufgabe** *Aufgabe04*  
**Datei für die Aufgabe** *ListeLesen.kt*

</details>

---

<details>
<summary> <b> Aufgabe 5 - Lieblingsfilme</b> </summary>

Gegeben ist eine veränderbare Liste namens lieblingsFilme, die Filme auflistet.

Erstelle einmal eine For-Schleife und einmal eine Do-While-Schleife.

Die Schleifen sollen die Liste mit den Lieblingsfilmen durchlaufen und prüfen, 
ob der Film "Matrix" in der Liste ist.
Wenn der Film "Matrix" in der Liste ist, soll in der Konsole "Ja, der Film Matrix ist in der Liste." 
ausgegeben werden.  
Zusätzlich soll die Stelle in der Liste ausgegeben werden, an der sich der Film "Matrix" befindet.

- Du darfst für diese Aufgabe nicht die contains()-Funktion für Listen verwenden.

**Modul für die Aufgabe** *Aufgabe05*  
**Datei für die Aufgabe** *Lieblingsfilme.kt*



</details>


---
<details>
<summary> <b> Aufgabe 6 - Zahlen in einer Liste erhöhen </b> </summary>

In dieser Aufgabe sollst du eine For-Schleife schreiben, die die Liste numbers durchläuft,
die jeweilige Zahl liest, es um 5 erhöht und dann wieder an der Stelle in der Liste speichert.
Gib nach der Schleife die Liste in der Konsole aus und überprüfe dein Ergebnis.  
Wurden alle Zahlen um 5 erhöht?

**Modul für die Aufgabe** *Aufgabe06*  
**Datei für die Aufgabe** *ListeManipulieren.kt*

</details>

---
<details>
<summary> <b> Aufgabe 7 - Fehler beheben </b> </summary>



In dieser Aufgabe sollst du fehlerhaften Code korrigieren. 

Wenn du fertig bist, sollte das Programm keine Compiler- noch Laufzeitfehler besitzen und alle Filme in der Liste 
lieblingsFilme in der Konsole ausgeben.

Wenn du nicht direkt auf die Lösung kommst, versuche erst einmal das Programm auszuführen und schau dir die 
Fehlermeldung an oder führe den Mauszeiger über die rot markierten Stellen im Code um nützliche 
Hinweise zu erhalten.

**Modul für die Aufgabe** *Aufgabe07*  
**Datei für die Aufgabe** *Fehler.kt*

</details>