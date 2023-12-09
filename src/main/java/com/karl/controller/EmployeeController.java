package com.karl.controller;

import com.karl.pojo.PageBean;
import com.karl.pojo.Result;
import com.karl.pojo.employee;
import com.karl.service.ElementViewService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * 职工管理Controller
 */
@Slf4j
@RequestMapping("/elementView")
@RestController
@Api
public class EmployeeController {
    @Autowired
    private ElementViewService elementViewService;

    /**
     * 查询职工数据
     * @return
     */
    @GetMapping
    public Result list(){
        log.info("查询全部职工数据");
        //调用service查询职工数据
        List<employee> employeeList =  elementViewService.list();
        return Result.success(employeeList);
    }

    /**
     * 根据条件查询职工数据
     * @return
     */
    @PostMapping("/list")
    public Result conditionalQueries(@RequestBody employee employee){
        log.info("根据条件查询职工数据");
        //调用service查询职工数据
        List<employee> employeeList =  elementViewService.CQlist(employee);
        return Result.success(employeeList);
    }


    /**
     * 新增职工
     * @return
     */
    @PostMapping("/add")
    public Result add(@RequestBody employee employee){
        log.info("新增职工: {}" , employee);
        //调用service新增职工
        elementViewService.add(employee);
        return Result.success();
    }

    /**
     * 编辑职工
     * @param employee
     * @return
     */
    @PostMapping("/update")
    public Result update(@RequestBody employee employee){
        log.info("编辑职工: {}" , employee);
        //调用service编辑职工
        elementViewService.update(employee);
        return Result.success();
    }

    /**
     * 删除职工
     * @return
     */
    @PostMapping("delete/{id}")
    public Result delete(@PathVariable Long id){
        log.info("根据ID进行逻辑删除删除职工:{}",id);
        //调用service根据ID进行逻辑删除删除职工
        elementViewService.delete(id);
        return Result.success();
    }



    @GetMapping("/page")
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize,
                       Long id, String empName
                      ){
        log.info("分页查询, 参数: {},{},{},{}",page,pageSize,id,empName);
        //调用service分页查询
        PageBean pageBean = elementViewService.page(page,pageSize,id,empName);
        return Result.success(pageBean);
    }

}
