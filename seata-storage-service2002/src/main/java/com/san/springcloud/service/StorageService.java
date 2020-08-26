package com.san.springcloud.service;

/**
 * Created by 三七 on 2020/8/26.
 */
public interface StorageService {

    //扣减库存
    void decrease(Long productId, Integer count);
}
