package src.application.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public ResponseEntity<String> createBook() {


        return ResponseEntity.ok("Book created successfully");

    }


}
