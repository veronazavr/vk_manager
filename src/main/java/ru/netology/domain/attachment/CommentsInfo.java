package ru.netology.domain.attachment;

public class CommentsInfo {
    private int id;
    private int userId;
    private String postId;
    private String parentId;
    private int dataCreate;
    private String textPost;
    private int replyToUser;
    private int replyToComment;

    public String thread(int count, boolean canPost, boolean showReplyButton, boolean groupCanPost){
        return null;
    }


    private String ulrUrl;
    private String urlVideo;
    private String urlAudio;
    private String urlFile;

    private int likeSum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public int getDataCreate() {
        return dataCreate;
    }

    public void setDataCreate(int dataCreate) {
        this.dataCreate = dataCreate;
    }

    public String getTextPost() {
        return textPost;
    }

    public void setTextPost(String textPost) {
        this.textPost = textPost;
    }

    public int getReplyToUser() {
        return replyToUser;
    }

    public void setReplyToUser(int replyToUser) {
        this.replyToUser = replyToUser;
    }

    public int getReplyToComment() {
        return replyToComment;
    }

    public void setReplyToComment(int replyToComment) {
        this.replyToComment = replyToComment;
    }

    public String getUlrUrl() {
        return ulrUrl;
    }

    public void setUlrUrl(String ulrUrl) {
        this.ulrUrl = ulrUrl;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public String getUrlAudio() {
        return urlAudio;
    }

    public void setUrlAudio(String urlAudio) {
        this.urlAudio = urlAudio;
    }

    public String getUrlFile() {
        return urlFile;
    }

    public void setUrlFile(String urlFile) {
        this.urlFile = urlFile;
    }

    public int getLikeSum() {
        return likeSum;
    }

    public void setLikeSum(int likeSum) {
        this.likeSum = likeSum;
    }
}