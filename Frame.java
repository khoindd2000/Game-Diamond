import java.awt.Canvas;

import javax.swing.JFrame;

public class Frame {
	private JFrame frame;
	private Canvas canvas;
	private String title;
	private int width,height;
	public Frame(String titles, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		
		Display();
	}
	
	public void Display() {
		frame = new JFrame(title);
		frame.setLocationRelativeTo(null);
		frame.setSize(width,height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
		canvas = new Canvas();
		canvas.setPreferredSize(frame.getSize());
		canvas.setMaximumSize(frame.getSize());
		canvas.setMinimumSize(frame.getSize());
		
		frame.add(canvas);
		frame.pack();
	}
	
	public Canvas getCanvas() {
		return canvas;
	}
	
}
