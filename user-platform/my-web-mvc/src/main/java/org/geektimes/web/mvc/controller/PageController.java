package org.geektimes.web.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 页面控制器， 负责服务端页面渲染
 */
public interface PageController extends Controller {

    String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable;
}
