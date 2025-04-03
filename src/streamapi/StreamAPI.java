package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

/*Its an interface introduced in java 8, to process the objects in a collection we go with stream.

	 * map()
	 * filter()
	 * min()
	 * max()
	 * sum()
	 * count()
	 * collect()
	 * sorted()
	 * sorted(comparator)
	 * */


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5,4,10,20,13);


        System.out.println("-----------Map() and filter()--------");
        //filter: returns a predicate value i.e., true or false (Intermediate op)
        List<Integer> filteredList = list.stream().filter(i->i%2==0).toList();
        System.out.println("Filter : "+filteredList);


        //Map: returns the same list, used to transform the elements (Intermediate op)
        List<Integer> mapped = list.stream().map(i->i*2).toList();
        System.out.println("Map :"+mapped);


        //Select all the passed students
        List<Integer> marks = Arrays.asList(30,45,67,54,32,10);
        List<Integer> passed = marks.stream().filter(i->(i>35)).toList();
        System.out.println("Passed students with more than 35 : "+passed);


        //adding 5 marks to all the failed students
        List<Integer> passing = marks.stream().filter(i->i<35).map(i->i+5).toList();
        System.out.println("Passing students : "+passing);


        //getting the total number of failed students
        long failed = marks.stream().filter(i->i<35).count();
        System.out.println("Count : Number of failed count :"+failed);
        System.out.println();


        //======================================================
        System.out.println("------- Sorted()--------");
        //Sorted() :
        //1.natural sorting order
        //2.Custom sorting order

        List<Integer> beingSorted = Arrays.asList(3,1,6,4,2,7,8,5,3);
        List<Integer> sorting = beingSorted.stream().sorted().toList();
        System.out.println("Natural Sorting : Sorting natural order :"+sorting);

        List<Character> chSort = Arrays.asList('v','b','k','a','z');
        List<Character> sorted = chSort.stream().sorted().toList();
        System.out.println("Natural Sorting : Sorting characters : "+sorted);


		/*if we ever want customized sorting, we shd be going for comparator(functional interface)
			Method : compare(obj1, obj2):
				return -ve: if obj1 has come before obj2
				return +ve: if onj1 has come after obj2
				return 0: if obj1 n obj2 are equal*/

        System.out.println();
        System.out.println("--------Collectors------");
        List<Integer> numbersss = Arrays.asList(1, 2, 3, 4);
        Set<Integer> numberSet = numbersss.stream().collect(Collectors.toSet());
        System.out.println("Collectors : "+numberSet);



        List<Integer> decending = beingSorted.stream().sorted((a,b)->((a<b)?1 : (a>b)?-1 : 0)).toList();
        System.out.println("Custom sorting : "+decending);

        List<Integer> decendingg = beingSorted.stream().sorted((Comparator.reverseOrder())).toList();
        System.out.println("Custom sorting : reverdeOrder() :"+decendingg);

        //comparing to b
        List<Integer> decendinggg = beingSorted.stream().sorted((a,b)->a.compareTo(b)).toList();
        System.out.println("Custom sorting : compareTo() :"+decendinggg);

        //adding - to the whole comparingTo() getting the reverse order.
        List<Integer> decendingggg = beingSorted.stream().sorted((a,b)-> -a.compareTo(b)).toList();
        System.out.println("Custom sorting : compareTo() reverse :"+decendingggg);

        List<Character> ch = chSort.stream().sorted((a,b)->((a<b)?1 :(a>b)?-1 : 0)).toList();
        System.out.println("Custom sorting : characters : "+ch);


        List<String> str = Arrays.asList("aa","aaa","nnnnn","cccc","b");


        List<String> sortedString = str.stream().sorted((a,b)->(Integer.compare(a.length(), b.length()))).toList();
        System.out.println("Lexical order of strings : "+sortedString);


        //=====================================================
        System.out.println();
        System.out.println("----------min() and max()------");

        //both method takes comparator as an argument and returns the value based on the comparator result.
        //min(comparator) - returns the first element from the comparator result;
        //max(comparator) - returns the last element form the comparator result;

        List<String> names = Arrays.asList("A","Ram","Sham","Renu", "Srinidhi");
        Comparator<String> c = (a, b)->{
            int l1 = a.length();
            int l2 = b.length();
            if(l1>l2) return 1;
            else if(l1<l2) return -1;
            else return 0;
        };
        String minVal = names.stream().min(c).get();
        System.out.println("min() : "+minVal);

        String maxVal = names.stream().max(c).get();
        System.out.println("max() : "+maxVal);

        String minValC = names.stream().min((a,b)->(Integer.compare(a.length(), b.length()))).get();
        System.out.println("Min value using a single line :"+minValC);

        String maxValC = names.stream().max((a,b)->(Integer.compare(a.length(), b.length()))).get();
        System.out.println("Max value using a single line :"+maxValC);


        List<Integer> numbers = Arrays.asList(10,20,12,30,43);

        Integer numbs = numbers.stream().max((a,b)->(Integer.compare(a, b))).get();
        System.out.println("Max in integers :"+numbs);

        Integer numbsMin = numbers.stream().min((a,b)->(Integer.compare(a, b))).get();
        System.out.println("Min in integers :"+numbsMin);
    }

}
