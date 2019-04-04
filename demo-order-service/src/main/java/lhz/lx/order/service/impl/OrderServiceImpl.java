package lhz.lx.order.service.impl;


import lhz.lx.order.dto.OrderDTO;
import lhz.lx.order.service.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by 廖师兄
 * 2017-12-10 16:44
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        return null;
    }
}
