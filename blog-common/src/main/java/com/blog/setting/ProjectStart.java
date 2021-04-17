package com.blog.setting;

import com.blog.utils.DateUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/** @author xiamo */
@Component
public class ProjectStart implements CommandLineRunner {
  @Override
  public void run(String... args) throws Exception {
    System.out.println(DateUtils.getTime() + "  Mashiro启动成功！");
    ApiRule.initApi();
  }
}
