package com.blog.service;

import com.blog.entity.TbCommentDetail;

import java.util.List;

/**
 * (TbCommentDetail)表服务接口
 *
 * @author xiamo
 * @since 2021-03-30 16:45:01
 */
public interface TbCommentDetailService {

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  TbCommentDetail queryById(Integer id);

  /**
   * 首页查最新前五条
   *
   * @return 对象列表
   */
  List<TbCommentDetail> queryByIndex();

  /**
   * 通过博客id作为查询条件查询
   *
   * @return 对象列表
   */
  List<TbCommentDetail> queryByblogId(Integer id);

  /**
   * 查询多条数据
   *
   * @param offset 查询起始位置
   * @param limit 查询条数
   * @return 对象列表
   */
  List<TbCommentDetail> queryAllByLimit(int offset, int limit);

  /**
   * 通过实体作为筛选条件查询
   *
   * @param tbCommentDetail 实例对象
   * @return 对象列表
   */
  List<TbCommentDetail> queryAll(TbCommentDetail tbCommentDetail);

  /**
   * 新增数据
   *
   * @param tbCommentDetail 实例对象
   * @return 实例对象
   */
  TbCommentDetail insert(TbCommentDetail tbCommentDetail);

  /**
   * 修改数据
   *
   * @param tbCommentDetail 实例对象
   * @return 实例对象
   */
  TbCommentDetail update(TbCommentDetail tbCommentDetail);

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 是否成功
   */
  boolean deleteById(Integer id);
}
