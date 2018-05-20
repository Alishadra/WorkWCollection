package org.itstep.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AppRuner {

	public static void main(String[] args) {

		List<String> compliments = getCompliments();
		Set<String> comparedCompliments = getComparedCompliments(compliments);
		System.out.println(compliments.size());
		System.out.println(comparedCompliments.size());
		
		Map<String, String> shoes = getShoes();
		for(String key : shoes.keySet()) {
			System.out.println(key +  " : " + shoes.get(key));
		}

	}

	private static Map<String, String> getShoes() {
		Map<String, String> shoes = new HashMap<>();
		
		shoes.put("Калинка", "Желтые");
		shoes.put("Злата", "Розовые");
		shoes.put("Надин", "Белый");
		shoes.put("Бершка", "Марсал");
		shoes.put("Балдинини", "Фиолетовый");
		
		return shoes;
	}

	private static Set<String> getComparedCompliments(List<String> compliments) {

		Set<String> complimentsSet = new HashSet<String>();

		for (String compliment : compliments) {
			complimentsSet.add(compliment);
		}

		return complimentsSet;
	}

	private static List<String> getCompliments() {
		List<String> compliments = new ArrayList<String>();

		compliments.add("Умная");
		compliments.add("Умная");
		compliments.add("Красивая");
		compliments.add("Любопытная");
		compliments.add("Любопытная");
		compliments.add("Веселая");
		compliments.add("Тактичная");

		return compliments;
	}

}
