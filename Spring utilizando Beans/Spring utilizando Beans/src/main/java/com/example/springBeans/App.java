
package com.example.springBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Livro livro = factory.getBean(Livro.class);
        livro.setNome("Hary");
        livro.setCodigo("1A2B3C");
        livro.exibir();
        
        Autor autor = factory.getBean(Autor.class);
        autor.setNome("J.K. Rowling");
        
        ((AbstractApplicationContext) factory).close();
    }
}
