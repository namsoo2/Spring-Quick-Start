package com.springbook.view.controller;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Namsoo on 2017. 12. 2..
 */
public class HandlerMapping {

    private Map<String, Controller> mappings;

    public HandlerMapping() {
        this.mappings = new HashMap<String, Controller>();
        mappings.put("/login.do", new LoginController());
        mappings.put("/getBoardList.do", new GetBoardListController());
        mappings.put("/getBoard.do", new GetBoardController());
        mappings.put("/insertBoard.do", new InsertBoardController());
        mappings.put("/updateBoard.do", new InsertBoardController());
        mappings.put("/deleteBoard.do", new DeleteBoardController());
        mappings.put("/logout.do", new LogoutController());

    }

    public Controller getController(String path)
    {
        return mappings.get(path);
    }
}
