package com.Qwertygid.QEyboard;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class QEyboard {

	public static void main(String[] args) {
		final JPanel panel = new JPanel(new GridLayout(6, 1, 0, 2));

		JPanel firstRow = new JPanel();
		firstRow.add(new Key("Esc", KeyEvent.VK_ESCAPE));

		firstRow.add(new Key("F1", KeyEvent.VK_F1));
		firstRow.add(new Key("F2", KeyEvent.VK_F2));
		firstRow.add(new Key("F3", KeyEvent.VK_F3));
		firstRow.add(new Key("F4", KeyEvent.VK_F4));
		firstRow.add(new Key("F5", KeyEvent.VK_F5));
		firstRow.add(new Key("F6", KeyEvent.VK_F6));
		firstRow.add(new Key("F7", KeyEvent.VK_F7));
		firstRow.add(new Key("F8", KeyEvent.VK_F8));
		firstRow.add(new Key("F9", KeyEvent.VK_F9));
		firstRow.add(new Key("F10", KeyEvent.VK_F10));
		firstRow.add(new Key("F11", KeyEvent.VK_F11));
		firstRow.add(new Key("F12", KeyEvent.VK_F12));

		firstRow.add(new Key("Pause", KeyEvent.VK_PAUSE));
		firstRow.add(new Key("Prt Sc", KeyEvent.VK_PRINTSCREEN));
		firstRow.add(new Key("Insert", KeyEvent.VK_INSERT));
		firstRow.add(new Key("Del", KeyEvent.VK_DELETE));

		panel.add(firstRow);

		JPanel secondRow = new JPanel();

		secondRow.add(new Key("` ~", KeyEvent.VK_BACK_QUOTE));

		secondRow.add(new Key("1 !", KeyEvent.VK_1));
		secondRow.add(new Key("2 @", KeyEvent.VK_2));
		secondRow.add(new Key("3 #", KeyEvent.VK_3));
		secondRow.add(new Key("4 $", KeyEvent.VK_4));
		secondRow.add(new Key("5 %", KeyEvent.VK_5));
		secondRow.add(new Key("6 ^", KeyEvent.VK_6));
		secondRow.add(new Key("7 &", KeyEvent.VK_7));
		secondRow.add(new Key("8 *", KeyEvent.VK_8));
		secondRow.add(new Key("9 (", KeyEvent.VK_9));
		secondRow.add(new Key("0 )", KeyEvent.VK_0));
		secondRow.add(new Key("- _", KeyEvent.VK_MINUS));
		secondRow.add(new Key("+ =", KeyEvent.VK_PLUS));

		secondRow.add(new Key("Backspace", KeyEvent.VK_BACK_SPACE));
		secondRow.add(new Key("Home", KeyEvent.VK_HOME));
		panel.add(secondRow);

		JPanel thirdRow = new JPanel();

		thirdRow.add(new Key("Tab", KeyEvent.VK_TAB));

		thirdRow.add(new Key("Q", KeyEvent.VK_Q));
		thirdRow.add(new Key("W", KeyEvent.VK_W));
		thirdRow.add(new Key("E", KeyEvent.VK_E));
		thirdRow.add(new Key("R", KeyEvent.VK_R));
		thirdRow.add(new Key("T", KeyEvent.VK_T));
		thirdRow.add(new Key("Y", KeyEvent.VK_Y));
		thirdRow.add(new Key("U", KeyEvent.VK_U));
		thirdRow.add(new Key("I", KeyEvent.VK_I));
		thirdRow.add(new Key("O", KeyEvent.VK_O));
		thirdRow.add(new Key("P", KeyEvent.VK_P));

		thirdRow.add(new Key("[ {", KeyEvent.VK_BRACELEFT));
		thirdRow.add(new Key("] }", KeyEvent.VK_BRACERIGHT));
		thirdRow.add(new Key("\\ |", KeyEvent.VK_BACK_SLASH));
		thirdRow.add(new Key("PgUp", KeyEvent.VK_PAGE_UP));

		panel.add(thirdRow);

		final JPanel fourthRow = new JPanel();

		fourthRow.add(new SpecKey("Caps Lock", KeyEvent.VK_CAPS_LOCK));

		fourthRow.add(new Key("A", KeyEvent.VK_A));
		fourthRow.add(new Key("S", KeyEvent.VK_S));
		fourthRow.add(new Key("D", KeyEvent.VK_D));
		fourthRow.add(new Key("F", KeyEvent.VK_F));
		fourthRow.add(new Key("G", KeyEvent.VK_G));
		fourthRow.add(new Key("H", KeyEvent.VK_H));
		fourthRow.add(new Key("J", KeyEvent.VK_J));
		fourthRow.add(new Key("K", KeyEvent.VK_K));
		fourthRow.add(new Key("L", KeyEvent.VK_L));

		fourthRow.add(new Key(": ;", KeyEvent.VK_COLON));
		fourthRow.add(new Key("' \"", KeyEvent.VK_QUOTE));
		fourthRow.add(new Key("ENTER", KeyEvent.VK_ENTER));
		fourthRow.add(new Key("PgDn", KeyEvent.VK_PAGE_DOWN));

		panel.add(fourthRow);

		final JPanel fifthRow = new JPanel();

		fifthRow.add(new SpecKey("Shift", KeyEvent.VK_SHIFT));

		fifthRow.add(new Key("Z", KeyEvent.VK_Z));
		fifthRow.add(new Key("X", KeyEvent.VK_X));
		fifthRow.add(new Key("C", KeyEvent.VK_C));
		fifthRow.add(new Key("V", KeyEvent.VK_V));
		fifthRow.add(new Key("B", KeyEvent.VK_B));
		fifthRow.add(new Key("N", KeyEvent.VK_N));
		fifthRow.add(new Key("M", KeyEvent.VK_M));

		fifthRow.add(new Key(", <", KeyEvent.VK_COMMA));
		fifthRow.add(new Key(". >", KeyEvent.VK_PERIOD));
		fifthRow.add(new Key("/ ?", KeyEvent.VK_SLASH));
		fifthRow.add(new Key("\u2191", KeyEvent.VK_UP));
		fifthRow.add(new Key("End", KeyEvent.VK_END));
		panel.add(fifthRow);

		final JPanel sixthRow = new JPanel();
		sixthRow.add(new SpecKey("Ctrl", KeyEvent.VK_CONTROL));
		sixthRow.add(new SpecKey("Alt", KeyEvent.VK_ALT));
		sixthRow.add(new Key(
				"                                                   SPACE                                                 ",
				KeyEvent.VK_SPACE));
		sixthRow.add(new Key("\u2190", KeyEvent.VK_LEFT));
		sixthRow.add(new Key("\u2193", KeyEvent.VK_DOWN));
		sixthRow.add(new Key("\u2192", KeyEvent.VK_RIGHT));
		panel.add(sixthRow);

		JFrame f = new JFrame("QEyboard");
		f.getContentPane().add(panel);
		f.setSize(1100, 350);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.addWindowListener(new WindowListener() {

			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			public void windowClosing(WindowEvent e) {
				SpecKey[] keys = { (SpecKey) fourthRow.getComponent(0),
						(SpecKey) fifthRow.getComponent(0),
						(SpecKey) sixthRow.getComponent(0),
						(SpecKey) sixthRow.getComponent(1) };
				for(int i = 0; i < keys.length; i++){
					if (keys[i].getModel().isPressed())
						keys[i].doClick();
				}
			}

			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}
		});
		f.setResizable(false);
		f.setFocusableWindowState(false);
		f.setAlwaysOnTop(true);
		f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.X_AXIS));

	}

}
