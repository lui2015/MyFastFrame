package com.luli.myfastframe.net;

import java.util.Map;
import io.reactivex.Single;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
/**
 * Created by luli on 2017/12/5.
 */

public interface Api {

    /**
     * 订阅列表
     *
     * @param stringMap
     * @return
     */
    @FormUrlEncoded
    @POST("fidnews/v1/dycy/hotTopic/querySubscription")
    Single<String> querySubscriptionList(@FieldMap Map<String, String> stringMap);


    /**
     * 添加用户主题订阅信息
     *
     * @param stringMap
     * @return
     */
    @FormUrlEncoded
    @POST("fidnews/v1/dycy/hotTopic/addSubscription")
    Single<String> addTopicToService(@FieldMap Map<String, String> stringMap);


    /**
     * 删除用户主题订阅信息
     *
     * @param stringMap
     * @return
     */
    @FormUrlEncoded
    @POST("fidnews/v1/dycy/hotTopic/delSubscription")
    Single<String> deleteTopicToService(@FieldMap Map<String, String> stringMap);
}
