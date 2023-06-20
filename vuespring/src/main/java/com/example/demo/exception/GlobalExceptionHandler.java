package com.example.demo.exception;


import com.example.demo.po.Result;
import com.example.demo.po.ResultCode;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result handlerExceprion(){
        return Result.error(ResultCode.SYSTEM_ERROR);
    }
    @ExceptionHandler(MyException.class)
    public  Result myExceptionHandler(MyException myException){

        return Result.error().code(myException.getCode()).msg(myException.getMsg()).data(myException.getData());
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public  Result  methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e){
        Map<String, Object> map=new HashMap<>();
        List<String> list=new ArrayList<>();
        if (!e.getBindingResult().getAllErrors().isEmpty()){
            for(ObjectError error:e.getBindingResult().getAllErrors()){
                list.add(error.getDefaultMessage().toString());
            }
        }
        map.put("validated_error",list);
        return Result.error(ResultCode.VALIDATED_ERROR,map);

    }
    @ExceptionHandler(BindException.class)
    public  Result validExceptionHandler(BindException exception){
        Map<String, Object> map=new HashMap<>();
        List<String> list=new ArrayList<>();
        if (!exception.getBindingResult().getAllErrors().isEmpty()){
            for(ObjectError error:exception.getBindingResult().getAllErrors()){
                list.add(error.getDefaultMessage().toString());
            }
        }
        map.put("validated_error",list);
        return Result.error(ResultCode.VALIDATED_ERROR,map);
    }
}
