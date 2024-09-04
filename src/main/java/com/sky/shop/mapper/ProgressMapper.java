package com.sky.shop.mapper;


import com.sky.shop.dto.Section_Progress;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProgressMapper {
    void saveVideoProgress(Section_Progress sectionProgress);
    String selectPreviousLearningTime(int userNo, String conNum);
}
