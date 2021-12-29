package com.macro.mall.search.domain;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

/** 搜索商品的品牌名称，分类名称及属性 Created by macro on 2018/6/27. */
@Data
@EqualsAndHashCode(callSuper = false)
public class EsProductRelatedInfo {
  private List<String> brandNames;
  private List<String> productCategoryNames;
  private List<ProductAttr> productAttrs;

  @Data
  @EqualsAndHashCode(callSuper = false)
  public static class ProductAttr {
    private Long attrId;
    private String attrName;
    private List<String> attrValues;
  }
}
