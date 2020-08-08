package com.onshuu.www.community.controller;

import com.onshuu.www.community.dto.CommuDto;
import com.onshuu.www.community.service.CommuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CommuController {

    @Autowired
    private CommuService commuService;

    @RequestMapping("/community/openCommuQnaList.do")
    public ModelAndView openCommuQnaList() throws Exception{
        ModelAndView mv = new ModelAndView("CommuQnaList");

        List<CommuDto> list = commuService.selectCommuQnaList();
        mv.addObject("list", list);

        return mv;
    }

    @RequestMapping("/community/openCommuQnaWrite.do")
    public String openCommuQnaWrite() throws Exception {
        return "CommuQnaWrite";
    }

    @RequestMapping("/community/insertCommuQna.do")
    public String insertCommuQna(CommuDto community) throws Exception {
        commuService.insertCommuQna(community);
        return "redirect:/community/openCommuQnaList.do";
    }

    @RequestMapping("/community/openCommuQnaDetail.do")
    public ModelAndView openCommuQnaDetail(@RequestParam int qna_num) throws Exception {
        ModelAndView mv = new ModelAndView("/community/CommuQnaDetail.do");

        CommuDto community = commuService.selectCommuQnaDetail(qna_num);
        mv.addObject("community",community);

        return mv;

    }

    @RequestMapping("/community/updateCommuQna")
    public String updateCommuQna(CommuDto community) throws Exception {
        commuService.updateCommuQna(community);
        return "redirect:/community/openCommuQnaList.do";
    }

//    @RequestMapping("/community/deleteCommuQna.do")
//    public String deleteCommuQna(int qna_num) throws Exception {
//        commuService.deleteCommuQna(qna_num);
//        return "redirect:/community/openCommuQnaList.do";
//    }

}
