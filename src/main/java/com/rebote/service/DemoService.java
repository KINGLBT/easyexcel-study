package com.rebote.service;

import com.rebote.domain.DemoData;

import java.util.List;

/**
 * 批量保存
 */
public interface DemoService {

    /**
     * 批量保存
     *
     * @param demoDataList
     */
    public void batchSave(List<DemoData> demoDataList);

    void procImportEtcBill(List<DemoData> list);
}
