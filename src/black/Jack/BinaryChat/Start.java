package black.Jack.BinaryChat;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;
import black.Jack.BinaryChat.R.id;

public class Start extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);
		
		EditText txt = (EditText) findViewById(id.editText1);
		final String defkey = Settings.Secure.getString(getContentResolver(), Settings.Secure.DEFAULT_INPUT_METHOD);
		boolean enable = false;
		InputMethodManager im = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
		String list = im.getEnabledInputMethodList().toString();
		try {
			for (int i = 0; i < list.length(); i++) {
				if (list.substring(i,i+21).equals("black.Jack.BinaryChat")) {
					enable = true;
					break;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			AlertDialog.Builder alert = new AlertDialog.Builder(Start.this);
			
			alert.setTitle("کیبورد باینری");
			alert.setMessage("سلام کاربر گرامی!" + '\n' + "به کیبورد باینری خوش اومدید!" + '\n' + "برای فعال کردن کیبورد دکمه تایید رو بزنید و تیک کیبورد باینری چت رو بزنید!");
			alert.setPositiveButton("تایید", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface arg0, int arg1) {
					// TODO Auto-generated method stub
					Intent intent=new Intent(android.provider.Settings.ACTION_INPUT_METHOD_SETTINGS);
					startActivity(intent);
					arg0.dismiss();
					new CountDownTimer(5000, 5000) {

						public void onTick(long millisUntilFinished) {

						}

						public void onFinish() {
							
							if (defkey !="black.Jack.BinaryChat/.BinKey") {
								InputMethodManager imm = (InputMethodManager)
							            getSystemService(Context.INPUT_METHOD_SERVICE);
							    imm.showInputMethodPicker();
							    Toast.makeText(getApplicationContext(), "کیبورد binary رو انتخاب کنید", Toast.LENGTH_LONG).show();
							}
							

						}

					}.start();
				}
			});
			alert.show();
			
		}
		
		
	}

	
}
