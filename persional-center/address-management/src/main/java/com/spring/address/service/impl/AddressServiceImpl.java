package com.spring.address.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.spring.address.common.RespCode;
import com.spring.address.domain.entity.Address;
import com.spring.address.exception.ServiceException;
import com.spring.address.mapper.AddressMapper;
import com.spring.address.service.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
@DS("master")
public class AddressServiceImpl implements AddressService {
    @Resource
    AddressMapper addressMapper;
    @Override
    public String insert(Address address) {
        String str = "插入失败";
        int insert = addressMapper.insert(address);
        if (insert > 0) {
            str = "插入成功";
        }
        log.info("影响行数" + insert);
        return str;
    }

    @Override
    public String delete(int addressId) {
        String str = "删除失败";
        int i = addressMapper.deleteById(addressId);
        if (i > 0) {
            str = "铲除成功";
        }
        log.info("影响行数" + i);
        return str;
    }

    @Override
    public String update(Address address) {
        String str = "更新失败";
        int i = addressMapper.updateById(address);
        if (i > 0) {
            str = "更新成功";
        }
        log.info("影响行数" + i);
        return str;
    }

    @Override
    @DS("slave")
    public Address select(int addressId) {
        Address address = addressMapper.selectById(addressId);
        if (address == null) {
            throw new ServiceException(RespCode.DATA_IS_WRONG);
        }
        return address;
    }
}
