package lhz.lx.product.controller;

import lhz.lx.product.VO.ResultVO;
import lhz.lx.product.pojo.ProductCategory;
import lhz.lx.product.pojo.ProductInfo;
import lhz.lx.product.service.CategoryService;
import lhz.lx.product.service.ProductService;
import lhz.lx.product.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/list")
    @ResponseBody
    public ResultVO list() {
        //1. 查询所有在架的商品
        List<ProductInfo> productInfoList = productService.findAll();

        return ResultVOUtil.success(productInfoList);
    }
}
