package org.skriptlang.skript.test.tests.localization;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ch.njol.skript.util.Utils;

public class UtilsPlurals {

	/**
	 * Testing method Utils.getEnglishPlural
	 */
	@Test
	public void testPlural() {
		String[][] strings = {
				{"house", "houses"},
				{"cookie", "cookies"},
				{"creeper", "creepers"},
				{"cactus", "cacti"},
				{"rose", "roses"},
				{"dye", "dyes"},
				{"name", "names"},
				{"ingot", "ingots"},
				{"derp", "derps"},
				{"sheep", "sheep"},
				{"choir", "choirs"},
				{"man", "men"},
				{"child", "children"},
				{"hoe", "hoes"},
				{"toe", "toes"},
				{"hero", "heroes"},
				{"kidney", "kidneys"},
				{"anatomy", "anatomies"},
				{"axe", "axes"},
				{"elf", "elfs"},
				{"knife", "knives"},
				{"shelf", "shelfs"},
		};
		for (String[] s : strings) {
			assertEquals(s[1], Utils.toEnglishPlural(s[0]));
			assertEquals(s[0], Utils.getEnglishPlural(s[1]).getFirst());
		}
	}

}
