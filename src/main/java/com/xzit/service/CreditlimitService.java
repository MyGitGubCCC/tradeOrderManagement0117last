package com.xzit.service;

import com.xzit.entity.Creditlimit;

/**
 * Created by Liu on 2018/1/13.
 */
public interface CreditlimitService {
    int insertCreditlimitInfo(Creditlimit record) throws Exception;

    int updateByPrimaryKey(Creditlimit record) throws Exception;
}
