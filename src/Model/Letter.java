/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.HashMap;

/**
 *
 * @author ntkhai
 */
public class Letter {
    private String character;
    private String word;
    private HashMap<String, Integer> map = new HashMap<>();
    public Letter() {
    }
    
    public HashMap<String, Integer> getMap() {
        return map;
    }

    public int get(String key)
    {
        if(map.containsKey(key))
            return map.get(key);
        else 
            return -1;
    }
    
    public void put(String key, Integer value)
    {
        map.put(key, value);
    }
    
    public void show()
    {
        for(String s : map.keySet())
        {
            Integer value = map.get(s);
            if(s.length() > 1)
                System.out.println(s + "=" + value);
            
        }
        for(String s : map.keySet())
        {
            Integer value = map.get(s);
            if(s.length() == 1)
                System.out.println(s + "=" + value);
        }
    }
    
    public void setMap(HashMap<String, Integer> map) {
        this.map = map;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
    
    
}
