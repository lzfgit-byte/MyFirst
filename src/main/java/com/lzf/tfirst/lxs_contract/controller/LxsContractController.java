package com.lzf.tfirst.lxs_contract.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lzf.tfirst.lxs_contract.entity.LxsContract;
import com.lzf.tfirst.lxs_contract.mapper.LxsContractMapper;
import com.lzf.tfirst.lxs_contract.service.impl.LxsContractServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.lzf.tfirst.config.BaseController;

import javax.annotation.Resource;
import java.util.List;
/**
 * <p>
 * 合同管理 前端控制器
 * </p>
 *
 * @author lzf
 * @since 2019-11-22
 */
@RestController
@RequestMapping("/lxs_contract")
public class LxsContractController extends BaseController {
    @Resource
    LxsContractMapper lxsContractMapper;
    @Resource
    LxsContractServiceImpl lxsContractService;


    /**
     * 分页测试
     * @return
     */
    @RequestMapping("")
    @ResponseBody
    public String index(){
        QueryWrapper<LxsContract> qw = new QueryWrapper<>();
        List<LxsContract> lxsContracts = lxsContractMapper.selectList(qw);
        Page<LxsContract> page = new Page<>(1,3);
        IPage<LxsContract> page1 = lxsContractService.page(page, qw);
        List<LxsContract> records = page1.getRecords();
        return "1";
    }




}
