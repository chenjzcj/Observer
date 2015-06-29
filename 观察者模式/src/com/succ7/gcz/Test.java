package com.succ7.gcz;

import java.util.Timer;
import java.util.TimerTask;

public class Test {

	private static Timer timer;
	private static TimerTask timerTask;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 被观察的角色
		final AndroidWeekly androidWeekly = new AndroidWeekly();
		// 观察者
		Coder mrsimple = new Coder("mr.simple");
		Coder coder1 = new Coder("coder-1");
		Coder coder2 = new Coder("coder-2");
		Coder coder3 = new Coder("coder-3");
		// 将观察者注册到可观察对象的观察者列表中
		androidWeekly.addObserver(mrsimple);
		androidWeekly.addObserver(coder1);
		androidWeekly.addObserver(coder2);
		androidWeekly.addObserver(coder3);

		timer = new Timer();
		timerTask = new TimerTask() {

			public void run() {
				androidWeekly.postNewPublication("新的一期AndroidWeekly 来啦!");
			}
		};
		timer.schedule(timerTask, 3000, 10);

	}

}
