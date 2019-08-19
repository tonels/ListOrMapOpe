package 关键字50个.extendsLs;

import lombok.Data;

@Data
public class ResultBean {
    /**
     * 信息代码
     */
    private String code;
    /**
     * 信息说明
     */
    private String msg;
    /**
     * 返回数据或jqgrid中的root
     */
    private Object result;

    protected ResultBean() {

    }

    public ResultBean(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultBean(String code, String msg, Object result) {
        this.code = code;
        this.msg = msg;
        this.result = result;
    }

    public static ResultBean ok() {
        return new ResultBean("200", "success");
    }

    public static ResultBean ok(Object result) {
        return new ResultBean("200", "success", result);
    }


    public static ResultBean error() {
        return new ResultBean("400", "failed with static");
    }

    public ResultBean err() {
        return new ResultBean("400", "failed no static");
    }


}