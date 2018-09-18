package jp.john.satoh.eurekatest

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ServerController(
        @Value("server.port")
        private val port: String
) {
    val logger: Log = LogFactory.getLog(jp.john.satoh.eurekatest.ServerController::class.java)

    @ResponseBody
    @GetMapping("message")
    fun getMessage(): String {
        logger.info("http://localhost:${port}/message")
        return "original message";
    }

    @ResponseBody
    @GetMapping("greet")
    fun getGreet(): String {
        logger.info("http://localhost:${port}/greet")
        return "hello";
    }
}