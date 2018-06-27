package edmt.dev.androiddrinkshop.Retrofit;

import edmt.dev.androiddrinkshop.Model.CheckUserResponse;
import edmt.dev.androiddrinkshop.Model.User;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by alex on 6/25/18.
 */

public interface IDrinkShopAPI {
    @FormUrlEncoded
    @POST("checkuser.php")
    Call<CheckUserResponse> checkUserExists(@Field("phone") String phone);

    @FormUrlEncoded
    @POST("register.php")
    Call<User> registerNewUser(@Field("phone") String phone,
                               @Field("name") String name,
                               @Field("birthdate") String birthdate,
                               @Field("address") String address);

}
