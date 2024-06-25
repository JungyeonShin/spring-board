package com.jy.todo.service;

import com.jy.todo.mapper.MainMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@AllArgsConstructor
public class MainService {

    private final MainMapper mainMapper;

    public HashMap getTestValue() {
        return mainMapper.selectTestValue();
    }
}
