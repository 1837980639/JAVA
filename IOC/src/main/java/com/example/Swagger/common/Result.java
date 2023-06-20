package com.example.Swagger.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    private Integer code;
    private String msg;
    private Object data;


    public  Result success(){
        return new Result(200,"成功",null);
    }
    public  Result success(String msg,Object data){
        return new Result(200,msg,data);
    }
    public  Result result(Integer code,String msg,Object data){
        return new Result(code,msg,data);
    }
    public  Result error(Integer code,String msg){
        return new Result(code,msg,null);
    }
}
