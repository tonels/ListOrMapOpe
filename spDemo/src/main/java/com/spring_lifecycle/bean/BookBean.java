package com.spring_lifecycle.bean;

public class BookBean {

    private String bookName;

    public BookBean() {
        System.out.println("BookBean 构造器方法被调用");
    }

    public BookBean(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "BookBean{" +
                "bookName='" + bookName + '\'' +
                '}';
    }
}
