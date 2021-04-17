package com.blog.dao;

import com.blog.entity.TbComment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TbComment)表数据库访问层
 *
 * @author xiamo
 * @since 2021-03-30 16:45:00
 */
@Mapper
public interface TbCommentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbComment queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbComment> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbComment 实例对象
     * @return 对象列表
     */
    List<TbComment> queryAll(TbComment tbComment);

    /**
     * 新增数据
     *
     * @param tbComment 实例对象
     * @return 影响行数
     */
    int insert(TbComment tbComment);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbComment> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbComment> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbComment> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbComment> entities);

    /**
     * 修改数据
     *
     * @param tbComment 实例对象
     * @return 影响行数
     */
    int update(TbComment tbComment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}