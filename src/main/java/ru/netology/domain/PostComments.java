package ru.netology.domain;

public class PostComments {
    private int commentCount;
    private boolean commentCanPost;
    private boolean commentCanClose;

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public boolean isCommentCanPost() {
        return commentCanPost;
    }

    public void setCommentCanPost(boolean commentCanPost) {
        this.commentCanPost = commentCanPost;
    }

    public boolean isCommentCanClose() {
        return commentCanClose;
    }

    public void setCommentCanClose(boolean commentCanClose) {
        this.commentCanClose = commentCanClose;
    }

    public boolean isCommentCanOpen() {
        return commentCanOpen;
    }

    public void setCommentCanOpen(boolean commentCanOpen) {
        this.commentCanOpen = commentCanOpen;
    }

    private boolean commentCanOpen;
}
