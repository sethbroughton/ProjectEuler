package com.projecteuler;

import java.util.HashMap;
import java.util.Map;

public class NumberLetterCounts {
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	public int sum() {
		map.put(1, 3); // one, eleven,
		map.put(2, 3); // two, twelve, twenty, two hundred and
		map.put(3, 5); // three, thirteen, thirty, three hurndre
		map.put(4, 4); // four, fourteen, fourty, four hundred
		map.put(5, 4); // five, fifteen, fifty, five hundred
		map.put(6, 3); // six, sixteen, sixty, six hundred
		map.put(7, 5); // seven, seventeen, seventy, seven hundred
		map.put(8, 5); // eight, eighteen, eighty, eight hundred
		map.put(9, 4); // nine, nineteen, ninety, nine hundred
		map.put(10, 3); // ten, twenty
		map.put(11, 6);
		map.put(12, 6);
		map.put(13, 8);
		map.put(15, 7);
		map.put(20, 6); // if num%10 == 0 then
		map.put(30, 6);
		map.put(50, 5);

		int counter = 0;

		for (int i = 1; i < 1000; i++) {

			int first = i % 10; // 121 = 1
			if (first > 0) {
				counter += map.get(first);
			}
			int second = (i - first) % 100; // 121 = 141-1 = 120%100 = 20; fourty
			if (map.containsKey(second)) {
				counter += map.get(second);
			} else if (second > 0) {
				int digit = second % 10;
				counter = counter + map.get(digit) + 2;
			}
			int third = (i - first - second);

			if (map.containsKey(third)) {
				counter += map.get(third);
			} else if (third > 0) { // hundred and =
				counter = counter + map.get(third % 100) + 7;
				if (second != 0 && first != 0) {
					counter += 3; // and = 3;
				}
			}

		}

		return counter;
		// 999 %10 Nine hundred ninety nine
		// 999 / 10 = 99
	}
}