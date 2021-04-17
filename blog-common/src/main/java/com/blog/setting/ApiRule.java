package com.blog.setting;

import com.blog.entity.TbUser;
import com.blog.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiamo
 * @date 2021/4/1 11:18
 */
@Component
public class ApiRule {

  public static ApiRule apiRule;
  @Autowired private TbUserService tbUserService;
  private static List<String> apis = new ArrayList<>();

  @PostConstruct
  public void init() {
    apiRule = this;
    apiRule.tbUserService = this.tbUserService;
  }

  public static boolean ApiChecked(String url) {
    boolean result = false;
    for (String api : apis) {
      if (url.indexOf(api) > -1) {
        result = true;
        break;
      }
    }
    return result;
  }

  public static boolean checkToken(String token) {
    System.out.println(234);
    TbUser user = new TbUser();
    user.setToken(token);
    return apiRule.tbUserService.queryAll(user).size() > 0;
  }

  public static void initApi() {
    apis.add("/sys/login");
    apis.add("/tbBlog/select");
    apis.add("/tbBlog/selectOne");
    apis.add("/tbComment/listComment");
    apis.add("/common/uploadimg");
    apis.add("/common/qqInfo");
    apis.add("/tbCommentDetail/insert");
  }
}
