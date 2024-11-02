package autoTest.accuweather.location;

import autoTest.accuweather.AbstractAccuweatherTest;
import autoTest.accuweather.locations.list.Regions;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;
import static io.restassured.RestAssured.given;

public class ListRegionsTest extends AbstractAccuweatherTest {



    @Test
    void getListRegions() {

        List<Regions> response = given()
                .queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl()+"/locations/v1/regions")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(2000L))
                .extract()
                .body().jsonPath().getList(".", Regions.class);

        Assertions.assertEquals(10,response.size());
        Assertions.assertEquals("Africa", response.get(0).getLocalizedName());
    }
}
