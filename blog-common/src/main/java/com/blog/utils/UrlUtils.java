package com.blog.utils;

import org.springframework.web.util.UrlPathHelper;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * @author xiamo
 * @date 2021/4/1 11:14
 */
public class UrlUtils {
  /**
   * 获得当前访问的URL路径
   *
   * @param request
   * @return
   */
  public static String getLocation(HttpServletRequest request) {
    UrlPathHelper helper = new UrlPathHelper();
    StringBuffer buff = request.getRequestURL();
    String uri = request.getRequestURI();
    String origUri = helper.getOriginatingRequestUri(request);
    buff.replace(buff.length() - uri.length(), buff.length(), origUri);
    String queryString = helper.getOriginatingQueryString(request);
    if (queryString != null) {
      buff.append("?").append(queryString);
    }
    try {
      return new String(buff.toString().getBytes(), "iso-8859-1");
    } catch (UnsupportedEncodingException e) {
      return buff.toString();
    }
  }
}
