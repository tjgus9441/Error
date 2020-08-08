package com.onshuu.www.community.mapper;

import java.util.List;

import com.onshuu.www.community.dto.CommuDto;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CommuMapper {
    List<CommuDto> selectCommuQnaList() throws Exception;

    void insertCommuQna(CommuDto community) throws Exception;

    void updateCommuQnaHitCount(int qna_num) throws Exception;

    CommuDto selectCommuQnaDetail(int qna_num) throws Exception;

    void updateCommuQna(CommuDto community) throws Exception;

//    void deleteCommuQna(int qna_num) throws Exception;

}
