package TestCases;

import org.testng.annotations.Test;

public class TestCase2 extends BaseClass2 {

	@Test
	public void setTestCookies()
	{
		String adminId="adminId";
		//String value;
		setCookies(adminId, "17000");
		
		String token="token";
		setCookies(token, "eyJhbGciOiAic2VjcmV0IiwidHlwIjogIkpXVCJ9.eyJhZG1pbklkIjoiMTcwMDAiLCJuYW1lIjoiaml0ZXNoLmdoIn0%3D.e1fa1c0c09140df28a3e3eaff74524dc");
		
		String groups="groups";
		setCookies(groups, "\"[\\\"AUTOOPT-DBA\\\"]\"");
		
		String sessionId="sessionId";
		setCookies(sessionId, "s292f7a3998d689f1796cecfa2a18b01a5e7cba401");
		
		String nameId="nameId";
		setCookies(nameId, "\"jitesh.gh@media.net\"");
		
		String name="name";
		setCookies(nameId, "jitesh.gh");
		
		/*String 1P_JAR="1P_JAR";
		setCookies(1P_JAR, "2021-11-19-13");*/
		
		
		
		
		
		
		
		
		
	}

}
