package com.liqi.springboot_websocket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @author Sky
 * create 2019/06/19
 * email sky.li@ixiaoshuidi.com
 **/
@Configuration
public class socketConfig {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {

        return new ServerEndpointExporter();
    }
}
