package com.example.lletresrepetides;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Letter {

	public static void readChar() {
		char[] chars = { 'J', 'u', 'l', 'i', 'o' };

		for (char d : chars) {
			System.out.print(d + " ");
		}
		System.out.println("");

	}

	public static void readList() {
		List<Character> list = fillTheList();

		for (Character character : list) {
			if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || 
				character == 'u') {
				System.out.println("Es una vocal " + character);
			} else if (character.isDigit(character)) {
				System.out.println("Els noms de persones no  contenen números " + character);
			} else {
				System.out.println("Es una consonate " + character);
			}
		}

	}

	private static List<Character> fillTheList() {
		List<Character> list = new ArrayList<>();

		list.add('J');
		list.add('u');
		list.add('l');
		list.add('i');
		list.add('o');
		list.add('0');
		list.add('0');
		list.add('7');
		return list;
		
	}

	public static void saveintoMap() {
		List<Character> list = fillTheList();
		Map<Character, Integer> map = new HashMap<>();
		int count = 0;

		System.out.println(list);

		for (Character character : list) {
			for (Character character2 : list) {
				if (character == character2) {
					count++;
				} 
			}
			map.put(character, count);
			count =0;
		}
		System.out.println(map);
		
	}

	public static void fusionList() {
		List<Character> list = fillTheList();
		List<Character> list2 = fillTheSecondList();

		System.out.println(list);
		System.out.println(list2);

		list.add('\u0020');
		list.addAll(list2);

		System.out.println("FullName : " + list);
	}

	private static List<Character> fillTheSecondList() {
		List<Character> list = new ArrayList<>();
		list.add('D');
		list.add('e');
		list.add('l');
		list.add('a');
		list.add('\u0020');
		list.add('C');
		list.add('r');
		list.add('u');
		list.add('z');
		
		return list;
	}

}
