package com.sirmcscruffybeard.simple_swing_window.window;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimpleSwingWindow extends JFrame {

	private final String TITLE = "Simple Swing Window";
	
	private final String HELLO_TEXT = "Hello World";
	
	private final String BUTTON_TEXT = "Close";
	
	private final boolean VISABLE = true;
	
	private final int HEIGHT = 300;
	
	private final int WIDTH = 500;
	
	private JButton closeButton = null;
	
	public SimpleSwingWindow() {
		
		this.setLayout(new BorderLayout());
		
		this.add(this.prepHelloLabel(), BorderLayout.CENTER); //Add label and put it in center section
		
		this.add(this.prepCloseButton(), BorderLayout.SOUTH);
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		this.setTitle(this.TITLE);
		
		this.setSize(WIDTH, HEIGHT);
		
		this.setVisible(VISABLE);
		
	}//End SimpleSwingWindow
	
	public String getTitle() {
		
		return this.TITLE;
	}
	
	private JLabel prepHelloLabel() {
		
		return new JLabel(HELLO_TEXT); //Initialize with text
	}
	
	private JButton prepCloseButton() {
		
		this.closeButton = new JButton(BUTTON_TEXT); //Initialize with text 
		
		this.closeButton.addActionListener(new CloseListener()); //Action Listener
		
		return this.closeButton;
	}
	
	private class CloseListener implements ActionListener {

		private int CLOSE_NORMAL = 0;
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.exit(this.CLOSE_NORMAL);
			
		}//End actionPerformed
		
	}//End CloseListener
	
}//End SimpleSwingWindow
