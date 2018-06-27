package edmt.dev.androiddrinkshop.Utils;

import edmt.dev.androiddrinkshop.Retrofit.IDrinkShopAPI;
import edmt.dev.androiddrinkshop.Retrofit.RetrofitClient;

/**
 * Created by alex on 6/25/18.
 */

public class Common {

    // In Emulator localhost ?????
    private static final String BASE_URL = "http://10.0.2.2/drinkshop/";

    public static IDrinkShopAPI getAPI() {
        return RetrofitClient.getClient(BASE_URL).create(IDrinkShopAPI.class);
    }
}
