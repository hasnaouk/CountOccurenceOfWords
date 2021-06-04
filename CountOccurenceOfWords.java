package Khalid_Summer_2021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountOccurenceOfWords {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your text: ");
		
		String text = input.nextLine();
		
		Map<String, Integer> tMap = new TreeMap<>();
		
		//File fileText = new File(text);
		
		//System.out.println(fileText);
		
		//Scanner scan = new Scanner(fileText);
		Scanner scan = new Scanner(text);
		int count=1;
		while (scan.hasNext()) {
			String word = scan.next();
			if(!tMap.containsKey(word)) 
				tMap.put(word, count);
			else
				tMap.put(word, tMap.get(word)+1);			
		}
		
		System.out.println(tMap);
		
	}

}
/*	public static int countSpecialWords(File file) throws Exception {
String[] specialWordsList = {"love", "darling"};
Set<String> specialWordsSet = new HashSet<>(Arrays.asList(specialWordsList));
int count = 0;
Scanner input = new Scanner(file);
while(input.hasNext()) {
	String word = input.next();
	if(specialWordsSet.contains(word))
		count++;
}
return count;

}*/