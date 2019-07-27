package com.extend_test;

import cn.hutool.core.date.DateTime;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {


        SubA s1 = new SubA();
        s1.setN(1);
        s1.setA1("haode");
        s1.setDate(Date.valueOf("2019-10-16"));
        ResultBean ok = ResultBean.ok(s1);
        System.out.println("ok= " + ok);
        System.out.println("====================");
        System.out.println(JSONUtil.parse(ok));

    }


}
