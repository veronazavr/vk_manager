package ru.netology.domain;


public class Post {
//Post info
    private int id;
    private int ownerID;
    private int fromID;
    private int createdBy;
    private int date;
    private String geo;
    private String mainText;
    private int signerID;
    private int replyOwnerID;
    private int replyPostID;
    private String copyright;

//    security
    private boolean friendsOnly;
    private String commentButton;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean pinned;
    private boolean markedAsAd;
    private boolean favorite;
    private int postponedID;

//    comments
    private int commentCount;
    private boolean commentCanPost;
    private boolean commentCanClose;
    private boolean commentCanOpen;

    public String PostComments(boolean canPost, boolean groupsCanPost, boolean canOpen) {
        return null;
    }
//    Likes
    private int likesCount;
    private boolean userLikes;
    private boolean canLike;
    private boolean canPublish;

    public String Postlikes (boolean userLikes, boolean canLike, boolean canPublish) {
        return null;
    }

//    reposts
    private int repostsCount;
    private boolean userReposted;
    private int viewsCount;
    private String postType;
    private String postSource;

    public String reposts(int count, boolean userReposted) {
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public int getFromID() {
        return fromID;
    }

    public void setFromID(int fromID) {
        this.fromID = fromID;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public int getReplyOwnerID() {
        return replyOwnerID;
    }

    public void setReplyOwnerID(int replyOwnerID) {
        this.replyOwnerID = replyOwnerID;
    }

    public int getReplyPostID() {
        return replyPostID;
    }

    public void setReplyPostID(int replyPostID) {
        this.replyPostID = replyPostID;
    }

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getCommentButton() {
        return commentButton;
    }

    public void setCommentButton(String commentButton) {
        this.commentButton = commentButton;
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

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public boolean isUserLikes() {
        return userLikes;
    }

    public void setUserLikes(boolean userLikes) {
        this.userLikes = userLikes;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }

    public int getRepostsCount() {
        return repostsCount;
    }

    public void setRepostsCount(int repostsCount) {
        this.repostsCount = repostsCount;
    }

    public boolean isUserReposted() {
        return userReposted;
    }

    public void setUserReposted(boolean userReposted) {
        this.userReposted = userReposted;
    }

    public int getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(int viewsCount) {
        this.viewsCount = viewsCount;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getPostSource() {
        return postSource;
    }

    public void setPostSource(String postSource) {
        this.postSource = postSource;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public int getSignerID() {
        return signerID;
    }

    public void setSignerID(int signerID) {
        this.signerID = signerID;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }

    public boolean isMarkedAsAd() {
        return markedAsAd;
    }

    public void setMarkedAsAd(boolean markedAsAd) {
        this.markedAsAd = markedAsAd;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public int getPostponedID() {
        return postponedID;
    }

    public void setPostponedID(int postponedID) {
        this.postponedID = postponedID;
    }
}


