package com.adil.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.adil.repository.IArtistRepository;

@Component
public class FinderMethodTestRunner implements CommandLineRunner {
	@Autowired
	private IArtistRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		
		System.out.println(repo.getClass()+"===="+repo.getClass().getSuperclass()+"===="+Arrays.toString(repo.getClass().getDeclaredMethods()));
		
		
		/*repo.findByCategoryEquals("HERO").forEach(System.out::println);
		System.out.println("--------------------------------------------------");
		repo.readByCategoryIs("hero").forEach(System.out::println);
		System.out.println("--------------------------------------------------");
		repo.getByCategoryIs("hero").forEach(System.out::println);*/
		
		/*repo.findByAnameStartingWith("K").forEach(System.out::println);
		System.out.println("--------------------------------------------------");
		repo.findByAnameEndingWith("j").forEach(System.out::println);
		System.out.println("--------------------------------------------------");
		repo.findByAnameContaining("a").forEach(System.out::println);
		System.out.println("--------------------------------------------------");
		repo.findByAnameContainingIgnoreCase("a").forEach(System.out::println);
		System.out.println("--------------------------------------------------");
		repo.findByAnameContaining("v").forEach(System.out::println);*/
		
		//repo.findByAnameLike("r%").forEach(System.out::println);//starting with 
		
		//repo.findByAnameLike("%an").forEach(System.out::println);// ending with
		
		//repo.findByAnameLike("%m%").forEach(System.out::println);// containing
		
		//repo.findByFeeBetween(800000, 7900000).forEach(System.out::println);
		
		//repo.findByCategoryIn(Arrays.asList("hero","villain")).forEach(System.out::println);
		
		//repo.findByCategoryInOrderByAnameAsc(List.of("hero","villain")).forEach(System.out::println);
		
		
		repo.findByCategoryInOrderByAnameDesc(List.of("hero","villain")).forEach(System.out::println);
		
		
		

	}

}
