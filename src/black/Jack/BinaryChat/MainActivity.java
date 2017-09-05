package black.Jack.BinaryChat;

import android.app.Activity;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ImageView;
import android.widget.Toast;
import black.Jack.BinaryChat.R.id;

public class MainActivity extends Activity {

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ImageView del = (ImageView) findViewById(id.del);
		ImageView cpy = (ImageView) findViewById(id.copy);
		final EditText txt = (EditText) findViewById(id.editText1);
		try {
			ClipboardManager clipBoard = (ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
		    String text = clipBoard.getText().toString();
			for (int i = 0;i<text.length();i=i+9) {
				switch (text.substring(i, i+9)) {
				//SYMBOL------------------------------------------------------------------------------------------------------------------

				case "000000000":
					txt.setText(txt.getText().toString()+" ");
					break;
					
			    //Farsi------------------------------------------------------------------------------------------------------------------
					
				case "001010001":
					txt.setText(txt.getText().toString()+"ص");
					break;
				case "001010010":
					txt.setText(txt.getText().toString()+"ض");
					break;
				case "001010011":
					txt.setText(txt.getText().toString()+"ث");
					break;
				case "001010100":
					txt.setText(txt.getText().toString()+"ق");
					break;
				case "001010101":
					txt.setText(txt.getText().toString()+"ف");
					break;
				case "001010110":
					txt.setText(txt.getText().toString()+"غ");
					break;
				case "001010111":
					txt.setText(txt.getText().toString()+"ع");
					break;
				case "001011000":
					txt.setText(txt.getText().toString()+"ه");
					break;
				case "001011001":
					txt.setText(txt.getText().toString()+"خ");
					break;
				case "001011010":
					txt.setText(txt.getText().toString()+"ح");
					break;
				case "001011011":
					txt.setText(txt.getText().toString()+"ج");
					break;
				case "001011100":
					txt.setText(txt.getText().toString()+"چ");
					break;
				case "001011101":
					txt.setText(txt.getText().toString()+"ش");
					break;
				case "001011110":
					txt.setText(txt.getText().toString()+"س");
					break;
				case "001011111":
					txt.setText(txt.getText().toString()+"ی");
					break;
				case "001100000":
					txt.setText(txt.getText().toString()+"ئ");
					break;
				case "001100001":
					txt.setText(txt.getText().toString()+"ب");
					break;
				case "001100010":
					txt.setText(txt.getText().toString()+"ل");
					break;
				case "001100011":
					txt.setText(txt.getText().toString()+"ا");
					break;
				case "001100100":
					txt.setText(txt.getText().toString()+"آ");
					break;
				case "001100101":
					txt.setText(txt.getText().toString()+"ت");
					break;
				case "001100110":
					txt.setText(txt.getText().toString()+"ن");
					break;
				case "001100111":
					txt.setText(txt.getText().toString()+"م");
					break;
				case "001101000":
					txt.setText(txt.getText().toString()+"پ");
					break;
				case "001101001":
					txt.setText(txt.getText().toString()+"ط");
					break;
				case "001101010":
					txt.setText(txt.getText().toString()+"ظ");
					break;
				case "001101011":
					txt.setText(txt.getText().toString()+"ز");
					break;
				case "001101100":
					txt.setText(txt.getText().toString()+"ژ");
					break;
				case "001101101":
					txt.setText(txt.getText().toString()+"ر");
					break;
				case "001101110":
					txt.setText(txt.getText().toString()+"ذ");
					break;
				case "001101111":
					txt.setText(txt.getText().toString()+"د");
					break;
				case "001110000":
					txt.setText(txt.getText().toString()+"ک");
					break;
				case "001110001":
					txt.setText(txt.getText().toString()+"گ");
					break;
				case "001110010":
					txt.setText(txt.getText().toString()+"و");
					break;
						
					
				//LowerCase--------------------------------------------------------------------------------------------------------------
					
				case "000000001":
					txt.setText(txt.getText().toString()+"a");
					break;
				case "000000010":
					txt.setText(txt.getText().toString()+"b");
					break;
				case "000000011":
					txt.setText(txt.getText().toString()+"c");
					break;
				case "000000100":
					txt.setText(txt.getText().toString()+"d");
					break;
				case "000000101":
					txt.setText(txt.getText().toString()+"e");
					break;
				case "000000110":
					txt.setText(txt.getText().toString()+"f");
					break;
				case "000000111":
					txt.setText(txt.getText().toString()+"g");
					break;
				case "000001000":
					txt.setText(txt.getText().toString()+"h");
					break;
				case "000001001":
					txt.setText(txt.getText().toString()+"i");
					break;
				case "000001010":
					txt.setText(txt.getText().toString()+"j");
					break;
				case "000001011":
					txt.setText(txt.getText().toString()+"k");
					break;
				case "000001100":
					txt.setText(txt.getText().toString()+"l");
					break;
				case "000001101":
					txt.setText(txt.getText().toString()+"m");
					break;
				case "000001110":
					txt.setText(txt.getText().toString()+"n");
					break;
				case "000001111":
					txt.setText(txt.getText().toString()+"o");
					break;
				case "000010000":
					txt.setText(txt.getText().toString()+"p");
					break;
				case "000010001":
					txt.setText(txt.getText().toString()+"q");
					break;
				case "000010010":
					txt.setText(txt.getText().toString()+"r");
					break;
				case "000010011":
					txt.setText(txt.getText().toString()+"s");
					break;
				case "000010100":
					txt.setText(txt.getText().toString()+"t");
					break;
				case "000010101":
					txt.setText(txt.getText().toString()+"u");
					break;
				case "000010110":
					txt.setText(txt.getText().toString()+"v");
					break;
				case "000010111":
					txt.setText(txt.getText().toString()+"w");
					break;
				case "000011000":
					txt.setText(txt.getText().toString()+"x");
					break;
				case "000011001":
					txt.setText(txt.getText().toString()+"y");
					break;
				case "000011010":
					txt.setText(txt.getText().toString()+"z");
					break;
					
					//UpperCase------------------------------------------------------------------------------------------------------------------

				case "000100001":
					txt.setText(txt.getText().toString()+"A");
					break;
				case "000100010":
					txt.setText(txt.getText().toString()+"B");
					break;
				case "000100011":
					txt.setText(txt.getText().toString()+"C");
					break;
				case "000100100":
					txt.setText(txt.getText().toString()+"D");
					break;
				case "000100101":
					txt.setText(txt.getText().toString()+"E");
					break;
				case "000100110":
					txt.setText(txt.getText().toString()+"F");
					break;
				case "000100111":
					txt.setText(txt.getText().toString()+"G");
					break;
				case "000101000":
					txt.setText(txt.getText().toString()+"H");
					break;
				case "000101001":
					txt.setText(txt.getText().toString()+"I");
					break;
				case "000101010":
					txt.setText(txt.getText().toString()+"J");
					break;
				case "000101011":
					txt.setText(txt.getText().toString()+"K");
					break;
				case "000101100":
					txt.setText(txt.getText().toString()+"L");
					break;
				case "000101101":
					txt.setText(txt.getText().toString()+"M");
					break;
				case "000101110":
					txt.setText(txt.getText().toString()+"N");
					break;
				case "000101111":
					txt.setText(txt.getText().toString()+"O");
					break;
				case "000110000":
					txt.setText(txt.getText().toString()+"P");
					break;
				case "000110001":
					txt.setText(txt.getText().toString()+"Q");
					break;
				case "000110010":
					txt.setText(txt.getText().toString()+"R");
					break;
				case "000110011":
					txt.setText(txt.getText().toString()+"S");
					break;
				case "000110100":
					txt.setText(txt.getText().toString()+"T");
					break;
				case "000110101":
					txt.setText(txt.getText().toString()+"U");
					break;
				case "000110110":
					txt.setText(txt.getText().toString()+"V");
					break;
				case "000110111":
					txt.setText(txt.getText().toString()+"W");
					break;
				case "000111000":
					txt.setText(txt.getText().toString()+"X");
					break;
				case "000111001":
					txt.setText(txt.getText().toString()+"Y");
					break;
				case "000111010":
					txt.setText(txt.getText().toString()+"Z");
					break;
				
				}
				
			}
			
		} catch (Exception e) {
			Toast.makeText(getApplicationContext(), "قبل از اینکه رمزگشارو باز کنین متن مورد نظر رو کپی کنید!", Toast.LENGTH_LONG).show();
		}
		
		del.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		
		cpy.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ClipboardManager clipBoard = (ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
				clipBoard.setText(txt.getText().toString());
			}
		});
	
		
		txt.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	
}
