package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        Store another = context.getBean(Store.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
        ui.input("Input");
        another.getAll().forEach(System.out::println);
    }
}

