package com.san.springcloud.service;

import com.san.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Created by 三七 on 2020/7/16.
 */



public interface PaymentService
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
