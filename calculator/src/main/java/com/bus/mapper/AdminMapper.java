package com.bus.mapper;

import com.bus.entity.Admin;
import com.bus.my.mapper.MyMapper;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AdminMapper extends MyMapper<Admin> {
}
