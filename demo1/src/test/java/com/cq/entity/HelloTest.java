package com.cq.entity;

import org.junit.Test;

import com.cq.entity.Hello;

/**
 * hello测试类
 *  @author HH
 *	@createDate 2019-4-8
 *  @updateDate 2019-4-8
 *  @version 1.0
 */
public class HelloTest {
	/**
	 * 测试show方法
	 */
	Hello he = new Hello();
	@Test
	public void show() {
		//调用show方法
		he.show("Maven");
	}
	/**
	 * 测试out方法
	 */
	@Test
	public void out() {
		String msg = he.out();
		System.out.println(msg);
	}
}
