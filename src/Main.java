import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class Main {

	private static Character character;

	public static void main(String[] args) {

// Ejercicio 1		
		System.out.println("Ejercicio ---> 1 ");
		char[] chars = { 'J', 'u', 'l', 'i', 'o' };
		System.out.println(chars);

		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			System.out.println(c);
		}
// Ejercicio 2
		System.out.println("Ejercicio ---> 2 ");
		List<Character> list = new ArrayList<>();

		list.add('J');
		list.add('u');
		list.add('l');
		list.add('i');
		list.add('o');
		list.add('0');
		list.add('0');
		list.add('7');

		System.out.println("Esta es la lista " + list);

		for (Character character : list) {
			if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
				System.out.println("Es una vocal " + character);
			} else if (character.isDigit(character)) {
				System.out.println("Els noms de persones no  contenen números " + character);
			} else {
				System.out.println("Es una consonate " + character);
			}

		}

// Ejercicio 3
		System.out.println("Ejercicio ---> 3 ");
		Map<Character, Integer> map = new HashMap<>();
		int count = 0;
		int i = 0;

		System.out.println(list);

		for (Character character2 : list) {
			System.out.println("Character ---> " + character2);
			for (Character character3 : list) {
				if (character2 == character3) {
					count++;
					System.out.println("Son iguales");
				} else {
					System.out.println("no son iguales");
				}
				map.put(character2, count);
			}
			count = 0;

		}

		System.out.println(map);
// Ejercicio 4
		System.out.println("Ejercicio ---> 4 ");

		List<Character> list2 = new ArrayList<>();

		list2.add('D');
		list2.add('e');
		list2.add('l');
		list2.add('a');
		list2.add('\u0020');
		list2.add('C');
		list2.add('r');
		list2.add('u');
		list2.add('z');

		System.out.println("Lista ---> 2 ");
		System.out.println(list2);

		list.add('\u0020');
		list.addAll(list2);

		System.out.println("FullName : " + list);

	}

}
