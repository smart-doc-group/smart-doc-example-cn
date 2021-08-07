
# app端接口测试
## 创建人员
**URL:** `http://localhost:8080/app/`

**Type:** `POST`

**Author:** yu 2018/9/4.

**Content-Type:** `application/json; charset=utf-8`

**Description:** 如果创建成功将会发送MQTT消息：person/{id}/create




**Body-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
name|string|名字|false|-
sex|enum|性别<br/>MALE<br/>FEMALE<br/>|false|-
childrenIds|array|子女ID|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/app/ --data '{
  "name": "张三",
  "sex": "MALE",
  "childrenIds": [
    344
  ]
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

## Test Constants
**URL:** `http://localhost:8080/app/admin/testConstants/1.0`

**Type:** `GET`

**Author:** yu 2018/9/4.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** Test Constants



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
page|int32|页码|false|-


**Request-example:**
```
curl -X GET -i http://localhost:8080/app/admin/testConstants/1.0?page=0
```

**Response-example:**
```
Doesn't return a value.
```

## 分页查询订单信息
**URL:** `http://localhost:8080/app/page/{pageIndex}/{pageSize}`

**Type:** `GET`

**Author:** yu 2018/9/4.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 分页查询订单信息


**Path-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
pageIndex|int32|当前页码|true|-
pageSize|int32|页面大小|true|-



**Request-example:**
```
curl -X GET -i http://localhost:8080/app/page/255/10
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
records|array|分页数据|-
└─orderId|int32|订单id|-
└─orderType|enum|订单类型<br/>WAIT_PAY -("0","已支付")<br/>PAID -("1","已支付")<br/>EXPIRED -("2","已经失效")<br/>|-
total|int64|获取总记录|-
size|int64|每页显示条数|-
count|int64|总数|-
page|int64|当前页码|-

**Response-example:**
```
{
  "records": [
    {
      "orderId": 912,
      "orderType": "WAIT_PAY"
    }
  ],
  "total": 616,
  "size": 354,
  "count": 497,
  "page": 68
}
```

## app测试
**URL:** `http://localhost:8080/app/test`

**Type:** `POST`

**Author:** yu 2018/9/4.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** app测试



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|false|-
beginTime|string|开始时间|false|-
endTime|string|结束时间|false|-


**Request-example:**
```
curl -X POST -i http://localhost:8080/app/test --data 'name=zhangsan&endTime=2021-08-07 15:39:03&beginTime=2021-08-07 15:39:03'
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

## app测试2
**URL:** `http://localhost:8080/app/test2`

**Type:** `GET`

**Author:** yu 2018/9/4.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** app测试2



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|false|-
beginTime|string|开始时间|false|-
endTime|string|结束时间|false|-


**Request-example:**
```
curl -X GET -i http://localhost:8080/app/test2?beginTime=2021-08-07 15:39:03&endTime=2021-08-07 15:39:03&name=adam.gibson
```

**Response-example:**
```
string
```

## app测试3
**URL:** `http://localhost:8080/app/test3`

**Type:** `GET`

**Author:** yu 2018/9/4.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** app测试3



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|false|-
beginTime|string|开始时间|false|-
endTime|string|结束时间|false|-


**Request-example:**
```
curl -X GET -i http://localhost:8080/app/test3?beginTime=2021-08-07 15:39:03&name=adam.gibson&endTime=2021-08-07 15:39:03
```

**Response-example:**
```
string
```

