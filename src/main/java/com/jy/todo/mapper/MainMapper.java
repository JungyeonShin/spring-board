package com.jy.todo.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MainMapper {

    int selectTestValue();
}
