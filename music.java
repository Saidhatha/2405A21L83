public class music {
    class Song {
        String title;
        String genre;
        String artist;
        double duration;
        Song next;
        Song(String title, String genre, String artist, double duration) {
            this.title = title;
            this.genre = genre;
            this.artist = artist;
            this.duration = duration;
            this.next = null;
        }
    }
    private Song head;
    public void addSong(String title, String genre, String artist, double duration) {
        Song newSong = new Song(title, genre, artist, duration);
        if (head == null) {
            head = newSong;
            return;
        }
        Song current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newSong;
    }
    public void deleteSong(String title) {
        if (head == null) {
            System.out.println("Playlist is empty");
            return;
        }
        if (head.title.equalsIgnoreCase(title)) {
            head = head.next;
            System.out.println("Song deleted");
            return;
        }
        Song current = head;
        while (current.next != null && 
               !current.next.title.equalsIgnoreCase(title)) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Song not found");
        } else {
            current.next = current.next.next;
            System.out.println("Song deleted");
        }
    }
    public void playNext() {
        if (head == null) {
            System.out.println("No songs to play");
            return;
        }
        System.out.println("Now playing: " + head.title);
        head = head.next;
    }
    public void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist is empty");
            return;
        }
        Song current = head;
        while (current != null) {
            System.out.println(
                current.title + " | " +
                current.genre + " | " +
                current.artist + " | " +
                current.duration + " mins"
            );
            current = current.next;
        }
    }
    public static void main(String[] args) {
        music playlist = new music();
        playlist.addSong("Shape of You", "Pop", "Ed Sheeran", 4.2);
        playlist.addSong("Blinding Lights", "Synthwave", "The Weeknd", 3.5);
        playlist.addSong("Believer", "Rock", "Imagine Dragons", 3.3);
        System.out.println("Playlist:");
        playlist.displayPlaylist();
        System.out.println("\nPlaying next song:");
        playlist.playNext();
        System.out.println("\nPlaylist after playing one song:");
        playlist.displayPlaylist();
        System.out.println("\nDeleting a song:");
        playlist.deleteSong("Believer");
        System.out.println("\nFinal Playlist:");
        playlist.displayPlaylist();
    }
}
