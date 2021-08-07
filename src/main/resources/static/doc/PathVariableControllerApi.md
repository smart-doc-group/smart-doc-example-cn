
# Path参数测试
## 接收数组类型pathVariable
**URL:** `http://localhost:8080/pathVariable/test/{id}`

**Type:** `GET`

**Author:** xingzi

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 接收数组类型pathVariable


**Path-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
id|array|No comments found.,[array of string]|true|



**Request-example:**
```
curl -X GET -i http://localhost:8080/pathVariable/test/
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
  "data": {
    "waring": "You may have used non-display generics."
  },
  "code": "62125",
  "timestamp": "2021-08-07 15:39:03"
}
```

## Path正则测试1
**URL:** `http://localhost:8080/pathVariable/download/{fileId:^[A-Za-z0-9_-]{10,50}$}`

**Type:** `GET`

**Author:** xingzi

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** Path正则测试1


**Path-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
fileId|string|文件id|true|-



**Request-example:**
```
curl -X GET -i http://localhost:8080/pathVariable/download/^5-z34-6gSc_U$
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
  "data": {
    "waring": "You may have used non-display generics."
  },
  "code": "62125",
  "timestamp": "2021-08-07 15:39:03"
}
```

## Path正则测试2
**URL:** `http://localhost:8080/pathVariable/download/{fileId:^[A-Za-z0-9_-]{10,50}$}/file`

**Type:** `GET`

**Author:** xingzi

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** Path正则测试2


**Path-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
fileId|string|文件id|true|-



**Request-example:**
```
curl -X GET -i http://localhost:8080/pathVariable/download/^_u4-6-44-24----_6nF$/file
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
  "data": {
    "waring": "You may have used non-display generics."
  },
  "code": "62125",
  "timestamp": "2021-08-07 15:39:03"
}
```

## Path正则测试3
**URL:** `http://localhost:8080/pathVariable/download/{fileId:^A-Za-z0-9_-{10,50}$}/file;	http:/localhost:8080/pathVariable/download/file/{fileId:^A-Za-z0-9_-{10,50}$}`

**Type:** `GET`

**Author:** xingzi

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** Path正则测试3


**Path-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
fileId|string|文件id|true|-



**Request-example:**
```
curl -X GET -i http://localhost:8080/pathVariable/download/^A-Za-z0-9_----------$/file
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
  "data": {
    "waring": "You may have used non-display generics."
  },
  "code": "62125",
  "timestamp": "2021-08-07 15:39:03"
}
```

