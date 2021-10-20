import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserReferense {
    @POST("/v1/user/Create")
    fun registration (
        @Body userRegistrationRequest: UserRegistrationRequest
    ):Call<UserRegistrationRequest>

}