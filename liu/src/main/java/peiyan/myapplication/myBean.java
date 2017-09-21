package peiyan.myapplication;

import java.util.List;



public class myBean {



    public int version;
    public String date;
    public List<LayoutsBean> layouts;



    @Override
    public String toString() {
        return "myBean{" +
                "version=" + version +
                ", date='" + date + '\'' +
                ", layouts=" + layouts +
                '}';
    }

    public static class LayoutsBean {
        /**
         * id : 225823
         * name : 旅游报01版
         * date : 2017-08-30
         * picUrl : https://img.newaircloud.com/xkycs/paper/201708/30/d9f405e7-2a7e-4459-a6e9-324e41f31927.jpg
         * height : 2009
         * width : 1259
         * mapping : [{"mapping":["66.617056%,82.362460%","98.118145%,82.362460%","98.118145%,66.181230%","66.617056%,66.181230%"],"articleID":"2228451"},{"mapping":["1.807440%,79.288026%","63.776794%,79.288026%","63.776794%,58.899676%","1.807440%,58.899676%"],"articleID":"2228452"},{"mapping":["67.649879%,63.430421%","97.085322%,63.430421%","97.085322%,49.029126%","67.649879%,49.029126%"],"articleID":"2228453"},{"mapping":["97.085322%,47.087379%","67.649879%,47.087379%","67.649879%,36.245955%","67.649879%,35.436893%","67.649879%,35.436893%","67.649879%,28.640777%","74.621431%,28.640777%","75.137842%,27.993528%","75.137842%,22.977346%","89.597359%,22.977346%","89.597359%,27.993528%","97.085322%,28.802589%"],"articleID":"2228454"},{"mapping":["1.807440%,54.045307%","64.035000%,54.045307%","64.035000%,17.961165%","1.807440%,17.961165%"],"articleID":"2228455"},{"mapping":["58.096270%,15.210356%","98.118145%,15.210356%","98.118145%,2.103560%","58.096270%,2.103560%"],"articleID":"2228456"}]
         * list : [{"id":2228451,"curl":"https://oss.newaircloud.com/xkycs/paper/article/201708/30/c2228451.json?v=1504073111","title":"医疗旅游服务产业成重要方向","version":1504073111,"pic1":""},{"id":2228452,"curl":"https://oss.newaircloud.com/xkycs/paper/article/201708/30/c2228452.json?v=1504073111","title":"内蒙古以全域旅游之笔绘行业发展蓝图","version":1504073111,"pic1":""},{"id":2228453,"curl":"https://oss.newaircloud.com/xkycs/paper/article/201708/30/c2228453.json?v=1504073112","title":"城市旅游","version":1504073112,"pic1":"https://img.newaircloud.com/xkycs/paper/201708/30/baa4058e-d021-4e6a-b515-d1631976a5b1.jpg"},{"id":2228454,"curl":"https://oss.newaircloud.com/xkycs/paper/article/201708/30/c2228454.json?v=1504073113","title":"大词汇文化旅游","version":1504073113,"pic1":"https://img.newaircloud.com/xkycs/paper/201708/30/715b3468-93ef-4e60-8730-ec00a2002de0.jpg"},{"id":2228455,"curl":"https://oss.newaircloud.com/xkycs/paper/article/201708/30/c2228455.json?v=1504073115","title":"澳大利亚全国旅游会议首次在华召开","version":1504073115,"pic1":"https://img.newaircloud.com/xkycs/paper/201708/30/b46177be-afcf-4aa3-8f89-46a4f3f051b3.jpg"},{"id":2228456,"curl":"https://oss.newaircloud.com/xkycs/paper/article/201708/30/c2228456.json?v=1504073115","title":"塞罕坝：践行\u201c两山\u201d理论发展生态旅游","version":1504073115,"pic1":""}]
         */

        public int id;
        public String name;
        public String date;
        public String picUrl;
        public int height;
        public int width;
        public List<MappingBean> mapping;
        public List<ListBean> list;

        @Override
        public String toString() {
            return "LayoutsBean{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", date='" + date + '\'' +
                    ", picUrl='" + picUrl + '\'' +
                    ", height=" + height +
                    ", width=" + width +
                    ", mapping=" + mapping +
                    ", list=" + list +
                    '}';
        }

        public static class MappingBean {
            /**
             * mapping : ["66.617056%,82.362460%","98.118145%,82.362460%","98.118145%,66.181230%","66.617056%,66.181230%"]
             * articleID : 2228451
             */

            public String articleID;
            public List<String> mapping;

            @Override
            public String toString() {
                return "MappingBean{" +
                        "articleID='" + articleID + '\'' +
                        ", mapping=" + mapping +
                        '}';
            }
        }

        public static class ListBean {
            /**
             * id : 2228451
             * curl : https://oss.newaircloud.com/xkycs/paper/article/201708/30/c2228451.json?v=1504073111
             * title : 医疗旅游服务产业成重要方向
             * version : 1504073111
             * pic1 :
             */

            public int id;
            public String curl;
            public String title;
            public int version;
            public String pic1;

            @Override
            public String toString() {
                return "ListBean{" +
                        "id=" + id +
                        ", curl='" + curl + '\'' +
                        ", title='" + title + '\'' +
                        ", version=" + version +
                        ", pic1='" + pic1 + '\'' +
                        '}';
            }
        }
    }
}
