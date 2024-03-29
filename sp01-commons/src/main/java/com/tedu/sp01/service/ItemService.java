package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	//根据订单id,获取订单中的商品列表
	List<Item> getItems(String orderId);
	
	//把商品列表中的所有商品的库存减掉
	void decreaseNumbers(List<Item> list);

}
