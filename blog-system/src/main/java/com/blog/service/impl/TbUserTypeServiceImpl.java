package com.blog.service.impl;

import com.blog.dao.TbUserTypeDao;
import com.blog.entity.TbUserType;
import com.blog.service.TbUserTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbUserType)表服务实现类
 *
 * @author xiamo
 * @since 2021-03-30 16:45:05
 */
@Service("tbUserTypeService")
public class TbUserTypeServiceImpl implements TbUserTypeService {
    @Resource
    private TbUserTypeDao tbUserTypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbUserType queryById(Integer id) {
        return this.tbUserTypeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbUserType> queryAllByLimit(int offset, int limit) {
        return this.tbUserTypeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbUserType 实例对象
     * @return 实例对象
     */
    @Override
    public TbUserType insert(TbUserType tbUserType) {
        this.tbUserTypeDao.insert(tbUserType);
        return tbUserType;
    }

    /**
     * 修改数据
     *
     * @param tbUserType 实例对象
     * @return 实例对象
     */
    @Override
    public TbUserType update(TbUserType tbUserType) {
        this.tbUserTypeDao.update(tbUserType);
        return this.queryById(tbUserType.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tbUserTypeDao.deleteById(id) > 0;
    }
}