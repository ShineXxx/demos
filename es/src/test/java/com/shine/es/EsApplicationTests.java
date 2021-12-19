package com.shine.es;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EsApplicationTests {

    @Autowired
    ItemDao itemDao;

    @Test
    void contextLoads() {
        Item item = new Item(1L, "itemName1", "type1", "http://123.com");
        Item save = itemDao.save(item);
        System.out.println(save);
        Iterable<Item> all = itemDao.findAll();
        for (Item item1 : all) {
            System.out.println(item1);
        }
    }

}
