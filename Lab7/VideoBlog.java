import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class VideoBlog {
    private String blogger;
    private List<Video> videos;

    public VideoBlog(String blogger, List<Video> videos) {
        this.blogger = blogger;
        this.videos = videos;
    }

    public int getTotalViews() {
        int totalViews = 0;

        Iterator<Video> videoIterator = videos.iterator();
        while (videoIterator.hasNext()) {
            Video video = videoIterator.next();
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

    public List<Video> getVideosWithMostDislikes() {
        List<Video> videosWithMostDislikes = new ArrayList<>();
        int maxDislikes = Integer.MIN_VALUE;

        Iterator<Video> videoIterator = videos.iterator();
        while (videoIterator.hasNext()) {
            Video video = videoIterator.next();
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
