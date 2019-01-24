package com.aaa.lxy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.aaa.lxy.entities.Dept;


@Mapper
public interface DeptDao
{
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
