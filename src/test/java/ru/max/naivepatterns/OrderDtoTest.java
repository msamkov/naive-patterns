package ru.max.naivepatterns;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderDtoTest {


    class OrderDto {
        private String orderId;
        private String phone;
        private long amount;

        private String name;

        public String getOrderId() {
            return orderId;
        }

        public String getPhone() {
            return phone;
        }

        public Long getAmount() {
            return amount;
        }

        public String getName() {
            return name;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setAmount(Long amount) {
            this.amount = amount;
        }

        public void setName(String name) {
            this.name = name;
        }

        public OrderDto(String orderId, String phone, Long amount, String name) {
            this.name = name;
            this.orderId = orderId;
            this.phone = phone;
            this.amount = amount;
        }
    }

    @Test
    void test() {
        List<OrderDto> expected = new ArrayList<>();
        expected.add(new OrderDto("1", "123", 300L, "Alex"));
        expected.add(new OrderDto("2", "1002", 1001L, "Bob"));


        List<OrderDto> orderDtos = new ArrayList<>();
        orderDtos.add(new OrderDto("1", "123", 100L, "Alex"));
        orderDtos.add(new OrderDto("1", "123", 200L, "Alex"));
        orderDtos.add(new OrderDto("2", "1002", 1001L, "Bob"));
        List<OrderDto> actual = aggregate(orderDtos);
        assertEquals(expected.size(), actual.size());
        expected.forEach(orderExp ->
                {
                    OrderDto orderActual = actual.stream().filter(orderDto1 -> orderDto1.phone.equals(orderExp.phone)).findFirst().orElse(null);
                    assertEquals(orderExp.name, orderActual.name);
                    assertEquals(orderExp.orderId, orderActual.orderId);
                    assertEquals(orderExp.phone, orderActual.phone);
                    assertEquals(orderExp.amount, orderActual.amount);
                }
        );
    }

    List<OrderDto> aggregate(List<OrderDto> orderDtos) {
        Map<String, OrderDto> orderMap = new HashMap<>();
        for (OrderDto orderDto : orderDtos) {
            OrderDto order = orderMap.get(orderDto.getPhone());
            if (order == null) {
                orderMap.put(orderDto.getPhone(), orderDto);
            } else if (order.getOrderId().equals(orderDto.getOrderId())) {
                order.setAmount(order.getAmount() + orderDto.getAmount());
                orderMap.put(order.getPhone(), order);
            }
        }
        return new ArrayList<>(orderMap.values());

    }

}





