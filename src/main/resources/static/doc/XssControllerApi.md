
# xss拦击测试
## xss过滤普通post请求
**URL:** `http://localhost:8080/xss/text`

**Type:** `POST`

**Author:** yu 2019/1/20.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** xss过滤普通post请求



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
text|string|请求文本|false|-


**Request-example:**
```
curl -X POST -i http://localhost:8080/xss/text --data 'text=14ru47'
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
  "data": "xads8b",
  "code": "62125",
  "timestamp": "2021-08-07 15:39:03"
}
```

## xss过滤get请求
**URL:** `http://localhost:8080/xss/query`

**Type:** `GET`

**Author:** yu 2019/1/20.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** xss过滤get请求



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
query|string|请求参数|false|-


**Request-example:**
```
curl -X GET -i http://localhost:8080/xss/query?query=o2v29r
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
  "data": "4mx83o",
  "code": "62125",
  "timestamp": "2021-08-07 15:39:03"
}
```

## xss过滤json数据
**URL:** `http://localhost:8080/xss/json`

**Type:** `POST`

**Author:** yu 2019/1/20.

**Content-Type:** `application/json; charset=utf-8`

**Description:** xss过滤json数据




**Body-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
age|int32|年龄|false|-
name|string|姓名|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/xss/json --data '{
  "age": 49,
  "name": "adam.gibson"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|处理成功返回的业务数据|-
└─age|int32|年龄|-
└─name|string|姓名|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
  "success": true,
  "message": "success",
  "data": {
    "age": 49,
    "name": "adam.gibson"
  },
  "code": "62125",
  "timestamp": "2021-08-07 15:39:03"
}
```

