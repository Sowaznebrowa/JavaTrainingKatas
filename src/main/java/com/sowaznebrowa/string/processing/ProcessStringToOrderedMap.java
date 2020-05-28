package com.sowaznebrowa.string.processing;

import java.util.*;

public class ProcessStringToOrderedMap {

		/*Given String of words split by “;” -
				Group them by first letter alphabetically. This should be case insensitive
		For example for “oword;aword;bword;cword;anotherword;Osomeword”
		Should group it like this:
		a -> aword, anotherword
		b -> bword
		c -> cword
		o -> oword, Osomeword

		Map<String, String[]> getResultMap(String data){

		}*/

    public static void displayExample(){
        Map<Character, List<String>> map = getResult("zword;aword;bword;dword;anotherword;Osomeword;;");
        System.out.println(map);
    }
    static Map<Character, List<String>> getResult(String data) {
        String[] words = data.split(";");
        Map<Character, List<String>> map = new TreeMap<>();

        Arrays.stream(words)
                .forEach(s -> {
                    Character key = s.toLowerCase().charAt(0);
                    List<String> list;
                    if (map.containsKey(key)) {
                        list = map.get(key);
                    } else {
                        list = new ArrayList<>();
                    }
                    list.add(s);
                    map.put(key, list);
                });

        return map;
    }
}
