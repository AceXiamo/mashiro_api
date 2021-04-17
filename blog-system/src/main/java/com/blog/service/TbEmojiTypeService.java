package com.blog.service;

import com.blog.entity.TbEmojiType;

import java.util.List;

/**
 * (TbEmojiType)表服务接口
 *
 * @author xiamo
 * @since 2021-03-30 16:45:03
 */
public interface TbEmojiTypeService {

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  TbEmojiType queryById(Integer id);

  /**
   * 查询多条数据
   *
   * @param offset 查询起始位置
   * @param limit 查询条数
   * @return 对象列表
   */
  List<TbEmojiType> queryAllByLimit(int offset, int limit);

  /**
   * 新增数据
   *
   * @param tbEmojiType 实例对象
   * @return 实例对象
   */
  TbEmojiType insert(TbEmojiType tbEmojiType);

  /**
   * 修改数据
   *
   * @param tbEmojiType 实例对象
   * @return 实例对象
   */
  TbEmojiType update(TbEmojiType tbEmojiType);

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 是否成功
   */
  boolean deleteById(Integer id);
}
