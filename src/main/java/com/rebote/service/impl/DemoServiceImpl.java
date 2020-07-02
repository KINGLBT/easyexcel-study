package com.rebote.service.impl;

import com.rebote.dao.DemoDao;
import com.rebote.domain.DemoData;
import com.rebote.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
public class DemoServiceImpl implements DemoService {

    public void batchSave(List<DemoData> demoDataList) {
        log.info("batchSave DemoData size:{}",demoDataList.size());
        demoDataList.forEach(demoData -> {
            log.info(demoData.toString());
        });
    }

    @Override
    public void procImportEtcBill(List<DemoData> list) {
        batchSave(list);
    }
}
