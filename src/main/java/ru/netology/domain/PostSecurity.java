package ru.netology.domain;

public class PostSecurity {

//    security
    private boolean friendsOnly;
    private String commentButton;
    private boolean canPin;
    private boolean canDelete;

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

    private boolean canEdit;
    private boolean pinned;
    private boolean markedAsAd;
    private boolean favorite;
    private int postponedID;
}
