package com.xworkz.ice_cream.service;

import com.xworkz.ice_cream.dto.IceCreamDto;

public interface IceCreamService {
    boolean save (IceCreamDto ice_creamDto);
    Double totalPrice(IceCreamDto ice_creamDto);
}
