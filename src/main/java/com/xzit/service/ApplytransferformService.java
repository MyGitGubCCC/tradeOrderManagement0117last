package com.xzit.service;

import com.xzit.entity.Applytransferform;

/**
 * Created by Liu on 2018/1/14.
 */
public interface ApplytransferformService {
    int insertSelective2(Applytransferform record) throws Exception;

    int updateByPrimaryKeySelective(Applytransferform record) throws Exception;
}
