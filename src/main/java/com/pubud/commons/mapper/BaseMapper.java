package com.pubud.commons.mapper;

import tk.mybatis.mapper.common.*;
import tk.mybatis.mapper.common.base.BaseDeleteMapper;
import tk.mybatis.mapper.common.base.BaseInsertMapper;
import tk.mybatis.mapper.common.base.BaseSelectMapper;
import tk.mybatis.mapper.common.base.BaseUpdateMapper;

/**
 * @Description 自定义BaseMapper
 * @Author: charleyZZZZ
 * @Date: 2019/6/19 11:13
 * @Version 1.0
 */
public interface BaseMapper<T> extends MySqlMapper<T>, ExampleMapper<T>, RowBoundsMapper<T>, BaseSelectMapper<T>,
        BaseUpdateMapper<T>, BaseDeleteMapper<T>, SqlServerMapper<T>, Marker {
}
