
<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Funktionen und Parameter</h3>
<br>

#### Beschreibung:

Willkommen zurück zu den Übungsaufgaben! Heute habt ihr alles rund um das Thema Parameter gelernt. Wenden wir gleich einmal das Gelernte an!

#### Hinweise zur Bearbeitung:

- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Löst die Aufgaben programmatisch, d.h. schreibt Code um auf die Lösung zu kommen.
- Wichtige Materialien für heute:
  - [Handbuch: Funktionen → verstehen → Parameter](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.ycfnnrwr0sgb)
  - [ Handbuch: Funktionen → implementieren → Parameter ](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.6u9tw4ybv1p)

---

<details>
<summary> <b> Aufgabe 1 - Textabgabe</b> </summary>

Überlege dir in den Aufgaben zuerst eine Antwort, notiere dir deine Antwort
(z.B. in einem Kommentar), kopiere dann den Code in die TextAufgabe.kt Datei,
führe ihn aus und überprüfe dann, ob das Programm die gleiche Ausgabe ausgibt, 
wie du dir zuvor notiert hast.

Wenn du fertig bist, lösche den Code aus der Datei.

a)

Schau dir den Codeausschnitt an.

- Was wird hier ausgegeben?

Notiere dir deine Antwort.  (z.B. in einem Kommentar)  
Führe dann den Code aus.
- Wird das ausgegeben, was du dir notiert hast?

```
fun main() {
    minusRechnen(5)
}

fun minusRechnen(zahl2: Int) {
    var zahl1: Int = 10
    println(zahl1 - zahl2)
}
```

b)

Schau dir den Codeausschnitt an.
- Was wird hier ausgegeben?

Notiere dir deine Antwort.  (z.B. in einem Kommentar)  
Führe dann den Code aus.
- Wird das ausgegeben, was du dir notiert hast?

```
fun main() {
    hallo("Peter")
}

fun hallo(name: String) {
    println("Hallo! Wie geht es dir $name?")
}
```
c)

Schau dir den Codeausschnitt an.
- Was wird hier ausgegeben?

Notiere dir deine Antwort.  (z.B. in einem Kommentar)  
Führe dann den Code aus.
- Wird das ausgegeben, was du dir notiert hast?

```
fun main() {
    multiplikation(5, 23)
}

fun multiplikation(zahl1: Int, zahl2: Int) {
    println(zahl1 * zahl2)
}
```

d)

Schau dir den Codeausschnitt an.
- Was wird hier ausgegeben?

Notiere dir deine Antwort. (z.B. in einem Kommentar)  
Führe dann den Code aus.
- Wird das ausgegeben, was du dir notiert hast?

```
fun main() {
    printFilm(1)
}

fun printFilm(listenIndex: Int) {
    val lieblingsFilme: MutableList<String> = mutableListOf(
        "Batman", "Oldboy", "ES",
        "Harry Potter", "Pulp Fiction"
    )
    println(lieblingsFilme[listenIndex])
}
```

**Modul für die Aufgabe:** *Aufgabe1*  
**Datei für die Aufgabe:** *TextAufgabe.kt*
</details>

---


<details>
<summary> <b> Aufgabe 2 - Funktionen entwerfen I</b> </summary>

In dieser Aufgabe erstellen wir eine Funktion mit Parametern.

- In der Datei "FunktionAnleitung.kt", außerhalb der main()-Funktion, schreibe das Keyword für Funktionen “fun”.
- Schreibe jetzt den Namen der Funktion “deinName”.
- Schreibe die Klammern für die Parameter "()".
- Schreibe in die Klammer deinen Parameter “name” vom Typ String.
- Gebe jetzt den Rumpf der Funktion mit "{}" an. 
- Gebe im Rumpf deiner Funktion deinen Namen aus:
  - Schreibe die println() Funktion.
  - Schreibe in die Klammern "Hallo, mein Name is $name.".
- rufe “deinName()” in der Main-Funktion auf und schreibe den Namen "Daniel" als String in die Klammern.

Führe jetzt dein Programm aus und überprüfe, ob der Text "Hallo, mein Name is Daniel." ausgegeben wird.  
Wenn ja, hast du die Funktion richtig erstellt und aufgerufen.



**Modul für die Aufgabe:** *Aufgabe2*  
**Datei für die Aufgabe:** *FunktionAnleitung.kt*

</details>


---

<details>
<summary> <b> Aufgabe 3 - Funktionen entwerfen II</b> </summary>

In dieser Aufgabe wirst du ein paar in der Praxis oft verwendete Funktionen erstellen.

a)

- Erstelle eine Funktion, die zwei Zahlen vom Typ Double als Parameter erhält,  
die zwei Zahlen addiert und das Ergebnis zurückgibt.

- Teste deine Funktion, indem du sie in der main()-Funktion mit den zwei Werten 123.45 und 76.55 aufrufst.  
- Lege den Rückgabewert der Funktion in einer Variable ab und gebe den Wert der Variable in der Konsole 
mit der println()-Funktion aus.  
Wird 200.0 ausgegeben?   
Du hast die Funktion richtig erstellt, wenn 200.0 ausgegeben wird.

b)

- Erstelle eine Funktion, die zwei Zahlen vom Typ Int als Parameter erhält,  
die zweite Zahl von der ersten Zahl abzieht und das Ergebnis zurückgibt.

- Teste deine Funktion, indem du sie in der main()-Funktion mit den zwei Werten 7 und 4 aufrufst.  
- Lege den Rückgabewert der Funktion in einer Variable ab und gebe den Wert der Variable in der Konsole
  mit der println()-Funktion aus.  
  Wird 3 ausgeben?  
  Du hast die Funktion richtig erstellt, wenn 3 ausgegeben wird.

c)

- Erstelle eine Funktion. 
- Die Funktion bekommt drei Zahlen vom Typ Int.
- Die Funktion multipliziert dann die ersten zwei Zahlen vom Typ Int 
und speichert das Ergebnis in einer Variable.
- Die Funktion zieht von dem Ergebnis die dritte Zahl ab.
- Die Funktion gibt dann das Ergebnis zurück.

- Teste deine Funktion, indem du sie in der main()-Funktion mit den drei Werten 25, 40 und 100 aufrufst.
- Lege den Rückgabewert der Funktion in einer Variable ab und gebe den Wert der Variable in der Konsole
  mit der println()-Funktion aus.  
Wird 900 ausgegeben?  
Du hast die Funktion richtig erstellt, wenn 900 ausgegeben wird.






**Modul für die Aufgabe:** *Aufgabe3*  
**Datei für die Aufgabe:** *FunktionenEntwerfen.kt*

</details>

---

<details>
<summary> <b> Aufgabe 4 - Funktionen entwerfen III</b> </summary>

Hier sollst du nun deine eigene Funktion selbst entwerfen!  
Gib der Funktion den Namen printCity.
Lege in der Funktion jetzt eine MutableList mit Städtenamen vom Typ String an.
Zu Begin hat die MutableList die Werte "Köln" und "Hamburg".
Die Funktion bekommt als Parameter einen Stadtnamen übergeben und fügt den Stadtnamen der Liste hinzu.
Am Ende gibt die Funktion die Liste aus.
Benutzt dazu die println()-Funktion.

Ruf jetzt die Funktion in der main-Funktion dreimal auf. Einmal mit dem Parameter "Berlin", 
einmal mit dem Parameter "Duisburg" und einmal mit dem Parameter "Frankfurt".

Du hast die Funktion richtig erstellt, wenn in der Konsole das ausgegeben wird.
```
[Köln, Hamburg, Berlin]
[Köln, Hamburg, Duisburg]
[Köln, Hamburg, Frankfurt]
```


**Modul für die Aufgabe:** *Aufgabe4*  
**Datei für die Aufgabe:** *NochMehrFunktionen.kt*

</details>


---

<details>
<summary> <b> Aufgabe 5 - Fehler beheben</b> </summary>

Verbessere die Fehler in der Datei.

**Modul für die Aufgabe:** *Aufgabe5*  
**Datei für die Aufgabe:** *FehlerBeheben.kt*

</details>

---
