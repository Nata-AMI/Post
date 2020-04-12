package manager;

import domain.*;

public class PostManager {
    private int ownerId;
    private String domain;
    private String query;
    private boolean ownersOnly;
    private int postId;
    private  int count;
    private int offset;

    public Post[] wallSearch(int ownerId, String domain, String query, boolean ownersOnly, int count, int offset) {
        return null;
    }

    public Post[] wallDelete(int ownerId, int postId) {
    }

}



