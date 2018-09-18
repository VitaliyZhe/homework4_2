package homework4_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFileFilter filter = new MyFileFilter("txt");
		LinkedHashSet<String> hashSet = new LinkedHashSet<>();
		File folder = new File("C:\\Users\\vitaliy\\Desktop\\input");
		File[] fList = folder.listFiles(filter);
		String str = "";
		String tx1 = null;
		String tx2 = null;
	
		try (BufferedReader bF = new BufferedReader(new FileReader(fList[0]))) {
			for (; (str = bF.readLine()) != null;)
				tx1 = str;
			System.out.println(tx1);
			for (String s : tx1.split(" ")) {
				hashSet.add(s);
			}

		} catch (IOException e) {
			System.out.println("ERROR");
		} // read file
		try (BufferedReader bF = new BufferedReader(new FileReader(fList[1]))) {
			for (; (str = bF.readLine()) != null;)
				tx2 = str;
			System.out.println(tx2);
			for (String s : tx2.split(" ")) {
				hashSet.add(s);
			}
		} catch (IOException e) {
		}
		System.out.println(hashSet);
		// Write file
		try (BufferedWriter f = new BufferedWriter(new FileWriter("all.txt"))) {
			for (String s : hashSet) {
				f.write(s + " ");
			}
		} catch (IOException e) {
			System.out.println();
		}

	}

}