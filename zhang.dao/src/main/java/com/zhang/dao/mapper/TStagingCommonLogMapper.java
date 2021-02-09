package com.zhang.dao.mapper;

import com.zhang.dao.entity.TStagingCommonLog;
import com.zhang.dao.entity.TStagingCommonLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TStagingCommonLogMapper {
    long countByExample(TStagingCommonLogExample example);

    int deleteByExample(TStagingCommonLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TStagingCommonLog record);

    int insertSelective(TStagingCommonLog record);

    TStagingCommonLog selectOneByExample(TStagingCommonLogExample example);

    List<TStagingCommonLog> selectByExample(TStagingCommonLogExample example);

    TStagingCommonLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TStagingCommonLog record, @Param("example") TStagingCommonLogExample example);

    int updateByExample(@Param("record") TStagingCommonLog record, @Param("example") TStagingCommonLogExample example);

    int updateByPrimaryKeySelective(TStagingCommonLog record);

    int updateByPrimaryKey(TStagingCommonLog record);

    int batchInsert(@Param("list") List<TStagingCommonLog> list);

    int batchInsertSelective(@Param("list") List<TStagingCommonLog> list, @Param("selective") TStagingCommonLog.Column ... selective);
}