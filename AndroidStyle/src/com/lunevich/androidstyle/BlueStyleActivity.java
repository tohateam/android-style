/**
 * 
 */
package com.lunevich.androidstyle;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * @author andrey_lunevich
 * 
 */
public class BlueStyleActivity extends Activity implements OnClickListener {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTheme(R.style.Theme_Blue);
		setContentView(R.layout.stylish);
		Button btn = (Button) findViewById(R.id.btn);
		btn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn:
			onBackPressed();
			break;
		}
	}
	
	@Override
    public void onBackPressed() {
		super.onBackPressed();
		this.finish();
	}
}