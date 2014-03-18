package com.example.drawdemo.painttools;

import com.example.drawdemo.interfaces.ToolInterface;

import android.graphics.Paint;

//∆’Õ®ª≠± 
public class PlainPen extends PenAbstract implements ToolInterface {
	public PlainPen(int size, int penColor) {
		this(size,penColor,Paint.Style.STROKE);
	}

	public PlainPen(int size, int penColor,Paint.Style style ) {
		super(size, penColor,style);
	}

	@Override
	public String toString() {
		return "\tplainPen: " + "\tshap: " + currentShape + "\thasDraw: "
				+ hasDraw() + "\tsize: " + penSize + "\tstyle:" +style;
	}
}
