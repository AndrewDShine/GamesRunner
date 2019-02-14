import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.Timer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RunnerRunner extends JPanel
	{

		public static void main(String[] args)
			{

			}
		public static void snake()
		{
			UploadScores.readScores("Snake");
			UploadScores.createDefaultScores();
			SnakeRunner.highScores.trimToSize();
			SnakeRunner.snake.add(new Body(0,0));
			JFrame frame = new JFrame("Snake");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        SnakeRunner ex = new SnakeRunner();
	        frame.add(ex);
	        frame.setSize(931, 828);
	        frame.setResizable(false);
	        frame.setVisible(true);
	        ex.setFocusable(true);
		}

	}
