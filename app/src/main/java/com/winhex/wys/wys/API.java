package com.winhex.wys.wys;

import com.winhex.wys.wys.bean.Loginbean;
import com.winhex.wys.wys.bean.Startokenbean;


import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import rx.Observable;

public interface API {

    @GET("dr/login")
    Observable<Loginbean> getlogin(@Query("username")String username, @Query("password")String password);
    
    
    @GET("dr/tokencheck")
    Observable<Startokenbean>ValidationToken(@Header("token") String token);
    
    
}
