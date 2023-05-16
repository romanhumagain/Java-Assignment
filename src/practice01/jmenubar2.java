package practice01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class jmenubar2 implements ActionListener{
	
		JFrame frame ;
		JMenuBar menubar ; 
		JMenu file,edit , help ;
		JMenuItem load , save , exit;
		
		public jmenubar2() {
		frame= new JFrame("trying menubar");
		frame.setSize(500 , 400);
		frame.setLayout(null);
		frame.setVisible(true);
	
		file = new JMenu("file");
		edit = new JMenu("edit");
		help = new JMenu("help");
		
		load =new JMenuItem ("Load");
		load.addActionListener(this);
		
		save =new JMenuItem ("Save");
		save.addActionListener(this);

		exit =new JMenuItem ("Exit");
		exit.addActionListener(this);

		
		file.add(load);
		file.add(save);
		file.add(exit);
		
		
		menubar= new JMenuBar();
		menubar.add(file);
		menubar.add(edit);
        menubar.add(help);
        
       menubar.setLayout(null);
		frame.setJMenuBar(menubar);
		
		file.setMnemonic(KeyEvent.VK_L);
		
		help.setMnemonic(KeyEvent.VK_H);

edit.setMnemonic(KeyEvent.VK_E);
}
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==load) {
				System.out.println("Successfully Loaded");
			}
			if(e.getSource()==save) {
				System.out.println("Successfully saved");
			}
			if(e.getSource()==exit) {
				System.out.println("Successfully exit");
			}
			
		}
		
		public static void main(String []args) {
			
			new jmenubar2();
		}
	
}

