package lhz.lx.order.map;

import lhz.lx.order.pojo.OrderDetail;
import lhz.lx.order.pojo.OrderMaster;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDetailMapper extends tk.mybatis.mapper.common.Mapper<OrderDetail> {
}
