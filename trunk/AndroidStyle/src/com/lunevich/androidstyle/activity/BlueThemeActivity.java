/**
 * 
 */
package com.lunevich.androidstyle.activity;

import com.lunevich.androidstyle.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

/**
 * @author andrey_lunevich
 * 
 */
public class BlueThemeActivity extends Activity implements OnClickListener {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setTheme(R.style.Theme_Blue);
		setContentView(R.layout.stylish);
		
		String[] items = { "One", "Two", "Three", "Four", "Five" };
		ListView listView = (ListView) findViewById(R.id.listView);
		listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items));
		
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