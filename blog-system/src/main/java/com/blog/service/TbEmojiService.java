package com.blog.service;

import com.blog.entity.TbEmoji;

import java.util.List;

/**
 * (TbEmoji)表服务接口
 *
 * @author xiamo
 * @since 2021-03-30 16:45:02
 */
public interface TbEmojiService {

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  TbEmoji queryById(Integer id);

  /**
   * 查询多条数据
   *
   * @param offset 查询起始位置
   * @param limit 查询条数
   * @return 对象列表
   */
  List<TbEmoji> queryAllByLimit(int offset, int limit);

  /**
   * 条件查询
   *
   * @param tbEmoji 实例对象
   * @return 对象列表
   */
  List<TbEmoji> queryAll(TbEmoji tbEmoji);

  /**
   * 新增数据
   *
   * @param tbEmoji 实例对象
   * @return 实例对象
   */
  TbEmoji insert(TbEmoji tbEmoji);

  /**
   * 修改数据
   *
   * @param tbEmoji 实例对象
   * @return 实例对象
   */
  TbEmoji update(TbEmoji tbEmoji);

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 是否成功
   */
  boolean deleteById(Integer id);
}
