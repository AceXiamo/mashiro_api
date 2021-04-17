package com.blog.service;

import com.blog.entity.TbFileType;

import java.util.List;

/**
 * (TbFileType)表服务接口
 *
 * @author xiamo
 * @since 2021-03-30 16:45:04
 */
public interface TbFileTypeService {

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  TbFileType queryById(Integer id);

  /**
   * 查询多条数据
   *
   * @param offset 查询起始位置
   * @param limit 查询条数
   * @return 对象列表
   */
  List<TbFileType> queryAllByLimit(int offset, int limit);

  /**
   * 新增数据
   *
   * @param tbFileType 实例对象
   * @return 实例对象
   */
  TbFileType insert(TbFileType tbFileType);

  /**
   * 修改数据
   *
   * @param tbFileType 实例对象
   * @return 实例对象
   */
  TbFileType update(TbFileType tbFileType);

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 是否成功
   */
  boolean deleteById(Integer id);
}
