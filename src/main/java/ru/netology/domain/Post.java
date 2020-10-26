package ru.netology.domain;


public class Post {
    //Post info
    final private int id;
    final private int ownerID;
    final private int fromID;
    final private int createdBy;
    final private int date;
    private String geo;
    private String mainText;
    private int signerID;
    private int replyOwnerID;
    private int replyPostID;
    private Copyright copyright;

    // Security
    private Security security;

    //Comments
    private List<Comment> comments;

    // Likes
    private List<Like> likes;

    // Reposts
    private List<Post> reposts;

    public Post(int ownerID, int fromID, int createdBy, int date, String geo, String mainText, Copyright copyright, Security security) {
        this.id = (new Random()).nextInt(); // generate unique id
        this.ownerID = ownerID;
        this.fromID = fromID;
        this.createdBy = createdBy;
        this.date = date;
        this.geo = geo;
        this.mainText = mainText;
        this.copyright = copyright;
        this.security = security;

        this.comments = new ArrayList<>();
        this.likes = new ArrayList<>();
        this.reposts = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public int getFromID() {
        return fromID;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public int getDate() {
        return date;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public int getSignerID() {
        return signerID;
    }

    public void setSignerID(int signerID) {
        this.signerID = signerID;
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

    public Copyright getCopyright() {
        return copyright;
    }

    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }
}

