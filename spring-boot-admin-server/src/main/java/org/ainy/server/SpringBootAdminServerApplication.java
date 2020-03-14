package org.ainy.server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yuandong
 * @description 启动类
 * @date 2019-07-26 08:34
 */
@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootAdminServerApplication.class, args);
    }
}
