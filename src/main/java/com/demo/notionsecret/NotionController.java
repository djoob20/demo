package com.demo.notionsecret;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("notion")
public class NotionController {

    @GetMapping
    public Map<String, String> printAllProps(){
        NotionConfigProperties props = new NotionConfigProperties("https://api.notion.com", "2024-12-30", "jskafhkfsfafjatoken", "dbid");
        return Map.of("apiUrl", props.apiUrl(),
                "apiVersion", props.apiVersion(),
                "authToken", props.authToken(),
                "databaseId", props.databaseId());
    }
}
