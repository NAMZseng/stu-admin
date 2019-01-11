import java.math.BigDecimal;

import org.junit.Test;

import models.CollegeStudent;
import play.mvc.Http.Response;
import play.test.FunctionalTest;



public class ApplicationTest extends FunctionalTest {

    @Test
    public void testThatIndexPageWorks() {
        Response response = GET("/");
        assertIsOk(response);
        assertContentType("text/html", response);
        assertCharset(play.Play.defaultWebEncoding, response);
    }
    @Test
    public void testCollegeStudent() {
    	
       CollegeStudent st = new CollegeStudent();
       st.name = "Nam";
       st.tuitionFee = new BigDecimal(5800.99);
       st.courseNum = 21;
       st.averageSore = new BigDecimal(3.75);
       st.save();
       
       CollegeStudent cst = CollegeStudent.find("byName", "Nam").first();
       assertEquals(cst.name, "Nam");

    }
}