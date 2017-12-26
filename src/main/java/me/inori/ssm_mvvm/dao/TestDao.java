package me.inori.ssm_mvvm.dao;

import org.springframework.stereotype.Repository;

import me.inori.ssm_mvvm.entity.Test;

@Repository
public interface TestDao {
	public Test test();
}
