
# 文件上传测试
## 上传单个文件
**URL:** `http://localhost:8080/upload`

**Type:** `POST`

**Author:** yu 2019/10/31.

**Content-Type:** `multipart/form-data`

**Description:** 上传单个文件



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
userId|string|用户id|false|-
file|file|文件|true|-


**Request-example:**
```
curl -X POST -H 'Content-Type: multipart/form-data' -i http://localhost:8080/upload --data 'userId=67'
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

## 批量上传文件
**URL:** `http://localhost:8080/batchUpload`

**Type:** `POST`

**Author:** yu 2019/10/31.

**Content-Type:** `multipart/form-data`

**Description:** 批量上传文件



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
file|file|文件(array of file)|true|-


**Request-example:**
```
curl -X POST -H 'Content-Type: multipart/form-data' -i http://localhost:8080/batchUpload
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

## 批量上传文件1
**URL:** `http://localhost:8080/batchUpload1`

**Type:** `POST`

**Author:** yu 2019/10/31.

**Content-Type:** `multipart/form-data`

**Description:** 批量上传文件1



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
file|file|文件(array of file)|true|-


**Request-example:**
```
curl -X POST -H 'Content-Type: multipart/form-data' -i http://localhost:8080/batchUpload1
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

## 批量上传文件2
**URL:** `http://localhost:8080/batchUpload2`

**Type:** `POST`

**Author:** yu 2019/10/31.

**Content-Type:** `multipart/form-data`

**Description:** 批量上传文件2



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
files|file|批量文件(array of file)|true|-


**Request-example:**
```
curl -X POST -H 'Content-Type: multipart/form-data' -i http://localhost:8080/batchUpload2
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

## 批量上传文件3
**URL:** `http://localhost:8080/batchUpload3`

**Type:** `POST`

**Author:** yu 2019/10/31.

**Content-Type:** `multipart/form-data`

**Description:** 批量上传文件3



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
files|file|批量文件(array of file)|true|-


**Request-example:**
```
curl -X POST -H 'Content-Type: multipart/form-data' -i http://localhost:8080/batchUpload3
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

