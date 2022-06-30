package com.imooc.ecommerce.advice;

import com.imooc.ecommerce.vo.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * TODO
 *
 * @author JiangZhou
 * @date 2022/6/30 20:14
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = Exception.class)
    public CommonResponse handlerCommerceException(HttpServletRequest request,
                                                   Exception exception) {

        //定义返回类
        CommonResponse<String> response = new CommonResponse<>(-1,"系统异常!");
        response.setData(exception.getMessage());
        log.error("发送系统异常：[{}]",exception.getMessage(),exception);
        return response;
    }
}
