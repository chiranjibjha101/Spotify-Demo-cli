import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Album album1=new Album("RRR","M. M. Keeravani");
        album1.addSongToAlbum("Natu natu",5.55);
        album1.addSongToAlbum("Dosti",5.52);
        album1.addSongToAlbum("Janani",3.50);
        LinkedList<Songs> myPlayList=new LinkedList<>();
        album1.addToPlayListFromAlbum("Natu natu",myPlayList);
        album1.addToPlayListFromAlbum("Dosti",myPlayList);
        System.out.println(myPlayList.get(0));
        play(myPlayList);
    }

    public static void printMenu() {
        System.out.println("Select:");
        System.out.println("1.Play next song");
        System.out.println("2.Play prev song");
        System.out.println("3.Repeat Song");
        System.out.println("4.Print All Songs");
        System.out.println("5.Delete current Song");
        System.out.println("6.Exit");
    }
    public static void play(LinkedList<Songs> playList){
        ListIterator<Songs> itr=playList.listIterator();
        Scanner sc=new Scanner(System.in);
        boolean isForward =false;
        if(playList.size()>0){
            System.out.println("Playing :");
            System.out.println(itr.next());
            isForward=true;
        }
        else{
            System.out.println("Playlist is Empty");
        }
        boolean exit=false;
        while(!exit){
            printMenu();
            System.out.println("Enter your choice :");
            switch (sc.nextInt()){
                case 1:
                    if(isForward==false){
                        itr.next();
                        isForward=true;
                    }
                    if(itr.hasNext()){
                        System.out.println(itr.next());
                    }
                    else{
                        System.out.println("Playlist Ended");
                        isForward=false;
                    }
                    break;
                case 2:
                    if(isForward){
                        itr.previous();
                        isForward=false;
                    }
                    if(itr.hasPrevious()){
                        System.out.println(itr.previous());
                    }
                    else{
                        System.out.println("You are at the beginning");
                    }
                    break;

                case 3:
                    if(isForward){
                    if(itr.hasPrevious()){
                        System.out.println(itr.previous());
                        isForward=false;
                    }
                    }
                    else{
                        if(itr.hasNext()){
                            System.out.println(itr.next());
                            isForward=true;
                        }
                    }
                    break;
                case 4:
                    for(int i=0;i<playList.size();i++){
                        System.out.println(playList.get(i));
                    }
                    break;
                case 5:
                    //to be done
                    break;
                case 6:
                    exit=true;
                    break;
            }
        }
    }

}