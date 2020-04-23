package com.lyg.flowermanagement;

import com.lyg.flowermanagement.entity.Shop;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FlowermanagementApplication.class)
class FlowermanagementApplicationTests {
    @Autowired
    Shop shop;
    @Test
    void test() {
        shop.setName("cc");
        System.out.println(shop.getName());
    }

}
