import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Comment {
    private String text;
    private int likes;
    private int dislikes;

    public Comment(String text, int likes, int dislikes) {
        this.text = text;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }
}