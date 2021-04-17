package com.blog.service;

import com.blog.entity.TbComment;

import java.util.List;

/**
 * (TbComment)表服务接口
 *
 * @author xiamo
 * @since 2021-03-30 16:45:00
 */
public interface TbCommentService {

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  TbComment queryById(Integer id);

  /**
   * 查询多条数据
   *
   * @param offset 查询起始位置
   * @param limit 查询条数
   * @return 对象列表
   */
  List<TbComment> queryAllByLimit(int offset, int limit);

  /**
   * 通过实体作为筛选条件查询
   *
   * @param tbComment 实例对象
   * @return 对象列表
   */
  List<TbComment> queryAll(TbComment tbComment);

  /**
   * 新增数据
   *
   * @param tbComment 实例对象
   * @return 实例对象
   */
  TbComment insert(TbComment tbComment);

  /**
   * 修改数据
   *
   * @param tbComment 实例对象
   * @return 实例对象
   */
  TbComment update(TbComment tbComment);

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 是否成功
   */
  boolean deleteById(Integer id);
}
