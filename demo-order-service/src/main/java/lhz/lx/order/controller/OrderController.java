package lhz.lx.order.controller;


import lhz.lx.order.VO.ResultVO;
import lhz.lx.order.dto.OrderDTO;
import lhz.lx.order.service.OrderService;
import lhz.lx.order.utils.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/create")
    @ResponseBody
    public ResultVO create() {
        //数据模拟前端传递过来
        OrderDTO orderDTO = new OrderDTO();
        return ResultVOUtil.success(orderService.create(orderDTO));
    }
}
