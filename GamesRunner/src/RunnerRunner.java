import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RunnerRunner extends JPanel
	{
		static Scanner userInput = new Scanner(System.in);
		static JFrame frame = new JFrame("Games Runner");
		public static void main(String[] args)
			{
				displayJFrame();
			}
		
		public static void displayJFrame()
		{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(300, 120);
			frame.setLocation(430, 100);
			
			JPanel panel = new JPanel();
			panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
			frame.add(panel);
			
			JLabel lbl = new JLabel("Select Game");
			lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
			
			panel.add(lbl);
			
			String [] choices = {"Snake", "Asteroids"};
			
			final JComboBox<String> cb = new JComboBox<String>(choices);
			
			cb.setMaximumSize(cb.getPreferredSize()); 
			cb.setAlignmentX(Component.CENTER_ALIGNMENT);
			
			panel.add(cb);

			JButton btn = new JButton("OK");
			btn.setAlignmentX(Component.CENTER_ALIGNMENT);
			panel.add(btn);
			
			frame.setVisible(true);
			
			btn.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						switch(cb.getSelectedIndex())
						{
							case 0:
								SnakeRunner sna = new SnakeRunner();
								sna.run();
								break;
							case 1:
								AsteroidsRunner ast = new AsteroidsRunner();
								ast.run();
								break;
						}
					}
				}
			);
		}

	}
