
# 简单对象测试2
## CommonResult&lt;String&gt;
**URL:** `http://localhost:8080/stringCommonResult`

**Type:** `POST`

**Author:** yu 2018/06/30.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** CommonResult&lt;String&gt;





**Request-example:**
```
curl -X POST -i http://localhost:8080/stringCommonResult
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
  "data": "8f4v0l",
  "code": "62125",
  "timestamp": "2021-08-07 15:39:03"
}
```

## 返回Staff&lt;Staff&lt;Staff&gt;&gt;
**URL:** `http://localhost:8080/staff`

**Type:** `POST`

**Author:** yu 2018/06/30.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 返回Staff&lt;Staff&lt;Staff&gt;&gt;





**Request-example:**
```
curl -X POST -i http://localhost:8080/staff
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|职工名称|-
annyObject|object|任何信息对象|-
└─name|string|职工名称|-
└─annyObject|object|任何信息对象|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|职工名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─annyObject|object|任何信息对象|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─data|array|泛型数据|-
└─data|array|泛型数据|-
data|array|泛型数据|-
└─name|string|职工名称|-
└─annyObject|object|任何信息对象|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|职工名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─annyObject|object|任何信息对象|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─data|array|泛型数据|-
└─data|array|泛型数据|-

**Response-example:**
```
{
  "name": "adam.gibson",
  "annyObject": {
    "name": "adam.gibson",
    "annyObject": {
      "$ref": "..."
    },
    "data": [
      {
        "$ref": ".."
      }
    ]
  },
  "data": [
    {
      "name": "adam.gibson",
      "annyObject": {
        "$ref": "..."
      },
      "data": [
        {
          "$ref": ".."
        }
      ]
    }
  ]
}
```

## 返回Staff&lt;String&gt;
**URL:** `http://localhost:8080/staffStr`

**Type:** `POST`

**Author:** yu 2018/06/30.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 返回Staff&lt;String&gt;





**Request-example:**
```
curl -X POST -i http://localhost:8080/staffStr
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|职工名称|-
annyObject|object|任何信息对象|-
data|array|泛型数据|-

**Response-example:**
```
{
  "name": "adam.gibson",
  "annyObject": "s8c5jw",
  "data": [
    "xmq6wu"
  ]
}
```

## JAVA继承测试
**URL:** `http://localhost:8080/children`

**Type:** `POST`

**Author:** yu 2018/06/30.

**Content-Type:** `application/json; charset=utf-8`

**Description:** JAVA继承测试




**Body-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
age|int32|年龄|false|-
name|string|姓名|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/children --data '{
  "age": 49,
  "name": "adam.gibson"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
age|int32|年龄|-
name|string|姓名|-

**Response-example:**
```
{
  "age": 49,
  "name": "adam.gibson"
}
```

