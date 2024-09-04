package com.sky.shop;


import com.sky.shop.service.ContentService;
import com.sky.shop.service.LectureService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class shopTests {

    @Autowired
    private ContentService contentService;

    @Autowired
    private LectureService lectureService;


    @Test
    void contextLoads() {
        lectureService.lectureList();
    }


}
