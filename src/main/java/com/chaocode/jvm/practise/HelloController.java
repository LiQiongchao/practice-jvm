package com.chaocode.jvm.practise;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Liqc
 * @date 2021/4/12 15:05
 */
@RestController
@RequestMapping("/black")
public class HelloController {

    @PostMapping("1")
    public Map normal() {
        return new HashMap(){{put("callId", null);}};
    }

    @PostMapping("2")
    public Map bitBlack(@RequestBody String callId) {
        return new HashMap(){{put("callId", callId);put("forbid", 1);}};
    }

    @PostMapping("2")
    public Map noBalance() {
        return new HashMap(){{put("message", "No balance");put("forbid", 1);}};
    }

}
