package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author linfei
 * @email linfei.zhong@qq.com
 * @date 2024-08-06 17:48:14
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
