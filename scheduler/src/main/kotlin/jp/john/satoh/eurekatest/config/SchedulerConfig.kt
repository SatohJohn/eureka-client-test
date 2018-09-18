package jp.john.satoh.eurekatest.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class SchedulerConfig {
    @Bean
    fun restTemplate(): RestTemplate {
        return RestTemplate()
    }
}