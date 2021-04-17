package com.blog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (TbEmoji)实体类
 *
 * @author xiamo
 * @since 2021-03-30 16:45:02
 */
public class TbEmoji extends Page implements Serializable {
  private static final long serialVersionUID = -46352215431648174L;
  /** id */
  private Integer id;
  /** 表情分类id */
  private Integer typeId;
  /** 表情图地址 */
  private String emojiUrl;
  /** 是否动图(0否1是) */
  private Object isDynamic;
  /** 创建人 */
  private String createBy;
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

  public String getEmojiUrl() {
    return emojiUrl;
  }

  public void setEmojiUrl(String emojiUrl) {
    this.emojiUrl = emojiUrl;
  }

  public Object getIsDynamic() {
    return isDynamic;
  }

  public void setIsDynamic(Object isDynamic) {
    this.isDynamic = isDynamic;
  }

  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
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
