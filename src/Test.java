import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tests {
	@Test
	public void test() {
		Playlist test = new Playlist("Test");		
		Song testSong1 = new Song("About you", "XXYYXX");
		Song testSong2 = new Song("Motivation", "Clams Casino");	
		Song testSong3 = new Song("Computer Vision", "Oneohtrix Point Never");
		test.add(testSong1);
		test.add(testSong2);
		test.add(testSong3);
		float slowSpeed = 0.5f;
		test.setPlaybackSpeed(slowSpeed);
		test.remove(testSong2);
		assertEquals("Test", test.getName());
		
	}

}
