
<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Listen</h3>
<br>

<p align="center">
  <img src="meme.jpeg" />
</p>

#### Beschreibung:

- Willkommen zurück bei den Aufgaben! Bei den heutigen Aufgaben geht es um das neue Thema Listen und wie man auf bestimmte Elemente von diesen zugreift.

#### Projektstruktur:

- Jede Aufgabe ist in einem Modul hinterlegt, das sind die Ordner Aufgabe1 -> Aufgabe7.  
- In den Modulen findet ihr im Ordner "src" die jeweilige Kotlin Datei, 
die ihr zur Bearbeitung der Aufgabe benötigt.

#### Hinweise zur Bearbeitung:

- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Wichtige Materialien für heute:
    - [Handbuch: Listen → Verstehen → Index](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.jaj16dkgh70z)
    - [Handbuch: Listen → Implementieren: Liste → Wert in Liste bei Index lesen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.i0wfp97ecai7)
    - [Handbuch: Listen → Verstehen → Größe und Index](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.kxvrskp9wctg)


---


<details>
<summary><b>Aufgabe 1 - Vorhersagen, welcher Wert bei Index 0 gelesen werden würde </b></summary>

Schau dir den nachfolgenden Code an und überlege wie die Ausgabe des Codes aussieht.  

```
var worldChampionYears:ㅤList<Int>ㅤ=ㅤlistOf(1954, 1974, 1990, 2014)ㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤ
var year: Int = worldChampionYears[0]ㅤㅤㅤㅤㅤ         ㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤ
println(year)ㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤ
```

Wenn du dir das Ergebnis überlegt hast, kannst du den Code in der Datei ausführen
und dein Ergebnis überprüfen.

**Modul für die Aufgabe:** *Aufgabe1*  
**Datei für die Aufgabe:** *01_Textabgabe.kt*

</details>


---


<details>
<summary><b>Aufgabe 2 - Vorhersagen, welcher Wert bei Index 2 gelesen werden würde </b></summary>

Schau dir den nachfolgenden Code an und überlege wie die Ausgabe des Codes aussieht.

```
varㅤnames:ㅤList<String>ㅤ=ㅤlistOf("Peter",ㅤ"Nancy",ㅤ"Sabrina") ㅤㅤㅤㅤ     ㅤㅤㅤ
varㅤname:ㅤStringㅤ=ㅤnames[2]    ㅤㅤㅤ  ㅤ ㅤ ㅤ
println(name)ㅤㅤㅤㅤㅤㅤㅤㅤ      ㅤㅤㅤㅤ
```

Wenn du dir das Ergebnis überlegt hast, kannst du den Code in der Datei ausführen
und dein Ergebnis überprüfen.

**Modul für die Aufgabe:** *Aufgabe2*  
**Datei für die Aufgabe:** *02_Textabgabe.kt*

</details>


---


<details>
<summary><b>Aufgabe 3 - Vorhersagen, welcher Wert bei Index 1 gelesen werden würde </b></summary>

Schau dir den nachfolgenden Code an und überlege wie die Ausgabe des Codes aussieht.

```
varㅤages:ㅤList<Int>ㅤ=ㅤlistOf(17,ㅤ25,ㅤ23,ㅤ80)
varㅤage:ㅤIntㅤ=ㅤages[1]ㅤㅤㅤ   ㅤㅤㅤㅤ
println(age)ㅤㅤㅤ     ㅤㅤㅤㅤ
```

Wenn du dir das Ergebnis überlegt hast, kannst du den Code in der Datei ausführen
und dein Ergebnis überprüfen.

**Modul für die Aufgabe:** *Aufgabe3*  
**Datei für die Aufgabe:** *03_Textabgabe.kt*

</details>


---


<details>
<summary><b>Aufgabe 4 - Vorhersagen, welcher Wert bei Index 2 gelesen werden würde </b></summary>

Schau dir den nachfolgenden Code an und überlege wie die Ausgabe des Codes aussieht.

```
varㅤhasBusTicketList:ㅤList<Boolean>ㅤ=ㅤlistOf(true,ㅤtrue,ㅤfalse)
varㅤhasBusTicket:ㅤBooleanㅤ=ㅤhasBusTicketList[2]
println(hasBusTicket)ㅤㅤㅤㅤ
```

Wenn du dir das Ergebnis überlegt hast, kannst du den Code in der Datei ausführen
und dein Ergebnis überprüfen.

**Modul für die Aufgabe:** *Aufgabe4*  
**Datei für die Aufgabe:** *04_Textabgabe.kt*

</details>


---


<details>
<summary><b>Aufgabe 5 - Vorhersagen, welcher Wert bei Index liste.size - 1 gelesen werden würde </b></summary>

Du hast heute auch etwas über den Zusammenhang zwischen Größe und Index einer Liste gelernt. Schau dir den nachfolgenden Code an und überlege wie die Ausgabe des Codes aussieht.

```
varㅤhouseNumbers:ㅤList<Int> = listOf(23, 25, 27, 29) ㅤㅤㅤ   
varㅤhouseNumber:ㅤInt = houseNumbers[houseNumbers.size - 1] ㅤㅤㅤㅤㅤ
println(houseNumber)ㅤㅤㅤㅤㅤㅤ     ㅤㅤㅤㅤ
```

Wenn du dir das Ergebnis überlegt hast, kannst du den Code in der Datei ausführen
und dein Ergebnis überprüfen.

**Modul für die Aufgabe:** *Aufgabe5*  
**Datei für die Aufgabe:** *05_Textabgabe.kt*

</details>


---


<details>
<summary><b>Aufgabe 6 - Vorhersagen, welcher Wert bei Index liste.size - 1 gelesen werden würde </b></summary>

Du hast heute auch etwas über den Zusammenhang zwischen Größe und Index einer Liste gelernt. Schau dir den nachfolgenden Code an und überlege wie die Ausgabe des Codes aussieht.

```
varㅤweekEnd: List<String>ㅤ=ㅤlistOf("Samstag",ㅤ"Sonntag")
varㅤweekEndDay:ㅤString =ㅤweekEnd[weekEnd.size - 1]
println(weekEndDay)ㅤㅤㅤ
```

Wenn du dir das Ergebnis überlegt hast, kannst du den Code in der Datei ausführen
und dein Ergebnis überprüfen.

**Modul für die Aufgabe:** *Aufgabe6*  
**Datei für die Aufgabe:** *06_Textabgabe.kt*

</details>


---


<details>
<summary><b>Aufgabe 7 - Vorhersagen, was bei Zugriff auf liste.size passieren würde </b></summary>

Du hast heute auch etwas über den Zusammenhang zwischen Größe und Index einer Liste gelernt. Schau dir den nachfolgenden Code an und überlege was passieren würde, wenn man den Code so ausführen würde.

```
varㅤnumbers:ㅤList<Int>ㅤ=ㅤlistOf(2,ㅤ5,ㅤ3,ㅤ7) ㅤ ㅤ ㅤ ㅤㅤ
varㅤnumber: Int = numbers[numbers.size]ㅤㅤㅤㅤㅤㅤ
println(number)ㅤㅤㅤㅤㅤㅤㅤ   ㅤㅤㅤㅤㅤㅤ
```

Führe dann den Code in der Datei aus und schau dir das Ergebnis in der Konsole an.  

**Modul für die Aufgabe:** *Aufgabe7*  
**Datei für die Aufgabe:** *07_Textabgabe.kt*

</details>


---
