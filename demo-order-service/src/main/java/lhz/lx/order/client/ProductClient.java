package lhz.lx.order.client;

import lhz.lx.order.pojo.ProductInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by Vi
 * Date on 2019/4/24 22:13
 */
@FeignClient(name = "DEMO-PRODUCT-SERVICE",fallback = ProductClient.ProductClientFallback.class)
public interface ProductClient {
    @PostMapping("/product/listForOrder")
    String listForOrder();

    @PostMapping("/product/list")
    String list();

    //产生服务降级以后访问下面的方法
    @Component
    class  ProductClientFallback implements ProductClient{
        @Override
        public String listForOrder() {
            return "Feign服务降级";
        }

        @Override
        public String list() {
            return "Feign服务降级";
        }
    }
}