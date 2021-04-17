package com.blog.entity;

/**
 * @author xiamo
 * @date 2021/4/2 16:08
 */
public class Page {
  /** 分页 */
  private Integer limit;
  /** 分页 */
  private Integer offset;

  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }
}
