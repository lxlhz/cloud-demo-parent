package lhz.lx.product.service.impl;

import lhz.lx.product.enums.ProductStatusEnum;
import lhz.lx.product.map.ProductInfoMapper;
import lhz.lx.product.pojo.ProductInfo;
import lhz.lx.product.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@Transactional(readOnly = true)
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Override
    public List<ProductInfo> findAll() {
        return productInfoMapper.selectAll();
    }
}
