package learn.project.springboot.controller;

import learn.project.springboot.domain.Book;
import learn.project.springboot.util.DataUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("book")
@RequiredArgsConstructor
@Log4j2
public class BookController {

    private final DataUtil dateUtil;

    @GetMapping(path = "list")
    public List<Book> list(){
        log.info(dateUtil.fomatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Book("romance"), new Book("the secret"));
    }
}
