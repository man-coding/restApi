package com.helloworld.quickstart.service;

import dto.ItemDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class QuickService {

    public boolean registerItem(ItemDto itemDto){
        // TODO: DB insert

        log.info("service ...");

        return true;
    }
}
