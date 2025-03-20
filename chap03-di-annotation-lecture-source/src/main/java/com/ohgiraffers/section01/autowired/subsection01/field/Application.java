package com.ohgiraffers.section01.autowired.subsection01.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        BookService bookService
                = applicationContext.getBean("bookServiceField", BookService.class);
        System.out.println(bookService.searchBookBySequence(1));
        System.out.println(bookService.selectAllBooks());

        /* IoC 컨테이너 없이 BookService 코드 사용 테스트 */
        BookService bookService2 = new BookService();
        System.out.println(bookService2.selectAllBooks());

    }
}
