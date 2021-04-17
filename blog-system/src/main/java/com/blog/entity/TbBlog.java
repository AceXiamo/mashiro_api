package com.blog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (TbBlog)实体类
 *
 * @author xiamo
 * @since 2021-04-02 15:17:42
 */
public class TbBlog implements Serializable {
  private static final long serialVersionUID = 827114108261225512L;
  /** id */
  private Integer id;
  /** 博客评论表id */
  private Integer commentId;
  /** 评论条数 */
  private Integer commentNum;
  /** 博客内容 */
  private String content;
  /** 标题 */
  private String title;
  /** 内容缩略(列表) */
  private String contentMini;
  /** 封面图 */
  private String coverImg;
  /** 创建者 */
  private String creator;
  /** 创建者昵称 */
  private String creatorNickname;
  /** 文章点击数 */
  private String view;
  /** 创建时间 */
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date createTime;
  /** 修改时间 */
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date updateTime;

  public Integer getCommentNum() {
    return commentNum;
  }

  public void setCommentNum(Integer commentNum) {
    this.commentNum = commentNum;
  }

  public Integer getCommentId() {
    return commentId;
  }

  public void setCommentId(Integer commentId) {
    this.commentId = commentId;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContentMini() {
    return contentMini;
  }

  public void setContentMini(String contentMini) {
    this.contentMini = contentMini;
  }

  public String getCoverImg() {
    return coverImg;
  }

  public void setCoverImg(String coverImg) {
    this.coverImg = coverImg;
  }

  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public String getCreatorNickname() {
    return creatorNickname;
  }

  public void setCreatorNickname(String creatorNickname) {
    this.creatorNickname = creatorNickname;
  }

  public String getView() {
    return view;
  }

  public void setView(String view) {
    this.view = view;
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
