package jp.john.satoh.service.eurekatest.controller

import jp.john.satoh.service.eurekatest.ClientService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ClientController(
    private val clientService: ClientService
) {

    @GetMapping("client1")
    fun callMessage() {
        clientService.getMessage()
    }

    @GetMapping("client2")
    fun callGreet() {
        clientService.getGreet()
    }
}