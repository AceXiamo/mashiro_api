package com.blog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (TbFile)实体类
 *
 * @author xiamo
 * @since 2021-03-30 16:45:03
 */
public class TbFile extends Page implements Serializable {
  private static final long serialVersionUID = 108505108158197703L;
  /** id */
  private Integer id;
  /** 文件类型表id */
  private Integer typeId;
  /** 文件地址 */
  private String url;
  /** 上传文件的ip地址 */
  private String ipAddress;
  /** 上传者用户id */
  private String createBy;
  /** 状态(0失效1有效) */
  private Object fileStatus;
  /** 创建时间 */
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date createTime;
  /** 修改时间 */
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date updateTime;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }

  public Object getFileStatus() {
    return fileStatus;
  }

  public void setFileStatus(Object fileStatus) {
    this.fileStatus = fileStatus;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }
}
