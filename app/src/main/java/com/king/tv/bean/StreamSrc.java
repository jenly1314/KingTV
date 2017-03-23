package com.king.tv.bean;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/7
 *
 */


public class StreamSrc {
    private String name;
    private String src;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    @Override
    public String toString() {
        return "StreamSrc{" +
                "name='" + name + '\'' +
                ", src='" + src + '\'' +
                '}';
    }
}
