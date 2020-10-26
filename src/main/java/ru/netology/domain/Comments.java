package ru.netology.domain;

public class Comments {

    public class Comment {
        private int id;
        private int ownerID;
        private int createdBy;
        private int date;
        private int postId;
        private String geo;
        private String mainText;
        private int signerID;

        private int commentCount;
        private boolean commentCanPost;
        private boolean commentCanClose;

        private int likesCount;
        private boolean userLikes;
        private boolean canLike;
        private boolean canPublish;

        public Comment(int id, int ownerID, int fromID, int createdBy, int date) {
            this.id = id; // generate unique id
            this.ownerID = ownerID;
            this.createdBy = createdBy;
            this.date = date;
        }

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
}
