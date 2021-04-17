package com.blog.service;

import com.blog.entity.TbBlog;

import java.util.List;

/**
 * (TbBlog)表服务接口
 *
 * @author xiamo
 * @since 2021-03-30 16:44:59
 */
public interface TbBlogService {

  /**
   * 首页查最新前五条
   *
   * @return 对象列表
   */
  List<TbBlog> queryByIndex();

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  TbBlog queryById(Integer id);

  /**
   * 查询多条数据
   *
   * @param offset 查询起始位置
   * @param limit 查询条数
   * @return 对象列表
   */
  List<TbBlog> queryAllByLimit(int offset, int limit);

  /**
   * 新增数据
   *
   * @param tbBlog 实例对象
   * @return 实例对象
   */
  TbBlog insert(TbBlog tbBlog);

  /**
   * 修改数据
   *
   * @param tbBlog 实例对象
   * @return 实例对象
   */
  TbBlog update(TbBlog tbBlog);

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 是否成功
   */
  boolean deleteById(Integer id);
}
