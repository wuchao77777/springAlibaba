package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.entities
 * @ClassName: Payment
 * @Author: 吴超
 * @Description: ${description}
 * @Date: 2020/3/7 22:57
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    /**
     * 支付流水号
     */
    private String serial;
}