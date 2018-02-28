package com.hunsy.metadata.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author hunsy
 * @date 2018/2/22
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
