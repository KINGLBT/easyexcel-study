package com.rebote.domain;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName: DemoData
 * @description:
 * @author: luomeng
 * @time: 2020/7/1 13:34
 */
@Data
public class DemoData {
    @ExcelProperty(index = 1,value = "日期标题")
    private Date date;
    @ExcelProperty(index = 2,value = "数字标题")
    private Double doubleData;
    @ExcelProperty(index = 0,value = "字符串标题")
    private String string;

    /**
     * 忽略这个字段
     */
    @ExcelIgnore
    private String ignore;
}
