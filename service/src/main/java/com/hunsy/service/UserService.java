package com.hunsy.service;

import com.hunsy.metadata.entity.UcUser;
import com.hunsy.metadata.mapper.UcUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author hunsy
 * @date 2018/2/22
 */
@Service
@Transactional(readOnly = false, rollbackFor = Exception.class)
public class UserService {

    @Autowired
    private UcUserMapper userMapper;

    /**
     * 主键查询
     *
     * @param id
     * @return
     */
    public UcUser findOne(String id) {
        UcUser ucUser = new UcUser();
        ucUser.setId(id);
        return userMapper.selectOne(ucUser);
    }


}
