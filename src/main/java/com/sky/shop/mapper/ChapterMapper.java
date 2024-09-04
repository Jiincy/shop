package com.sky.shop.mapper;

import com.sky.shop.dto.Chapter;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChapterMapper {

    List<Chapter> findAllChapters(String conNum);
    void saveChapter(Chapter chapter);
    void updateChapter(Chapter chapter);
    void deleteChapter(String chapNum);
    Chapter selectChapter(String chapNum);
    Chapter getContentByNum(String chapNum);
    List<Chapter> selectChapterByConNum(String conNum);

}