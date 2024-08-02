package com.example.springboot.common;

import lombok.Data;

@Data
public class Result {
    //返回错误代码
    private static final String SUCCESS_CODE = "200";
    private static final String ERROR_CODE = "-1";


    private String code;
    private Object data;
    private String msg;

    //无参
    public static Result success(){
        Result result = new Result();
        result.setCode("200");
        return result;
    }
    //有参
    public static Result success(Object data){
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        result.setData(data);
        return result;
    }
    public static Result error(String msg){
        Result result = new Result();
        result.setCode(ERROR_CODE);
        result.setData(msg);
        return result;
    }

}
