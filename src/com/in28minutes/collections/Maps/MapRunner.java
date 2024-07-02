/*
 * package com.in28minutes.collections.Maps;
 * 
 * import java.util.HashMap; import java.util.Map;
 * 
 * public class MapRunner {
 * 
 * public static void main(String[] args) {
 * 
 * String str= "This is an awesome occasion. This has never happened before.";
 * 
 * // Map<Character, Integer> occurance = new HashMap<>(); // char[] characters
 * = str.toCharArray(); // for(char character:characters) { // Integer
 * integer=occurance.get(character); // if(integer==null) { //
 * occurance.put(character,1); // }else { // occurance.put(character,integer+1);
 * // } // } // System.out.println(occurance);
 * 
 * 
 * 
 * Map<String, Integer> stroccurance = new HashMap<>(); String[] words =
 * str.split(" "); for(String word:words) { Integer
 * integer=stroccurance.get(word); if(integer==null) { stroccurance.put(word,1);
 * }else { stroccurance.put(word,integer+1); } }
 * System.out.println(stroccurance); } }
 * 
 * //Get the characters //if it is there,we increment the count //if it is not
 * there, initialize to 1
 */