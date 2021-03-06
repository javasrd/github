package com.ecp.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ecp.entity.Item;

import tk.mybatis.mapper.common.Mapper;

public interface ItemMapper extends Mapper<Item> {
	
	/**
	 * @Description 通过品牌、属性值进行查询
	 * @param brands
	 * @param attrValPairs
	 * @return
	 */
	public List<Item> getItemByBrandAndAttr(@Param("cid") Long cid, 
											@Param("brands") List<Long> brands, 
											@Param("attrValPairs") List<String> attrValPairs);
	
	
	/**
	 * @Description 查询SPU keywords item_name
	 * @param keywordList
	 * @return
	 */
	public List<Item> getItemByKeywords(@Param("keywords") List<String> keywordList);
	
	
	/**
	 * @Description 根据品牌id获取 SPU列表
	 * @param ids
	 * @return
	 */
	public List<Item> getItemByBrandIds(@Param("ids") List<Long> ids);
	
	
	/**
	 * 根据条件查询商品
	 * @param map
	 * 		map为null时查询所有商品
	 * @return
	 */
	List<Map<String, Object>> selectItemsByCondition(Map<String, Object> map);

}