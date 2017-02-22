package colorchooserapplication;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

//@author: Celena Williams
//Copyrighted: 2014
//Last edited: February 22, 2017

//Code may be kept and modified, so long as my name stays the creator.
//Parts of code may be used without documentation if code is understood.

public class ColorChooserApplication extends JFrame implements ActionListener {
	public static void main (String [] args) {
            ColorChooserApplication application = new ColorChooserApplication ();
            application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}//END public static void main (String [] args)

	//I had a specific layout in mind for this program. This is the way I
        //found was the easiest to get that layout.
	JLabel redLabel, greenLabel, blueLabel, hexLabel, rgbLabel;
	JLabel webSafeLabel, colorNameLabel;
	JSlider redBar, greenBar, blueBar;
	JTextField hexField, rField, gField, bField, sampleTextFieldRGB;
	JTextField sampleTextFieldHex;
	JButton backgroundButton, textButton;
	JPanel buttonPanel, centerPanel, textPanel, textPanel1, textPanel2;
	JPanel centerNorthPanel, centerSouthPanel;
	JPanel redPanel, redPanel1, redPanel2, greenPanel, greenPanel1;
	JPanel greenPanel2, colorPanel, hexPanel;
	JPanel bluePanel, bluePanel1, bluePanel2, webColorPanel, hexRGBPanel;
	JPanel webPanel, rgbPanel;
	JMenuBar colorMenuBar;
	JMenu colorMenu, aboutMenu;
	JMenuItem basicColorMenuItem, webSafeColorMenuItem, copyrightMenuItem;
	JMenuItem purposeMenuItem, usageMenuItem;

	int rValue = 0, gValue = 0, bValue = 0;
	Color newColor;
	String hexCode1 = "00", hexCode2 = "00", hexCode3 = "00";

	public ColorChooserApplication () {
            setResizable (false);
            setTitle ("Hex and RGB Color Chooser");
            setLayout (new BorderLayout ());
            newColor = new Color (rValue, gValue, bValue);

            //Creates the window layout, including the menubars.
            colorMenuBar = new JMenuBar ();
            colorMenu = new JMenu ("Color Menu");
            aboutMenu = new JMenu ("About");

            basicColorMenuItem = new JMenuItem ("Basic Color Menu");
            webSafeColorMenuItem = new JMenuItem ("Websafe Color Menu");
            copyrightMenuItem = new JMenuItem ("Copyright");
            purposeMenuItem = new JMenuItem ("Purpose");
            usageMenuItem = new JMenuItem ("How to Use");

            colorMenuBar.add (colorMenu);
            colorMenuBar.add (aboutMenu);
            colorMenu.add (basicColorMenuItem);
            colorMenu.add (webSafeColorMenuItem);
            aboutMenu.add (copyrightMenuItem);
            aboutMenu.add (purposeMenuItem);
            aboutMenu.add (usageMenuItem);
            setJMenuBar (colorMenuBar);

            buttonPanel = new JPanel ();
            buttonPanel.setLayout (new FlowLayout (FlowLayout.CENTER));
            buttonPanel.setBackground (newColor);
            centerPanel = new JPanel ();
            centerPanel.setBackground (newColor);
            centerPanel.setLayout (new BorderLayout ());
            textPanel = new JPanel ();
            textPanel.setLayout (new BorderLayout ());
            textPanel.setBackground (newColor);

            centerNorthPanel = new JPanel ();
            centerNorthPanel.setLayout (new BorderLayout ());
            centerSouthPanel = new JPanel ();
            centerSouthPanel.setLayout (new BorderLayout ());

            redPanel = new JPanel ();
            redPanel.setLayout (new BorderLayout ());
            greenPanel = new JPanel ();
            greenPanel.setLayout (new BorderLayout ());
            bluePanel = new JPanel ();
            bluePanel.setLayout (new BorderLayout ());

            redPanel1 = new JPanel ();
            redPanel1.setLayout (new FlowLayout (FlowLayout.CENTER));
            redPanel1.setBackground (newColor);
            redPanel2 = new JPanel ();
            redPanel2.setLayout (new FlowLayout (FlowLayout.CENTER));
            redPanel2.setBackground (newColor);

            greenPanel1 = new JPanel ();
            greenPanel1.setLayout (new FlowLayout (FlowLayout.CENTER));
            greenPanel1.setBackground (newColor);
            greenPanel2 = new JPanel ();
            greenPanel2.setLayout (new FlowLayout (FlowLayout.CENTER));
            greenPanel2.setBackground (newColor);

            bluePanel1 = new JPanel ();
            bluePanel1.setLayout (new FlowLayout (FlowLayout.CENTER));
            bluePanel1.setBackground (newColor);
            bluePanel2 = new JPanel ();
            bluePanel2.setLayout (new FlowLayout (FlowLayout.CENTER));
            bluePanel2.setBackground (newColor);

            textPanel1 = new JPanel ();
            textPanel1.setLayout (new FlowLayout (FlowLayout.CENTER));
            textPanel1.setBackground (newColor);
            textPanel2 = new JPanel ();
            textPanel2.setLayout (new FlowLayout (FlowLayout.CENTER));
            textPanel2.setBackground (newColor);

            webColorPanel = new JPanel ();
            webColorPanel.setLayout (new BorderLayout ());
            webColorPanel.setBackground (newColor);
            hexRGBPanel = new JPanel ();
            hexRGBPanel.setLayout (new BorderLayout ());
            hexRGBPanel.setBackground (newColor);

            webPanel = new JPanel ();
            webPanel.setLayout (new FlowLayout (FlowLayout.CENTER));
            webPanel.setBackground (newColor);
            colorPanel = new JPanel ();
            colorPanel.setLayout (new FlowLayout (FlowLayout.CENTER));
            colorPanel.setBackground (newColor);

            hexPanel = new JPanel ();
            hexPanel.setLayout (new FlowLayout (FlowLayout.CENTER));
            hexPanel.setBackground (newColor);
            rgbPanel = new JPanel ();
            rgbPanel.setLayout (new FlowLayout (FlowLayout.CENTER));
            rgbPanel.setBackground (newColor);

            //Adds all the content to the window.
            add (buttonPanel, BorderLayout.NORTH);
            add (centerPanel, BorderLayout.CENTER);
            add (textPanel, BorderLayout.SOUTH);

            centerPanel.add (centerNorthPanel, BorderLayout.NORTH);
            centerPanel.add (centerSouthPanel, BorderLayout.SOUTH);

            centerNorthPanel.add (redPanel, BorderLayout.NORTH);
            centerNorthPanel.add (greenPanel, BorderLayout.CENTER);
            centerNorthPanel.add (bluePanel, BorderLayout.SOUTH);

            redPanel.add (redPanel1, BorderLayout.NORTH);
            redPanel.add (redPanel2, BorderLayout.SOUTH);

            greenPanel.add (greenPanel1, BorderLayout.NORTH);
            greenPanel.add (greenPanel2, BorderLayout.SOUTH);

            bluePanel.add (bluePanel1, BorderLayout.NORTH);
            bluePanel.add (bluePanel2, BorderLayout.SOUTH);

            textPanel.add (textPanel1, BorderLayout.NORTH);
            textPanel.add (textPanel2, BorderLayout.SOUTH);

            centerSouthPanel.add (webColorPanel, BorderLayout.NORTH);
            centerSouthPanel.add (hexRGBPanel, BorderLayout.SOUTH);

            webColorPanel.add (webPanel, BorderLayout.NORTH);
            webColorPanel.add (colorPanel, BorderLayout.SOUTH);

            hexRGBPanel.add (hexPanel, BorderLayout.NORTH);
            hexRGBPanel.add (rgbPanel, BorderLayout.SOUTH);

            //Adds action listeners to the buttons.
            backgroundButton = new JButton ("Background");
            backgroundButton.addActionListener (this);
            backgroundButton.setActionCommand ("Background");

            textButton = new JButton ("Text");
            textButton.addActionListener (this);
            textButton.setActionCommand ("Text");

            webSafeLabel = new JLabel ("Websafe");
            colorNameLabel = new JLabel ("Black");
            hexLabel = new JLabel ("Hex code: ");
            rgbLabel = new JLabel ("RGB code: ");

            hexField = new JTextField (6);
            hexField.setText (hexCode1 + hexCode2 + hexCode3);
            hexField.setEditable (false);

            //Size 3 allows for 2 characters to be better seen.
            rField = new JTextField (3);
            rField.setText (rValue + "");
            rField.setEditable (false);
            gField = new JTextField (3);
            gField.setText (gValue + "");
            gField.setEditable (false);
            bField = new JTextField (3);
            bField.setText (bValue +"");
            bField.setEditable (false);

            //Sets the sample textfields up with the appropriate text and colors.
            sampleTextFieldRGB = new JTextField (20);
            sampleTextFieldRGB.setBackground (new Color (255,255,255));
            sampleTextFieldRGB.setForeground (newColor);
            Color backcolor = sampleTextFieldRGB.getBackground ();
            String backColorRGB = "(" + backcolor.getRed () + "," +
                                        backcolor.getGreen () + "," +
                                        backcolor.getBlue () + ")";

            Color textcolor = sampleTextFieldRGB.getForeground ();
            String textColorRGB = "(" + textcolor.getRed () + "," +
                                        textcolor.getGreen () + "," +
                                        textcolor.getBlue () + ")";
            sampleTextFieldRGB.setText ("Background: " + backColorRGB +
        				" Text: " + textColorRGB);
            sampleTextFieldRGB.setEditable (false);

            sampleTextFieldHex = new JTextField (20);
            sampleTextFieldHex.setBackground (new Color (255,255,255));
            sampleTextFieldHex.setForeground (newColor);
            String backColorHex = rgbToHex (backcolor.getRed ()) +
        			  rgbToHex (backcolor.getGreen ()) +
                        	  rgbToHex (backcolor.getBlue ());

            String textColorHex = rgbToHex (textcolor.getRed ()) +
        			  rgbToHex (textcolor.getGreen ()) +
                        	  rgbToHex (textcolor.getBlue ());
            sampleTextFieldHex.setText ("Background: " + backColorHex +
					 " Text: " + textColorHex);
            sampleTextFieldHex.setEditable (false);

            //Creates the Sliders to be used to mainpulate the colors.
            //Adds a listener to each of the Sliders and states what is to be 
            //done when the state of the Sliders is changed. Since I 
            //incorporated Sliders and Buttons, I chose to code the 
            //ChangeEvent up here.
            redLabel = new JLabel ("Red");
            redBar = new JSlider (JSlider.HORIZONTAL, 0, 255, 0);
            redBar.setMinorTickSpacing (16);
            redBar.setMajorTickSpacing (48);
            redBar.setPaintTicks (true);

            redBar.addChangeListener ((ChangeEvent e) -> {
                JSlider args = (JSlider) e.getSource ();
                rField.setText (args.getValue () + "");
                rValue = Integer.parseInt (rField.getText ());
                //Regardless of which Slider is changed, all values are required
                //for a constantly updated color as the Slider moves.
                newColor = new Color (rValue, gValue, bValue);

                buttonPanel.setBackground (newColor);
                centerPanel.setBackground (newColor);
                textPanel.setBackground (newColor);
                textPanel1.setBackground (newColor);
                textPanel2.setBackground (newColor);
                centerNorthPanel.setBackground (newColor);
                centerSouthPanel.setBackground (newColor);
                redPanel.setBackground (newColor);
                greenPanel.setBackground (newColor);
                bluePanel.setBackground (newColor);
                redPanel1.setBackground (newColor);
                redPanel2.setBackground (newColor);
                greenPanel1.setBackground (newColor);
                greenPanel2.setBackground (newColor);
                bluePanel1.setBackground (newColor);
                bluePanel2.setBackground (newColor);
                webColorPanel.setBackground (newColor);
                hexRGBPanel.setBackground (newColor);
                webPanel.setBackground (newColor);
                colorPanel.setBackground (newColor);
                hexPanel.setBackground (newColor);
                rgbPanel.setBackground (newColor);

                //Sends the correct values to the correct methods.
                //Set the correct fields to the correct values.
                hexCode1 = rgbToHex (rValue);
                hexField.setText (hexCode1 + hexCode2 + hexCode3);
                webSafeLabel.setText (webSafeColors (rValue));
                colorNameLabel.setText (colorName (hexField.getText ()));
            });//END redBar.addChangeListener ((ChangeEvent e)

            greenLabel = new JLabel ("Green");
            greenBar = new JSlider (JSlider.HORIZONTAL, 0, 255, 0);
            greenBar.setMinorTickSpacing (16);
            greenBar.setMajorTickSpacing (48);
            greenBar.setPaintTicks (true);
            greenBar.addChangeListener ((ChangeEvent e) -> {
                JSlider args = (JSlider) e.getSource ();
                gField.setText (args.getValue () + "");
                gValue = Integer.parseInt (gField.getText ());
                newColor = new Color (rValue, gValue, bValue);

                buttonPanel.setBackground (newColor);
                centerPanel.setBackground (newColor);
                textPanel.setBackground (newColor);
                textPanel1.setBackground (newColor);
                textPanel2.setBackground (newColor);
                centerNorthPanel.setBackground (newColor);
                centerSouthPanel.setBackground (newColor);
                redPanel.setBackground (newColor);
                greenPanel.setBackground (newColor);
                bluePanel.setBackground (newColor);
                redPanel1.setBackground (newColor);
                redPanel2.setBackground (newColor);
                greenPanel1.setBackground (newColor);
                greenPanel2.setBackground (newColor);
                bluePanel1.setBackground (newColor);
                bluePanel2.setBackground (newColor);
                webColorPanel.setBackground (newColor);
                hexRGBPanel.setBackground (newColor);
                webPanel.setBackground (newColor);
                colorPanel.setBackground (newColor);
                hexPanel.setBackground (newColor);
                rgbPanel.setBackground (newColor);

                hexCode2 = rgbToHex (gValue);
                hexField.setText (hexCode1 + hexCode2 + hexCode3);
                webSafeLabel.setText (webSafeColors (gValue));
                colorNameLabel.setText (colorName (hexField.getText ()));
            });//END greenBar.addChangeListener ((ChangeEvent e)

            blueLabel = new JLabel ("Blue");
            blueBar = new JSlider (JSlider.HORIZONTAL, 0, 255, 0);
            blueBar.setMinorTickSpacing (16);
            blueBar.setMajorTickSpacing (48);
            blueBar.setPaintTicks (true);
            blueBar.addChangeListener ((ChangeEvent e) -> {
                JSlider args = (JSlider) e.getSource ();
                bField.setText (args.getValue () + "");
                bValue = Integer.parseInt (bField.getText ());
                newColor = new Color (rValue, gValue, bValue);

                buttonPanel.setBackground (newColor);
                centerPanel.setBackground (newColor);
                textPanel.setBackground (newColor);
                textPanel1.setBackground (newColor);
                textPanel2.setBackground (newColor);
                centerNorthPanel.setBackground (newColor);
                centerSouthPanel.setBackground (newColor);
                redPanel.setBackground (newColor);
                greenPanel.setBackground (newColor);
                bluePanel.setBackground (newColor);
                redPanel1.setBackground (newColor);
                redPanel2.setBackground (newColor);
                greenPanel1.setBackground (newColor);
                greenPanel2.setBackground (newColor);
                bluePanel1.setBackground (newColor);
                bluePanel2.setBackground (newColor);
                webColorPanel.setBackground (newColor);
                hexRGBPanel.setBackground (newColor);
                webPanel.setBackground (newColor);
                colorPanel.setBackground (newColor);
                hexPanel.setBackground (newColor);
                rgbPanel.setBackground (newColor);

                hexCode3 = rgbToHex (bValue);
                hexField.setText (hexCode1 + hexCode2 + hexCode3);
                webSafeLabel.setText (webSafeColors (bValue));
                colorNameLabel.setText (colorName (hexField.getText ()));
            });//END blueBar.addChangeListener ((ChangeEvent e)

		//Allows all 16,581,375 color combinations to be accessed.
            basicColorMenuItem.addActionListener ((ActionEvent e) -> {
                redBar.setMinorTickSpacing (16);
                redBar.setMajorTickSpacing (48);
                redBar.setSnapToTicks (false);
                greenBar.setMinorTickSpacing (16);
                greenBar.setMajorTickSpacing (48);
                greenBar.setSnapToTicks (false);
                blueBar.setMinorTickSpacing (16);
                blueBar.setMajorTickSpacing (48);
                blueBar.setSnapToTicks (false);
            });//END basicColorMenuItem.addActionListener ((ActionEvent e)

            //Allows only Websafe colors to be accessed.
            //Websafe is explained later in the code.
            webSafeColorMenuItem.addActionListener (
            (ActionEvent e) -> {
                redBar.setMinorTickSpacing (0);
                redBar.setMajorTickSpacing (51);
                redBar.setSnapToTicks (true);
                greenBar.setMinorTickSpacing (0);
                greenBar.setMajorTickSpacing (51);
                greenBar.setSnapToTicks (true);
                blueBar.setMinorTickSpacing (0);
                blueBar.setMajorTickSpacing (51);
                blueBar.setSnapToTicks (true);
            });//END webSafeColorMenuItem.addActionListener ((ActionEvent e)

            copyrightMenuItem.addActionListener ((ActionEvent e) -> {
                JOptionPane.showMessageDialog (this, "Color Chooser Application"
                    + "\nCopyright 2014	© Celena Williams\n\n" + 
                      "ALL RIGHTS RESERVED\n" + "celena.c.williams@gmail.com", 
                      "Copyright", JOptionPane.INFORMATION_MESSAGE);
            });//END copyrightMenuItem.addActionListener ((ActionEvent e)

            purposeMenuItem.addActionListener ((ActionEvent e) -> {
                JOptionPane.showMessageDialog (this,  "This program was " +
                "designed with the\nintent to make designing websites" +
                "\nmuch simpler, and to help avoid\nwebsites which cannot be " +
                "read.", "Purpose", JOptionPane.INFORMATION_MESSAGE);
            });//END purposeMenuItem.addActionListener ((ActionEvent e)

            usageMenuItem.addActionListener ((ActionEvent e) -> {
                JOptionPane.showMessageDialog (null, "To Use:\nColors are " +
                "consisted of three values, red, green, and blue.\nTo change " +
                "the color, slide one slider at a time until you get\nthe " +
                "color you desire. Then click either the Background\nor Text " +
                "button to preview your choices. Once satisfied, you\ncan " +
                "write down the RGB code and/or the hexidecimal code. \nAt " +
                "one time, web browsers could only perceive 256 colors,\n" +
                "known as websafe colors. However, modern browsers can\n" +
                "perceive the whole spectrum of over 16 million colors. It is" +
                "\nstill ideal, though, to try to use web safe colors.",
                "How to Use", JOptionPane.INFORMATION_MESSAGE);
            });//END usageMenuItem.addActionListener ((ActionEvent e)

            //Finishes adding content to the window.
            buttonPanel.add (backgroundButton);
            buttonPanel.add (textButton);
            redPanel1.add (redLabel);
            redPanel2.add (redBar);
            greenPanel1.add (greenLabel);
            greenPanel2.add (greenBar);
            bluePanel1.add (blueLabel);
            bluePanel2.add (blueBar);
            webPanel.add (webSafeLabel);
            colorPanel.add (colorNameLabel);
            hexPanel.add (hexLabel);
            hexPanel.add (hexField);
            rgbPanel.add (rgbLabel);
            rgbPanel.add (rField);
            rgbPanel.add (gField);
            rgbPanel.add (bField);
            textPanel1.add (sampleTextFieldHex);
            textPanel2.add (sampleTextFieldRGB);

            setSize (300, 450);
            setVisible (true);
	}//END public ColorChooserApplication ()

	//This method converts the RGB values to Hex values.
	public final String rgbToHex (int value) {
            String hex = "";

            //Divides the RGB value by 16.
            //Stores the integer value of that dividend.
            //Stores the decimal value of that dividend.
            //Multiples the decimal value by 16.
            double val = value / 16.0;
            int integer = value / 16;
            double dec = val - integer;
            int decimal = (int) (dec * 16);

            //To avoid recursion (since I already have the second number) I
            //included the second hex number. Recursion would have still been
            //the same amount of lines.
            if (0 == integer)
                hex += "0";
            if (1 == integer)
                hex += "1";
            if (2 == integer)
                hex += "2";
            if (3 == integer)
                hex += "3";
            if (4 == integer)
                hex += "4";
            if (5 == integer)
                hex += "5";
            if (6 == integer)
                hex += "6";
            if (7 == integer)
                hex += "7";
            if (8 == integer)
                hex += "8";
            if (9 == integer)
                hex += "9";
            if (10 == integer)
                hex += "A";
            if (11 == integer)
                hex += "B";
            if (12 == integer)
                hex += "C";
            if (13 == integer)
                hex += "D";
            if (14 == integer)
                hex += "E";
            if (15 == integer)
                hex += "F";


            if (0 == decimal)
                hex += "0";
            if (1 == decimal)
                hex += "1";
            if (2 == decimal)
                hex += "2";
            if (3 == decimal)
                hex += "3";
            if (4 == decimal)
                hex += "4";
            if (5 == decimal)
                hex += "5";
            if (6 == decimal)
                hex += "6";
            if (7 == decimal)
                hex += "7";
            if (8 == decimal)
                hex += "8";
            if (9 == decimal)
                hex += "9";
            if (10 == decimal)
                hex += "A";
            if (11 == decimal)
                hex += "B";
            if (12 == decimal)
                hex += "C";
            if (13 == decimal)
                hex += "D";
            if (14 == decimal)
                hex += "E";
            if (15 == decimal)
                hex += "F";

            return hex;
	}//END public final String rgbToHex (int value)

	//This method states if the color is websafe.
	//Websafe refers to when old browsers could only handle
	//255 colors TOTAL, not 255 for EACH red, green, and blue.
	//In recent years, we don't have to worry about websafe colors,
	//but it is good programming to make sure you do know if your
	//colors are websafe or not.
	public final String webSafeColors (int code) {
            String webSafe = " Non Websafe  ";

            if (0 == code || 51 == code || 102 == code || 153 == code ||
                204 == code || 255 == code)
                webSafe = "    Websafe   ";

            return webSafe;
	}//END public final String webSafeColors (int code)

	//This method assigns the predetermined color name in HTML.
	//In coding with HTML and CSS, you can use these names instead
	//of RGB or Hex values.
	public final String colorName (String code) {
            String colorName = "";

            if ("F0F8FF".equals (code))
                colorName = "Alice Blue";
            if ("FAEBD7".equals (code))
                colorName = "Antique White";
            if ("00FFFF".equals (code))
                colorName = "Aqua";
            if ("7FFFD4".equals (code))
                colorName = "Aquamarine";
            if ("F0FFFF".equals (code))
                colorName = "Azure";
            if ("F5F5DC".equals (code))
                colorName = "Beige";
            if ("FFE4C4".equals (code))
                colorName = "Bisque";
            if ("000000".equals (code))
                colorName = "Black";
            if ("FFEDCD".equals (code))
                colorName = "Blanched Almond";
            if ("0000FF".equals (code))
                colorName = "Blue";
            if ("8A2BE2".equals (code))
                colorName = "Blue Violet";
            if ("A52A2A".equals (code))
                colorName = "Brown";
            if ("DEB887".equals (code))
                colorName = "Burly Wood";
            if ("5F9EA0".equals (code))
                colorName = "Cadet Blue";
            if ("7FFF00".equals (code))
                colorName = "Charteuse";
            if ("D2691E".equals (code))
                colorName = "Chocolate";
            if ("FF7F50".equals (code))
                colorName = "Coral";
            if ("6495ED".equals (code))
                colorName = "Cornflower Blue";
            if ("FFF8DC".equals (code))
                colorName = "Cornsilk";
            if ("DC143C".equals (code))
                colorName = "Crimson";
            if ("00FFFF".equals (code))
                colorName = "Cyan";
            if ("00008B".equals (code))
                colorName = "Dark Blue";
            if ("008B8B".equals (code))
                colorName = "Dark Cyan";
            if ("B8860B".equals (code))
                colorName = "Dark Golden Rod";
            if ("A9A9A9".equals (code))
                colorName = "Dark Gray";
            if ("006400".equals (code))
                colorName = "Dark Green";
            if ("BDB76B".equals (code))
                colorName = "Dark Khaki";
            if ("8B008B".equals (code))
                colorName = "Dark Magenta";
            if ("556B2F".equals (code))
                colorName = "Dark Olive Green";
            if ("FF8C00".equals (code))
                colorName = "Dark Orange";
            if ("9932CC".equals (code))
                colorName = "Dark Orchid";
            if ("8B0000".equals (code))
                colorName = "Dark Red";
            if ("E9967A".equals (code))
                colorName = "Dark Salmon";
            if ("8FBC8F".equals (code))
                colorName = "Dark Sea Green";
            if ("483D8B".equals (code))
                colorName = "Dark Slate Blue";
            if ("2F4F4F".equals (code))
                colorName = "Dark Slate Gray";
            if ("00CED1".equals (code))
                colorName = "Dark Turquoise";
            if ("9400D3".equals (code))
                colorName = "Dark Violet";
            if ("FF1493".equals (code))
                colorName = "Deep Pink";
            if ("00BFFF".equals (code))
                colorName = "Deep Sky Blue";
            if ("696969".equals (code))
                colorName = "Dim Gray";
            if ("1E90FF".equals (code))
                colorName = "Dodger Blue";
            if ("B22222".equals (code))
                colorName = "Fire Brick";
            if ("FFFAF0".equals (code))
                colorName = "Floral White";
            if ("228B22".equals (code))
                colorName = "Forest Green";
            if ("FF00FF".equals (code))
                colorName = "Fuchsia";
            if ("DCDCDC".equals (code))
                colorName = "Gainsboro";
            if ("F8F8FF".equals (code))
                colorName = "Ghost White";
            if ("FFD700".equals (code))
                colorName = "Gold";
            if ("DAA520".equals (code))
                colorName = "Golden Rod";
            if ("808080".equals (code))
                colorName = "Gray";
            if ("008000".equals (code))
                colorName = "Green";
            if ("ADFF2F".equals (code))
                colorName = "Green Yellow";
            if ("F0FFF0".equals (code))
                colorName = "Honey Dew";
            if ("FF69B4".equals (code))
                colorName = "Hot Pink";
            if ("CD5C5C".equals (code))
                colorName = "Indian Red";
            if ("4B0082".equals (code))
                colorName = "Indigo";
            if ("FFFFF0".equals (code))
                colorName = "Ivory";
            if ("F0E68C".equals (code))
                colorName = "Khaki";
            if ("E6E6FA".equals (code))
                colorName = "Lavender";
            if ("FFF0F5".equals (code))
                colorName = "Lavender Blush";
            if ("7CFC00".equals (code))
                colorName = "Lawn Green";
            if ("FFFACD".equals (code))
                colorName = "Lemon Chiffon";
            if ("ADD8E6".equals (code))
                colorName = "Light Blue";
            if ("F08080".equals (code))
                colorName = "Light Coral";
            if ("E0FFFF".equals (code))
                colorName = "Light Cyan";
            if ("FAFAD2".equals (code))
                colorName = "Light Golden Rod";
            if ("D3D3D3".equals (code))
                colorName = "Light Gray";
            if ("90EE90".equals (code))
                colorName = "Light Green";
            if ("FFB6C1".equals (code))
                colorName = "Light Pink";
            if ("FFA07A".equals (code))
                colorName = "Light Salmon";
            if ("20B2AA".equals (code))
                colorName = "Light Sea Green";
            if ("87CEFA".equals (code))
                colorName = "Light Sky Blue";
            if ("778899".equals (code))
                colorName = "Light Slate Gray";
            if ("B0C4DE".equals (code))
                colorName = "Light Steel Blue";
            if ("FFFFE0".equals (code))
                colorName = "Light Yellow";
            if ("00FF00".equals (code))
                colorName = "Lime";
            if ("32CD32".equals (code))
                colorName = "Lime Green";
            if ("FAF0E6".equals (code))
                colorName = "Linen";
            if ("FF00FF".equals (code))
                colorName = "Magenta";
            if ("800000".equals (code))
                colorName = "Maroon";
            if ("66CDAA".equals (code))
                colorName = "Medium Aquamarine";
            if ("0000CD".equals (code))
                colorName = "Medium Blue";
            if ("BA55D3".equals (code))
                colorName = "Medium Orchid";
            if ("9370DB".equals (code))
                colorName = "Medium Purple";
            if ("3CD371".equals (code))
                colorName = "Medium Sea Green";
            if ("7B68EE".equals (code))
                colorName = "Medium Slate Blue";
            if ("00FA9A".equals (code))
                colorName = "Medium Spring Green";
            if ("48D1CC".equals (code))
                colorName = "Medium Turquoise";
            if ("C71585".equals (code))
                colorName = "Medium Violet Red";
            if ("191970".equals (code))
                colorName = "Midnight Blue";
            if ("F5FFFA".equals (code))
                colorName = "Mint Cream";
            if ("FFE4E1".equals (code))
                colorName = "Misty Rose";
            if ("FFE485".equals (code))
                colorName = "Mocassin";
            if ("FFDEAD".equals (code))
                colorName = "Navajo White";
            if ("000080".equals (code))
                colorName = "Navy";
            if ("FDF5E6".equals (code))
                colorName = "Old Lace";
            if ("808000".equals (code))
                colorName = "Olive";
            if ("6B8E23".equals (code))
                colorName = "Olive Drab";
            if ("FFA500".equals (code))
                colorName = "Orange";
            if ("FF4500".equals (code))
                colorName = "Orange Red";
            if ("DA70D6".equals (code))
                colorName = "Orchid";
            if ("EEE8AA".equals (code))
                colorName = "Pale Golden Rod";
            if ("98FB98".equals (code))
                colorName = "Pale Green";
            if ("AFEEEE".equals (code))
                colorName = "Pale Turquoise";
            if ("DB7093".equals (code))
                colorName = "Pale Violet Red";
            if ("FFEFD5".equals (code))
                colorName = "Papaya Whip";
            if ("FFDAB9".equals (code))
                colorName = "Peach Puff";
            if ("CD853F".equals (code))
                colorName = "Peru";
            if ("FFC0CB".equals (code))
                colorName = "Pink";
            if ("DDA0DD".equals (code))
                colorName = "Plum";
            if ("B0E0E6".equals (code))
                colorName = "Powder Blue";
            if ("800080".equals (code))
                colorName = "Purple";
            if ("FF0000".equals (code))
                colorName = "Red";
            if ("BC8F8F".equals (code))
                colorName = "Rosy Brown";
            if ("4169E1".equals (code))
                colorName = "Royal Blue";
            if ("8B4513".equals (code))
                colorName = "Saddle Brownn";
            if ("FA8072".equals (code))
                colorName = "Salmon";
            if ("F4A460".equals (code))
                colorName = "Sandy Brown";
            if ("2E8B57".equals (code))
                colorName = "Sea Green";
            if ("FFF5EE".equals (code))
                colorName = "Sea Shell";
            if ("A0522D".equals (code))
                colorName = "Sienna";
            if ("C0C0C0".equals (code))
                colorName = "Silver";
            if ("87CEEB".equals (code))
                colorName = "Sky Blue";
            if ("6A5ACD".equals (code))
                colorName = "Slate Blue";
            if ("708090".equals (code))
                colorName = "Slate Gray";
            if ("FFFAFA".equals (code))
                colorName = "Snow";
            if ("00FF7F".equals (code))
                colorName = "Spring Green";
            if ("4682B4".equals (code))
                colorName = "Steel Blue";
            if ("D2B48C".equals (code))
                colorName = "Tan";
            if ("008080".equals (code))
                colorName = "Teal";
            if ("D8BFD8".equals (code))
                colorName = "Thistle";
            if ("FF6347".equals (code))
                colorName = "Tomato";
            if ("40E0D0".equals (code))
                colorName = "Turquoise";
            if ("EE82EE".equals (code))
                colorName = "Violet";
            if ("F5DEB3".equals (code))
                colorName = "Wheat";
            if ("FFFFFF".equals (code))
                colorName = "White";
            if ("F5F5F5".equals (code))
                colorName = "White Smoke";
            if ("FFFF00".equals (code))
                colorName = "Yellow";
            if ("9ACD32".equals (code))
                colorName = "Yellow Green";

            return colorName;
	}//END public final String colorName (String code)

	@Override
	public void actionPerformed (ActionEvent e) {
            String arg = e.getActionCommand ();

            //If the Background button is clicked, change the color of the
            //background and change the RGB and Hex values displayed.
            //The foreground is not changed, but the color values are gotten to
            //keep the values in the displayed text.
            if ("Background".equals (arg)) {
                sampleTextFieldRGB.setBackground (newColor);
                String backColorRGB = "(" + newColor.getRed () + "," +
                                            newColor.getGreen () + "," +
                                            newColor.getBlue () + ")";
                Color textcolorRGB = sampleTextFieldRGB.getForeground ();
                String textColorRGB = "(" + textcolorRGB.getRed () + "," +
                                            textcolorRGB.getGreen () + "," +
                                            textcolorRGB.getBlue () + ")";
                sampleTextFieldRGB.setText ("Background: " + backColorRGB +
                                            " Text: " + textColorRGB);

                sampleTextFieldHex.setBackground (newColor);
                String backColorHex = rgbToHex (newColor.getRed ()) +
				      rgbToHex (newColor.getGreen ()) +
				      rgbToHex (newColor.getBlue ());
                Color textcolorHex = sampleTextFieldHex.getForeground ();
                String textColorHex = rgbToHex (textcolorHex.getRed ()) +
                        	      rgbToHex (textcolorHex.getGreen ()) +
                        	      rgbToHex (textcolorHex.getBlue ());
		sampleTextFieldHex.setText ("Background: " + backColorHex +
					    " Text: " + textColorHex);
            }//END if ("Background".equals (arg))

            //If the Text button is clicked, change the color of the
            //text and change the RGB and Hex values displayed.
            //The background is not changed, but the color values are gotten to
            //keep the values in the displayed text.
            if ("Text".equals (arg)) {
                sampleTextFieldRGB.setForeground (newColor);
                String textColorRGB = "(" + newColor.getRed () + "," +
                                            newColor.getGreen () + "," +
                                            newColor.getBlue () + ")";
                Color backcolorRGB = sampleTextFieldRGB.getBackground ();
                String backColorRGB = "(" + backcolorRGB.getRed () + "," +
                                            backcolorRGB.getGreen () + "," +
                                            backcolorRGB.getBlue () + ")";
                sampleTextFieldRGB.setText ("Background: " + backColorRGB +
                                            " Text: " + textColorRGB);

                sampleTextFieldHex.setForeground (newColor);
                String textColorHex = rgbToHex (newColor.getRed ()) +
                                      rgbToHex (newColor.getGreen ()) +
                                      rgbToHex (newColor.getBlue ());
                Color backcolorHex = sampleTextFieldHex.getBackground ();
                String backColorHex = rgbToHex (backcolorHex.getRed ()) +
                                      rgbToHex (backcolorHex.getGreen ()) +
                                      rgbToHex (backcolorHex.getBlue ());
                sampleTextFieldHex.setText ("Background: " + backColorHex +
                                            " Text: " + textColorHex);
            }//END if ("Text".equals (arg))
	}//END public void actionPerformed (ActionEvent e)
}//END public class ColorChooserApplication
