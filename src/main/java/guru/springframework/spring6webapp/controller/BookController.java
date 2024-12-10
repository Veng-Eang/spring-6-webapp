package guru.springframework.spring6webapp.controller;

import guru.springframework.spring6webapp.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public String getAllBook(Model model){
        model.addAttribute("books",bookService.findAll());
        return "books";
    }
}
