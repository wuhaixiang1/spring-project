package com.spring.address.service;

import com.spring.address.domain.entity.Address;

public interface AddressService {
    String insert(Address address);
    String delete(int addressId);
    String update(Address address);
    Address select(int addressId);
}
