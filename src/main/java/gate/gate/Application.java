package gate.gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.factory.StripPrefixGatewayFilterFactory;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        StripPrefixGatewayFilterFactory.Config config = new StripPrefixGatewayFilterFactory.Config();
//        config.setParts(1);
//        return builder.routes()
//                .route("host_route", r -> r.path("/a/**").filters(f -> f.stripPrefix(1)).uri("http://localhost:8080"))
//                .route("host_route", r -> r.path("/b/**").filters(f -> f.stripPrefix(1)).uri("www.sohu.com"))
//                .build();
//    }
    
    
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/star")
                .uri("http://localhost:8080"))
                .route(r -> r.path("/sohu")
                .uri("http://www.sohu.com/"))
                .build();
    }

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//    	return builder.routes()
//    			.route("hello", r -> r
//    					.path("/user/**")
//    					.and()
//    					.uri("http://localhost:8080")
//    					).build();
//    }


}