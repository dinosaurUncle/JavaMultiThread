package me.dinosauruncle.chapter3.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Ch3BMain {
	public static void main(String[] args) {
		final List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());
		new WriterThread(list).start();
		new ReaderThread(list).start();
	}
}
