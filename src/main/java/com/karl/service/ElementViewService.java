package com.karl.service;

import com.karl.pojo.PageBean;
import com.karl.pojo.employee;

import java.time.LocalDate;
import java.util.List;

/**
 * 职工管理
 */
public interface ElementViewService {
    /**
     * 查询全部职工数据
     * @return
     */
    List<employee> list();

    /**
     * 根据ID进行逻辑删除删除职工
     * @param id
     */
    void delete(Long id);


    /**
     * 条件查询
     * @param employee
     * @return
     */
    List<employee> CQlist(employee employee);

    /**
     * 新增职工
     * @param employee
     */
    void add(employee employee);

    /**
     * 编辑职工
     * @param employee
     */
    void update(employee employee);

    /**
     * 分页查询
     * @param page
     * @param pageSize
     * @return
     */
    PageBean page(Integer page, Integer pageSize, Long id, String empName);

}
