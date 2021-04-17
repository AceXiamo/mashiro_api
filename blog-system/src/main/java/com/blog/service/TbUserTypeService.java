package com.blog.service;

import com.blog.entity.TbUserType;

import java.util.List;

/**
 * (TbUserType)表服务接口
 *
 * @author xiamo
 * @since 2021-03-30 16:45:05
 */
public interface TbUserTypeService {

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  TbUserType queryById(Integer id);

  /**
   * 查询多条数据
   *
   * @param offset 查询起始位置
   * @param limit 查询条数
   * @return 对象列表
   */
  List<TbUserType> queryAllByLimit(int offset, int limit);

  /**
   * 新增数据
   *
   * @param tbUserType 实例对象
   * @return 实例对象
   */
  TbUserType insert(TbUserType tbUserType);

  /**
   * 修改数据
   *
   * @param tbUserType 实例对象
   * @return 实例对象
   */
  TbUserType update(TbUserType tbUserType);

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 是否成功
   */
  boolean deleteById(Integer id);
}
