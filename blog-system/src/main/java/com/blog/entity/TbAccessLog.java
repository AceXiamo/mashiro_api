package com.blog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (TbAccessLog)实体类
 *
 * @author xiamo
 * @since 2021-03-30 16:44:57
 */
public class TbAccessLog extends Page implements Serializable {
  private static final long serialVersionUID = 655143176779937928L;
  /** id */
  private Integer id;
  /** ip地址 */
  private String ipaddress;
  /** ip所在省 */
  private String province;
  /** ip所在城市 */
  private String city;
  /** 经纬度 */
  private String latandlon;
  /** 访问的api地址 */
  private String accessApi;
  /** 访问时间 */
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date accessTime;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getIpaddress() {
    return ipaddress;
  }

  public void setIpaddress(String ipaddress) {
    this.ipaddress = ipaddress;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getLatandlon() {
    return latandlon;
  }

  public void setLatandlon(String latandlon) {
    this.latandlon = latandlon;
  }

  public String getAccessApi() {
    return accessApi;
  }

  public void setAccessApi(String accessApi) {
    this.accessApi = accessApi;
  }

  public Date getAccessTime() {
    return accessTime;
  }

  public void setAccessTime(Date accessTime) {
    this.accessTime = accessTime;
  }
}
