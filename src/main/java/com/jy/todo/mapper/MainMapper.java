package com.jy.todo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface MainMapper {

    HashMap selectTestValue();
}
