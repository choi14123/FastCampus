package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RequestLineTest {

    @Test
    void create() {
        RequestLine requestLine = new RequestLine("GET /calculate?operand1=10&operator=*&operand2=55 HTTP/1.1");

        Assertions.assertThat(requestLine).isNotNull();
        Assertions.assertThat(requestLine).isEqualTo(new RequestLine("GET", "/calculate", "operand1=10&operator=*&operand2=55"));

    }
}
