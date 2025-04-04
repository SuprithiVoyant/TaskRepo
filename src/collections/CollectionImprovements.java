package collections;

import java.util.*;

public class CollectionImprovements {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Suprith", "Anil", "Ravi");
        System.out.println("forEach example:");
        names.forEach(name -> System.out.println(name));


        List<String> namesToRemove = new ArrayList<>(Arrays.asList("Anil", "Ravi", "Ramesh"));
        namesToRemove.removeIf(name -> name.startsWith("R"));
        System.out.println("\nAfter removeIf (names starting with R): " + namesToRemove);


        List<String> techList = new ArrayList<>(Arrays.asList("java", "spring", "boot"));
        techList.replaceAll(name -> name.toUpperCase());
        System.out.println("\nAfter replaceAll to uppercase: " + techList);


        Map<String, Integer> techMap = new HashMap<>();
        techMap.put("Java", 8);
        techMap.put("Spring", 6);
        System.out.println("\nMap.forEach example:");
        techMap.forEach((key, value) -> System.out.println(key + " -> " + value));


        Map<String, List<String>> listMap = new HashMap<>();
        listMap.computeIfAbsent("fruits", k -> new ArrayList<>()).add("apple");
        System.out.println("\nMap after computeIfAbsent: " + listMap);


        Map<String, Integer> countMap = new HashMap<>();
        countMap.put("count", 1);
        countMap.merge("count", 1, Integer::sum);
        countMap.merge("total", 1, Integer::sum);
        System.out.println("\nMap after merge: " + countMap);


        List<String> sortedNames = new ArrayList<>(Arrays.asList("Suprith", "Anil", "Ravi"));
        sortedNames.sort((a, b) -> b.compareTo(a)); // reverse order
        System.out.println("\nSorted names in reverse order: " + sortedNames);
    }
}
