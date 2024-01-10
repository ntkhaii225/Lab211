/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Letter;
import View.Menu;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ntkhai
 */
public class Processing extends Menu {

    Letter l = new Letter();
    Scanner sc = new Scanner(System.in);

    public String input(String str) {
        System.out.println(str);
        String s = sc.nextLine();
        return s;
    }
    
    public String check(String str)
    {
        StringBuilder sb = new StringBuilder();
        for(Character c : str.toCharArray())
        {
            if(Character.isLetterOrDigit(c) || c == ' ')
            {
               sb.append(c);
            }
        }
        
        return sb.toString();
    }
    
    public void cutLetter(String str, Letter l) {
        StringTokenizer token = new StringTokenizer(str);
        while (token.hasMoreTokens()) {
            String letter = token.nextToken().toLowerCase();
            if (l.getMap().containsKey(letter)) {
                l.put(letter, l.get(letter) + 1);
            } else {
                l.put(letter, 1);
            }
        }
    }

    public void cutWord(Letter l) {
        char c;
        HashMap<String, Integer> wordMap = new HashMap<>(l.getMap());
        for (String letter : wordMap.keySet()) {
            for (int i = 0; i < letter.length(); i++) {
                c = letter.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    String word = String.valueOf(c).toLowerCase();
                    if (l.getMap().containsKey(word)) {
                        l.put(word, l.get(word) + 1);
                    } else {
                        l.put(word, 1);
                    }
                }
            }
        }
    }

    @Override
    public void execute() {
        String s = input("Enter your content:");
        String ss = check(s);
        cutLetter(ss, l);
        cutWord(l);
        l.show();
    }
}
