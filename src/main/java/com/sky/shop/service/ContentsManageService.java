package com.sky.shop.service;

import com.sky.shop.dto.Contents_Manage;
import com.sky.shop.mapper.LectureMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContentsManageService {
    private final LectureMapper lectureMapper;
    public List<Contents_Manage> getContentsByLecNum(String lecNum) {
        return lectureMapper.getContentsByLecNum(lecNum);
    }
}
