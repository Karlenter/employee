package com.karl.service.impl;

import com.karl.mapper.ElementViewMapper;
import com.karl.pojo.PageBean;
import com.karl.pojo.employee;
import com.karl.service.ElementViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ElementViewServiceImpl implements ElementViewService {

    @Autowired
    private ElementViewMapper elementViewMapper;

    @Override
    public List<employee> list() {
        return elementViewMapper.list();
    }


    /**
     * 条件查询
     * @param employee
     * @return
     */
    @Override
    public List<employee> CQlist(employee employee) {
        List<employee> employees1 = elementViewMapper.CQlist(employee.getDeptName(),employee.getEmpName(),employee.getEmpDegreeName());
        return employees1;
    }

    /**
     * 新增职工
     * @param employee
     */
    @Override
    public void add(employee employee) {
        elementViewMapper.insert(employee);
    }

    /**
     * 编辑职工
     * @param employee
     */
    @Override
    public void update(employee employee) {
        elementViewMapper.update(employee);
    }

    @Override
    public PageBean page(Integer page, Integer pageSize, Long id, String empName) {
        return null;
    }

    /**
     * 根据ID进行逻辑删除删除职工
     * @param id
     */
    @Override
    public void delete(Long id) {
        employee employee = new employee();
        employee.setId(id);
        employee.setDeleteFlag(0);
        elementViewMapper.update(employee);
    }

}
