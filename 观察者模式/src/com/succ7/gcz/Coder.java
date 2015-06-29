package com.succ7.gcz;

import java.util.Observable;
import java.util.Observer;

/**
 * 程序员是观察者
 * 
 * @author zhongcj 2015-6-29
 * 
 */
public class Coder implements Observer {

	public String name;

	public Coder(String aName) {
		name = aName;
	}

	public void update(Observable o, Object arg) {
		System.out.println("Hi, " + name + ", AndroidWeekly 更新啦, 内容: " + arg);

	}

	public String toString() {
		return "码农: " + name;
	}

}
