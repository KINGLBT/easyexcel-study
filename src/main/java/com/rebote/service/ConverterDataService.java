package com.rebote.service;

import com.rebote.domain.ConverterData;
import com.rebote.domain.DemoData;

import java.util.List;

/**
 * 批量保存
 */
public interface ConverterDataService {

    /**
     * 批量保存
     *
     * @param demoDataList
     */
    public void batchSave(List<ConverterData> demoDataList);

}
