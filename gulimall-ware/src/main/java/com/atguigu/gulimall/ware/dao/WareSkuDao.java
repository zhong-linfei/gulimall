package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author linfei
 * @email linfei.zhong@qq.com
 * @date 2024-08-06 18:08:17
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
