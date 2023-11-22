package com.example.LibraryManagementSystem.Repos;

import com.example.LibraryManagementSystem.modules.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book,Long> {
}
