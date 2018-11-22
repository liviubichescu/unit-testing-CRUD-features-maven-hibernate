package com.test;

import com.test.entities.Book;
//import com.test.entities.Persoana;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//       UserService service = new UserService();
        BookService bookService = new BookService();

        Book book = new Book();

        book.setId(5);
        book.setAutor("Mihai");
        book.setTitlu("Povestiri");
        book.setEditura("Humanitas");

        bookService.add(book);

//        bookService.update(1, "Eminescu");

//        bookService.delete(1);

//       Persoana p = new Persoana();
//       p.setAge(100);
//       p.setCnp("1860429080115");
//       p.setName("Liviu");
//       p.setSurname("Bichescu");
//       service.add(p);
    }
}
