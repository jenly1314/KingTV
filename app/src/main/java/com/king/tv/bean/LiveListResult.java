package com.king.tv.bean;

import java.util.List;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/3
 */
public class LiveListResult {

    private int total;
    private int pageCount;
    private int page;
    private int size;
    private String icon;

    private RecommendBean recommend;

    private List<LiveInfo> data;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public RecommendBean getRecommend() {
        return recommend;
    }

    public void setRecommend(RecommendBean recommend) {
        this.recommend = recommend;
    }

    public List<LiveInfo> getData() {
        return data;
    }

    public void setData(List<LiveInfo> data) {
        this.data = data;
    }

    public static class RecommendBean {
        private long id;
        private String name;
        private String icon;

        private List<DataBean> data;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }


        public static class DataBean {
            private int id;
            private String title;
            private String thumb;
            private String link;
            private String create_at;
            private int status;
            private String fk;
            private String subtitle;
            private String content;
            private Object ext;
            private int slot_id;
            private int priority;
            /**
             * no : 7447007
             * nick : 皮卡皮卡皮卡丘丶
             * avatar : http://a.img.shouyintv.cn/4STZ101-normal
             * follow : 12808
             * id : 67813
             * uid : 7447007
             * title : 皮卡丘：只玩麦克雷和狙加群有福利
             * category_id : 15
             * slug :
             * intro : 主玩麦克雷，毛妹，混分DJ
             * announcement : 直播时间早上下午晚上除开饭点以及特殊情况
             * cover : 7447007-1488533943-756.jpg
             * play_at : 2017-03-03 14:46:26
             * last_play_at :
             * view : 7397
             * views : 0
             * status : 2
             * priv : 0
             * landscape : 1
             * position :
             * weight : 0
             * check : 1
             * recommend_image :
             * videoQuality :
             * category_name : 守望先锋
             * screen : 0
             * start_time : 1488523586.43
             * source : ws
             * thumb : http://snap.quanmin.tv/7447007-1488533943-756.jpg?imageView2/2/w/390/
             * video : http://thumb.quanmin.tv/7447007.mp4?t=1488533700
             * stream : http://flv.quanmin.tv/live/7447007_L3.flv
             * categoryId : 15
             * hidden : false
             * play_status : true
             * icontext :
             * category_slug : overwatch
             */

            private LinkObjectBean link_object;

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

            public Object getExt() {
                return ext;
            }

            public void setExt(Object ext) {
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

            public LinkObjectBean getLink_object() {
                return link_object;
            }

            public void setLink_object(LinkObjectBean link_object) {
                this.link_object = link_object;
            }

            public static class LinkObjectBean {
                private String no;
                private String nick;
                private String avatar;
                private String follow;
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
                private String views;
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
                private String source;
                private String thumb;
                private String video;
                private String stream;
                private String categoryId;
                private boolean hidden;
                private boolean play_status;
                private String icontext;
                private String category_slug;

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

                public String getFollow() {
                    return follow;
                }

                public void setFollow(String follow) {
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
                    return views;
                }

                public void setViews(String views) {
                    this.views = views;
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

                public String getSource() {
                    return source;
                }

                public void setSource(String source) {
                    this.source = source;
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

                public String getStream() {
                    return stream;
                }

                public void setStream(String stream) {
                    this.stream = stream;
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
            }
        }
    }


    public String toString() {
        return "LiveListResult{" +
                "total=" + total +
                ", pageCount=" + pageCount +
                ", page=" + page +
                ", size=" + size +
                ", icon='" + icon + '\'' +
                ", data=" + data +
                '}';
    }
}
