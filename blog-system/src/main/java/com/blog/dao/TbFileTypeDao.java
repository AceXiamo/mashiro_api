package com.blog.dao;

import com.blog.entity.TbFileType;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (TbFileType)表数据库访问层
 *
 * @author xiamo
 * @since 2021-03-30 16:45:04
 */
@Mapper
public interface TbFileTypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbFileType queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbFileType> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbFileType 实例对象
     * @return 对象列表
     */
    List<TbFileType> queryAll(TbFileType tbFileType);

    /**
     * 新增数据
     *
     * @param tbFileType 实例对象
     * @return 影响行数
     */
    int insert(TbFileType tbFileType);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbFileType> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbFileType> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbFileType> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbFileType> entities);

    /**
     * 修改数据
     *
     * @param tbFileType 实例对象
     * @return 影响行数
     */
    int update(TbFileType tbFileType);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}