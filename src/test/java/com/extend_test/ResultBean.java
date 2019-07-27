package com.extend_test;

import lombok.Data;

@Data
public class ResultBean {

    private String code;

    private String msg;

    private Object result;


    public ResultBean() {
    }

    public ResultBean(String code, String msg, Object result) {
        this.code = code;
        this.msg = msg;
        this.result = result;
    }

    public ResultBean(String code, String msg, Object... result) {
        this.code = code;
        this.msg = msg;
        this.result = result;
    }

    public ResultBean(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ResultBean ok(){
        return new ResultBean("200","成功");
    }

    public static ResultBean ok(Object result){
        return new ResultBean("200","成功",result);
    }

    public static ResultBean ok(Object r1,Object r2,Object r3){
        return new ResultBean("200","成功",r1,r2,r3);
    }

    public static ResultBean error(){
        return new ResultBean("000", "失败");
    }

    public static ResultBean error(String msg){
        return new ResultBean("000", msg);
    }

    public static ResultBean error(String code, String msg){
        return new ResultBean(code, msg);
    }

}
