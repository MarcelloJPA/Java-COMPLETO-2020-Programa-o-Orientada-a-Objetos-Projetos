package aula2021;

import java.util.*;
public class TesteString {
	public static void main(String[] args) {
		String str1 = "S�o Paulo";
		String str2 = "Palmeiras";		
		String str4 = "Santos";
		String str5 = "Vasco";
		String str6 = "Flamengo";
		String str7 = "Botafogo";
		String str8 = "Fluminense";
		String str9 = "Atletico/MG";
		String str3 = "Cruzeiro";
		String str10 = "Corinthians";
		
		ArrayList times = new ArrayList();
		times.add(str1);
		times.add(str2);
		times.add(str3);
		times.add(str4);
		times.add(str5);
		times.add(str6);
		times.add(str7);
		times.add(str8);
		times.add(str9);
		times.add(str10);
		
		times.remove(9);
		
		String time;
		Iterator iTer = times.iterator();
		while (iTer.hasNext()){
			time = (String) iTer.next();
			System.out.println(time);
		}
		
		System.out.println("\nOrdenando.....:");
		System.out.println("S�o Paulo");
		Collections.sort(times);
		Iterator iTer2 = times.iterator();
while (iTer2.hasNext()){
			time = (String) iTer2.next();
			if(!time.equals("S�o Paulo"))
				System.out.println(time);
		}
	}
}
