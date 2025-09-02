//Abby Bruskin
// Decodes a message that has been encoded by shifting each letter back by 2 places in the alphabet
//09/02/2025


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Cipher {

    private static List<Character> alphabet = List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

    public static String decode(String word) {
        String result = "";
        word = word.toLowerCase();
        for (char letter: word.toCharArray()) {
            if (!(letter==(' ')))
            {
                int index = alphabet.indexOf(letter);
                if (index == 24)
                {
                    result += alphabet.get(0);
                }
                else if (index == 25)
                {
                    result += alphabet.get(1);
                }
                else { 
                result += alphabet.get(index + 2);
            }
            }
            else
            {
                result += ' ';
            }
        }
        return result;
    }

    public static void main(String[] args) {
    
   String phrase = "fcjjm rfgq gq kw rcqr";//should output hello this is my test
   System.out.print(decode(phrase));

}

}


