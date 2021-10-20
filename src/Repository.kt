import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Repository {
    val JsonPlaceHolderUrl = "https://api.m3o.com"
    val retrofit = Retrofit.Builder()
        .baseUrl(JsonPlaceHolderUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val userReference = retrofit.create(UserReferense::class.java)
}