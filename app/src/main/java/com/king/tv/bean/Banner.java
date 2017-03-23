package com.king.tv.bean;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/20
 */

public class Banner {


    /**
     * id : 1309
     * title :
     * thumb : http://image.quanmin.tv/6152d95937023d6e730afb34f7aede01jpg
     * link :
     * create_at : 2016-07-26 18:21:10
     * status : 1
     * fk : 1980174
     * subtitle :
     * content :
     * ext : {"type":"play"}
     * slot_id : 113
     * priority : 6
     * link_object : {"no":"1980174","nick":"菠萝焕","avatar":"http://a.img.shouyintv.cn/D46W101-normal","follow":"76295","uid":"1980174","play_at":"2017-03-20 13:51:06","screen":0,"views":"0","intro":"符文天赋歌单在新浪微博:小焕亚索","videoQuality":"3","thumb":"http://image.quanmin.tv/6152d95937023d6e730afb34f7aede01jpg","stream":"http://flv.quanmin.tv/live/1980174_L3.flv","position":"","announcement":"直播时间下午1点到晚上7点周日休息","id":"100593","video":"http://thumb.quanmin.tv/1980174.mp4?t=1489999200","slug":"","category_id":"1","cover":"1980174-1489999436-214.jpg","status":"2","recommend_image":"http://image.quanmin.tv/5fa2a9871fec1c70c664dc7a00077879jpg","weight":"0","start_time":"1489989066.248","check":"1","priv":"0","category_name":"英雄联盟","title":"菠萝焕来呀互相伤害啊","source":"ws","last_play_at":"","landscape":"1","view":"82407","app_shuffling_image":"http://image.quanmin.tv/3b87905359d4a53e217df6b3a04eadb1jpg","categoryId":"1","hidden":false,"play_status":true}
     */

    private int id;
    private String title;
    private String thumb;
    private String link;
    private String create_at;
    private int status;
    private String fk;
    private String subtitle;
    private String content;
    /**
     * type : play
     */

    private ExtBean ext;
    private int slot_id;
    private int priority;
    /**
     * no : 1980174
     * nick : 菠萝焕
     * avatar : http://a.img.shouyintv.cn/D46W101-normal
     * follow : 76295
     * uid : 1980174
     * play_at : 2017-03-20 13:51:06
     * screen : 0
     * views : 0
     * intro : 符文天赋歌单在新浪微博:小焕亚索
     * videoQuality : 3
     * thumb : http://image.quanmin.tv/6152d95937023d6e730afb34f7aede01jpg
     * stream : http://flv.quanmin.tv/live/1980174_L3.flv
     * position :
     * announcement : 直播时间下午1点到晚上7点周日休息
     * id : 100593
     * video : http://thumb.quanmin.tv/1980174.mp4?t=1489999200
     * slug :
     * category_id : 1
     * cover : 1980174-1489999436-214.jpg
     * status : 2
     * recommend_image : http://image.quanmin.tv/5fa2a9871fec1c70c664dc7a00077879jpg
     * weight : 0
     * start_time : 1489989066.248
     * check : 1
     * priv : 0
     * category_name : 英雄联盟
     * title : 菠萝焕来呀互相伤害啊
     * source : ws
     * last_play_at :
     * landscape : 1
     * view : 82407
     * app_shuffling_image : http://image.quanmin.tv/3b87905359d4a53e217df6b3a04eadb1jpg
     * categoryId : 1
     * hidden : false
     * play_status : true
     */

    private LiveInfo link_object;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getFk() {
        return fk;
    }

    public void setFk(String fk) {
        this.fk = fk;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ExtBean getExt() {
        return ext;
    }

    public void setExt(ExtBean ext) {
        this.ext = ext;
    }

    public int getSlot_id() {
        return slot_id;
    }

    public void setSlot_id(int slot_id) {
        this.slot_id = slot_id;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public LiveInfo getLink_object() {
        return link_object;
    }

    public void setLink_object(LiveInfo link_object) {
        this.link_object = link_object;
    }

    public boolean isRoom(){

        if(getExt()!=null)
            return "play".equals(getExt().getType());

        return false;
    }

    public static class ExtBean {
        private String type;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }


}
