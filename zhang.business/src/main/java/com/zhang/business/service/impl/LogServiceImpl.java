package com.zhang.business.service.impl;

import com.zhang.business.service.LogService;
import com.zhang.dao.entity.TStagingCommonLog;
import com.zhang.dao.mapper.TStagingCommonLogMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class LogServiceImpl implements LogService {


    @Autowired
    private TStagingCommonLogMapper tStagingCommonLogMapper;


    @Override
    public void saveLog(TStagingCommonLog tStagimgCommonLog) {
        tStagingCommonLogMapper.insertSelective(tStagimgCommonLog);
    }
}
