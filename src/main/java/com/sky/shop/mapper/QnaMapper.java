package com.sky.shop.mapper;

import com.sky.shop.dto.Qna;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QnaMapper {
	List<Qna> selectQnaList() throws Exception;

	void insertQna(Qna qna) throws Exception;

	List<Qna> selectQnaDetail(int qNum) throws Exception;

	void updateHitCount(int qNum) throws Exception;

	void updateQna(Qna qna) throws Exception;

	void deleteQna(int qNum) throws Exception;


	List<Qna> findPage(int offset, int itemsPerPage);

	int countTotal();
}
