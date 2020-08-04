package com.spring.address.controller;

import com.spring.address.common.RespEntity;
import com.spring.address.domain.entity.Address;
import com.spring.address.service.AddressService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Resource
    AddressService addressService;
    @PostMapping("/add")
    public RespEntity<String> add(Address address) {
        String insert = addressService.insert(address);
        return RespEntity.success(insert);
    }
    @GetMapping("/select")
    public RespEntity<Address> select(int addressId) {
        Address select = addressService.select(addressId);
        return RespEntity.success(select);
    }
    @PutMapping("/update")
    public RespEntity<String> update(Address address) {
        String update = addressService.update(address);
        return RespEntity.success(update);
    }
    @DeleteMapping("/delete")
    public RespEntity<String> delete(int addressId) {
        String delete = addressService.delete(addressId);
        return RespEntity.success(delete);
    }
}
