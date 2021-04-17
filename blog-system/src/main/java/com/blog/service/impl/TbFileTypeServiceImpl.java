package com.blog.service.impl;

import com.blog.dao.TbFileTypeDao;
import com.blog.entity.TbFileType;
import com.blog.service.TbFileTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbFileType)表服务实现类
 *
 * @author xiamo
 * @since 2021-03-30 16:45:04
 */
@Service("tbFileTypeService")
public class TbFileTypeServiceImpl implements TbFileTypeService {
    @Resource
    private TbFileTypeDao tbFileTypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbFileType queryById(Integer id) {
        return this.tbFileTypeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbFileType> queryAllByLimit(int offset, int limit) {
        return this.tbFileTypeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbFileType 实例对象
     * @return 实例对象
     */
    @Override
    public TbFileType insert(TbFileType tbFileType) {
        this.tbFileTypeDao.insert(tbFileType);
        return tbFileType;
    }

    /**
     * 修改数据
     *
     * @param tbFileType 实例对象
     * @return 实例对象
     */
    @Override
    public TbFileType update(TbFileType tbFileType) {
        this.tbFileTypeDao.update(tbFileType);
        return this.queryById(tbFileType.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tbFileTypeDao.deleteById(id) > 0;
    }
}