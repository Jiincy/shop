package com.sky.shop.controller;


import com.sky.shop.dto.Contents_Manage;
import com.sky.shop.dto.Lecture_Info;
import com.sky.shop.dto.SugangRegWithDetails;
import com.sky.shop.service.ContentsManageService;
import com.sky.shop.service.LectureService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class SugangListController {

    private final LectureService lectureService;
    private final ContentsManageService contentsManageService;



    @GetMapping("/sugangList")
    public String sugangList(Model model, HttpServletRequest request) {
        // 유저넘 세션값 가져오기
        int userNo = (int) request.getSession().getAttribute("userNo");

        List<SugangRegWithDetails> lectures = lectureService.getSugangRegWithDetailsByUserNo(userNo);

        model.addAttribute("lectures", lectures);
        return "sugangList"; //
    }

    @GetMapping("/sugangReg")
    public String sugangReg(Model model) {
        List<Lecture_Info> lectures = lectureService.getAllLectures();
        model.addAttribute("lectures", lectures);
        return "sugangReg";
    }
    @GetMapping("/lecture/{lecNum}") // 수강신청에서 과목 선택시 과목 내부 페이지 보여줌
    public String lectureDetails(@PathVariable String lecNum, Model model) {
        List<Contents_Manage> contents = contentsManageService.getContentsByLecNum(lecNum);
        model.addAttribute("contents", contents);
        return "lectureDetails"; // lectureDetails.jsp 파일을 뷰로 사용
    }




}
