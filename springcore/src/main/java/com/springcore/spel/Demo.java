package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{22 + 56}")
	private int x;
	@Value("#{22 + 56}")
	private int y;

	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double z;

	@Value("#{T(java.lang.Math).E}")
	private double e;

	@Value("#{ new java.lang.String('This is my string') } ")
	private String str;
	
	@Value("#{ 8 > 3}")
	public boolean isActive;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", str=" + str + ", isActive=" + isActive + "]";
	}

	
	

}
