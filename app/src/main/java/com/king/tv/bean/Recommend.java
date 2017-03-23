package com.king.tv.bean;

import com.king.tv.util.DecimalFormatUtil;

import java.util.List;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/16
 */

public class Recommend {


    /**
     * id : 0
     * name : 精彩推荐
     * is_default : 1
     * icon :
     * slug :
     * category_more :
     * type : 1
     * screen : 0
     * list : [{"beauty_cover":"","no":14800687,"first_play_at":"1970-01-01 08:00:00","category_name":"王者荣耀","thumb":"http://snap.quanmin.tv/1509943928-1489628343-550.jpg?imageView2/2/w/390/","last_play_at":"1970-01-01 08:00:00","screen":0,"video":"http://thumb.quanmin.tv/1509943928.mp4?t=1489628100","title":"我要回到铂金怀抱  不回铂金不睡觉","recommend_image":"","is_shield":false,"nick":"苏沫","uid":1509943928,"view":"6058","category_id":17,"stream":"http://flv.quanmin.tv/live/1509943928.flv","slug":"sumo","love_cover":"","level":0,"like":0,"video_quality":null,"weight":0,"starlight":10,"check":true,"avatar":"http://a.img.shouyintv.cn/70Ok101-normal","follow":1522,"play_count":0,"play_true":0,"fans":0,"max_view":0,"default_image":"","last_end_at":"1970-01-01 08:00:00","position":"外太空","create_at":"2017-03-16 07:04:12","last_thumb":"1509943928-1489583944-693.jpg","landscape":1,"category_slug":"wangzhe","anniversary":0,"play_status":true,"status":2,"coin":10,"link":"http://www.quanmin.tv/v/sumo"},{"beauty_cover":"","no":13544113,"first_play_at":"1970-01-01 08:00:00","category_name":"Showing","thumb":"http://a.img.shouyintv.cn/1ZIo101-big","last_play_at":"1970-01-01 08:00:00","screen":1,"video":"http://thumb.quanmin.tv/1851753316.mp4?t=1489628100","title":"秒变蓝孩纸\u2026\u2026","recommend_image":"","is_shield":false,"nick":"wuli瑶拉","uid":1851753316,"view":"5182","category_id":29,"stream":"http://flv.quanmin.tv/live/1851753316.flv","slug":null,"love_cover":"http://a.img.shouyin.tv/YuAW101","level":0,"like":0,"video_quality":null,"weight":0,"starlight":206614,"check":true,"avatar":"http://a.img.shouyintv.cn/1ZIo101-normal","follow":15789,"play_count":0,"play_true":0,"fans":0,"max_view":0,"default_image":"","last_end_at":"1970-01-01 08:00:00","position":"外太空","create_at":"2017-03-16 08:47:03","last_thumb":"1851753316-1486704002-255.jpg","landscape":0,"category_slug":"showing","anniversary":0,"play_status":true,"status":2,"coin":206614,"link":"http://www.quanmin.tv/13544113"},{"beauty_cover":"","no":9007109,"first_play_at":"1970-01-01 08:00:00","category_name":"全民星秀","thumb":"http://snap.quanmin.tv/9007109-1489628342-424.jpg?imageView2/2/w/390/","last_play_at":"1970-01-01 08:00:00","screen":0,"video":"http://thumb.quanmin.tv/9007109.mp4?t=1489628100","title":"早上好这里是晨间欣欣","recommend_image":"http://bj.bcebos.com/mas-service/14882605382602098d63be05e955da25526dc358a3ee7","is_shield":false,"nick":"欣欣妹儿","uid":9007109,"view":"9380","category_id":4,"stream":"http://flv.quanmin.tv/live/9007109.flv","slug":"","love_cover":"http://image.quanmin.tv/love/30b824aea12577c64e9ee2379a6533bbjpg","level":0,"like":0,"video_quality":null,"weight":0,"starlight":520917,"check":true,"avatar":"http://a.img.shouyintv.cn/cs3r101-normal","follow":19194,"play_count":0,"play_true":0,"fans":0,"max_view":0,"default_image":"","last_end_at":"1970-01-01 08:00:00","position":"成都市","app_shuffling_image":"http://bj.bcebos.com/mas-service/14882605512292098d63be05e955da25526dc358a3ee7","create_at":"2017-03-16 08:34:22","last_thumb":"9007109-1489582803-124.jpg","landscape":1,"category_slug":"beauty","anniversary":0,"play_status":true,"status":2,"coin":520917,"link":"http://www.quanmin.tv/9007109"},{"beauty_cover":"","no":13242623,"first_play_at":"1970-01-01 08:00:00","category_name":"守望先锋","thumb":"http://snap.quanmin.tv/1784263034-1489628373-896.jpg?imageView2/2/w/390/","last_play_at":"1970-01-01 08:00:00","screen":0,"video":"http://thumb.quanmin.tv/1784263034.mp4?t=1489628100","title":"又睡不着了，继续玩骚东西随缘上分","recommend_image":"","is_shield":false,"nick":"小天使六六酱","uid":1784263034,"view":"5039","category_id":15,"stream":"http://flv.quanmin.tv/live/1784263034_L3.flv","slug":null,"love_cover":"","level":0,"like":0,"video_quality":null,"weight":0,"starlight":15306,"check":true,"avatar":"http://a.img.shouyintv.cn/21zk101-normal","follow":1272,"play_count":0,"play_true":0,"fans":0,"max_view":0,"default_image":"","last_end_at":"1970-01-01 08:00:00","position":"南京市","create_at":"2017-03-16 06:39:13","last_thumb":"1784263034-1489587819-34.jpg","landscape":1,"category_slug":"overwatch","anniversary":0,"play_status":true,"status":2,"coin":15306,"link":"http://www.quanmin.tv/13242623"},{"beauty_cover":"","no":806371,"first_play_at":"1970-01-01 08:00:00","category_name":"H1Z1","thumb":"http://snap.quanmin.tv/806371-1489628343-291.jpg?imageView2/2/w/390/","last_play_at":"1970-01-01 08:00:00","screen":0,"video":"http://thumb.quanmin.tv/806371.mp4?t=1489628100","title":"见面就是怼~~~~","recommend_image":"","is_shield":false,"nick":"玲儿么么哒","uid":806371,"view":"2454","category_id":54,"stream":"http://flv.quanmin.tv/live/806371.flv","slug":"linger","love_cover":"","level":0,"like":0,"video_quality":"","weight":0,"starlight":4167,"check":true,"avatar":"http://a.img.shouyintv.cn/sp0k101-normal","follow":4224,"play_count":0,"play_true":0,"fans":0,"max_view":0,"default_image":"","last_end_at":"1970-01-01 08:00:00","position":"贺州市","create_at":"2017-03-16 05:54:20","last_thumb":"806371-1489560722-454.jpg","landscape":1,"category_slug":"h1z1","anniversary":0,"play_status":true,"status":2,"coin":4167,"link":"http://www.quanmin.tv/v/linger"},{"beauty_cover":"","no":5163677,"first_play_at":"1970-01-01 08:00:00","category_name":"全民户外","thumb":"http://snap.quanmin.tv/3119090-1489628395-764.jpg?imageView2/2/w/390/","last_play_at":"1970-01-01 08:00:00","screen":0,"video":"http://thumb.quanmin.tv/3119090.mp4?t=1489628100","title":"流浪生存第二十五天","recommend_image":"","is_shield":false,"nick":"陈朋朋","uid":3119090,"view":"4360","category_id":13,"stream":"http://flv.quanmin.tv/live/3119090.flv","slug":null,"love_cover":"","level":0,"like":0,"video_quality":null,"weight":0,"starlight":176,"check":true,"avatar":"http://a.img.shouyintv.cn/jBKq101-normal","follow":204,"play_count":0,"play_true":0,"fans":0,"max_view":0,"default_image":"","last_end_at":"1970-01-01 08:00:00","position":"外太空","create_at":"2017-03-16 08:53:49","last_thumb":"3119090-1489543931-117.jpg","landscape":1,"category_slug":"huwai","anniversary":0,"play_status":true,"status":2,"coin":176,"link":"http://www.quanmin.tv/5163677"}]
     */

    private List<RoomBean> room;
    private List<?> ad;

    public List<RoomBean> getRoom() {
        return room;
    }

    public void setRoom(List<RoomBean> room) {
        this.room = room;
    }

    public List<?> getAd() {
        return ad;
    }

    public void setAd(List<?> ad) {
        this.ad = ad;
    }

    public static class RoomBean {
        private int id;
        private String name;
        private int is_default;
        private String icon;
        private String slug;
        private String category_more;
        private int type;
        private int screen;
        /**
         * beauty_cover :
         * no : 14800687
         * first_play_at : 1970-01-01 08:00:00
         * category_name : 王者荣耀
         * thumb : http://snap.quanmin.tv/1509943928-1489628343-550.jpg?imageView2/2/w/390/
         * last_play_at : 1970-01-01 08:00:00
         * screen : 0
         * video : http://thumb.quanmin.tv/1509943928.mp4?t=1489628100
         * title : 我要回到铂金怀抱  不回铂金不睡觉
         * recommend_image :
         * is_shield : false
         * nick : 苏沫
         * uid : 1509943928
         * view : 6058
         * category_id : 17
         * stream : http://flv.quanmin.tv/live/1509943928.flv
         * slug : sumo
         * love_cover :
         * level : 0
         * like : 0
         * video_quality : null
         * weight : 0
         * starlight : 10
         * check : true
         * avatar : http://a.img.shouyintv.cn/70Ok101-normal
         * follow : 1522
         * play_count : 0
         * play_true : 0
         * fans : 0
         * max_view : 0
         * default_image :
         * last_end_at : 1970-01-01 08:00:00
         * position : 外太空
         * create_at : 2017-03-16 07:04:12
         * last_thumb : 1509943928-1489583944-693.jpg
         * landscape : 1
         * category_slug : wangzhe
         * anniversary : 0
         * play_status : true
         * status : 2
         * coin : 10
         * link : http://www.quanmin.tv/v/sumo
         */

        private List<ListBean> list;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getIs_default() {
            return is_default;
        }

        public void setIs_default(int is_default) {
            this.is_default = is_default;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getCategory_more() {
            return category_more;
        }

        public void setCategory_more(String category_more) {
            this.category_more = category_more;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getScreen() {
            return screen;
        }

        public void setScreen(int screen) {
            this.screen = screen;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            private String beauty_cover;
            private int no;
            private String first_play_at;
            private String category_name;
            private String thumb;
            private String last_play_at;
            private int screen;
            private String video;
            private String title;
            private String recommend_image;
            private boolean is_shield;
            private String nick;
            private int uid;
            private String view;
            private int category_id;
            private String stream;
            private String slug;
            private String love_cover;
            private int level;
            private int like;
            private Object video_quality;
            private int weight;
            private int starlight;
            private boolean check;
            private String avatar;
            private int follow;
            private int play_count;
            private int play_true;
            private int fans;
            private int max_view;
            private String default_image;
            private String last_end_at;
            private String position;
            private String create_at;
            private String last_thumb;
            private int landscape;
            private String category_slug;
            private int anniversary;
            private boolean play_status;
            private int status;
            private int coin;
            private String link;

            public String getBeauty_cover() {
                return beauty_cover;
            }

            public void setBeauty_cover(String beauty_cover) {
                this.beauty_cover = beauty_cover;
            }

            public int getNo() {
                return no;
            }

            public void setNo(int no) {
                this.no = no;
            }

            public String getFirst_play_at() {
                return first_play_at;
            }

            public void setFirst_play_at(String first_play_at) {
                this.first_play_at = first_play_at;
            }

            public String getCategory_name() {
                return category_name;
            }

            public void setCategory_name(String category_name) {
                this.category_name = category_name;
            }

            public String getThumb() {
                return thumb;
            }

            public void setThumb(String thumb) {
                this.thumb = thumb;
            }

            public String getLast_play_at() {
                return last_play_at;
            }

            public void setLast_play_at(String last_play_at) {
                this.last_play_at = last_play_at;
            }

            public int getScreen() {
                return screen;
            }

            public void setScreen(int screen) {
                this.screen = screen;
            }

            public String getVideo() {
                return video;
            }

            public void setVideo(String video) {
                this.video = video;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getRecommend_image() {
                return recommend_image;
            }

            public void setRecommend_image(String recommend_image) {
                this.recommend_image = recommend_image;
            }

            public boolean isIs_shield() {
                return is_shield;
            }

            public void setIs_shield(boolean is_shield) {
                this.is_shield = is_shield;
            }

            public String getNick() {
                return nick;
            }

            public void setNick(String nick) {
                this.nick = nick;
            }

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public String getView() {
                return view;
            }


            public String getViews() {
                try{
                    int views = Integer.parseInt(view);

                    return DecimalFormatUtil.formatW(views);
                }catch (Exception e){

                }

                return view;
            }

            public void setView(String view) {
                this.view = view;
            }

            public int getCategory_id() {
                return category_id;
            }

            public void setCategory_id(int category_id) {
                this.category_id = category_id;
            }

            public String getStream() {
                return stream;
            }

            public void setStream(String stream) {
                this.stream = stream;
            }

            public String getSlug() {
                return slug;
            }

            public void setSlug(String slug) {
                this.slug = slug;
            }

            public String getLove_cover() {
                return love_cover;
            }

            public void setLove_cover(String love_cover) {
                this.love_cover = love_cover;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public int getLike() {
                return like;
            }

            public void setLike(int like) {
                this.like = like;
            }

            public Object getVideo_quality() {
                return video_quality;
            }

            public void setVideo_quality(Object video_quality) {
                this.video_quality = video_quality;
            }

            public int getWeight() {
                return weight;
            }

            public void setWeight(int weight) {
                this.weight = weight;
            }

            public int getStarlight() {
                return starlight;
            }

            public void setStarlight(int starlight) {
                this.starlight = starlight;
            }

            public boolean isCheck() {
                return check;
            }

            public void setCheck(boolean check) {
                this.check = check;
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

            public int getPlay_count() {
                return play_count;
            }

            public void setPlay_count(int play_count) {
                this.play_count = play_count;
            }

            public int getPlay_true() {
                return play_true;
            }

            public void setPlay_true(int play_true) {
                this.play_true = play_true;
            }

            public int getFans() {
                return fans;
            }

            public void setFans(int fans) {
                this.fans = fans;
            }

            public int getMax_view() {
                return max_view;
            }

            public void setMax_view(int max_view) {
                this.max_view = max_view;
            }

            public String getDefault_image() {
                return default_image;
            }

            public void setDefault_image(String default_image) {
                this.default_image = default_image;
            }

            public String getLast_end_at() {
                return last_end_at;
            }

            public void setLast_end_at(String last_end_at) {
                this.last_end_at = last_end_at;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getCreate_at() {
                return create_at;
            }

            public void setCreate_at(String create_at) {
                this.create_at = create_at;
            }

            public String getLast_thumb() {
                return last_thumb;
            }

            public void setLast_thumb(String last_thumb) {
                this.last_thumb = last_thumb;
            }

            public int getLandscape() {
                return landscape;
            }

            public void setLandscape(int landscape) {
                this.landscape = landscape;
            }

            public String getCategory_slug() {
                return category_slug;
            }

            public void setCategory_slug(String category_slug) {
                this.category_slug = category_slug;
            }

            public int getAnniversary() {
                return anniversary;
            }

            public void setAnniversary(int anniversary) {
                this.anniversary = anniversary;
            }

            public boolean isPlay_status() {
                return play_status;
            }

            public void setPlay_status(boolean play_status) {
                this.play_status = play_status;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getCoin() {
                return coin;
            }

            public void setCoin(int coin) {
                this.coin = coin;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }
        }

        @Override
        public String toString() {
            return "RoomBean{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", is_default=" + is_default +
                    ", icon='" + icon + '\'' +
                    ", slug='" + slug + '\'' +
                    ", category_more='" + category_more + '\'' +
                    ", type=" + type +
                    ", screen=" + screen +
                    ", list=" + list +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Recommend{" +
                "room=" + room +
                ", ad=" + ad +
                '}';
    }
}
