package com.example.drawdemo;


import com.example.drawdemo.interfaces.PaintViewCallBack;
import com.example.drawdemo.view.PaintView;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	private PaintView mPaintView = null;
	private LinearLayout paintViewLayout=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initLayout();
		initPaintView();
		initCallBack();
	}


	/**
	 * 初始化paintView的回调函数
	 */
	private void initCallBack() {
		mPaintView.setCallBack(new PaintViewCallBack() {
			// 当画了之后对Button进行更新
			public void onHasDraw() {
			}

			// 当点击之后让各个弹出的窗口都消失
			public void onTouchDown() {
			}
		});
	}
	
	/**
	 * 初始化画画所用的paintView
	 */
	private void initPaintView() {
		mPaintView = new PaintView(this);
		paintViewLayout.addView(mPaintView);
	}
	private void initLayout(){
		paintViewLayout=(LinearLayout) findViewById(R.id.layout_paint);
	}
}
