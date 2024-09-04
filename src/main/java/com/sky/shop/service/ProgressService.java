package com.sky.shop.service;


import com.sky.shop.dto.Section_Progress;
import com.sky.shop.mapper.ProgressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgressService {

	@Autowired
	private ProgressMapper progressMapper;

	public void saveVideoProgress(Section_Progress sectionProgress){
		progressMapper.saveVideoProgress(sectionProgress);
	}


	public String getPreviousLearningTime(int userNo, String conNum) {
		return progressMapper.selectPreviousLearningTime(userNo, conNum);
	}

}
