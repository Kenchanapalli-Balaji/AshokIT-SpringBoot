package com.ashokIT.repo;

import com.ashokIT.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="books")
public interface BookRepo extends JpaRepository<Book,Integer> {
}
