package org.hsy.netflix.openfeign.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author heshiyuan
 * @date 2021/6/26 19:06
 */
@FeignClient("ProducerApplication")
@RequestMapping("/api")
public interface ProducerApi {

    @GetMapping("/lb")
    Map<String, String> loadBalance();
}
