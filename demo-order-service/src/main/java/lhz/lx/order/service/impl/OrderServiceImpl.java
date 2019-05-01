package lhz.lx.order.service.impl;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lhz.lx.order.client.ProductClient;
import lhz.lx.order.dto.OrderDTO;
import lhz.lx.order.enums.OrderStatusEnum;
import lhz.lx.order.enums.PayStatusEnum;
import lhz.lx.order.map.OrderDetailMapper;
import lhz.lx.order.map.OrderMasterMapper;
import lhz.lx.order.pojo.OrderMaster;
import lhz.lx.order.service.OrderService;
import lhz.lx.order.utils.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;


@Service
@Transactional(readOnly = true)
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMasterMapper orderMasterMapper;

    @Autowired
    OrderDetailMapper orderDetailMapper;

    @Autowired
    private ProductClient productClient;

    public String create() {

        //调用商品服务获取数据
        String order = productClient.listForOrder();
        System.out.println("Feign返回结果" + order);
        return order;
    }

    public String listByproId() {
        return "服务熔断处理";
    }
}
