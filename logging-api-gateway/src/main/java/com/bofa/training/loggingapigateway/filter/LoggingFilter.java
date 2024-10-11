package com.bofa.training.loggingapigateway.filter;

import java.util.Date;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Mono;

@Component
public class LoggingFilter {

    @Bean
    public GlobalFilter addLog() {
        return (exchange,chain)->{
            String uri=exchange.getRequest().getURI().toString();
            System.out.println("pre-filter before forwading to "+uri+" "+new Date());
            return chain.filter(exchange).then(Mono.fromRunnable(()->{
            	
                System.out.println("post-filter after invoking "+uri+" "+new Date());
            }));
        };
    }
}


