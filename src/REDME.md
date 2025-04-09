# TP1 - Couverture des Tests Unitaires

## Exercice 1 - Palindrome

###  Bug identifié

Dans la version initiale de la méthode `isPalindrome(String s)`, on trouve une erreur logique dans la boucle :

```java
j++;
i--;

la correction :

i++;
j--;



