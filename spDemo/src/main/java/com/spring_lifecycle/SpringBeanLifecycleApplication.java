package com.spring_lifecycle;

import com.spring_lifecycle.bean.Book;
import com.spring_lifecycle.bean.BookBean;
import com.spring_lifecycle.bean.BookCustomBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class SpringBeanLifecycleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBeanLifecycleApplication.class, args);
        // -------awareinterfaces---------
        ApplicationContext context1 = new ClassPathXmlApplicationContext("classpath:xmlConfig/beans.xml");

//        AwareBeanImpl awareBeanImpl = (AwareBeanImpl) context1.getBean("awareBean");

        // -------beanpostprocessor------
//        BookBean bookBean = (BookBean) context1.getBean("bookBeanPost");
//        System.out.println("bookBean 书名为：" + bookBean.getBookName());

//        Book book = (Book) context1.getBean("bookBean");
//        System.out.println(book.getBookName());

        BookCustomBean bookCustomBean = (BookCustomBean) context1.getBean("customLifeCycleBookBean");

        ((AbstractApplicationContext) context1).registerShutdownHook();




    }

}
