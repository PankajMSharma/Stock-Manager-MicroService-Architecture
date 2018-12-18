/**
 * 
 */
package geek.pankaj.stock.stockservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Pankaj Sharma
 *
 */
@Configuration
public class BeanConfig {

	//@LoadBalanced //Will be used for client side load balancing when we are using Eureka Service
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
