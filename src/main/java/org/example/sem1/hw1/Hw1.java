package org.example.sem1.hw1;
// Given an input string s, reverse the order of the words.
// Учитывая входную строку s, измените порядок слов на противоположный.

public class Hw1 {
    static void reverse(char[] str, int start, int end)
    {
        char temp;
        while (start <= end) {
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
    static char[] reverseWords(char[] s)
    {
        int word_begin = -1;
        int i = 0;
        while (i < s.length) {
            if ((word_begin == -1) && (s[i] != ' ')) {
                word_begin = i;
            }
            if (word_begin != -1
                    && ((i + 1 == s.length)
                    || (s[i + 1] == ' '))) {
                reverse(s, word_begin, i);
                word_begin = -1;
            }
            i++;
        }
        reverse(s, 0, (s.length - 1));
        return s;
    }
    public static void main(String[] args)
    {
        String s = "Return a string of the words in reverse order concatenated by a single space";
        char[] p = reverseWords(s.toCharArray());
        System.out.println(p);
    }
}
