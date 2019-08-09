package com.extend_test;

import lombok.Data;

import java.sql.Date;

@Data
public class SubA extends A{

    private Date date;

//    @Override
//    public String toString() {
//        return "SubA{" +
//                "date=" + date +"a1=" + super.getA1()+"n="+super.getN()+
//                '}';
//    }
}
