package com.hanke.adminappbackend.repository;

import com.hanke.adminappbackend.pojo.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ProductRepository extends CrudRepository<Product, Integer>, PagingAndSortingRepository<Product,Integer> {

    Iterable<Product> findByTitle(String title);

    Page<Product> findPageByTitleLike(String title, Pageable pageable);

    @Query("select p from Product p where p.title = ?1")
    List<Product> findByTitleContaining(String title);

}