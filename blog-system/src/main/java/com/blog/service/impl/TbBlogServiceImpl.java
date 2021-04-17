package com.blog.service.impl;

import com.blog.dao.TbBlogDao;
import com.blog.entity.TbBlog;
import com.blog.service.TbBlogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbBlog)表服务实现类
 *
 * @author xiamo
 * @since 2021-03-30 16:44:59
 */
@Service("tbBlogService")
public class TbBlogServiceImpl implements TbBlogService {
  @Resource private TbBlogDao tbBlogDao;

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  @Override
  public TbBlog queryById(Integer id) {
    return this.tbBlogDao.queryById(id);
  }

  /**
   * 首页查最新前五条
   *
   * @return 对象列表
   */
  @Override
  public List<TbBlog> queryByIndex() {
    return this.tbBlogDao.queryByIndex();
  }

  /**
   * 查询多条数据
   *
   * @param offset 查询起始位置
   * @param limit 查询条数
   * @return 对象列表
   */
  @Override
  public List<TbBlog> queryAllByLimit(int offset, int limit) {
    return this.tbBlogDao.queryAllByLimit(offset, limit);
  }

  /**
   * 新增数据
   *
   * @param tbBlog 实例对象
   * @return 实例对象
   */
  @Override
  public TbBlog insert(TbBlog tbBlog) {
    this.tbBlogDao.insert(tbBlog);
    return tbBlog;
  }

  /**
   * 修改数据
   *
   * @param tbBlog 实例对象
   * @return 实例对象
   */
  @Override
  public TbBlog update(TbBlog tbBlog) {
    this.tbBlogDao.update(tbBlog);
    return this.queryById(tbBlog.getId());
  }

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 是否成功
   */
  @Override
  public boolean deleteById(Integer id) {
    return this.tbBlogDao.deleteById(id) > 0;
  }
}
