package com.adil.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adil.entity.Artist;

public interface IArtistRepository extends JpaRepository<Artist, Integer>{
	// implementation of finder method not needs because spring data jpa will provide implementation at runtime
	public List<Artist> findByCategoryEquals(String category);
	
	public List<Artist> readByCategoryIs(String category);
	
	public List<Artist> getByCategoryIs(String category);
	
	public List<Artist> findByAnameStartingWith(String initChar);
	
	public List<Artist> findByAnameEndingWith(String lastChar);
	
	public List<Artist> findByAnameContaining(String chars);
	
	public List<Artist> findByAnameContainingIgnoreCase(String chars);
	
	public Iterable<Artist> findByAnameLike(String chars);
	
	public Iterable<Artist> findByFeeBetween(double start, double end);
	
	public Iterable<Artist> findByCategoryInOrderByAnameAsc(List<String> categories);
	
	public Iterable<Artist> findByCategoryInOrderByAnameDesc(List<String> categories);

}
	