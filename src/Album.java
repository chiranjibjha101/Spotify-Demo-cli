import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private List<Songs> song;
    private String artist;

    public Album(String name, String artist) {
        this.name = name;
        song = new ArrayList<>();
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public List<Songs> getSong() {
        return song;
    }

    public void setSong(List<Songs> song) {
        this.song = song;
    }


    public void addSongToAlbum(String title,double duration){
        Songs s=new Songs(title,duration);

        if(findSong(s.getTitle())==true){
            System.out.println("Song is present in album");
        }
        else{
            song.add(s);
            System.out.println("Song is Added");
        }
    }

    private boolean findSong(String title) {
        for(Songs S:song){
            if(title.equals(S.getTitle())){
                return true;
            }
        }
        return false;
    }

    public void addToPlayListFromAlbum(String title , LinkedList<Songs> playList ){
            for(Songs S:song){
                if(title.equals(S.getTitle())) {
                    playList.add(S);
                    System.out.println("Song is Added to Playlist");
                    return;
                }
            }
             System.out.println("Song not found");
        }

    public void addToPlayListFromAlbum(int trackNo,LinkedList<Songs> playList){
        int index=trackNo-1;
        if(index>=0 && index<song.size()){
            playList.add(song.get(index));
        }
        else {
            System.out.println("Invalid track number");
        }

    }
}
