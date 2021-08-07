
# JSR303参数验证规范测试
## 验证validate
**URL:** `http://localhost:8080/validator/test`

**Type:** `POST`

**Author:** yu 2018/06/28.

**Content-Type:** `application/json; charset=utf-8`

**Description:** 验证validate




**Body-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|true|-
birthday|string|生日|true|-
age|int32|年龄|false|-
subject|object|科目|true|-
└─subjectName|string|科目名称|true|-
└─core|int32|分数|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/validator/test --data '{
  "name": "adam.gibson",
  "birthday": "2021-08-07",
  "age": 49,
  "subject": {
    "subjectName": "adam.gibson",
    "core": 74
  }
}'
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

## 验证通用参数
**URL:** `http://localhost:8080/validator/valid`

**Type:** `POST`

**Author:** yu 2018/06/28.

**Content-Type:** `application/json; charset=utf-8`

**Description:** 验证通用参数




**Body-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
token|string|token|true|-
sequenceNo|string|序列号|true|-
parameter|object|No comments found.|false|-
└─subUserName|string|用户名称|true|-
└─numbers|number|bigInteger|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/validator/valid --data '{
  "token": "ojmz40",
  "sequenceNo": "lvv04u",
  "parameter": {
    "subUserName": "张三",
    "numbers": 395
  }
}'
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

## 分组验证1
**URL:** `http://localhost:8080/validator/save`

**Type:** `POST`

**Author:** yu 2018/06/28.

**Content-Type:** `application/json; charset=utf-8`

**Description:** 分组验证1




**Body-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
id|int64|主键id|false|-
name|string|名称|false|-
mobile|string|电话|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/validator/save --data '{
  "id": 422,
  "name": "adam.gibson",
  "mobile": "(817) 227-6384"
}'
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

## 分组验证2
**URL:** `http://localhost:8080/validator/update`

**Type:** `POST`

**Author:** yu 2018/06/28.

**Content-Type:** `application/json; charset=utf-8`

**Description:** 分组验证2




**Body-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
id|int64|主键id|false|-
name|string|名称|false|-
mobile|string|电话|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/validator/update --data '{
  "id": 775,
  "name": "adam.gibson",
  "mobile": "(817) 227-6384"
}'
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

## 分组验证3
**URL:** `http://localhost:8080/validator/login`

**Type:** `POST`

**Author:** yu 2018/06/28.

**Content-Type:** `application/json; charset=utf-8`

**Description:** 分组验证3




**Body-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
id|int64|主键id|false|-
name|string|名称|false|-
mobile|string|电话|true|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/validator/login --data '{
  "id": 859,
  "name": "adam.gibson",
  "mobile": "(817) 227-6384"
}'
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

## 分页查询
**URL:** `http://localhost:8080/validator/list`

**Type:** `POST`

**Author:** yu 2018/06/28.

**Content-Type:** `application/json; charset=utf-8`

**Description:** 分页查询




**Body-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|true|-
birthday|string|生日|true|-
age|int32|年龄|false|-
subject|object|科目|true|-
└─subjectName|string|科目名称|true|-
└─core|int32|分数|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/validator/list --data '{
  "name": "adam.gibson",
  "birthday": "2021-08-07",
  "age": 49,
  "subject": {
    "subjectName": "adam.gibson",
    "core": 61
  }
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|姓名|-
birthday|string|生日|-
age|int32|年龄|-
subject|object|科目|-
└─subjectName|string|科目名称|-
└─core|int32|分数|-

**Response-example:**
```
{
  "name": "adam.gibson",
  "birthday": "2021-08-07",
  "age": 49,
  "subject": {
    "subjectName": "adam.gibson",
    "core": 776
  }
}
```

