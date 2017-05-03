package com.king.tv.bean;

import com.king.tv.util.DecimalFormatUtil;



/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/3
 */
public class LiveInfo {

    private String no;
    private String nick;
    private String avatar;
    private int follow;
    private String id;
    private String uid;
    private String title;
    private String category_id;
    private String slug;
    private String intro;
    private String announcement;
    private String cover;
    private String play_at;
    private String last_play_at;
    private String view;
    private String status;
    private String priv;
    private String landscape;
    private String position;
    private String weight;
    private String check;
    private String recommend_image;
    private String videoQuality;
    private String category_name;
    private int screen;
    private String start_time;
    private String stream;
    private String thumb;
    private String video;
    private String app_shuffling_image;
    private String categoryId;
    private boolean hidden;
    private boolean play_status;
    private String icontext;
    private String category_slug;
    private String love_cover;

    public LiveInfo(String no, String nick, String avatar, int follow, String id,
            String uid, String title, String category_id, String slug, String intro,
            String announcement, String cover, String play_at, String last_play_at,
            String view, String status, String priv, String landscape,
            String position, String weight, String check, String recommend_image,
            String videoQuality, String category_name, int screen,
            String start_time, String stream, String thumb, String video,
            String app_shuffling_image, String categoryId, boolean hidden,
            boolean play_status, String icontext, String category_slug,String love_cover) {
        this.no = no;
        this.nick = nick;
        this.avatar = avatar;
        this.follow = follow;
        this.id = id;
        this.uid = uid;
        this.title = title;
        this.category_id = category_id;
        this.slug = slug;
        this.intro = intro;
        this.announcement = announcement;
        this.cover = cover;
        this.play_at = play_at;
        this.last_play_at = last_play_at;
        this.view = view;
        this.status = status;
        this.priv = priv;
        this.landscape = landscape;
        this.position = position;
        this.weight = weight;
        this.check = check;
        this.recommend_image = recommend_image;
        this.videoQuality = videoQuality;
        this.category_name = category_name;
        this.screen = screen;
        this.start_time = start_time;
        this.stream = stream;
        this.thumb = thumb;
        this.video = video;
        this.app_shuffling_image = app_shuffling_image;
        this.categoryId = categoryId;
        this.hidden = hidden;
        this.play_status = play_status;
        this.icontext = icontext;
        this.category_slug = category_slug;
        this.love_cover = love_cover;
    }

    public LiveInfo() {
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getFollow() {
        return follow;
    }

    public void setFollow(int follow) {
        this.follow = follow;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getPlay_at() {
        return play_at;
    }

    public void setPlay_at(String play_at) {
        this.play_at = play_at;
    }

    public String getLast_play_at() {
        return last_play_at;
    }

    public void setLast_play_at(String last_play_at) {
        this.last_play_at = last_play_at;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getViews() {
        try{
            int views = Integer.parseInt(view);

            return DecimalFormatUtil.formatW(views);
        }catch (Exception e){

        }

        return view;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriv() {
        return priv;
    }

    public void setPriv(String priv) {
        this.priv = priv;
    }

    public String getLandscape() {
        return landscape;
    }

    public void setLandscape(String landscape) {
        this.landscape = landscape;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public String getRecommend_image() {
        return recommend_image;
    }

    public void setRecommend_image(String recommend_image) {
        this.recommend_image = recommend_image;
    }

    public String getVideoQuality() {
        return videoQuality;
    }

    public void setVideoQuality(String videoQuality) {
        this.videoQuality = videoQuality;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public int getScreen() {
        return screen;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getApp_shuffling_image() {
        return app_shuffling_image;
    }

    public void setApp_shuffling_image(String app_shuffling_image) {
        this.app_shuffling_image = app_shuffling_image;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public boolean isPlay_status() {
        return play_status;
    }

    public void setPlay_status(boolean play_status) {
        this.play_status = play_status;
    }

    public String getIcontext() {
        return icontext;
    }

    public void setIcontext(String icontext) {
        this.icontext = icontext;
    }

    public String getCategory_slug() {
        return category_slug;
    }

    public void setCategory_slug(String category_slug) {
        this.category_slug = category_slug;
    }

    public boolean getHidden() {
        return this.hidden;
    }

    public boolean getPlay_status() {
        return this.play_status;
    }

    public String getLove_cover() {
        return love_cover;
    }

    public void setLove_cover(String love_cover) {
        this.love_cover = love_cover;
    }

    @Override
    public String toString() {
        return "LiveInfo{" +
                "no='" + no + '\'' +
                ", nick='" + nick + '\'' +
                ", avatar='" + avatar + '\'' +
                ", follow=" + follow +
                ", id='" + id + '\'' +
                ", uid='" + uid + '\'' +
                ", title='" + title + '\'' +
                ", category_id='" + category_id + '\'' +
                ", slug='" + slug + '\'' +
                ", intro='" + intro + '\'' +
                ", announcement='" + announcement + '\'' +
                ", cover='" + cover + '\'' +
                ", play_at='" + play_at + '\'' +
                ", last_play_at='" + last_play_at + '\'' +
                ", view='" + view + '\'' +
                ", status='" + status + '\'' +
                ", priv='" + priv + '\'' +
                ", landscape='" + landscape + '\'' +
                ", position='" + position + '\'' +
                ", weight='" + weight + '\'' +
                ", check='" + check + '\'' +
                ", recommend_image='" + recommend_image + '\'' +
                ", videoQuality='" + videoQuality + '\'' +
                ", category_name='" + category_name + '\'' +
                ", screen=" + screen +
                ", start_time='" + start_time + '\'' +
                ", stream='" + stream + '\'' +
                ", thumb='" + thumb + '\'' +
                ", video='" + video + '\'' +
                ", app_shuffling_image='" + app_shuffling_image + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", hidden=" + hidden +
                ", play_status=" + play_status +
                ", icontext='" + icontext + '\'' +
                ", category_slug='" + category_slug + '\'' +
                ", love_cover='" + love_cover + '\'' +
                '}';
    }
}
