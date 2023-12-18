import java.util.HashSet;
import java.util.Set;

class VideoBlog {
    private String blogger;
    private Set<Video> videos;

    public VideoBlog(String blogger, Set<Video> videos) {
        this.blogger = blogger;
        this.videos = videos;
    }

    public int getTotalViews() {
        int totalViews = 0;

        for (Video video : videos) {
            totalViews += video.getViews();
        }

        return totalViews;
    }

    public boolean hasCommentWithMoreLikes() {
        for (Video video : videos) {
            for (Comment comment : video.getComments()) {
                if (comment.getLikes() > video.getLikes()) {
                    return true;
                }
            }
        }

        return false;
    }

    public Set<Video> getVideosWithMostDislikes() {
        Set<Video> videosWithMostDislikes = new HashSet<>();
        int maxDislikes = Integer.MIN_VALUE;

        for (Video video : videos) {
            if (video.getDislikes() > maxDislikes) {
                maxDislikes = video.getDislikes();
                videosWithMostDislikes.clear();
                videosWithMostDislikes.add(video);
            } else if (video.getDislikes() == maxDislikes) {
                videosWithMostDislikes.add(video);
            }
        }

        return videosWithMostDislikes;
    }
}