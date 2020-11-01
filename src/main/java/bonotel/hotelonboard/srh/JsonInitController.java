package bonotel.hotelonboard.srh;

import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;
import org.apache.struts2.rest.RestActionMapper;

public class JsonInitController extends RestActionMapper{
	private String jsonPath;
	
	public String getJsonPath() {
		return jsonPath;
	}

	public void setJsonPath(String jsonPath) {
		this.jsonPath = jsonPath;
	}
	

	/*  POST	http://localhost:8080/ZeroTouchHotelOnboard/api/processhotels
	 * 
	 * {
	 *   "jsonPath":"C:\\Users\\Ruwan..Wedisa\\Documents\\rest-working"
	 * }
	 */
	
	public HttpHeaders create() {
		System.out.println("jsonPath :"+getJsonPath());
		return new DefaultHttpHeaders("create");
	}

}
