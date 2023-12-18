import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VideoBlogApp {

    public static void main(String[] args) {
        Comment comment1 = new Comment("Great video!", 10, 2);
        Comment comment2 = new Comment("Nice content!", 15, 3);

        List<Comment> video1Comments = new ArrayList<>();
        video1Comments.add(comment1);
        Video video1 = new Video("Introduction to Java", "https://example.com/java", 1000, 20, 5, video1Comments);

        List<Comment> video2Comments = new ArrayList<>();
        video2Comments.add(comment2);
        Video video2 = new Video("Python Basics", "https://example.com/python", 800, 25, 8, video2Comments);

        List<Video> videos = new ArrayList<>();
        videos.add(video1);
        videos.add(video2);
        VideoBlog videoBlog = new VideoBlog("TechExplained", videos);

        System.out.println("Total views across all videos: " + videoBlog.getTotalViews());

        if (videoBlog.hasCommentWithMoreLikes()) {
            System.out.println("There is a comment with more likes than the video it belongs to.");
        } else {
            System.out.println("No comments have more likes than the videos they belong to.");
        }

        List<Video> videosWithMostDislikes = videoBlog.getVideosWithMostDislikes();
        if (!videosWithMostDislikes.isEmpty()) {
            System.out.println("Videos with the most dislikes:");
            for (Video video : videosWithMostDislikes) {
                System.out.println(video.getTitle());
            }
        } else {
            System.out.println("No videos with dislikes.");
        }
    }
}