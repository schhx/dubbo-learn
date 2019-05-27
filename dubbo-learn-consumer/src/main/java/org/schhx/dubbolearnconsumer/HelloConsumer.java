package org.schhx.dubbolearnconsumer;

import org.apache.dubbo.config.annotation.Reference;
import org.schhx.dubbolearnprovider.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shanchao
 * @date 2019-05-27
 */
@RestController
public class HelloConsumer {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @GetMapping("/sayHello")
    public String sayHello(String name) {
        try {
            return demoService.sayHello(name);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

}
