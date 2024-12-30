package com.demo.notionsecret;


public record NotionConfigProperties(
        String apiUrl,
        String apiVersion,
        String authToken,
        String databaseId) {
}
