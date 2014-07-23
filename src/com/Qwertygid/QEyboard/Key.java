package com.Qwertygid.QEyboard;
import javax.swing.JButton;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Key extends JButton{
	private static final long serialVersionUID = -7266865055409763079L;

	public Key(String text, final int key){
		setText(text);
		setFont(getFont().deriveFont(10f));
		addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				try {
					Robot r = new Robot();
					r.keyPress(key);
					r.keyRelease(key);
				} catch (AWTException e1) {
					e1.printStackTrace();
				}
			}
			
		});
	}
}
