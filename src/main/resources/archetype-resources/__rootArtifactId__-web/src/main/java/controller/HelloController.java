package ${package}.controller;

import ${package}.api.HelloApi;
import ${package}.model.CommonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello controller
 *
 * @author luohq
 * @date 2021-09-11 20:53
 */
@Controller
public class HelloController implements HelloApi {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    @ResponseBody
    @Override
    public CommonResult hello() {
        log.info("${greeting-msg}");
        return CommonResult.success("${greeting-msg}");
    }

}
