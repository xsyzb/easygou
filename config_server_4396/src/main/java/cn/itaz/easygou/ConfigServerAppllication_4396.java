package cn.itaz.easygou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 这是服务端的入口 除了eureka 和 服务端 之外 其他的都是客户端
 */
@SpringBootApplication
@EnableEurekaClient //加入注册中心
@EnableConfigServer //启动配置服务端
public class ConfigServerAppllication_4396 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerAppllication_4396.class,args);
    }
}
