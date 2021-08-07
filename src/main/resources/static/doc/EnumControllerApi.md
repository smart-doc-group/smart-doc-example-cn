
# 枚举参数测试
## 获取枚举参数1
**URL:** `http://localhost:8080/enum`

**Type:** `GET`

**Author:** yu 2019/11/28.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 获取枚举参数1



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
simpleEnum|enum|RED<br/>BLUE<br/>|false|-


**Request-example:**
```
curl -X GET -i http://localhost:8080/enum?simpleEnum=RED
```

**Response-example:**
```
string
```

## 获取枚举参数2
**URL:** `http://localhost:8080/enum/{orderEnum}`

**Type:** `GET`

**Author:** yu 2019/11/28.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 获取枚举参数2


**Path-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
orderEnum|enum|WAIT_PAY -(0,已支付)<br/>PAID -(1,已支付)<br/>EXPIRED -(2,已经失效)<br/>|true|-



**Request-example:**
```
curl -X GET -i http://localhost:8080/enum/WAIT_PAY
```

**Response-example:**
```
string
```

## 获取枚举参数3
**URL:** `http://localhost:8080/enum/{simpleEnum}`

**Type:** `GET`

**Author:** yu 2019/11/28.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 获取枚举参数3


**Path-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
simpleEnum|enum|RED<br/>BLUE<br/>|true|-



**Request-example:**
```
curl -X GET -i http://localhost:8080/enum/RED
```

**Response-example:**
```
string
```

## 获取枚举参数4
**URL:** `http://localhost:8080/enum/test1`

**Type:** `POST`

**Author:** yu 2019/11/28.

**Content-Type:** `application/json; charset=utf-8`

**Description:** 获取枚举参数4




**Body-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
orderId|int32|订单id|false|-
orderType|enum|订单类型<br/>WAIT_PAY -("0","已支付")<br/>PAID -("1","已支付")<br/>EXPIRED -("2","已经失效")<br/>|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/enum/test1 --data '{
  "orderId": 445,
  "orderType": "WAIT_PAY"
}'
```

**Response-example:**
```
string
```

## 枚举响应
**URL:** `http://localhost:8080/enum/resp`

**Type:** `GET`

**Author:** yu 2019/11/28.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 枚举响应





**Request-example:**
```
curl -X GET -i http://localhost:8080/enum/resp
```

**Response-example:**
```
RED
```

