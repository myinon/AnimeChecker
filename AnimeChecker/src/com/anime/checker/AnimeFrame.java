/*
 * Anime Checker - Verify the integrity of your anime files
 * Copyright (C) 2014-2018  Yinon Michaeli
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact by e-mail if you discover any bugs or if you have a suggestion
 * to myinon2005@hotmail.com
 */

package com.anime.checker;

import java.awt.*;
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 * The main window which will house all of the components of the
 * application, such as the files table and settings panel.
 * <br><br>
 * There is also a menu system to perform some operations
 * like changing the view and theme of the application.
 * 
 * @author Yinon Michaeli
 * @version 2.0
 */
public class AnimeFrame extends JFrame
implements ActionListener, AWTEventListener, FocusListener, MouseListener,
	MouseMotionListener, PropertyChangeListener, WindowFocusListener {
	
	public AnimeFrame() {
		// TODO: super(getResourceString("Window.Title"));
		// TODO: ShadowPopupFactory.install();
		UIManager.put("Button.defaultButtonFollowsFocus", Boolean.TRUE);
		
		String bm = System.getProperty("swing.boldMetal");
		if (bm != null && !bm.equals("") && bm.length() != 0) {
			if (bm.equals("true") || bm.equals("false"))
				UIManager.put("swing.boldMetal", Boolean.valueOf(bm));
			else
				UIManager.put("swing.boldMetal", Boolean.TRUE);
		} else if (UIManager.get("swing.boldMetal") == null) {
			UIManager.put("swing.boldMetal", Boolean.TRUE);
		}
		
		// TODO: initActions();
		
		//content = new CountryPanel();
		//content.setOpaque(true);
		// TODO: tcMenu = new TextComponentMenu();
		// TODO: sbMenu = new ScrollbarMenu();
		//menuListener = new MenuMouseListener(content.getStatusBar());
		
		setJMenuBar(new JMenuBar());
		// TODO: initMenuBar();
		// TODO: initThemeMenu();
		// TODO: initUIResources();
		
		setAutoRequestFocus(true);
		//setContentPane(content);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		addWindowFocusListener(this);
		
		/* TODO: URL url = getResource(getResourceString("Window.Icon"));
		if (url != null) {
			ImageIcon icon = new ImageIcon(url);
			setIconImages(Arrays.asList(
				icon.getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH),
				icon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH),
				icon.getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH)));
		}

		initTabs();
		
		getCommand("copy").setEnabled(false);
		getCommand("copy_part").setEnabled(false);
		getCommand("copy_flag").setEnabled(false);
		getCommand("showd").putValue(Action.SELECTED_KEY, Boolean.TRUE);
		getCommand("showt").putValue(Action.SELECTED_KEY, Boolean.TRUE);
		getCommand("showb").putValue(Action.SELECTED_KEY, Boolean.TRUE);
		
		if (IS_MAC) {
			final CountryFrame cf = this;
			Application.setAboutHandler(new AboutHandler() {
				@Override
				public void handleAbout(AboutEvent e) {
					cf.setState(JFrame.NORMAL);
					cf.showTabsDialog(0);
				}
			});
			Application.setQuitHandler(new QuitHandler() {
				@Override
				public void handleQuitRequestWith(QuitEvent e, QuitResponse response) {
					cf.exit();
					response.performQuit();
				}
			});
			Application.setQuitStrategy(QuitStrategy.SYSTEM_EXIT_0);
			Application.setDockIconImage(getIconImages().get(0));
			
			getRootPane().putClientProperty("apple.awt.brushMetalLook", Boolean.TRUE);
			getRootPane().putClientProperty("Window.shadow", Boolean.TRUE);
			
			JMenu help = getJMenuBar().getMenu(HELP_MENU);
			help.remove(help.getItemCount() - 1); // About
			
			getJMenuBar().remove(FILE_MENU);
		}
		
		JTable table = content.getTable();
		table.addFocusListener(this);

		pack();
		setLocationRelativeTo(null);
		Insets border = getInsets();
		setMinimumSize(new Dimension(
			160 + border.left + border.right,
			(int) ((table.getRowHeight() * 2.4)
				+ border.top + border.bottom)));*/
		
		Toolkit.getDefaultToolkit().addAWTEventListener(this, AWTEvent.MOUSE_EVENT_MASK);
		UIManager.addPropertyChangeListener(this);
		KeyboardFocusManager.getCurrentKeyboardFocusManager()
		.addPropertyChangeListener("permanentFocusOwner", this);
	}
	
	private Font getUnderlineFont() {
		Map<TextAttribute, Object> map = new HashMap<>(2);
		map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		return UIManager.getFont("Label.font").deriveFont(map);
	}
	
	// Performs application close logic
	void exit() {
		setVisible(false);
		// DO save logic in-between visibility and disposal
		dispose();
	}
	
	/*
	 * ActionListener
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
	
	/*
	 * AWTEventListener
	 */
	@Override
	public void eventDispatched(AWTEvent e) {
		if (e instanceof MouseEvent
		&& e.getID() >= MouseEvent.MOUSE_FIRST && e.getID() <= MouseEvent.MOUSE_LAST) {
			// TODO: processMouseEvent(e);
		}
	}
	
	/*
	 * FocusListener
	 */
	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub

	}
	
	/*
	 * MouseListener
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void mousePressed(MouseEvent e) {}
	
	@Override
	public void mouseReleased(MouseEvent e) {}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void mouseExited(MouseEvent e) {}
	
	/*
	 * MouseMotionListener
	 */
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void mouseDragged(MouseEvent e) {}
	
	/*
	 * PropertyChangeListener
	 */
	@Override
	public void propertyChange(PropertyChangeEvent e) {
		// TODO Auto-generated method stub

	}
	
	/*
	 * WindowFocusListener
	 */
	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void windowLostFocus(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}
	
	private class MenuAction extends AbstractAction {
		static final long serialVersionUID = 7628269108519804090L;
		
		@Override
		public void actionPerformed(ActionEvent e) {
			AnimeFrame.this.actionPerformed(e);
		}
	}
	
	/* TODO: private static class MenuMouseListener extends MouseAdapter implements MenuListener {
		private String menuTip;
		String statusText;
		StatusBar statusBar;
		
		MenuMouseListener(StatusBar sb) {
			statusBar = sb;
		}
		
		@Override
		public void mouseEntered(final MouseEvent e) {
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					if (e.getSource() instanceof JMenuItem) {
						JMenuItem mi = (JMenuItem) e.getSource();
						if (mi instanceof JMenu) {
							JMenu menu = (JMenu) mi;
							if (!menu.isSelected())
								return;
						}
						
						if (statusText == null)
							statusText = statusBar.getStatus();
						
						String tip = (String) mi.getClientProperty("ToolTip");
						if (tip != null)
							statusBar.setStatus(tip);
					} else {
						JSeparator sep = (JSeparator) e.getSource();
						if (statusText == null)
							statusText = statusBar.getStatus();
						
						String tip = (String) sep.getClientProperty("ToolTip");
						if (tip != null)
							statusBar.setStatus(tip);
					}
				}
			});
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			if ((menuTip != null) && (((Component) e.getSource()).getParent() instanceof JPopupMenu)) {
				statusBar.setStatus(menuTip);
			}
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			if ((statusText != null) && !(e.getSource() instanceof JMenu)) {
				if (e.getComponent().isEnabled()) {
					statusBar.setStatus(statusText);
					statusText = null;
					menuTip = null;
				}
			}
		}
		
		@Override
		public void menuSelected(MenuEvent e) {
			ToolTipManager.sharedInstance().setEnabled(false);
			JMenu menu = (JMenu) e.getSource();
			if (statusText == null)
				statusText = statusBar.getStatus();
			
			menuTip = (String) menu.getClientProperty("ToolTip");
			if (menuTip != null)
				statusBar.setStatus(menuTip);
		}
		
		@Override
		public void menuDeselected(MenuEvent e) {
			ToolTipManager.sharedInstance().setEnabled(true);
			if (statusText != null) {
				statusBar.setStatus(statusText);
				statusText = null;
				menuTip = null;
			}
		}
		
		@Override
		public void menuCanceled(MenuEvent e) {
			ToolTipManager.sharedInstance().setEnabled(true);
			if (statusText != null) {
				statusBar.setStatus(statusText);
				statusText = null;
				menuTip = null;
			}
		}
	}*/

}
