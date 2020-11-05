
public class Song implements IComponent {
	public String songName;
	public String artist;
	public float speed = 1; // Default playback speed

	public Song(String songName, String artist ) {
		this.songName = songName;
		this.artist = artist; 
	}

	public String getName() {
		return songName;
	}

	public void setName(String songName) {
		this.songName = songName;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public float getSpeed() {
		return speed;
	}

	public void setPlaybackSpeed(float speed) {
		this.speed = speed;
	}
	
	public void play() {
		System.out.println("Playing: " + getName() +
				"\n Artist: " + getArtist() +
				"\n at Speed: " + getSpeed());
	}
	
}
