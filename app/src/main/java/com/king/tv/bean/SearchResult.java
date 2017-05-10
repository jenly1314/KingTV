package com.king.tv.bean;

import java.util.List;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/5/9
 */

public class SearchResult {


    /**
     * code : 200
     * error :
     * data : {"items":[{"no":4041550,"category_name":"英雄联盟","thumb":"http://snap.quanmin.tv/4041550-1494311643-542.jpg?imageView2/2/w/390/","screen":0,"avatar":"http://a.img.shouyintv.cn/zIRe101-normal","title":"啊啊啊！总有刁民想害我！不拿一血算我输！","is_shield":false,"nick":"lol小胖777","uid":4041550,"view":"86","category_id":1,"slug":"","category_slug":"lol","play_status":true,"frame":"","landscape":1},{"no":2291142,"category_name":"英雄联盟","thumb":"http://snap.quanmin.tv/277255-1494311643-61.jpg?imageView2/2/w/390/","screen":0,"avatar":"http://a.img.shouyintv.cn/FXK8201-normal","title":"LOL走起","is_shield":false,"nick":"崽崽的弟弟","uid":277255,"view":"72","category_id":1,"slug":"s7410","category_slug":"lol","play_status":true,"frame":"","landscape":1},{"no":11935228,"category_name":"英雄联盟","thumb":"http://snap.quanmin.tv/9767855-1494311643-252.jpg?imageView2/2/w/390/","screen":0,"avatar":"http://a.img.shouyintv.cn/42kV101-normal","title":"一个喜欢唱歌的LOL主播！！！","is_shield":false,"nick":"Aai洋洋洋","uid":9767855,"view":"65","category_id":1,"slug":"aaa9767855aaa","category_slug":"lol","play_status":true,"frame":"","landscape":1},{"no":15052121,"category_name":"英雄联盟","thumb":"http://snap.quanmin.tv/1499045422-1494311642-393.jpg?imageView2/2/w/390/","screen":0,"avatar":"http://a.img.shouyintv.cn/lDLt101-normal","title":"新版本试水LOL","is_shield":false,"nick":"小小窜天猴","uid":1499045422,"view":"64","category_id":1,"slug":null,"category_slug":"lol","play_status":true,"frame":"","landscape":1},{"no":14021622,"category_name":"坦克世界","thumb":"http://snap.quanmin.tv/1230751544-1494311457-699.jpg?imageView2/2/w/390/","screen":0,"avatar":"http://a.img.shouyintv.cn/R1xY101-normal","title":"LOL、TK娱乐直播","is_shield":false,"nick":"老侯娱乐","uid":1230751544,"view":"4","category_id":36,"slug":null,"category_slug":"tank","play_status":false,"frame":"","landscape":1},{"no":13296128,"category_name":"英雄联盟","thumb":"http://snap.quanmin.tv/1878893862-1494248432-563.jpg?imageView2/2/w/390/","screen":0,"avatar":"http://a.img.shouyintv.cn/HhFY103-normal","title":"男爵匹配可以上车","is_shield":false,"nick":"LOL_芒果","uid":1878893862,"view":"3","category_id":1,"slug":"lolmg","category_slug":"lol","play_status":false,"frame":"","landscape":1},{"no":10688220,"category_name":"英雄联盟","thumb":"http://snap.quanmin.tv/8549649-1494308718-104.jpg?imageView2/2/w/390/","screen":0,"avatar":"http://image.quanmin.tv/avatar/9934be9168cb2fd27733f253ec0327b5jpg?imageView2/2/w/300/","title":"lol、","is_shield":false,"nick":"直播是我的梦想","uid":8549649,"view":"2","category_id":1,"slug":null,"category_slug":"lol","play_status":false,"frame":"","landscape":1},{"no":15972081,"category_name":"英雄联盟","thumb":"http://snap.quanmin.tv/1553660782-1494000723-985.jpg?imageView2/2/w/390/","screen":0,"avatar":"http://a.img.shouyintv.cn/Rlq7201-normal","title":"LOL主播 野哥的直播间","is_shield":false,"nick":"LOL主播 野哥","uid":1553660782,"view":"1","category_id":1,"slug":null,"category_slug":"lol","play_status":false,"frame":"","landscape":1},{"no":10940428,"category_name":"英雄联盟","thumb":"http://snap.quanmin.tv/8801728-1494177663-725.jpg?imageView2/2/w/390/","screen":0,"avatar":"http://image.quanmin.tv/avatar/01b1f717345d4e33f8f2d993042c830djpg?imageView2/2/w/300/","title":"最强青铜,主玩劫。","is_shield":false,"nick":"LOL小十七","uid":8801728,"view":"1","category_id":1,"slug":null,"category_slug":"lol","play_status":false,"frame":"","landscape":1},{"no":7946685,"category_name":"棋牌游戏","thumb":"http://snap.quanmin.tv/7946685-1493985237-487.jpg?imageView2/2/w/390/","screen":0,"avatar":"http://image.quanmin.tv/avatar/2366f142a0980b5448293952c71c12ddjpg?imageView2/2/w/300/","title":"重温小时候玩的（血战上海滩）","is_shield":false,"nick":"小邢LOL","uid":7946685,"view":"1","category_id":42,"slug":"","category_slug":"qipai","play_status":false,"frame":"","landscape":1}],"total":1216,"pageNb":122}
     */

    private int code;
    private String error;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * items : [{"no":4041550,"category_name":"英雄联盟","thumb":"http://snap.quanmin.tv/4041550-1494311643-542.jpg?imageView2/2/w/390/","screen":0,"avatar":"http://a.img.shouyintv.cn/zIRe101-normal","title":"啊啊啊！总有刁民想害我！不拿一血算我输！","is_shield":false,"nick":"lol小胖777","uid":4041550,"view":"86","category_id":1,"slug":"","category_slug":"lol","play_status":true,"frame":"","landscape":1},{"no":2291142,"category_name":"英雄联盟","thumb":"http://snap.quanmin.tv/277255-1494311643-61.jpg?imageView2/2/w/390/","screen":0,"avatar":"http://a.img.shouyintv.cn/FXK8201-normal","title":"LOL走起","is_shield":false,"nick":"崽崽的弟弟","uid":277255,"view":"72","category_id":1,"slug":"s7410","category_slug":"lol","play_status":true,"frame":"","landscape":1},{"no":11935228,"category_name":"英雄联盟","thumb":"http://snap.quanmin.tv/9767855-1494311643-252.jpg?imageView2/2/w/390/","screen":0,"avatar":"http://a.img.shouyintv.cn/42kV101-normal","title":"一个喜欢唱歌的LOL主播！！！","is_shield":false,"nick":"Aai洋洋洋","uid":9767855,"view":"65","category_id":1,"slug":"aaa9767855aaa","category_slug":"lol","play_status":true,"frame":"","landscape":1},{"no":15052121,"category_name":"英雄联盟","thumb":"http://snap.quanmin.tv/1499045422-1494311642-393.jpg?imageView2/2/w/390/","screen":0,"avatar":"http://a.img.shouyintv.cn/lDLt101-normal","title":"新版本试水LOL","is_shield":false,"nick":"小小窜天猴","uid":1499045422,"view":"64","category_id":1,"slug":null,"category_slug":"lol","play_status":true,"frame":"","landscape":1},{"no":14021622,"category_name":"坦克世界","thumb":"http://snap.quanmin.tv/1230751544-1494311457-699.jpg?imageView2/2/w/390/","screen":0,"avatar":"http://a.img.shouyintv.cn/R1xY101-normal","title":"LOL、TK娱乐直播","is_shield":false,"nick":"老侯娱乐","uid":1230751544,"view":"4","category_id":36,"slug":null,"category_slug":"tank","play_status":false,"frame":"","landscape":1},{"no":13296128,"category_name":"英雄联盟","thumb":"http://snap.quanmin.tv/1878893862-1494248432-563.jpg?imageView2/2/w/390/","screen":0,"avatar":"http://a.img.shouyintv.cn/HhFY103-normal","title":"男爵匹配可以上车","is_shield":false,"nick":"LOL_芒果","uid":1878893862,"view":"3","category_id":1,"slug":"lolmg","category_slug":"lol","play_status":false,"frame":"","landscape":1},{"no":10688220,"category_name":"英雄联盟","thumb":"http://snap.quanmin.tv/8549649-1494308718-104.jpg?imageView2/2/w/390/","screen":0,"avatar":"http://image.quanmin.tv/avatar/9934be9168cb2fd27733f253ec0327b5jpg?imageView2/2/w/300/","title":"lol、","is_shield":false,"nick":"直播是我的梦想","uid":8549649,"view":"2","category_id":1,"slug":null,"category_slug":"lol","play_status":false,"frame":"","landscape":1},{"no":15972081,"category_name":"英雄联盟","thumb":"http://snap.quanmin.tv/1553660782-1494000723-985.jpg?imageView2/2/w/390/","screen":0,"avatar":"http://a.img.shouyintv.cn/Rlq7201-normal","title":"LOL主播 野哥的直播间","is_shield":false,"nick":"LOL主播 野哥","uid":1553660782,"view":"1","category_id":1,"slug":null,"category_slug":"lol","play_status":false,"frame":"","landscape":1},{"no":10940428,"category_name":"英雄联盟","thumb":"http://snap.quanmin.tv/8801728-1494177663-725.jpg?imageView2/2/w/390/","screen":0,"avatar":"http://image.quanmin.tv/avatar/01b1f717345d4e33f8f2d993042c830djpg?imageView2/2/w/300/","title":"最强青铜,主玩劫。","is_shield":false,"nick":"LOL小十七","uid":8801728,"view":"1","category_id":1,"slug":null,"category_slug":"lol","play_status":false,"frame":"","landscape":1},{"no":7946685,"category_name":"棋牌游戏","thumb":"http://snap.quanmin.tv/7946685-1493985237-487.jpg?imageView2/2/w/390/","screen":0,"avatar":"http://image.quanmin.tv/avatar/2366f142a0980b5448293952c71c12ddjpg?imageView2/2/w/300/","title":"重温小时候玩的（血战上海滩）","is_shield":false,"nick":"小邢LOL","uid":7946685,"view":"1","category_id":42,"slug":"","category_slug":"qipai","play_status":false,"frame":"","landscape":1}]
         * total : 1216
         * pageNb : 122
         */

        private int total;
        private int pageNb;
        private List<LiveInfo> items;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getPageNb() {
            return pageNb;
        }

        public void setPageNb(int pageNb) {
            this.pageNb = pageNb;
        }

        public List<LiveInfo> getItems() {
            return items;
        }

        public void setItems(List<LiveInfo> items) {
            this.items = items;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "total=" + total +
                    ", pageNb=" + pageNb +
                    ", items=" + items +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "code=" + code +
                ", error='" + error + '\'' +
                ", data=" + data +
                '}';
    }
}