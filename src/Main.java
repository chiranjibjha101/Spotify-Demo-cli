import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Album album1=new Album("RRR","M. M. Keeravani");
        album1.addSongToAlbum("Natu natu",5.55);
        album1.addSongToAlbum("Dosti",5.5);
        LinkedList<Songs> myPlayList=new LinkedList<>();
        album1.addToPlayListFromAlbum("Natu natu",myPlayList);
    }
}