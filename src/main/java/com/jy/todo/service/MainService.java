package com.jy.todo.service;

import com.jy.todo.mapper.MainMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MainService {

    private final MainMapper mainMapper;

    public int getTestValue() {
        return mainMapper.selectTestValue();
    }
}
