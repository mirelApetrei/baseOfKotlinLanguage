
<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Objektorientierte Programmierung</h3>



#### Beschreibung:

- Willkommen bei den Bonusaufgaben! In den folgenden Aufgaben sollst du dich noch etwas mehr mit Methoden von Klassen beschäftigen.

#### Hinweise zur Bearbeitung:

- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Wichtige Materialien für heute:
  - [Handbuch: Objektorientierte Programmierung (OOP)  → Implementieren → Klasse + Eigenschaften + Methoden implementieren, instanziieren und nutzen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.b0ktcwf5liay)


---


<details>
<summary><b>Aufgabe 1 </b></summary>

In dieser Aufgabe sollst du die Klasse `EBike` implementieren.
Die Eigenschaften dieser Klasse sind:
- Aktuelle Position (String)
- Geschwindigkeit (in km/h)
- Reichweite (in km)
- Ladezeit (in Minuten)

Außerdem soll die Klasse eine Methode haben, bei der das E-Bike an eine neue Position bewegt wird.
Diese Methode soll die neue Position und die zurückzulegende Distanz als Parameter bekommen.
Dann soll die Fahrzeit auf der Konsole ausgegeben werden.
Die main-Funktion für diese Aufgabe findest du unter der Klasse.

Optional: Wenn die Distanz zu groß für eine volle Batterie ist, muss das Fahrrad zwischendurch geladen werden. Ändere die Methode so ab, dass dies in Fahrzeit berücksichtigt wird.

**Datei für die Aufgabe:** *EBike.kt* 

</details>

---


<details>
<summary><b>Aufgabe 2</b></summary>

Für diese Aufgabe brauchst du zwei Klassen: `TrafficLight`(Ampel) und `Pedestrian`(Fußgänger).
Die Ampel hat als einzige Eigenschaft die Farbe, die aktuell angezeigt wird.
Implementiere zusätzlich eine Methode, welche die Farbe von rot auf grün und andersherum ändert.
Ein/e Fußgänger/in hat drei Eigenschaften:
- Name
- Kreuzungen bis zum Ziel
- Kreuzungen die bereits überquert wurden

Implementiere eine Methode, bei der ein/e Fußgänger/in eine Ampel übergeben bekommt und dann entweder über die Straße geht oder bei rot stehen bleibt.
Gib auf der Konsole aus, was passiert ist. Wenn die Kreuzung überquert wurde, sollen die Kreuzungen bis zum Ziel um eins verringert werden.
Wenn am Ende der Methode das Ziel erreicht ist, soll es eine entsprechende Ausgabe auf der Konsole geben.

Lege eine Liste von Ampeln an und lasse ein/e Fußgänger/in so lange durch die Liste laufen bis er/sie am Ziel ist.
Nach jedem Aufruf von der oben beschriebenen Methode sollen die Ampelphasen der kompletten Liste geändert werden.

Optional: Ändere die Ampelmethode so, dass sie der Farbe zufällig grün oder rot zuordnet.
Lege mehrere Fußgänger/innen an und lass sie ein kleines Rennen laufen.


**1. Datei für die Aufgabe:** *TrafficLight.kt*

**2. Datei für die Aufgabe:** *Pedestrian.kt*

**3. Datei für die Aufgabe:** *main.kt*

</details>

---


<details>
<summary><b>Aufgabe 3</b></summary>

In dieser Aufgabe sollst du eine Klasse `Human` erstellen. Diese soll als Eigenschaften Name, Alter, Geschlecht und Größe beinhalten und eine Methode um herauszufinden, ob die Person volljährig ist oder nicht.

Außerdem soll es eine Klasse `Teacher` geben, eine Unterklasse von `Human`. Diese soll als Eigenschaft besitzen, in welcher Schule die Lehrperson unterrichtet. Als Methode soll sie "unterrichten" besitzen. "unterrichten" gibt einen Text aus mit dem Ort, wo die Person unterrichtet. 

Implementiere eine Methode, welche alle Eigenschaften einer Person auflistet.

Optional: 1-2 weitere Unterklassen von `Teacher`, zum Beispiel `MathTeacher`oder `PeTeacher`, die zusätzlich ausgeben, welches Fach sie unterrichten.


**Datei für die Aufgabe:** *aufgabe3.kt*

</details>

---