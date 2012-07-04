/**
 * 
 */
package com.lunevich.androidstyle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * @author andrey_lunevich
 * 
 */
public class AndroidStyleActivity extends Activity implements OnClickListener {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btnBlueStyle = (Button) findViewById(R.id.btnBlueStyle);
        Button btnGreenStyle = (Button) findViewById(R.id.btnGreenStyle);
        
        btnBlueStyle.setOnClickListener(this);
        btnGreenStyle.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnBlueStyle:
			Intent blueIntent = new Intent(AndroidStyleActivity.this, BlueStyleActivity.class);
			startActivity(blueIntent);
			break;
		case R.id.btnGreenStyle:
			Intent greenIntent = new Intent(AndroidStyleActivity.this, GreenStyleActivity.class);
			startActivity(greenIntent);
			break;
		}
	}
}