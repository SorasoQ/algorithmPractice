package com.zjl.hashtable;

/**
 * @author zjl
 */
public class IsAnagram {
    public boolean isAnagram(String s, String t){
        int[] record = new int[26];
        for (char c : s.toCharArray()){
            record[c-'a'] += 1;
        }
        for (char v: t.toCharArray()){
            record[v-'a'] -= 1;
        }
        for (int i : record){
            if (i != 0){
                return false;
            }
        }
        return true;
    }
}
class TestIsAnagram{
    public static void main(String[] args) {
        IsAnagram IA = new IsAnagram();
        String s = "aead";
        String t = "ead";
        if(IA.isAnagram(s,t)){
            System.out.println("This is an Anagram");
        }else {
            System.out.println("This is not an Anagram");
        }
    }
}
