package com.SpringBean;

import org.springframework.stereotype.Component;

@Component
public class Hello {
	
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
