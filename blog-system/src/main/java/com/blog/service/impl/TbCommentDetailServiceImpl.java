package com.blog.service.impl;

import com.blog.dao.TbCommentDetailDao;
import com.blog.entity.TbCommentDetail;
import com.blog.service.TbCommentDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbCommentDetail)表服务实现类
 *
 * @author xiamo
 * @since 2021-03-30 16:45:01
 */
@Service("tbCommentDetailService")
public class TbCommentDetailServiceImpl implements TbCommentDetailService {
  @Resource private TbCommentDetailDao tbCommentDetailDao;

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  @Override
  public TbCommentDetail queryById(Integer id) {
    return this.tbCommentDetailDao.queryById(id);
  }

  /**
   * 查询多条数据
   *
   * @param offset 查询起始位置
   * @param limit 查询条数
   * @return 对象列表
   */
  @Override
  public List<TbCommentDetail> queryAllByLimit(int offset, int limit) {
    return this.tbCommentDetailDao.queryAllByLimit(offset, limit);
  }

  /**
   * 通过实体作为筛选条件查询
   *
   * @param tbCommentDetail 实例对象
   * @return 对象列表
   */
  @Override
  public List<TbCommentDetail> queryAll(TbCommentDetail tbCommentDetail) {
    return this.tbCommentDetailDao.queryAll(tbCommentDetail);
  }

  /**
   * 首页查最新前五条
   *
   * @return 对象列表
   */
  @Override
  public List<TbCommentDetail> queryByIndex() {
    return this.tbCommentDetailDao.queryByIndex();
  }

  /**
   * 通过博客id作为查询条件查询
   *
   * @return 对象列表
   */
  @Override
  public List<TbCommentDetail> queryByblogId(Integer id) {
    return this.tbCommentDetailDao.queryByblogId(id);
  }

  /**
   * 新增数据
   *
   * @param tbCommentDetail 实例对象
   * @return 实例对象
   */
  @Override
  public TbCommentDetail insert(TbCommentDetail tbCommentDetail) {
    this.tbCommentDetailDao.insert(tbCommentDetail);
    return tbCommentDetail;
  }

  /**
   * 修改数据
   *
   * @param tbCommentDetail 实例对象
   * @return 实例对象
   */
  @Override
  public TbCommentDetail update(TbCommentDetail tbCommentDetail) {
    this.tbCommentDetailDao.update(tbCommentDetail);
    return this.queryById(tbCommentDetail.getId());
  }

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 是否成功
   */
  @Override
  public boolean deleteById(Integer id) {
    return this.tbCommentDetailDao.deleteById(id) > 0;
  }
}
