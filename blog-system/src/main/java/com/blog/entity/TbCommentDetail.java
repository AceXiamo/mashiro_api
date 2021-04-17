package com.blog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (TbCommentDetail)实体类
 *
 * @author xiamo
 * @since 2021-03-30 16:45:01
 */
public class TbCommentDetail implements Serializable {
  private static final long serialVersionUID = 126817248386051461L;
  /** id */
  private Integer id;
  /** 父级id */
  private Integer pid;
  /** 博客id */
  private Integer blogId;
  /** 父表id */
  private Integer parentId;
  /** 博客标题 */
  private String blogTitle;
  /** 评论内容 */
  private Object content;
  /** 评论状态(0删除1隐藏2展示) */
  private Object commentStatus;
  /** 评论者用户id */
  private Integer createBy;
  /** 用户是否在用户表内(0否1是) */
  private Object isUser;
  /** 评论者昵称 */
  private String nickname;
  /** 评论者qq */
  private String qq;
  /** 评论者邮箱 */
  private String email;
  /** 评论者ip地址 */
  private String ipAddress;
  /** ip所在省 */
  private String province;
  /** ip所在城市 */
  private String city;
  /** 评论者头像地址 */
  private String avatar;
  /** 父级评论 */
  private TbCommentDetail commentp;
  /** 创建时间 */
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date createTime;

  public TbCommentDetail getCommentp() {
    return commentp;
  }

  public void setCommentp(TbCommentDetail commentp) {
    this.commentp = commentp;
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

  public Integer getBlogId() {
    return blogId;
  }

  public void setBlogId(Integer blogId) {
    this.blogId = blogId;
  }

  public String getBlogTitle() {
    return blogTitle;
  }

  public void setBlogTitle(String blogTitle) {
    this.blogTitle = blogTitle;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getPid() {
    return pid;
  }

  public void setPid(Integer pid) {
    this.pid = pid;
  }

  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  public Object getContent() {
    return content;
  }

  public void setContent(Object content) {
    this.content = content;
  }

  public Object getCommentStatus() {
    return commentStatus;
  }

  public void setCommentStatus(Object commentStatus) {
    this.commentStatus = commentStatus;
  }

  public Integer getCreateBy() {
    return createBy;
  }

  public void setCreateBy(Integer createBy) {
    this.createBy = createBy;
  }

  public Object getIsUser() {
    return isUser;
  }

  public void setIsUser(Object isUser) {
    this.isUser = isUser;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getQq() {
    return qq;
  }

  public void setQq(String qq) {
    this.qq = qq;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
}
