package peiyan.myapplication;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class mebean {


    /**
     * [] : [{"Moment":{"id":15,"userId":70793,"date":"2017-02-08 16:06:11.0","content":"APIJSON is a JSON Transmission Structure Protocol\u2026","praiseUserIdList":[82055,82002],"pictureList":["http://static.oschina.net/uploads/user/1218/2437072_100.jpg?t=1461076033000","http://common.cnblogs.com/images/icon_weibo_24.png"]},"User":{"id":70793,"name":"Strong","head":"http://static.oschina.net/uploads/user/585/1170143_50.jpg?t=1390226446000"},"Comment[]":[{"id":3,"toId":0,"userId":82002,"momentId":15,"date":"2017-02-01 19:20:50.0","content":"This is a Content...-3"},{"id":176,"toId":166,"userId":38710,"momentId":15,"date":"2017-03-25 20:28:03.0","content":"thank you"}]},{"Moment":{"id":58,"userId":90814,"date":"2017-02-01 19:14:31.0","content":"This is a Content...-435","praiseUserIdList":[38710,82003,82005,93793,82006,82044,82001],"pictureList":["http://static.oschina.net/uploads/img/201604/22172507_aMmH.jpg"]},"User":{"id":90814,"name":"007","head":"http://static.oschina.net/uploads/user/51/102723_50.jpg?t=1449212504000"},"Comment[]":[{"id":13,"toId":0,"userId":82005,"momentId":58,"date":"2017-02-01 19:20:50.0","content":"This is a Content...-13"},{"id":77,"toId":13,"userId":93793,"momentId":58,"date":"2017-02-01 19:20:50.0","content":"This is a Content...-77"}]},{"Moment":{"id":170,"userId":70793,"date":"2017-02-01 19:14:31.0","content":"This is a Content...-73","praiseUserIdList":[82044,82002,82001],"pictureList":["http://static.oschina.net/uploads/img/201604/22172508_eGDi.jpg","http://static.oschina.net/uploads/img/201604/22172508_eGDi.jpg","http://static.oschina.net/uploads/img/201604/22172508_mpwj.jpg"]},"User":{"id":70793,"name":"Strong","head":"http://static.oschina.net/uploads/user/585/1170143_50.jpg?t=1390226446000"},"Comment[]":[{"id":44,"toId":0,"userId":82003,"momentId":170,"date":"2017-02-01 19:20:50.0","content":"This is a Content...-44"},{"id":54,"toId":0,"userId":82004,"momentId":170,"date":"2017-02-01 19:20:50.0","content":"This is a Content...-54"}]},{"Moment":{"id":301,"userId":93793,"date":"2017-02-01 19:14:31.0","content":"This is a Content...-301","praiseUserIdList":[38710,93793,82003,82005,82040,82055,82002,82001],"pictureList":["http://static.oschina.net/uploads/img/201604/22172508_eGDi.jpg"]},"User":{"id":93793,"name":"Mike","head":"http://static.oschina.net/uploads/user/48/96331_50.jpg"},"Comment[]":[{"id":45,"toId":0,"userId":93793,"momentId":301,"date":"2017-02-01 19:20:50.0","content":"This is a Content...-45"},{"id":51,"toId":45,"userId":82003,"momentId":301,"date":"2017-02-01 19:20:50.0","content":"This is a Content...-51"}]},{"Moment":{"id":371,"userId":82002,"date":"2017-02-01 19:14:31.0","content":"This is a Content...-371","praiseUserIdList":[90814,93793,82003,82005,82006,82040,82002,82001],"pictureList":["http://static.oschina.net/uploads/img/201604/22172507_rrZ5.jpg","http://static.oschina.net/uploads/img/201604/22172507_rrZ5.jpg","https://camo.githubusercontent.com/c98b1c86af136745cc4626c6ece830f76de9ee83/687474703a2f2f696d61676573323031352e636e626c6f67732e636f6d2f626c6f672f3636303036372f3230313630342f3636303036372d32303136303431343232343930383036362d313837323233393236352e6a7067","http://static.oschina.net/uploads/img/201604/22172507_aMmH.jpg","http://static.oschina.net/uploads/img/201604/22172508_eGDi.jpg"]},"User":{"id":82002,"name":"Happy~","head":"http://static.oschina.net/uploads/user/1174/2348263_50.png?t=1439773471000"},"Comment[]":[{"id":68,"toId":0,"userId":82005,"momentId":371,"date":"2017-02-01 19:20:50.0","content":"This is a Content...-68"},{"id":110,"toId":0,"userId":93793,"momentId":371,"date":"2017-02-01 19:23:24.0","content":"This is a Content...-110"}]},{"Moment":{"id":470,"userId":38710,"date":"2017-02-01 19:14:31.0","content":"This is a Content...-470","praiseUserIdList":[],"pictureList":["http://static.oschina.net/uploads/img/201604/22172507_Pz9Y.png"]},"User":{"id":38710,"name":"TommyLemon","head":"http://static.oschina.net/uploads/user/1218/2437072_100.jpg?t=1461076033000"},"Comment[]":[{"id":4,"toId":0,"userId":38710,"momentId":470,"date":"2017-02-01 19:20:50.0","content":"This is a Content...-4"},{"id":22,"toId":221,"userId":82001,"momentId":470,"date":"2017-02-01 19:20:50.0","content":"This is a Content...-22"}]},{"Moment":{"id":704,"userId":38710,"date":"2017-03-12 17:39:44.0","content":"APIJSON is a JSON Transmission Structure Protocol\u2026","praiseUserIdList":[82003,82002,82001],"pictureList":["http://static.oschina.net/uploads/user/629/1258821_50.jpg?t=1378063141000","http://static.oschina.net/uploads/user/1332/2664107_50.jpg?t=1457405500000"]},"User":{"id":38710,"name":"TommyLemon","head":"http://static.oschina.net/uploads/user/1218/2437072_100.jpg?t=1461076033000"},"Comment[]":[{"id":1490863563124,"toId":0,"userId":82003,"momentId":704,"date":"2017-03-30 16:46:03.0","content":"I want one"},{"id":1502560583160,"toId":1490863563124,"userId":82001,"momentId":704,"date":"2017-08-13 01:56:23.0","content":"哈哈"}]},{"Moment":{"id":1491200468898,"userId":38710,"date":"2017-04-03 14:21:08.0","content":"APIJSON, let interfaces go to hell!","praiseUserIdList":[82001,38710],"pictureList":["http://static.oschina.net/uploads/user/998/1997902_50.jpg?t=1407806577000","http://static.oschina.net/uploads/user/1200/2400261_50.png?t=1439638750000"]},"User":{"id":38710,"name":"TommyLemon","head":"http://static.oschina.net/uploads/user/1218/2437072_100.jpg?t=1461076033000"},"Comment[]":[{"id":1491209763162,"toId":0,"userId":82001,"momentId":1491200468898,"date":"2017-04-03 16:56:03.0","content":"How do you do"},{"id":1491312382941,"toId":0,"userId":82001,"momentId":1491200468898,"date":"2017-04-04 21:26:22.0","content":"Wow"}]},{"Moment":{"id":1493835799335,"userId":38710,"date":"2017-05-04 02:23:19.0","content":"APIJSON is a JSON Transmission Structure Protocol\u2026","praiseUserIdList":[82001,82002],"pictureList":["http://static.oschina.net/uploads/user/1218/2437072_100.jpg?t=1461076033000","http://common.cnblogs.com/images/icon_weibo_24.png"]},"User":{"id":38710,"name":"TommyLemon","head":"http://static.oschina.net/uploads/user/1218/2437072_100.jpg?t=1461076033000"},"Comment[]":[{"id":1500974749796,"toId":0,"userId":82001,"momentId":1493835799335,"date":"2017-07-25 17:25:49.0","content":"六级"},{"id":1500974755007,"toId":1500974749796,"userId":82001,"momentId":1493835799335,"date":"2017-07-25 17:25:55.0","content":"回来了"}]}]
     * code : 200
     * msg : success
     */

    @SerializedName("code")
    public long code;
    @SerializedName("msg")
    public String msg;
    @SerializedName("[]")
    public List<shutBean> fuck;

    public static mebean objectFromData(String str) {

        return new Gson().fromJson(str, mebean.class);
    }

    public static class shutBean {
        /**
         * Moment : {"id":15,"userId":70793,"date":"2017-02-08 16:06:11.0","content":"APIJSON is a JSON Transmission Structure Protocol\u2026","praiseUserIdList":[82055,82002],"pictureList":["http://static.oschina.net/uploads/user/1218/2437072_100.jpg?t=1461076033000","http://common.cnblogs.com/images/icon_weibo_24.png"]}
         * User : {"id":70793,"name":"Strong","head":"http://static.oschina.net/uploads/user/585/1170143_50.jpg?t=1390226446000"}
         * Comment[] : [{"id":3,"toId":0,"userId":82002,"momentId":15,"date":"2017-02-01 19:20:50.0","content":"This is a Content...-3"},{"id":176,"toId":166,"userId":38710,"momentId":15,"date":"2017-03-25 20:28:03.0","content":"thank you"}]
         */

        @SerializedName("Moment")
        public MomentBean Moment;
        @SerializedName("User")
        public UserBean User;
        @SerializedName("Comment[]")
        public List<CommentfuckBean> Commentfuck;

        public static shutBean objectFromData(String str) {

            return new Gson().fromJson(str, shutBean.class);
        }

        public static class MomentBean {
            /**
             * id : 15
             * userId : 70793
             * date : 2017-02-08 16:06:11.0
             * content : APIJSON is a JSON Transmission Structure Protocol…
             * praiseUserIdList : [82055,82002]
             * pictureList : ["http://static.oschina.net/uploads/user/1218/2437072_100.jpg?t=1461076033000","http://common.cnblogs.com/images/icon_weibo_24.png"]
             */

            @SerializedName("id")
            public long id;
            @SerializedName("userId")
            public long userId;
            @SerializedName("date")
            public String date;
            @SerializedName("content")
            public String content;
            @SerializedName("praiseUserIdList")
            public List<Integer> praiseUserIdList;
            @SerializedName("pictureList")
            public List<String> pictureList;

            public static MomentBean objectFromData(String str) {

                return new Gson().fromJson(str, MomentBean.class);
            }
        }

        public static class UserBean {
            /**
             * id : 70793
             * name : Strong
             * head : http://static.oschina.net/uploads/user/585/1170143_50.jpg?t=1390226446000
             */

            @SerializedName("id")
            public long id;
            @SerializedName("name")
            public String name;
            @SerializedName("head")
            public String head;

            public static UserBean objectFromData(String str) {

                return new Gson().fromJson(str, UserBean.class);
            }
        }

        public static class CommentfuckBean {
            /**
             * id : 3
             * toId : 0
             * userId : 82002
             * momentId : 15
             * date : 2017-02-01 19:20:50.0
             * content : This is a Content...-3
             */

            @SerializedName("id")
            public long id;
            @SerializedName("toId")
            public long toId;
            @SerializedName("userId")
            public long userId;
            @SerializedName("momentId")
            public long momentId;
            @SerializedName("date")
            public String date;
            @SerializedName("content")
            public String content;

            public static CommentfuckBean objectFromData(String str) {

                return new Gson().fromJson(str, CommentfuckBean.class);
            }
        }
    }
}
