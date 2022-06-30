package com.imooc.ecommerce.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 通用响应对象定义
 *
 * @author JiangZhou
 * @date 2022/6/30 19:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> implements Serializable {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 响应消息
     */
    private String msg;

    /**
     * 数据
     */
    private T data;

    public CommonResponse(Integer code, String msg) {
        this.code=code;
        this.msg=msg;
    }
}
