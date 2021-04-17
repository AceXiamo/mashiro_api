package com.blog.setting;

import com.blog.entity.TbUser;
import com.blog.service.TbUserService;
import com.blog.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

/**
 * @author xiamo
 * @date 2021/4/1 17:00
 */
@Component
public class SysUser {
  @Autowired private TbUserService tbUserService;
  public static SysUser sysUser;
  public static String token;

  @PostConstruct
  public void init() {
    sysUser = this;
    sysUser.tbUserService = this.tbUserService;
  }

  public static TbUser getLoginUser(HttpServletRequest request) {
    String token = request.getHeader("Authorization");
    if (StringUtils.isNull(token)) {
      return null;
    }
    return sysUser.tbUserService.queryByToken(token);
  }
}
