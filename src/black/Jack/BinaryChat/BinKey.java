package black.Jack.BinaryChat;

import android.R.string;
import android.content.Intent;
import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.inputmethodservice.KeyboardView.OnKeyboardActionListener;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.Switch;

public class BinKey extends InputMethodService implements OnKeyboardActionListener {

	private KeyboardView kv;
	private Keyboard keyboard;
	private boolean fa = false;
	private boolean caps = false;

	@Override
	public View onCreateInputView() {
		kv = (KeyboardView) getLayoutInflater().inflate(R.layout.keyboard, null);
		keyboard = new Keyboard(this, R.xml.qwerty);
		kv.setKeyboard(keyboard);
		
		kv.setOnKeyboardActionListener(this);
		return kv;

	}

	private void playClick(int keyCode) {
		AudioManager am = (AudioManager) getSystemService(AUDIO_SERVICE);
		switch (keyCode) {
		case 32:
			am.playSoundEffect(AudioManager.FX_KEYPRESS_SPACEBAR);
			break;
		case Keyboard.KEYCODE_DONE:
		case 10:
			am.playSoundEffect(AudioManager.FX_KEYPRESS_RETURN);
			break;
		case Keyboard.KEYCODE_DELETE:
			am.playSoundEffect(AudioManager.FX_KEYPRESS_DELETE);
			break;
		default:
			am.playSoundEffect(AudioManager.FX_KEYPRESS_STANDARD);
		}
	}

	@Override
	public void onKey(int primaryCode, int[] keyCodes) {
		InputConnection ic = getCurrentInputConnection();
		playClick(primaryCode);
		switch (primaryCode) {
		case Keyboard.KEYCODE_DELETE:
			ic.deleteSurroundingText(9, 0);
			break;
		case Keyboard.KEYCODE_SHIFT:
			caps = !caps;
			keyboard.setShifted(caps);
			kv.invalidateAllKeys();
			break;
		case Keyboard.KEYCODE_DONE:
			ic.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_ENTER));
			break;

		default:
			char code = (char) primaryCode;
			if (Character.isLetter(code) && caps) {
				code = Character.toUpperCase(code);
			} else if (Character.isLetter(code) && !caps) {
				code = Character.toLowerCase(code);
			}
			if (code == 32) {
				ic.commitText("000000000", 1);
			}
			if (code == 130) {
				
				if (!fa) {
					kv.setKeyboard(new Keyboard(this, R.xml.per));
					fa = true;
				}
				else {
					kv.setKeyboard(new Keyboard(this, R.xml.qwerty));
					fa = false;
				}
				

			}
			
			//*********************************************BIGGEST BIN IS 000111100*******************************************
			
			
			switch (primaryCode) {
			
//NUMBERS-------------------------------------------------------------------------------------------
			
			//persian
			case 1:
				ic.commitText("000111100", 1);
				break;
			case 2:
				ic.commitText("000111101", 1);
				break;
			case 3:
				ic.commitText("000111110", 1);
				break;
			case 4:
				ic.commitText("000111111", 1);
				break;
			case 5:
				ic.commitText("001000000", 1);
				break;
			case 6:
				ic.commitText("001000001", 1);
				break;
			case 7:
				ic.commitText("001000010", 1);
				break;
			case 8:
				ic.commitText("001000011", 1);
				break;
			case 9:
				ic.commitText("001000100", 1);
				break;
			case 10:
				ic.commitText("001000101", 1);
				break;
				
			//LATIN--------------------------
				
			case 49:
				ic.commitText("001000110", 1);
				break;
			case 50:
				ic.commitText("001000111", 1);
				break;
			case 51:
				ic.commitText("001001000", 1);
				break;
			case 52:
				ic.commitText("001001001", 1);
				break;
			case 53:
				ic.commitText("001001010", 1);
				break;
			case 54:
				ic.commitText("001001011", 1);
				break;
			case 55:
				ic.commitText("001001100", 1);
				break;
			case 56:
				ic.commitText("001001101", 1);
				break;
			case 57:
				ic.commitText("001001110", 1);
				break;
			case 58:
				ic.commitText("001001111", 1);
				break;
			case 59:
				ic.commitText("001010000", 1);
				break;

//PERSIAN Char-------------------------------------------------------------------------------------------
			
			case 12:
				ic.commitText("001010001", 1);
				break;
			case 13:
				ic.commitText("001010010", 1);
				break;
			case 14:
				ic.commitText("001010011", 1);
				break;
			case 15:
				ic.commitText("001010100", 1);
				break;
			case 16:
				ic.commitText("001010101", 1);
				break;
			case 17:
				ic.commitText("001010110", 1);
				break;
			case 18:
				ic.commitText("001010111", 1);
				break;
			case 19:
				ic.commitText("001011000", 1);
				break;
			case 20:
				ic.commitText("001011001", 1);
				break;
			case 21:
				ic.commitText("001011010", 1);
				break;
			case 200:
				ic.commitText("001011011", 1);
				break;
			case 39:
				ic.commitText("001011100", 1);
				break;
			case 22:
				ic.commitText("001011101", 1);
				break;
			case 23:
				ic.commitText("001011110", 1);
				break;
			case 24:
				ic.commitText("001011111", 1);
				break;
			case 201:
				ic.commitText("001100000", 1);
				break;
			case 25:
				ic.commitText("001100001", 1);
				break;
			case 26:
				ic.commitText("001100010", 1);
				break;
			case 27:
				ic.commitText("001100011", 1);
				break;
			case 202:
				ic.commitText("001100100", 1);
				break;
			case 28:
				ic.commitText("001100101", 1);
				break;
			case 29:
				ic.commitText("001100110", 1);
				break;
			case 30:
				ic.commitText("001100111", 1);
				break;
			case 203:
				ic.commitText("001101000", 1);
				break;
			case 33:
				ic.commitText("001101001", 1);
				break;
			case 34:
				ic.commitText("001101010", 1);
				break;
			case 35:
				ic.commitText("001101011", 1);
				break;
			case 204:
				ic.commitText("001101100", 1);
				break;
			case 36:
				ic.commitText("001101101", 1);
				break;
			case 37:
				ic.commitText("001101110", 1);
				break;
			case 38:
				ic.commitText("001101111", 1);
				break;
			case 40:
				ic.commitText("001110000", 1);
				break;
			case 42:
				ic.commitText("001110001", 1);
				break;
			case 206:
				ic.commitText("001110010", 1);
				break;
				
				
				
				
//-------------------------------------------------------------------------------------------	
			case 2151:
				Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
				myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				getApplicationContext().startActivity(myIntent);
				break;
			

			
			
			}
			switch (String.valueOf(code)) {
			
			// Marks------------------------------------------------------------------------------------------------------------------
			
			case "(":
				ic.commitText("000011011", 1);
				break;
			case ")":
				ic.commitText("000011100", 1);
				break;
			case "{":
				ic.commitText("000011101", 1);
				break;
			case "}":
				ic.commitText("000011110", 1);
				break;
			case "/":
				ic.commitText("000011111", 1);
				break;
			case ".":
				ic.commitText("000010000", 1);
				break;
				
			// Lower Case------------------------------------------------------------------------------------------------------------------
				
			case "a":
				ic.commitText("000000001", 1);
				break;
			case "b":
				ic.commitText("000000010", 1);
				break;
			case "c":
				ic.commitText("000000011", 1);
				break;
			case "d":
				ic.commitText("000000100", 1);
				break;
			case "e":
				ic.commitText("000000101", 1);
				break;
			case "f":
				ic.commitText("000000110", 1);
				break;
			case "g":
				ic.commitText("000000111", 1);
				break;
			case "h":
				ic.commitText("000001000", 1);
				break;
			case "i":
				ic.commitText("000001001", 1);
				break;
			case "j":
				ic.commitText("000001010", 1);
				break;
			case "k":
				ic.commitText("000001011", 1);
				break;
			case "l":
				ic.commitText("000001100", 1);
				break;
			case "m":
				ic.commitText("000001101", 1);
				break;
			case "n":
				ic.commitText("000001110", 1);
				break;
			case "o":
				ic.commitText("000001111", 1);
				break;
			case "p":
				ic.commitText("000010000", 1);
				break;
			case "q":
				ic.commitText("000010001", 1);
				break;
			case "r":
				ic.commitText("000010010", 1);
				break;
			case "s":
				ic.commitText("000010011", 1);
				break;
			case "t":
				ic.commitText("000010100", 1);
				break;
			case "u":
				ic.commitText("000010101", 1);
				break;
			case "v":
				ic.commitText("000010110", 1);
				break;
			case "w":
				ic.commitText("000010111", 1);
				break;
			case "x":
				ic.commitText("000011000", 1);
				break;
			case "y":
				ic.commitText("000011001", 1);
				break;
			case "z":
				ic.commitText("000011010", 1);
				break;
				
			// Upper Case------------------------------------------------------------------------------------------------------------------
				
			case "A":
				ic.commitText("000100001", 1);
				break;
			case "B":
				ic.commitText("000100010", 1);
				break;
			case "C":
				ic.commitText("000100011", 1);
				break;
			case "D":
				ic.commitText("000100100", 1);
				break;
			case "E":
				ic.commitText("000100101", 1);
				break;
			case "F":
				ic.commitText("000100110", 1);
				break;
			case "G":
				ic.commitText("000100111", 1);
				break;
			case "H":
				ic.commitText("000101000", 1);
				break;
			case "I":
				ic.commitText("000101001", 1);
				break;
			case "J":
				ic.commitText("000101010", 1);
				break;
			case "K":
				ic.commitText("000101011", 1);
				break;
			case "L":
				ic.commitText("000101100", 1);
				break;
			case "M":
				ic.commitText("000101101", 1);
				break;
			case "N":
				ic.commitText("000101110", 1);
				break;
			case "O":
				ic.commitText("000101111", 1);
				break;
			case "P":
				ic.commitText("000110000", 1);
				break;
			case "Q":
				ic.commitText("000110001", 1);
				break;
			case "R":
				ic.commitText("000110010", 1);
				break;
			case "S":
				ic.commitText("000110011", 1);
				break;
			case "T":
				ic.commitText("000110100", 1);
				break;
			case "U":
				ic.commitText("000110101", 1);
				break;
			case "V":
				ic.commitText("000110110", 1);
				break;
			case "W":
				ic.commitText("000110111", 1);
				break;
			case "X":
				ic.commitText("000111000", 1);
				break;
			case "Y":
				ic.commitText("000111001", 1);
				break;
			case "Z":
				ic.commitText("000111010", 1);
				break;

				
				
				
			}
		}
	}

	@Override
	public void onPress(int primaryCode) {
	}

	@Override
	public void onRelease(int primaryCode) {
	}

	@Override
	public void onText(CharSequence text) {
	}

	@Override
	public void swipeDown() {
	}

	@Override
	public void swipeLeft() {
	}

	@Override
	public void swipeRight() {
	}

	@Override
	public void swipeUp() {
	}
}
