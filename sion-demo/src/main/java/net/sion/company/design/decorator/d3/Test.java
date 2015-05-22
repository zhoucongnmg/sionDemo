package net.sion.company.design.decorator.d3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test {
	public static void main(String[] args) throws Exception {
		InputStream is = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("D:/1.txt")));
		int c;
		while ((c = is.read()) >= 0) {
			System.out.print((char)c);
		}
		is.close();
	}
}
