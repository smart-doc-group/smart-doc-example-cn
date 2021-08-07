
# FastJson和Jackson注解支持测试
## Jackson注解支持测试
**URL:** `http://localhost:8080/json/jacksonTest`

**Type:** `GET`

**Author:** yu 2018/7/10.

**Content-Type:** `application/json; charset=utf-8`

**Description:** Jackson注解支持测试




**Body-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
name|string|用户名|false|-

**Request-example:**
```
curl -X GET -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/json/jacksonTest --data '{
  "name": "adam.gibson"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|用户名|-

**Response-example:**
```
{
  "name": "adam.gibson"
}
```

## FastJson注解支持测试
**URL:** `http://localhost:8080/json/fastJsonTest`

**Type:** `GET`

**Author:** yu 2018/7/10.

**Content-Type:** `application/json; charset=utf-8`

**Description:** FastJson注解支持测试




**Body-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
dataExpressionEnum|enum|枚举<br/>SENSIRION -("2101",null)<br/>|false|-
menuPermissionCodes|array|菜单/权限编码<br/>WAIT_PAY -("0","已支付")<br/>PAID -("1","已支付")<br/>EXPIRED -("2","已经失效")<br/>|false|-
date|string|学好|false|-
username|string|用户名|false|-
idCard|string|身份证号|false|-
age|int32|No comments found.|false|-
age2|int32|No comments found.|false|-

**Request-example:**
```
curl -X GET -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/json/fastJsonTest --data '{
  "dataExpressionEnum": "SENSIRION",
  "menuPermissionCodes": [
    "WAIT_PAY"
  ],
  "date": "2019-01-01",
  "username": "adam.gibson",
  "idCard": "420912197503134437",
  "age": 49,
  "age2": 397
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
dataExpressionEnum|enum|枚举<br/>SENSIRION -("2101",null)<br/>|-
menuPermissionCodes|array|菜单/权限编码<br/>WAIT_PAY -("0","已支付")<br/>PAID -("1","已支付")<br/>EXPIRED -("2","已经失效")<br/>|-
date|string|学好|-
username|string|用户名|-
idCard|string|身份证号|-
age|int32|No comments found.|-
age2|int32|No comments found.|-

**Response-example:**
```
{
  "dataExpressionEnum": "SENSIRION",
  "menuPermissionCodes": [
    "WAIT_PAY"
  ],
  "date": "2019-01-01",
  "username": "adam.gibson",
  "idCard": "420912197503134437",
  "age": 49,
  "age2": 927
}
```

