package com.hkk.webdemo.controller;

import java.awt.print.Book;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class BookController {


  @GetMapping("/books")
  List<Book> findAll() {
    return null;
  }

  // Save
  @PostMapping("/books")
  @ResponseStatus(HttpStatus.CREATED)
  Book newBook(@Valid @RequestBody Book newBook) {
    return null;
  }

  // Find
  @GetMapping("/books/{id}")
  Book findOne(@PathVariable @Min(1) Long id) {
    return null;
  }

  // Save or update
  @PutMapping("/books/{id}")
  Book saveOrUpdate(@RequestBody Book newBook, @PathVariable Long id) {
    return null;
  }

  @PatchMapping("/books/{id}")
  Book patch(@RequestBody Map<String, String> update, @PathVariable Long id) {

    return null;

  }

  @DeleteMapping("/books/{id}")
  void deleteBook(@PathVariable Long id) {
  }


}
