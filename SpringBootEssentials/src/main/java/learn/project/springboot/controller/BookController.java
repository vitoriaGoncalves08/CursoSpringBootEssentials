package learn.project.springboot.controller;

import learn.project.springboot.domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {

    @GetMapping(path = "list")
    public List<Book> list(){
        return List.of(new Book("romance"), new Book("the secret"));
    }
}
