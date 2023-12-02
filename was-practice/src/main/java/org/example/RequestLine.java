package org.example;

import java.util.Objects;

public class RequestLine {

    private final String method;// GET
    private final String urlpath;// /calculate?operand1=10&operator=*&operand2=55
    private QueryStrings queryString;


    public RequestLine(String method, String urlPath, String queryString) {
        this.method = method;
        this.urlpath = urlPath;
        this.queryString = new QueryStrings(queryString);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestLine that = (RequestLine) o;
        return Objects.equals(method, that.method) && Objects.equals(urlpath, that.urlpath) && Objects.equals(queryString, that.queryString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(method, urlpath, queryString);
    }

    public RequestLine(String requestLine) {
        String[] tokens = requestLine.split(" ");
        this.method = tokens[0];
        String[] urlPathTokens = tokens[1].split("\\?");
        this.urlpath = urlPathTokens[0];

        if (urlPathTokens.length == 2) {
            this.queryString = new QueryStrings(urlPathTokens[1]);
        }

    }

    public boolean isGetRequest() {
        return "GET".equals(this.method);
    }

    public boolean matchPath(String requestPath) {
        return urlpath.equals(requestPath);
    }

    public QueryStrings getQueryStrings() {
        return this.queryString;
    }
}