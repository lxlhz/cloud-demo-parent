package lhz.lx.order.client;

import lhz.lx.order.pojo.ProductInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by Vi
 * Date on 2019/4/24 22:13
 */
@FeignClient("DEMO-PRODUCT-SERVICE")
public interface ProductClient {
    @PostMapping("/product/listForOrder")
    String listForOrder();
}