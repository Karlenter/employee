package com.karl.mapper;

import com.karl.pojo.employee;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 部门管理
 */
@Mapper
public interface ElementViewMapper {
    /**
     * 查询全部部门
     * @return
     */
    @Select("select * from employee")
    List<employee> list();

    /**
     * 根据ID进行逻辑删除删除职工
     * @param id
     */
    @Update("update employee set deleteFlag = #{delete_Flag}}")
    void deleteById(Integer id);

    /**
     * 条件查询
     * @param list
     * @return
     */
    List<employee> CQlist(String deptName, String empName, String empDegreeName);

    /**
     * 新增职工
     * @param employee
     */
    @Insert("insert into employee(empName,sex,age,deptName,empDegreeName) values(#{emp_name},#{sex},#{age},#{dept_name},#{emp_degree_name})")
    void insert(employee employee);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @Select("select id from employee")
    List<employee> Clist(Integer id);

    /**
     * 编辑
     * @param employee
     * @return
     */
    void update(employee employee);


}
