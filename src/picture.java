import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class picture extends GraphicsProgram{
	private static final int WIDTH = 1000;
	private static final int HEIGHT =400;
	private static final int HEAD_WIDTH=WIDTH/3;
	private static final int HEAD_HEIGHT=HEIGHT- 100;
	private static final int EYE_RADIUS=HEAD_WIDTH/5;
	private static final int MOUTH_WIDTH=HEAD_WIDTH/2;
	private static final int MOUTH_HEIGHT=HEAD_HEIGHT/6;

	public void run(){
		this.setSize(WIDTH, HEIGHT);
		GRect robot = new GRect(HEAD_WIDTH, 50, HEAD_WIDTH, HEAD_HEIGHT);
		GOval eye1 = new GOval(HEAD_WIDTH+40, HEAD_HEIGHT/4, EYE_RADIUS, EYE_RADIUS);
		GOval eye2 = new GOval(HEAD_WIDTH+195, HEAD_HEIGHT/4, EYE_RADIUS, EYE_RADIUS);
		GRect mouth = new GRect(HEAD_WIDTH+73, 300, MOUTH_WIDTH, MOUTH_HEIGHT);
		eye1.setColor(Color.Blue);
		eye1.setFilled(true);
		eye2.setColor(Color.Blue);
		eye2.setFilled(true);
		mouth.setColor(Color.WHITE);
		mouth.setFilled(true);
		robot.setColor(Color.Red);
		robot.setFilled(true);
		add(robot);
		add(eye1);
		add(eye2);
		add(mouth);
	}

}
