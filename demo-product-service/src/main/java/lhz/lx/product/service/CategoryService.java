package lhz.lx.product.service;


import java.util.List;
import lhz.lx.product.pojo.ProductCategory;



public interface CategoryService {

    List<ProductCategory> findByCategoryType(int typeId);

    List<Integer> findAllCategoryType();

    List<ProductCategory> findAllCategory();
}
