package com.karl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class employee {
    private Long id; //职工ID 主键
    private String empName; //职工姓名
    private String sex; //性别 ,  男, 女
    private Integer age; //年龄
    private String deptName; //部门名称
    private String empDegreeName; //学历
    private Integer deleteFlag; //逻辑删除字段 1 未删除 0 删除
}
