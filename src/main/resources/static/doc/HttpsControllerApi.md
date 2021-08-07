
# https测试
## 测试https
**URL:** `http://localhost:8080/testHttps`

**Type:** `GET`

**Author:** yu 2018/12/20.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 测试https





**Request-example:**
```
curl -X GET -i http://localhost:8080/testHttps
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|处理成功返回的业务数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
  "success": true,
  "message": "success",
  "data": "9ksdkg",
  "code": "62125",
  "timestamp": "2021-08-07 15:39:03"
}
```

## 测试http
**URL:** `http://localhost:8080/testHttp`

**Type:** `GET`

**Author:** yu 2018/12/20.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 测试http





**Request-example:**
```
curl -X GET -i http://localhost:8080/testHttp
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|处理成功返回的业务数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
  "success": true,
  "message": "success",
  "data": "6c14ai",
  "code": "62125",
  "timestamp": "2021-08-07 15:39:03"
}
```

