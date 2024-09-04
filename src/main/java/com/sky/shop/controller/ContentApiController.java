package com.sky.shop.controller;

import com.sky.shop.dto.Contents_Manage;
import com.sky.shop.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContentApiController {
    @Autowired
    private ContentService contentService;

    @GetMapping("/content/data")
    public List<Contents_Manage> getContentData(@RequestParam(defaultValue = "1", name = "page") int pageNo) {
        return contentService.paging(pageNo, 10);
    }
}
