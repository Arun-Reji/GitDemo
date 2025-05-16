import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Stream0 {
	
	//@Test

	public void regular() 
	{
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.addAll(Arrays.asList("Aewe", "erwe", "sfsfs", "Asfdf", "dhfsdnf", "Ajnebdbd", "Asdsmn"));
		int count =0;
		for( String ele: arr) {
			System.out.println(ele);
			if(ele.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
		

	}
	
	//@Test
	public void streamFilter() {
		ArrayList<String> arr = new ArrayList<String>();
		arr.addAll(Arrays.asList("ArunReji", "erwe", "sfsfsa", "AlanRejia", "dhfsdnf", "Ajnebdbd", "Asdsmn"));
		Long c = arr.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);
		arr.stream().filter(s -> s.length()>4).limit(1).forEach(s-> System.out.println(s));
		
	}
	
	//@Test
	public void streamMap() {
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.addAll(Arrays.asList("Aewe", "erwe", "sfsfs", "Asfdf", "dhfsdnf", "Ajnebdbd", "Asdsmn"));
		
		Stream.of("Aruna", "AlanReji", "AnakhaRa", "Chinnua", "Reji").filter(s-> s.endsWith("a")).limit(1).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		String [] names = {"Aruna", "AlanReji", "AnakhaRa", "Chinnua", "Reji"};
		List<String> name = Arrays.asList(names);
		name.stream().filter(s-> s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s-> System.out.println(s));
		
		//merging
		Stream<String> newStream = Stream.concat(arr.stream(), name.stream());
		//newStream.map(s-> s.toUpperCase()).forEach(s->System.out.println("New array=" + s));
		
		//match
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("arun"));
		Assert.assertTrue(flag);
		System.out.println(flag);
	}
	
	//@Test
	public void streamCollect() {
		List<String> ls = Stream.of("Aruna", "AlanReji", "AnakhaRa", "Chinnua", "Reji").filter(s-> s.endsWith("a")).sorted().map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(0));
		
	}
	//@Test
	public void streamLearning() {
		// List of sentences
        List<String> sentences = Arrays.asList("Java Stream", "map vs flatMap", "Core Concepts");

        // Using map(): Each sentence becomes a list of words (nested list)
        List<List<String>> mapped = sentences.stream()
        		.map(s -> Arrays.asList(s.split(" ")))
                //.map(sentence -> Arrays.asList(sentence.split(" ")))
                .collect(Collectors.toList());

        System.out.println("Using map():");
        System.out.println(mapped);
        
        List<String> flatMapped = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .toList();

        System.out.println("\nUsing flatMap():");
        System.out.println(flatMapped);  
	}
	
	@Test
	public void Assignment(){
		List<Integer> score = Arrays.asList(1,2,3,4,5,6,7,5,9,9,9,3,45,50,99,11);
		score.stream().distinct().forEach(s-> System.out.println(s));
		List<Integer> li = score.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		
	}
	
	

}
