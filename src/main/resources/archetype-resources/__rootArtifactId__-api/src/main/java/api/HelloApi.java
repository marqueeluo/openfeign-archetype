package ${package}.api;

import  ${package}.model.CommonResult;
import org.springframework.web.bind.annotation.*;

/**
 * API - 示例接口定义
 *
 * @author luohq
 * @date 2021-09-14
 */
public interface HelloApi {

    @GetMapping("/hello")
    @ResponseBody
    CommonResult hello();

}
