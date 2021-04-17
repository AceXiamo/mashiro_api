package com.blog.service.impl;

import com.blog.dao.TbUserDao;
import com.blog.entity.TbUser;
import com.blog.service.TbUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbUser)表服务实现类
 *
 * @author xiamo
 * @since 2021-03-30 16:45:05
 */
@Service("tbUserService")
public class TbUserServiceImpl implements TbUserService {
  @Resource private TbUserDao tbUserDao;

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  @Override
  public TbUser queryById(Integer id) {
    return this.tbUserDao.queryById(id);
  }

  /**
   * 通过token查询单条数据
   *
   * @param token token
   * @return 实例对象
   */
  @Override
  public TbUser queryByToken(String token) {
    return this.tbUserDao.queryByToken(token);
  }

  /**
   * 通过用户名查询单条数据
   *
   * @param userName 用户名
   * @return 实例对象
   */
  @Override
  public TbUser queryByUserName(String userName) {
    return this.tbUserDao.queryByUserName(userName);
  }

  /**
   * 查询多条数据
   *
   * @param offset 查询起始位置
   * @param limit 查询条数
   * @return 对象列表
   */
  @Override
  public List<TbUser> queryAllByLimit(int offset, int limit) {
    return this.tbUserDao.queryAllByLimit(offset, limit);
  }

  /**
   * 新增数据
   *
   * @param tbUser 实例对象
   * @return 实例对象
   */
  @Override
  public TbUser insert(TbUser tbUser) {
    this.tbUserDao.insert(tbUser);
    return tbUser;
  }

  /**
   * 修改数据
   *
   * @param tbUser 实例对象
   * @return 实例对象
   */
  @Override
  public TbUser update(TbUser tbUser) {
    this.tbUserDao.update(tbUser);
    return this.queryById(tbUser.getId());
  }

  /**
   * 条件查询
   *
   * @param tbUser 实例对象
   * @return 对象列表
   */
  @Override
  public List<TbUser> queryAll(TbUser tbUser) {
    return this.tbUserDao.queryAll(tbUser);
  }

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 是否成功
   */
  @Override
  public boolean deleteById(Integer id) {
    return this.tbUserDao.deleteById(id) > 0;
  }
}
