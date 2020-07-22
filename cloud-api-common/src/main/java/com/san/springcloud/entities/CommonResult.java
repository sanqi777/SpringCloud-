package com.san.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by 三七 on 2020/7/16.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CommonResult<T> {
    private Integer code;
    private String message;
    private T     data;

    public CommonResult( Integer code ,String message){
        this (code,message,null);
    }
}
