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
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				if(userInput.nextLine().equals("Snake"))
					{
						SnakeRunner sna = new SnakeRunner();
						sna.run();	
					}
				else
					{
						AsteroidsRunner ast = new AsteroidsRunner();
						ast.run();
					}
			}

	}
