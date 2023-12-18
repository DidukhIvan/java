import java.util.HashSet;
import java.util.Set;

class Video {
    private String title;
    private String url;
    private int views;
    private int likes;
    private int dislikes;
    private Set<Comment> comments;

    public Video(String title, String url, int views, int likes, int dislikes, Set<Comment> comments) {
        this.title = title;
        this.url = url;
        this.views = views;
        this.likes = likes;
        this.dislikes = dislikes;
        this.comments = comments;
    }

    public String getTitle() {
        return title;
    }

    public int getViews() {
        return views;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public Set<Comment> getComments() {
        return comments;
    }
}