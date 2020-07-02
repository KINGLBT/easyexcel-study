package com.rebote.service.impl;

import com.rebote.domain.ConverterData;
import com.rebote.domain.DemoData;
import com.rebote.service.ConverterDataService;
import com.rebote.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: DemoServiceImpl
 * @description:
 * @author: luomeng
 * @time: 2020/7/1 13:41
 */
@Service
@Slf4j
public class ConverterDataServiceImpl implements ConverterDataService {

    public void batchSave(List<ConverterData> demoDataList) {
        log.info("batchSave ConverterData size:{}",demoDataList.size());
        demoDataList.forEach(demoData -> {
            log.info(demoData.toString());
        });
    }
}
