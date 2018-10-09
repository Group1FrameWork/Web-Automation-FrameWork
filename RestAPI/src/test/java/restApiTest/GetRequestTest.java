package restApiTest;

import base.CommonAPI;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static io.restassured.RestAssured.get;

public class GetRequestTest {

    public static String url ="https://api.jikan.moe/v3";
    @Test
    public void testStatusCode(){
        TestLogger.log(getClass().getSimpleName()+":"+ CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        int statusCode = get(url).getStatusCode();
        Assert.assertEquals(statusCode,200);
    }
    @Test
    public void testResponseTime(){
        TestLogger.log(getClass().getSimpleName()+":"+ CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        long time = get(url).getTime();
        Assert.assertTrue(time > 0.0);
    }
    @Test
    public void testAuthor(){
        TestLogger.log(getClass().getSimpleName()+":"+ CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        JsonPath jsonPath = get(url).jsonPath();
        String author = jsonPath.get("Author");
        Assert.assertEquals(author,"@irfanDahir");
    }
    @Test
    public void testWebSite(){
        TestLogger.log(getClass().getSimpleName()+":"+ CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        JsonPath jsonPath = get(url).jsonPath();
        String webSite = jsonPath.getString("Website");
        System.out.println(webSite);
        Assert.assertEquals(webSite,"https://jikan.moe");
    }
}
