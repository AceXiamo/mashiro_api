package com.blog.service;

import com.blog.entity.TbFile;

import java.util.List;

/**
 * (TbFile)表服务接口
 *
 * @author xiamo
 * @since 2021-03-30 16:45:03
 */
public interface TbFileService {

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  TbFile queryById(Integer id);

  /**
   * 查询多条数据
   *
   * @param offset 查询起始位置
   * @param limit 查询条数
   * @return 对象列表
   */
  List<TbFile> queryAllByLimit(int offset, int limit);

  /**
   * 通过实体作为筛选条件查询
   *
   * @param tbFile 实例对象
   * @return 对象列表
   */
  List<TbFile> queryAll(TbFile tbFile);

  /**
   * 新增数据
   *
   * @param tbFile 实例对象
   * @return 实例对象
   */
  TbFile insert(TbFile tbFile);

  /**
   * 修改数据
   *
   * @param tbFile 实例对象
   * @return 实例对象
   */
  TbFile update(TbFile tbFile);

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 是否成功
   */
  boolean deleteById(Integer id);
}
