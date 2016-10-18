import javax.swing.*;

import java.awt.Dimension;
import java.awt.event.*;


public class PhotoAlbum extends JFrame{
	
	ImageIcon image;
	JLabel labelForImage;

	JButton buttonShowFamily;
	JButton buttonShowCat;
	JButton buttonShowBrother;
	
	String currentPhoto="family.jpg";
	
	PhotoAlbum()
	{
		GroupLayout layout = new GroupLayout(getContentPane());
		 
		image=new ImageIcon(getClass().getResource(currentPhoto));
		labelForImage=new JLabel(image);

		ActionListener actionListener = new ButtonClickActionListener();
			 
		buttonShowFamily = new JButton("Моя семья");
		buttonShowFamily.setActionCommand("family.jpg");
		buttonShowFamily.addActionListener(actionListener);

	    buttonShowCat = new JButton("Моя кошка");
	    buttonShowCat.setActionCommand("cat.jpg");
		buttonShowCat.addActionListener(actionListener);
	        
	    buttonShowBrother = new JButton("Мой братик");
	    buttonShowBrother.setActionCommand("brother.jpg");
		buttonShowBrother.addActionListener(actionListener);

		getContentPane().setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		        
		layout.setHorizontalGroup(layout.createSequentialGroup()
	             .addComponent(labelForImage)
	             .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                     .addComponent(buttonShowFamily)
	                     .addComponent(buttonShowCat)
	                     .addComponent(buttonShowBrother))
		);
		    
		    
		layout.linkSize(SwingConstants.HORIZONTAL, buttonShowFamily,buttonShowCat,buttonShowBrother);
	
	    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
	        			.addComponent(labelForImage)
	        			.addGroup(layout.createSequentialGroup()
	                             .addComponent(buttonShowFamily)
	                             .addComponent(buttonShowCat)
	                             .addComponent(buttonShowBrother))
	     );
		
	}
		
	public static void main(String args[])
	{
		PhotoAlbum photoAlbum=new PhotoAlbum();
		photoAlbum.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		photoAlbum.setVisible(true);
		photoAlbum.pack();
		photoAlbum.setTitle("Photos");
		photoAlbum.setSize(650, 400);
	}
	
	class ButtonClickActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			currentPhoto=e.getActionCommand();
			image=new ImageIcon(getClass().getResource(currentPhoto));
			labelForImage.setIcon(image);
		}
	}
}
