package org.example.builder;

import java.lang.reflect.Array;

public class UrlBuilder {

    private String baseUrl = "";
    private final StringBuilder builder = new StringBuilder();

    public UrlBuilder insertUrl(String url) {
        this.baseUrl += url.concat("/");
        return this;
    }


    public UrlBuilder addParam(String key, String value) {
        if (this.baseUrl.endsWith("/")) {
            this.baseUrl = this.baseUrl.substring(0, this.baseUrl.length() - 1);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder
                    .append("?")
                    .append(key)
                    .append("=")
                    .append(value)
                    .append("&");
            this.baseUrl += stringBuilder.toString();
            return this;
        } else if (this.baseUrl.endsWith("&")) {
            this.builder.append(key)
                    .append("=")
                    .append(value)
                    .append("&");
            this.baseUrl += this.builder.toString();
            return this;
        }
        return this;
    }

    public String build() {
        if (this.baseUrl.endsWith("&")) {
            this.baseUrl.substring(0, this.baseUrl.length() - 1);
            return this.baseUrl;
        }
        return this.baseUrl;
    }

}
