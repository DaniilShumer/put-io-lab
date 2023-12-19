# Pytanie 2.1
Odpowiedź: możemy użyć biblioteki Mockito do stworzenia obiektu zastępczego dla naszej bazy danych i weryfikacji poprawności interakcji. Po wywołaniu metody 'loadExpenses' na repozytorium, weryfikujemy, czy metody 'connect', 'queryAll' i 'close' zostały wywołane w odpowiedniej kolejności, za pomocą 'InOrder' z Mockito

# Pytanie 5.1
Odpowiedź: Tak, kolejność oczekiwań ma znaczenie. Zamiana kolejności oczekiwań może skutkować innym zachowaniem testu. Dlatego ważne jest, aby zachować odpowiednią kolejność oczekiwań w Mockito, aby uniknąć błędów w testach i zapewnić oczekiwane rezultaty.




