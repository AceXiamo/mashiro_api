package com.blog.setting;

import com.blog.controller.BaseController;
import com.blog.core.uuid.IdUtils;
import com.blog.entity.TbUser;
import com.blog.enums.SysEnums;
import com.blog.service.TbUserService;
import com.blog.utils.Md5Utils;
import com.blog.utils.RedisUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xiamo
 * @since 2021-03-31 11:49:58
 */
@RestController
@RequestMapping("sys")
public class SysController extends BaseController {

  @Resource TbUserService tbUserService;
  @Resource RedisUtils redisUtils;

  @GetMapping("login")
  public Map login(TbUser user) {
    Map map = new HashMap();
    try {
      TbUser tbUser = tbUserService.queryByUserName(user.getUserName());
      if (tbUser != null) {
        if (tbUser.getPassword().equals(Md5Utils.hash(user.getPassword()))) {
          String token = IdUtils.fastUUID();
          tbUser.setToken(token);
          tbUserService.update(tbUser);
          map.put("code", SysEnums.SUCCESS.getCode());
          map.put("msg", SysEnums.SUCCESS.getMsg());
          map.put("data", tbUser);
        } else {
          map.put("code", SysEnums.LOGINPASSWORDERROR.getCode());
          map.put("msg", SysEnums.LOGINPASSWORDERROR.getMsg());
        }
      } else {
        map.put("code", SysEnums.LOGINERROR.getCode());
        map.put("msg", SysEnums.LOGINERROR.getMsg());
      }
    } catch (Exception e) {
      e.printStackTrace();
      map.put("code", SysEnums.ERROR.getCode());
      map.put("msg", SysEnums.ERROR.getMsg());
    } finally {
      return map;
    }
  }
}
