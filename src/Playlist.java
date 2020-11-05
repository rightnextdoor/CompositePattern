import java.util.ArrayList;

public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList();
	

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

  // Your code goes here!
	public void play() {
		System.out.println("------------");	
		System.out.println("Playlist name: " + getName());
		for (IComponent play: playlist) {
			play.play();
		}
		System.out.println("------------");					
		
	}
	
	
	public void setPlaybackSpeed(float speed) {
		for (IComponent newSpeed: this.playlist) {
			newSpeed.setPlaybackSpeed(speed);
		}
	}
	
	public String getName(){
		return playlistName;
	}
	
	public void setName(String playlistName) {
		this.playlistName = playlistName;
	}
	
	public void add(IComponent component) {
		System.out.println("Added song: " + component.getName());
		playlist.add(component);
	}
	
	public void remove(IComponent component) {
		System.out.println("Remove song: " + component.getName());
		playlist.remove(component);
	}

}