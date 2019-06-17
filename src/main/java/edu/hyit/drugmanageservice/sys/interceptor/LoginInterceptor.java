package edu.hyit.drugmanageservice.sys.interceptor;

import edu.hyit.drugmanageservice.app.model.EmployeeInfo;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //判断session
        //如果没有用户信息在响应头中设置响应状态码403，返回json：{msg：'access denied'}
        HttpSession session = request.getSession(false);
        if (session!=null){
            EmployeeInfo principal = (EmployeeInfo) session.getAttribute("principal");
            return principal !=null;
        }

        response.setContentType("application/json;charset=UTF-8");
        response.setStatus(403);
        response.getWriter().write("{\"msg\"：\"access denied\"}");
        return false;
    }
}
