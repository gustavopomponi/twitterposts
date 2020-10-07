package br.com.gustavopomponi.gateway.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class UriConfiguration {

    private String httpUrl = "http://localhost:8083";

    public String gethttpUrl() {
        return httpUrl;
    }

    public void sethttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
    }

}
