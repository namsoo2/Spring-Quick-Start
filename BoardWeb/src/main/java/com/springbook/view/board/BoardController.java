package com.springbook.view.board;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Namsoo on 2017. 12. 11..
 */
@Controller
public class BoardController {

    @RequestMapping("/getBoardList.do")
    public String getBoardList(BoardVO vo, BoardDAO boardDAO, Model model) {
        model.addAttribute("boardList", boardDAO.getBoardList(vo));
        return "/getBoardList.jsp";
    }

    @RequestMapping("/getBoard.do")
    public String getBoard(BoardVO vo, BoardDAO boardDAO, Model model) {
        model.addAttribute("board", boardDAO.getBoard(vo));
        return "getBoard.jsp";
    }

    @RequestMapping("/deleteBoard.do")
    public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
        boardDAO.deleteBoard(vo);
        return "getBoardList.do";
    }

    @RequestMapping("/insertBoard.do")
    public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
        boardDAO.insertBoard(vo);
        return "getBoardList.do";
    }

    @RequestMapping("/updateBoard.do")
    public ModelAndView updateBoard(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
        mav.setViewName("getBoardList.do");
        return mav;
    }
}
