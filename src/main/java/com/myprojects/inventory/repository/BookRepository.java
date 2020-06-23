package com.myprojects.inventory.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.myprojects.inventory.entity.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	
}
