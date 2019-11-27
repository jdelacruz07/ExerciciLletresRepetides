package com.example.lletresrepetides;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class LetterTest {

	@Test
	public void testRead() {
		Letter.readChar();
		assertTrue(true);
	}

	@Test
	public void testList() {
		List<Character> list = Letter.fillThefirstList();
		char word =  list.get(7);
		assertEquals('7', word);
	}

	@Test
	public void testaddTwoList() {
		List<Character> list1 = Letter.fillThefirstList();
		List<Character> list2 = Letter.fillTheSecondList();
		int count = list1.size() + list2.size() + 1 ;
		assertEquals(18, count);
	}

}
