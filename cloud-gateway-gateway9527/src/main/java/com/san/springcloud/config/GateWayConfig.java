package com.san.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by 三七 on 2020/8/18.
 */
@Configuration
public class GateWayConfig {

    /*
     *  配置一个ID为route_name的路由规则
     * @Param builder
     * @return
    */

    @Bean
    public RouteLocator customRouteLocator (RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("path_rote_san",r -> r.path("/guonei").uri("https://news.baidu.com/guonei")).build();
        return  routes.build();
    }

}
