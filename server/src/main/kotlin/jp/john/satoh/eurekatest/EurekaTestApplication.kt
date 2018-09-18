package jp.john.satoh.eurekatest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class EurekaTestApplication

fun main(args: Array<String>) {
    runApplication<EurekaTestApplication>(*args)
}
