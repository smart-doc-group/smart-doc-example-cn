
# 测试json
## RequestParam+json
**URL:** `http://localhost:8080/getUserJson`

**Type:** `POST`

**Author:** yu 2020/11/17.

**Content-Type:** `application/json; charset=utf-8`

**Description:** RequestParam+json



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
name|string|No comments found.|true|-

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
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/getUserJson?name=adam.gibson --data '{
  "dataExpressionEnum": "SENSIRION",
  "menuPermissionCodes": [
    "WAIT_PAY"
  ],
  "date": "2019-01-01",
  "username": "adam.gibson",
  "idCard": "420912197503134437",
  "age": 49,
  "age2": 440
}'
```

**Response-example:**
```
string
```

