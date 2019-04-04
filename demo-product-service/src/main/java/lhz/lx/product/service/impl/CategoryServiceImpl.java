package lhz.lx.product.service.impl;

import lhz.lx.product.map.ProductCategoryMapper;
import lhz.lx.product.pojo.ProductCategory;
import lhz.lx.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@Transactional(readOnly = true)
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Override
    public List<ProductCategory> findByCategoryType(int typeId) {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryType(typeId);
        return productCategoryMapper.selectByExample(productCategory);
    }

    @Override
    public List<Integer> findAllCategoryType() {
        List<Integer> typeList = new ArrayList<>();
        List<ProductCategory> list = productCategoryMapper.selectAll();
        for (ProductCategory category : list) {
            int type = category.getCategoryId();
            typeList.add(type);
        }
        return typeList;
    }

    @Override
    public List<ProductCategory> findAllCategory() {
        return productCategoryMapper.selectAll();
    }
}
