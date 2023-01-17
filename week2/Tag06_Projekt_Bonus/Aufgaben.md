
<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Listen</h3>
<br>



#### Beschreibung:

- Willkommen zu den Bonusaufgaben!

#### Hinweise zur Bearbeitung:

- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Wichtige Materialien für heute:
  - [Handbuch: Listen → Verstehen → Index](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.jaj16dkgh70z)
  - [Handbuch: Listen → Implementieren: Liste → Wert in Liste bei Index lesen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.i0wfp97ecai7)
  - [Handbuch: Listen → Verstehen → Größe und Index](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.kxvrskp9wctg)



---


<details>
<summary><b>Aufgabe 1</b></summary>

Schau dir den nachfolgenden Code an und überlege wie die Ausgabe des Codes aussieht.
```
val fruits:ㅤList<String> = listOf("Banane",ㅤ"Apfel",ㅤ"Birne")
val fruit:ㅤStringㅤ=ㅤfruits[fruits.size - 3]
println(fruit)ㅤㅤㅤㅤㅤ     ㅤㅤㅤㅤ
```

Führe dann den Code in der Datei aus und überprüfe dein Ergebnis.

**Modul für die Aufgabe:** *Aufgabe1*  
**Datei für die Aufgabe:** *01_Textabgabe.kt*

</details>

---


<details>
<summary><b>Aufgabe 2</b></summary>

Schau dir den nachfolgenden Code an und überlege wie die Ausgabe des Codes aussieht.

```
val operatingSystems:ㅤList<String> =ㅤlistOf("Windows",ㅤ"Linux",ㅤ"MacOS",ㅤ"Android",ㅤ"iOS")
valㅤoperatingSystem:ㅤStringㅤ=ㅤoperatingSystems[operatingSystems.size - 4]
println(operatingSystem)ㅤㅤㅤㅤㅤ   
```

Führe dann den Code in der Datei aus und überprüfe dein Ergebnis.

**Modul für die Aufgabe:** *Aufgabe2*  
**Datei für die Aufgabe:** *02_Textabgabe.kt*

</details>

---

<details>
<summary><b>Aufgabe 3</b></summary>

Schau dir den nachfolgenden Code an und überlege wie die Ausgabe des Codes aussieht.  
Notiere dir in dieser Aufgabe dein erwartetes Ergebnis.

```
valㅤsports:ㅤList<String>ㅤ=ㅤlistOf("Fußball",ㅤ"Handball",ㅤ"Golf",ㅤ"Tennis",ㅤ"Volleyball")ㅤㅤㅤㅤ ㅤㅤㅤ
println(sports[4]) ㅤ ㅤ ㅤ ㅤ ㅤ ㅤ ㅤ
println(sports[5])ㅤ ㅤ ㅤ ㅤ ㅤ ㅤ ㅤ 
println(sports[0])ㅤ ㅤ ㅤㅤㅤ ㅤㅤㅤㅤㅤ
println(sports[1])ㅤㅤㅤㅤ  ㅤㅤㅤ
println(sports[2])ㅤㅤㅤ
println(sports[3])ㅤㅤ
ㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤ
```

Führe dann den Code in der Datei aus und überprüfe dein Ergebnis.

**Modul für die Aufgabe:** *Aufgabe3*  
**Datei für die Aufgabe:** *03_Textabgabe.kt*

</details>


---


<details>
<summary><b>Aufgabe 4</b></summary>

Schau dir den nachfolgenden Code an und überlege wie die Ausgabe des Codes aussieht.

```
valㅤnumbers:ㅤList<Int>ㅤ=ㅤlistOf(1,2,3,4,5)
valㅤnumber1:ㅤInt =ㅤnumbers[numbers.size-2] + 5
valㅤnumber2:ㅤInt =ㅤnumbers[numbers.size-3]
println(number1)ㅤㅤㅤㅤ ㅤㅤㅤ
println(number2)ㅤㅤㅤ ㅤㅤㅤ
```

Führe dann den Code in der Datei aus und überprüfe dein Ergebnis.

**Modul für die Aufgabe:** *Aufgabe4*  
**Datei für die Aufgabe:** *04_Textabgabe.kt*

</details>


---


<details>
<summary><b>Aufgabe 5</b></summary>

Schau dir den nachfolgenden Code an und überlege wie die Ausgabe des Codes aussieht.

```
valㅤmyValues:ㅤList<Int>ㅤ=ㅤlistOf(1,ㅤ5,ㅤ6,ㅤ10,ㅤ15,ㅤ2,ㅤ13)
valㅤresult:ㅤIntㅤ=ㅤmyValues[1]ㅤ+ㅤmyValues[3] +ㅤmyValues[6]
println(result)
```

Führe dann den Code in der Datei aus und überprüfe dein Ergebnis.

**Modul für die Aufgabe:** *Aufgabe5*  
**Datei für die Aufgabe:** *05_Textabgabe.kt*

</details>



---


<details>
<summary><b>Aufgabe 6</b></summary>

Weise in der Datei der Konstante index den richtigen Wert zu, 
sodass in der Liste der String "Kotlin" ausgewählt und in der Konsole ausgegeben wird.

```
valㅤprogrammingLanguages:ㅤList<String>ㅤ=ㅤlistOf("Java",ㅤ"Python",ㅤ"ABAP",ㅤ"JavaScript",ㅤ"Kotlin",ㅤ"Swift",ㅤ"C#")
val index: Int =
val myProgrammingLanguage: String = programmingLanguages[index]
println(myProgrammingLanguage)
```

Führe dann den Code in der Datei aus und überprüfe dein Ergebnis.

**Modul für die Aufgabe:** *Aufgabe6*  
**Datei für die Aufgabe:** *06_Textabgabe.kt*

</details>


---


<details>
<summary><b>Aufgabe 7</b></summary>

Passe den Code so an, dass der Variable sport der Wert "Handball" aus der Liste zugewiesen wird  
und in der Konsole entsprechend "Handball" ausgegeben wird.  
Folgende Einschränkungen müssen dabei beachtet werden:
- Du darfst nicht die Zeile Code verändern, in der die Liste sports definiert wird.

```
varㅤsports:ㅤList<String>ㅤ=ㅤlistOf("Football",ㅤ"Handball",ㅤ"Basketball",) // Diese Zeile darf nicht verändert werden!

// todo: Passe den Code ab hier an.
varㅤsport: Int = sports[sports.size + 1]ㅤㅤㅤㅤㅤㅤ
println(sport)ㅤㅤㅤㅤㅤㅤㅤ   ㅤㅤㅤㅤㅤㅤ
```

**Modul für die Aufgabe:** *Aufgabe7*  
**Datei für die Aufgabe:** *07_Textabgabe.kt*

</details>