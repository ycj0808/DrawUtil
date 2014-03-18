package com.example.drawdemo.interfaces;

import com.example.drawdemo.painttools.FirstCurrentPosition;

import android.graphics.Path;

public interface Shapable {
	public Path getPath();

	public FirstCurrentPosition getFirstLastPoint();

	void setShap(ShapesInterface shape);
}
