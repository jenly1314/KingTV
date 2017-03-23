package com.king.tv.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/2/20
 */

@Entity
public class LiveCategory {


    /**
     * id : 29
     * name : Showing
     * is_default : 1
     * sort : 999
     * icon_gray : http://uimg.quanmin.tv/1480649956/53ef5.png
     * icon_red : http://uimg.quanmin.tv/1480649951/4b823.png
     * icon_image : http://uimg.quanmin.tv/1480649936/10414.png
     * slug : showing
     * type : 2
     * screen : 1
     */

    @Id
    private long id;
    private String name;
    private int is_default;
    private int sort;
    private String icon_gray;
    private String icon_red;
    private String icon_image;
    private String slug;
    private int type;
    private int screen;

    @Generated(hash = 760358639)
    public LiveCategory(long id, String name, int is_default, int sort,
            String icon_gray, String icon_red, String icon_image, String slug,
            int type, int screen) {
        this.id = id;
        this.name = name;
        this.is_default = is_default;
        this.sort = sort;
        this.icon_gray = icon_gray;
        this.icon_red = icon_red;
        this.icon_image = icon_image;
        this.slug = slug;
        this.type = type;
        this.screen = screen;
    }

    @Generated(hash = 547755947)
    public LiveCategory() {
    }

    public long getId() {
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

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getIcon_gray() {
        return icon_gray;
    }

    public void setIcon_gray(String icon_gray) {
        this.icon_gray = icon_gray;
    }

    public String getIcon_red() {
        return icon_red;
    }

    public void setIcon_red(String icon_red) {
        this.icon_red = icon_red;
    }

    public String getIcon_image() {
        return icon_image;
    }

    public void setIcon_image(String icon_image) {
        this.icon_image = icon_image;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
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


    @Override
    public String toString() {
        return "LiveCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", is_default=" + is_default +
                ", sort=" + sort +
                ", icon_gray='" + icon_gray + '\'' +
                ", icon_red='" + icon_red + '\'' +
                ", icon_image='" + icon_image + '\'' +
                ", slug='" + slug + '\'' +
                ", type=" + type +
                ", screen=" + screen +
                '}';
    }

    public void setId(long id) {
        this.id = id;
    }


}
