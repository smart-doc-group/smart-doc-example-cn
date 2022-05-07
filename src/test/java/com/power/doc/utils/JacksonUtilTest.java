package com.power.doc.utils;

import com.power.common.util.Base64Util;
import com.power.common.util.StringUtil;
import com.power.doc.entity.Employee;
import com.power.doc.model.mybatisplus.MybatisPlusPage;
import org.junit.jupiter.api.Test;

import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yu 2021/7/11.
 */

public class JacksonUtilTest {

    @Test
    public void testToJsonString() {
        String a ="eyJhbGciOiJSUzI1NiIsImtpZCI6IiJ9.eyJpc3MiOiJrdWJlcm5ldGVzL3NlcnZpY2VhY2NvdW50Iiwia3ViZXJuZXRlcy5pby9zZXJ2aWNlYWNjb3VudC9uYW1lc3BhY2UiOiJrdWJlLXN5c3RlbSIsImt1YmVybmV0ZXMuaW8vc2VydmljZWFjY291bnQvc2VjcmV0Lm5hbWUiOiJrOGRhc2gtdG9rZW4tcDcya2giLCJrdWJlcm5ldGVzLmlvL3NlcnZpY2VhY2NvdW50L3NlcnZpY2UtYWNjb3VudC5uYW1lIjoiazhkYXNoIiwia3ViZXJuZXRlcy5pby9zZXJ2aWNlYWNjb3VudC9zZXJ2aWNlLWFjY291bnQudWlkIjoiNzBjZGI2MWItYWYwOS0xMWVjLTllMjItYjQwNTVkYzhjMDUwIiwic3ViIjoic3lzdGVtOnNlcnZpY2VhY2NvdW50Omt1YmUtc3lzdGVtOms4ZGFzaCJ9.GwnT6VxcimJP2vZfOY-PfXsnudZsr61m95iTXjdmrFK0FxPazBbvd-pFlFYaUrsYYgOVzFJjkNwFyP1dYeXDMuyldNGuHh0P7HkF9SNOO28cru6Aw2hhF5KcszhXuUprFvyO0V4ez9NCZi_jUwjaxk11IxdfKvpAzM2QmEjLmu_jwCLe5mLbQU7yBUDqSX0g-SbkgGSJOrW-nQ0-p70r-mDW_bPlRPuz9nVJuElz5UJMMwGdTqfslZVyaJmRohGyh-evUZ2dZaROy0GcwG1EevpUW-6VN7UuAimJzoc5Z5iXP4L2b4ImDMCJI3VGwoHfNBRAphZrbppRRRhTg-GMTA";

        System.out.println(Base64Util.encryptToString(a));

    }

}
