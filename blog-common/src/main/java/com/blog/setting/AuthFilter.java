package com.blog.setting;

import com.blog.enums.SysEnums;
import com.blog.utils.UrlUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Component
@WebFilter(urlPatterns = "/*", filterName = "authFilter")
public class AuthFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    // TODO Auto-generated method stub

  }

  @Override
  public void doFilter(
      ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
      throws IOException, ServletException {
    HttpServletRequest request = (HttpServletRequest) servletRequest;
    HttpServletResponse response = (HttpServletResponse) servletResponse;
    String url = UrlUtils.getLocation(request);
    System.out.println("过滤器emm");
    if (ApiRule.ApiChecked(url)) {
      filterChain.doFilter(servletRequest, servletResponse);
    } else {
      Map result = new HashMap();
      String token = request.getHeader("Authorization");
      if (token == null || token.equals("")) {
        result.put("code", SysEnums.NOTLOGIN.getCode());
        result.put("msg", SysEnums.NOTLOGIN.getMsg());
        try {
          responseOutWithJson(response, result);
        } catch (Exception e) {
          e.printStackTrace();
        }
      } else {
        boolean status = false;
        try {
          status = ApiRule.checkToken(token);
          if (status) {
            filterChain.doFilter(servletRequest, servletResponse);
          } else {
            result.put("code", SysEnums.TOKENERROR.getCode());
            result.put("msg", SysEnums.TOKENERROR.getMsg());
            try {
              responseOutWithJson(response, result);
            } catch (Exception e) {
              e.printStackTrace();
            }
          }
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
  }

  protected void responseOutWithJson(HttpServletResponse response, Object responseObject)
      throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    String jsonStr = mapper.writeValueAsString(responseObject);
    response.setCharacterEncoding("UTF-8");
    response.setContentType("application/json; charset=utf-8");
    PrintWriter out = null;
    try {
      out = response.getWriter();
      out.append(jsonStr);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (out != null) {
        out.close();
      }
    }
  }

  @Override
  public void destroy() {
    // TODO Auto-generated method stub

  }
}
