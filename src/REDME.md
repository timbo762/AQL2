# Java Code Testing and Fixes

Ce projet regroupe plusieurs exercices Java avec corrections et tests de couverture (ligne, branche, condition).

---

## Exercice 1 – Vérification de Palindrome

### Description :
La méthode `isPalindrome(String s)` vérifie si une chaîne est un palindrome, en ignorant la casse et les espaces.

### Corrections :
- Vérification si la chaîne est `null`.
- Conversion en minuscules + suppression des espaces.
- Parcours de la chaîne avec deux indices `i` et `j` (à corriger : bien avancer `i` et reculer `j`).

---
# Exercice 2 – Vérification d’anagramme (Anagram → Anagrampr)
## Objectif :
Vérifier si deux chaînes de caractères sont des anagrammes : elles contiennent les mêmes lettres en quantité égale, sans prendre en compte la casse ni les espaces.

Dans la version initiale Anagram, la boucle suivante provoque une StringIndexOutOfBoundsException :
```java
for (int i = 0; i <= s1.length(); i++) {
```
### Solution corrigée (Anagrampr) :
```java
for (int i = 0; i < s1.length(); i++) {
```
Ainsi, on parcourt les caractères de 0 à length - 1, ce qui garantit une itération sûre sur la chaîne.

## Exercice 2.b – Vérification de correspondance entre deux chaînes
## Problème rencontré :

### Problème :
```java
for (int i = 0; i <= s1.length(); i++) // Provoque un
```
Correction :

```java
for (int i = 0; i < s1.length(); i++)
```
## Exercice 3 – Recherche binaire (BinarySearchpr)
## Problème :
Mauvaise condition de boucle while (low < high)

Classe non accessible depuis d'autres packages

## Corrections :
Modifier la boucle en while (low <= high)

Déclarer la classe en public

## Exercice 4 – Équation quadratique (QuadraticEquationpr)
## Problème :
Retourne null si pas de solution réelle.

## Correction :
Retourne new double[0] au lieu de null.

## Exercice 5 – Conversion de nombres romains (RomanNumeralpr)
## Problèmes :
Boucle dépasse la taille du tableau

Condition n > values[i] oublie n == values[i]

## Corrections :
```java
- for (int i = 0; i <= symbols.length; i++)
+ for (int i = 0; i < symbols.length; i++)

- while (n > values[i])
+ while (n >= values[i])

```
## Exercice 6 – FizzBuzz (FizzBuzzpr)
### Problème :
Rejet de n = 1 (alors que c’est un entier valide)

## Correction :
```java
- if (n <= 1)
+ if (n < 1)
```
# Tests de couverture
## Les tests utilisent :

LineCoverageTest : Chaque ligne exécutée.

BranchCoverageTest : Tous les cas des structures conditionnelles couverts.

ConditionCoverageTest : Chaque condition booléenne testée vraie et fausse.
