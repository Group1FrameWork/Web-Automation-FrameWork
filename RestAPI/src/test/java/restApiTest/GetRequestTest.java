package restApiTest;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class GetRequestTest {

    public static String url ="https://api.jikan.moe/v3";
    @Test
    public void testStatusCode(){
        int statusCode = get(url).getStatusCode();
        Assert.assertEquals(statusCode,200);
    }
    @Test
    public void testResponseTime(){
        long time = get(url).getTime();
        Assert.assertTrue(time > 0.0);
    }
    @Test
    public void testAuthor(){
        JsonPath jsonPath = get(url).jsonPath();
        String author = jsonPath.get("Author");
        Assert.assertEquals(author,"@irfanDahir");
    }
    @Test
    public void testWebSite(){
        JsonPath jsonPath = get(url).jsonPath();
        String webSite = jsonPath.getString("Website");
        System.out.println(webSite);
        Assert.assertEquals(webSite,"https://jikan.moe");
    }
}
