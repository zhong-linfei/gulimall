package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author linfei
 * @email linfei.zhong@qq.com
 * @date 2024-08-06 17:53:14
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
