package com.san.springcloud.service;

import com.san.springcloud.entities.CommonResult;
import com.san.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * Created by 三七 on 2020/8/25.
 */
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
