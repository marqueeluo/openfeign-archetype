package ${package};

import com.luo.demo.openfeign.opt.anno.EnableFeignClientsOpt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author luohq
 * @date 2021-09-11
 */
@EnableFeignClientsOpt
@SpringBootApplication
public class StartUpApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartUpApplication.class, args);
    }

}
