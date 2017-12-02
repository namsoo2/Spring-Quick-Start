package com.springbook.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Namsoo on 2017. 12. 2..
 */
public interface Controller {
    String handleRequest(HttpServletRequest request, HttpServletResponse response);
}
