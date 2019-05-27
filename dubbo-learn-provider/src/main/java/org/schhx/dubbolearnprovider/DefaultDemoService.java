package org.schhx.dubbolearnprovider;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author shanchao
 * @date 2019-05-27
 */
@Service(version = "1.0.0")
public class DefaultDemoService implements DemoService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        if("hhx".equals(name)) {
            throw new RuntimeException("错误");
        }
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
