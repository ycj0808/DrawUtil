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
	 * ��ʼ��paintView�Ļص�����
	 */
	private void initCallBack() {
		mPaintView.setCallBack(new PaintViewCallBack() {
			// ������֮���Button���и���
			public void onHasDraw() {
			}

			// �����֮���ø��������Ĵ��ڶ���ʧ
			public void onTouchDown() {
			}
		});
	}
	
	/**
	 * ��ʼ���������õ�paintView
	 */
	private void initPaintView() {
		mPaintView = new PaintView(this);
		paintViewLayout.addView(mPaintView);
	}
	private void initLayout(){
		paintViewLayout=(LinearLayout) findViewById(R.id.layout_paint);
	}
}
