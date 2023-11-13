# System aukcyjny

## Wprowadzenie

Specyfikacja wymagań funkcjonalnych w ramach informatyzacji procesu sprzedaży produktów w oparciu o mechanizm aukcyjny. 

## Procesy biznesowe

---
<a id="bc1"></a>
### BC1: Sprzedaż aukcyjna 

**Aktorzy:** [Sprzedający](#ac1), [Kupujący](#ac2)

**Opis:** Proces biznesowy opisujący sprzedaż za pomocą mechanizmu aukcyjnego. |

**Scenariusz główny:**
1. [Sprzedający](#ac1) wystawia produkt na aukcję. ([UC1](#uc1))
2. [Kupujący](#ac2) oferuje kwotę za produkt wyższą od aktualnie najwyższej oferty. ([BR1](#br1), [UC2](#uc2))
3. [Kupujący](#ac2) wygrywa aukcję. ([BR2](#br2), ([UC3](#uc3)))
4. [Kupujący](#ac2) przekazuje należność Sprzedającemu. ([UC3](#uc3))
5. [Sprzedający](#ac1) przekazuje produkt Kupującemu. ([UC3](#uc3))

**Scenariusze alternatywne:** 


2.A. Oferta Kupującego została przebita, a [Kupujący](#ac2) pragnie przebić aktualnie najwyższą ofertę.
* 2.A.1. Przejdź do kroku 2.

3.A. Czas aukcji upłynął i [Kupujący](#ac2) przegrał aukcję. ([BR2](#br2))
* 3.A.1. Koniec przypadku użycia.

---

## Aktorzy

<a id="ac1"></a>
### AC1: Sprzedający

Osoba oferująca towar na aukcji.

<a id="ac2"></a>
### AC2: Kupujący

Osoba chcąca zakupić produkt na aukcji.


## Przypadki użycia poziomu użytkownika

### Aktorzy i ich cele

[Sprzedający](#ac1):
* [UC1](#uc1): Wystawienie produktu na aukcję
* [UC1](#uc1): Wprowadzenie informacji o produkcie i jego cenę wywoławczą
* [UC3](#uc3): Przekazanie przedmiotu Kupującemu
* [UC4](#uc4): Anulowanie aukcji
* [UC5](#uc5): Przegląd historii aukcji
* [UC7](#uc7): Zarządzanie kontem

[Kupujący](#ac2)
* [UC2](#uc2): Udział w licytacji
* [UC3](#uc3): Wygranie/Przegranie licytacji
* [UC3](#uc3): Dokonanie płatności Sprzedającemu
* [UC5](#uc5): Przegląd historii aukcji
* [UC6](#uc6): Reklamacja zakupionego produktu
* [UC7](#uc7): Zarządzanie kontem


---
<a id="uc1"></a>
### UC1: Wystawienie produktu na aukcję

**Aktorzy:** [Sprzedający](#ac1)

**Scenariusz główny:**
1. [Sprzedający](#ac1) zgłasza do systemu chęć wystawienia produktu na aukcję.
2. System prosi o podanie danych produktu i ceny wywoławczej.
3. [Sprzedający](#ac1) podaje dane produktu oraz cenę wywoławczą.
4. System weryfikuje poprawność danych.
5. System informuje o pomyślnym wystawieniu produktu na aukcję.

**Scenariusze alternatywne:** 

4.A. Podano niepoprawne lub niekompletne dane produktu.
* 4.A.1. System informuje o błędnie podanych danych.
* 4.A.2. Przejdź do kroku 2.

---

<a id="uc2"></a>
### UC2: Udział Kupującego w licytacji

**Aktorzy:** [Kupujący](#ac2)

**Scenariusz główny:**
1. [Kupujący](#ac2) wyraża chęć wzięcia udziału w licytacji.
2. System prosi o podanie danych Kupującego i kwoty.
3. [Kupujący](#ac2) dostarcaza swoje dane i proponowaną kwotę.
4. System sprawdza poprawność dostarczonyvh danych. [BR1](#br1)
5. System informuje o udanym uczestnictwie w licytacji.

**Scenariusze alternatywne:** 

4.A. Wprowadzono nieprawidłowe dane lub kwota nie spełnia wymagań.
* 4.A.1. System informuje o błędzie w danych.
* 4.A.2. Przejdż do kroku 2.

---

<a id="uc3"></a>
### UC3: Zakończenie licytacji

**Aktorzy:** [Sprzedający](#ac1), [Kupujący](#ac2)

**Scenariusz główny:**
1. Po zakończeniu czasu trwania licytacji system ogłasza zwycięzcę. [BR2](#br2)
2. System informuje Kupującego, który wygrał licytację o konieczności uregulowania należności wobec Sprzedającego.
3. [Kupujący](#ac2) przekazuje należność Sprzedającemu według własnego wyboru.
4. System informuje Sprzedającego o otrzymaniu należności od Kupującego.
5. [Sprzedający](#ac1) według własnego wyboru przekazuje produkt Kupującemu.
6. System informuje Sprzedającego o zakończeniu aukcji i usuwa wszelkie poufne dane.

**Scenariusze alternatywne:** 

1.A. Wprowadzono nieprawidłowe dane lub kwota nie spełnia wymagań.
* 1.A.1. System informuje Sprzedającego o braku wyłonienia zwycięzcy aukcji.
* 1.A.2. Zakończenie przypadku użycia.

---

## Obiewkty biznesowe (inaczje obiekty dziedzinowe lub informatycjne)

### BO1: Aukcja

Aukcja jest formą zawierania transakcji kupna-sprzedaży, w której Sprzedający określa cenę wywoławczą produktu, natomiast Kupujący mogą oferować własną ofertę zakupu każdorazowo proponując kwotę wyższą od aktualnie oferowanej kwoty. Aukcja kończy się po upływie określonego czasu. Jeśli złożona została co najmniej jedna oferta zakupy produkt nabywa ten Kupujący, który zaproponował najwyższą kwotę. 

### BO2: Produkt

Fizyczny lub cyfrowy obiekt, który ma zostać sprzedany w ramach aukcji.

## Reguły biznesowe

<a id="br1"></a>
### BR1: Złożenie oferty

Złożenie oferty wymaga zaproponowania kwoty wyższej niż aktualnie oferowana o minimum 1,00 PLN.


<a id="br2"></a>
### BR2: Rozstrzygnięcie aukcji

Aukcję wygrywa ten z [Kupujący](#ac2)ch, który w momencie jej zakończenia (upłynięcia czasu) złożył najwyższą ofertę.

## Macierz CRUDL


| Przypadek użycia                                  | Aukcja | Produkt | ... |
| ------------------------------------------------- | ------ | ------- | --- |
| UC1: Wystawienia produktu na aukcję               |    C   |    C    | ... |
| UC2: Udział Kupującego w licytacji                |   RU   |   ---   | ... |
| UC3: Zakończenie licytacji                        |    D   |   RUD   | ... |

