package com.blog.enums;

public enum SysEnums {
  SUCCESS("0", "操作成功！"),
  ERROR("1", "操作失败！"),
  LOGINERROR("2", "未找到该用户！"),
  LOGINPASSWORDERROR("3", "密码错误！"),
  LOGINTIMEOUT("4", "登陆超时，请重新登陆！"),
  NOTLOGIN("5", "请先登录！"),
  TOKENERROR("6", "登录态失效，请重新登陆！"),
  UPLOADFILERROR("7", "文件上传失败");

  private String code;
  private String msg;

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  SysEnums(String code, String msg) {
    this.code = code;
    this.msg = msg;
  }
}
