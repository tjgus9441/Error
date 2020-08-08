package com.onshuu.www.community.service;

import com.onshuu.www.community.dto.CommuDto;
import java.util.List;

public interface CommuService {
    public List<CommuDto> selectCommuQnaList() throws Exception ;

    void insertCommuQna(CommuDto community) throws Exception;

    CommuDto selectCommuQnaDetail(int qna_num) throws Exception;

    void updateCommuQna(CommuDto community) throws Exception;

//    void deleteCommuQna(int qna_num) throws Exception;

}
