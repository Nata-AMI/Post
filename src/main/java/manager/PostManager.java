package manager;

import domain.*;

public class PostManager {
    private int ownerId;
    private int date;
    private String Image;
    private String text;
    private String URL;
    private String ImageUrl;
    private CommentsInfo commentsInfo;
    private LikesInfo likesinfo;
    private RepostsInfo reportsInfo;
    private int isPinned;
    private Views views;

    public Post[] wallSearch(int ownerId, String domain, String query, boolean ownersOnly, int count, int offset) {
        return null;
    }

    public Post[] wallDelete(int ownerId, int PostId) {
        return null;
    }

}



