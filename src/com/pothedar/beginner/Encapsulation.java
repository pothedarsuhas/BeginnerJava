package com.pothedar.beginner;

class TestForEncapsulation { // this is a typical example of encapsulation, kepping all the variable private and giving the methods to access them and change them legally
	private int a,b,c;
	private String d,e;
	private double f,g;
	private float i;
	private byte j;
	private char k;
	private long y;
	private boolean z;
	private short s;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	public String getE() {
		return e;
	}
	public void setE(String e) {
		this.e = e;
	}
	public double getF() {
		return f;
	}
	public void setF(double f) {
		this.f = f;
	}
	public double getG() {
		return g;
	}
	public void setG(double g) {
		this.g = g;
	}
	public float getI() {
		return i;
	}
	public void setI(float i) {
		this.i = i;
	}
	public byte getJ() {
		return j;
	}
	public void setJ(byte j) {
		this.j = j;
	}
	public char getK() {
		return k;
	}
	public void setK(char k) {
		this.k = k;
	}
	public long getY() {
		return y;
	}
	public void setY(long y) {
		this.y = y;
	}
	public boolean isZ() {
		return z;
	}
	public void setZ(boolean z) {
		this.z = z;
	}
	public short getS() {
		return s;
	}
	public void setS(short s) {
		this.s = s;
	}
	
}

public class Encapsulation{
	public static void main(String[] args) {
		TestForEncapsulation t = new TestForEncapsulation();
		t.setA(12);
		System.out.println(t.getA());
	}
}
