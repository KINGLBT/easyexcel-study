package com.rebote.controller;

import com.alibaba.excel.EasyExcel;
import com.rebote.domain.DemoData;
import com.rebote.domain.DemoDataListener;
import com.rebote.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @ClassName: EasyExcelController
 * @description:
 * @author: luomeng
 * @time: 2020/7/1 15:26
 */
@Controller
@Slf4j
public class EasyExcelController {

    @Autowired
    private DemoService demoService;


    /**
     * 文件上传
     * <p>
     * 1. 创建excel对应的实体对象 参照{@link UploadData}
     * <p>
     * 2. 由于默认一行行的读取excel，所以需要创建excel一行一行的回调监听器，参照{@link UploadDataListener}
     * <p>
     * 3. 直接读即可
     */
    @PostMapping("upload")
    @ResponseBody
    public String upload(MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), DemoData.class, new DemoDataListener(demoService)).sheet().doRead();
        return "success";
    }


}
