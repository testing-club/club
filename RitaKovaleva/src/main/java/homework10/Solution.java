package homework10;

// Запускаю тест-кесы и получаю вот такую ошибку. не понимаю, а что он ругается. по ходу счетчик выходит за пределы строки?
// но не пойму в каком методе

//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 0
//	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
//	at java.base/java.lang.String.charAt(String.java:709)
//	at homework10.Solution.cutPartOfString(Solution.java:34)
//	at homework10.Solution.solution(Solution.java:48)
//	at homework10.Solution.main(Solution.java:26)


/* TASK
You are given a string consisting of lowercase letters of the English alphabet.
You must split this string into a minimal number of substrings in such a way that no letter occurs more than once in each substring.

For example, here are some correct splits of the string ‘abacdec’: (‘a’, ‘bac’, ‘dec’), (‘a’, ‘bacd’, ‘ec’) and (‘ab’, ‘ac’, ‘dec’).

Write a function:

That, given a string S of length N, returns the minimum number of substrings into which the string has to be split.

Example:

Given ‘world’, your function should return 1. These is no need to split the stringent substrings as all letters occur just once.
Given ‘dddd’, your function should return 4. The result can be achieved by splitting the string into four substrings (‘d’, ‘d’, ‘d’, ‘d’).

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..1 000 000];
String S consists only lowercase letters (a-z).

Test cases:
solution("abba"); // 2
solution("abacbad") // 3
solution("abacdec") // 3
solution("abacdeazxaavnma") //6
solution("bacdec") // 2
solution("aaaaa") // 5
solution("world") // 1

*/


public class Solution {

    public static void main(String[] args) {
        solution("abba");

    }

    public static String cutPartOfString(String searchString) {
        char letter = searchString.charAt(0); // задаем переменную, куда кладем первую букву строки, которую мы будем исследовать
        searchString = searchString.substring(1); // откусываем подстроку от первой буквы, в которой будем проверять наличие предыдущего элемента
        String stash = String.valueOf(letter); // создаем строку, где будут формироваться кусочки с разными буквами по левую сторону
        while ((!stash.contains(String.valueOf(searchString.charAt(0)))) && (!searchString.isEmpty())) {
            // в условии цикла проверяем нет ли в сохраненном левом кусочке первой буквы правой подстроки
            // И проверяем, не пустая ли наша правая подстрока
            // если все ок, заходим в цикл =>
            letter += searchString.charAt(0); //добавляем уникальные символы в левый кусочек
            searchString = searchString.substring(1); // перезаписываем нашу исследовательскую подстроку
        }
        stash = String.valueOf(letter);
        return stash; // на выходе получаем нужный нам кусочек с уникальными буквами
    }

    public static int solution (String S) {
        int partsAmount = 0; // объявляем переменную, которая будет считать, на сколько кусочков можно поделить главную строку
        while (S.length() > 0) {
            String partOfString = cutPartOfString(S); // вызываем наш метод, которые откусывает кусочки строки
            S = S.substring(partOfString.length()); // откусываем найденный с помощью метода выше кусочек
            partsAmount++; // обновляем счетчик
        }
        return partsAmount;
    }
}
