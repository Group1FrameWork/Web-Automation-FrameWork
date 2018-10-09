package JSONServer;

import base.CommonAPI;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class PostsResource  {

    @Test
    public void postsTest(){
        TestLogger.log(getClass().getSimpleName()+":"+ CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 105);
        jsonObject.put("title", "Dream Job");
        jsonObject.put("author", "Subhra Roy");

        request.body(jsonObject.toJSONString());
        Response response = request.post("http://localhost:3000/posts");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,201);
    }
    @Test
    public void deletePost() {
        TestLogger.log(getClass().getSimpleName()+":"+ CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        RequestSpecification request = RestAssured.given();
        Response response = request.delete("http://localhost:3000/posts/105");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
    @Test
    public void putPost(){
        TestLogger.log(getClass().getSimpleName()+":"+ CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 104);
        jsonObject.put("title", "Software Tester");
        jsonObject.put("author", "Alif Laila");

        request.body(jsonObject.toJSONString());
        Response response = request.put("http://localhost:3000/posts/104");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);
    }
    @Test
    public void putNullPost() {
        TestLogger.log(getClass().getSimpleName()+":"+ CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 999);
        jsonObject.put("title", "Fishing Tuna");
        jsonObject.put("author", "Lalu Mastan");
        request.body(jsonObject.toJSONString());
        Response response = request.put("http://localhost:3000/posts/999");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 404);
    }
    @Test
    public void getPost() {
        TestLogger.log(getClass().getSimpleName()+":"+ CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        Response response = request.get("http://localhost:3000/posts");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }

}
