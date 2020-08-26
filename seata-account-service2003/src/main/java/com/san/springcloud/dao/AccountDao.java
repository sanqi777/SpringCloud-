package com.san.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * Created by 三七 on 2020/8/26.
 */
@Mapper
public interface AccountDao {


     //扣减账户余额
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
