package com.demo.notionsecret;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("notion")
public class NotionController {
    private final NotionConfigProperties notionConfigProperties;

    public NotionController(NotionConfigProperties notionConfigProperties) {
        this.notionConfigProperties = notionConfigProperties;
    }

    @GetMapping
    public Map<String, String> printAllProps(){
        return Map.of("apiUrl", notionConfigProperties.apiUrl(),
                "apiVersion", notionConfigProperties.apiVersion(),
                "authToken", notionConfigProperties.authToken(),
                "databaseId", notionConfigProperties.databaseId());
    }
}
