package com.jejuda.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface UserDao {		
	
	public String test(@Param("no")int no);
}
