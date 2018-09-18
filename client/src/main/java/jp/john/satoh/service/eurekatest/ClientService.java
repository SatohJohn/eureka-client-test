package jp.john.satoh.service.eurekatest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("server")
public interface ClientService {
    @GetMapping("message")
    void getMessage();

    @GetMapping("greet")
    void getGreet();
}