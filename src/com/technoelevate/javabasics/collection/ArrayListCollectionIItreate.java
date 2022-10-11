package com.technoelevate.javabasics.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListCollectionIItreate {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);

		System.out.println("for iterate ");

		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);

		}

		System.out.println("for loop");
		for (int i = 1; i < arrayList.size(); i++) {
			System.out.println(i);
		}

		System.out.println("adv for loop");
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}

		System.out.println("List forward");
		ListIterator<Integer> listIterator = arrayList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());

		}
		
//		cursor to bring up
		ListIterator<Integer> listIterator1 = arrayList.listIterator(arrayList.size());
		System.out.println("List Back");
		while (listIterator1.hasPrevious()) {
			System.out.println(listIterator1.previous());

		}
	}

}
