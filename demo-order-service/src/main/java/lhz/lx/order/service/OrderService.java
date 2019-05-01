package lhz.lx.order.service;


import lhz.lx.order.dto.OrderDTO;

public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    String create(OrderDTO orderDTO);
}
