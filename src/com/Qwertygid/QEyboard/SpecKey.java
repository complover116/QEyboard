package com.Qwertygid.QEyboard;

import javax.swing.JButton;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpecKey extends JButton {
	private static final long serialVersionUID = -6126830050704016998L;

	private int i = 0;

	public SpecKey(String txt, final int key) {
		setText(txt);
		setFont(getFont().deriveFont(10f));
		addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					Robot r = new Robot();
					if (i % 2 == 0) {
						getModel().setPressed(true);
						r.keyPress(key);
					} else {
						getModel().setPressed(false);
						r.keyRelease(key);
					}
					i++;
				} catch (AWTException e1) {
					e1.printStackTrace();
				}
			}

		});
	}
}