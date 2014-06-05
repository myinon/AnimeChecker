/*
 * Anime Checker - Verify the integrity of your anime files
 * Copyright (C) 2014-2017  Yinon Michaeli
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

import javax.swing.SwingUtilities;


public class AnimeChecker {

	public static void main(String[] args) {
		// TODO Take into account command-line arguments
		//      like adding files or doing a console check.
		System.setProperty("apple.laf.useScreenMenuBar", "true");
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// Run application's main window
				// AnimeFrame anime = new AnimeFrame();
				// anime.setVisible(true);
			}
		});
	}

}
