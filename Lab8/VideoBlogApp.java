import java.util.HashSet;
import java.util.Set;

public class VideoBlogApp {

    public static void main(String[] args) {
        // Створення коментарів
        Comment comment1 = new Comment("Great video!", 11, 1);
        Comment comment2 = new Comment("Nice content!", 18, 2);

        // Створення відео
        Set<Comment> video1Comments = new HashSet<>();
        video1Comments.add(comment1);
        Video video1 = new Video("Introduction to Java", "https://example.com/java", 900, 20, 5, video1Comments);

        Set<Comment> video2Comments = new HashSet<>();
        video2Comments.add(comment2);
        Video video2 = new Video("Python Basics", "https://example.com/python", 900, 25, 8, video2Comments);

        // Створення відеоблогу
        Set<Video> videos = new HashSet<>();
        videos.add(video1);
        videos.add(video2);
        VideoBlog videoBlog = new VideoBlog("TechExplained", videos);

        // Виклики методів та виведення результатів
        System.out.println("Total views across all videos: " + videoBlog.getTotalViews());

        if (videoBlog.hasCommentWithMoreLikes()) {
            System.out.println("There is a comment with more likes than the video it belongs to.");
        } else {
            System.out.println("No comments have more likes than the videos they belong to.");
        }

        Set<Video> videosWithMostDislikes = videoBlog.getVideosWithMostDislikes();
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