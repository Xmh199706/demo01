package com.cq.entity;

import org.junit.Test;

import com.cq.entity.Hello;

/**
 * hello������
 *  @author HH
 *	@createDate 2019-4-8
 *  @updateDate 2019-4-8
 *  @version 1.0
 */
public class HelloTest {
	/**
	 * ����show����
	 */
	Hello he = new Hello();
	@Test
	public void show() {
		//����show����
		he.show("Maven");
	}
	/**
	 * ����out����
	 */
	@Test
	public void out() {
		String msg = he.out();
		System.out.println(msg);
	}
}
