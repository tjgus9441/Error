package com.onshuu.www.community.service;


import com.onshuu.www.community.dto.CommuDto;
import com.onshuu.www.community.mapper.CommuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommuServiceImpl implements CommuService {


    @Autowired
    public CommuMapper commuMapper;

    @Override
    public List<CommuDto> selectCommuQnaList() throws Exception{
        return commuMapper.selectCommuQnaList();
    }

    @Override
    public void insertCommuQna(CommuDto community) throws Exception {
        commuMapper.insertCommuQna(community);

    }

    @Override
    public CommuDto selectCommuQnaDetail(int qna_num) throws Exception {
        commuMapper.updateCommuQnaHitCount(qna_num);

        CommuDto community = commuMapper.selectCommuQnaDetail(qna_num);

        return community;
    }

    @Override
    public void updateCommuQna(CommuDto community) throws Exception {
        commuMapper.updateCommuQna(community);

    }

//    @Override
//    public void deleteCommuQna(int qna_num) throws Exception {
//        commuMapper.deleteCommuQna(qna_num);
//
//    }


}





