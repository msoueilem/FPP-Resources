import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Prog8Test {

	@Test
	void test() {
        assertEquals(-21,Prog8.min(new int[]{2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22}));
	}

}
