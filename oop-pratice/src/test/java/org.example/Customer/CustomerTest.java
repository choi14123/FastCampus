package org.example.Customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CustomerTest {

    @DisplayName("메뉴이름에 해당하는 요리를 주문한다.")
    @Test
    void orderTest() {
        Customer customer = new Customer();
        Menu menu;
        menu = new Menu(List.of(new MenuItem("돈까스", 5000), new MenuItem("냉면", 7000)));
        Cooking cooking = new Cooking();
        Assertions.assertThatCode(() -> customer.order("돈까스", menu, cooking)).doesNotThrowAnyException();
    }
}
