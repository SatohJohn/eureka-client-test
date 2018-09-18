package jp.john.satoh.eurekatest.controller

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Controller
import org.springframework.web.client.RestTemplate
import java.net.URI
import java.security.SecureRandom

@Controller
class Controller(
        private val client: RestTemplate
) {
    val logger: Log = LogFactory.getLog(jp.john.satoh.eurekatest.controller.Controller::class.java)

    @Scheduled(fixedDelay = 500, initialDelay = 1000)
    fun scheduler() {
        val url: URI = SecureRandom().nextInt(2).run {
//            val port = "1000${this%3 + 1}"
//            val uri = "client${this%2 + 1}"
//            URI("http://localhost:${port}/${uri}")
            val port = "10001"
            val uri = "/client${this%2 + 1}"
            URI("http://localhost:${port}${uri}")
        }

        this.client
                .getForEntity(url, Unit.javaClass)
                .apply {
                    logger.info("${url.scheme}://${url.host}:${url.port}${url.path}. status code: ${this.statusCodeValue}.")
                }
    }
}
