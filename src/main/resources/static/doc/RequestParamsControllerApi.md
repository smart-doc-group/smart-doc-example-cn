
# Spring boot params test
## Test Normal param binding
**URL:** `http://localhost:8080/testNormalParams/binding`

**Type:** `GET`

**Author:** yu 2019/9/28.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** Test Normal param binding



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
name|string|name|true|-
age|int32| age|false|-


**Request-example:**
```
curl -X GET -i http://localhost:8080/testNormalParams/binding?name=adam.gibson&age=49
```

**Response-example:**
```
Doesn't return a value.
```

## Test @RequestBody User
**URL:** `http://localhost:8080/testRequestBody`

**Type:** `POST`

**Author:** yu 2019/9/28.

**Content-Type:** `application/json; charset=utf-8`

**Description:** Test @RequestBody User




**Body-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
userDetails|array|用户详情|false|-
└─githubAddress|string|测试|false|-
userList|array|用户列表|false|-
userName|string|用户名|false|-
nickName|string|昵称|false|-
userAddress|string|用户地址|false|-
userAge|int32|用户年龄|false|-
phone|string|手机号|false|-
createTime|int64|创建时间|false|-
small|float|钱少|false|-
money|double|钱太多了|false|-
ipv6|string|ipv6|false|-
telephone|string|固定电话|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/testRequestBody --data '{
  "userDetails": [
    {
      "githubAddress": "6133 Alfredo Knoll， North Stormyfort， WV 13566-4252"
    }
  ],
  "userList": [
    {
      "$ref": ".."
    }
  ],
  "userName": "adam.gibson",
  "nickName": "shannon.williamson",
  "userAddress": "6133 Alfredo Knoll， North Stormyfort， WV 13566-4252",
  "userAge": 49,
  "phone": "586.908.7202",
  "createTime": 1628321943837,
  "small": 11.66,
  "money": 4.76,
  "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
  "telephone": "586.908.7202"
}'
```

**Response-example:**
```
Doesn't return a value.
```

## Test @RequestBody Map
**URL:** `http://localhost:8080/testRequestBodyMap`

**Type:** `POST`

**Author:** yu 2019/9/28.

**Content-Type:** `application/json; charset=utf-8`

**Description:** Test @RequestBody Map




**Body-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
userDetails|array|用户详情|false|-
└─githubAddress|string|测试|false|-
userList|array|用户列表|false|-
userName|string|用户名|false|-
nickName|string|昵称|false|-
userAddress|string|用户地址|false|-
userAge|int32|用户年龄|false|-
phone|string|手机号|false|-
createTime|int64|创建时间|false|-
small|float|钱少|false|-
money|double|钱太多了|false|-
ipv6|string|ipv6|false|-
telephone|string|固定电话|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/testRequestBodyMap --data '{
  "mapKey": {
    "userDetails": [
      {
        "githubAddress": "6133 Alfredo Knoll， North Stormyfort， WV 13566-4252"
      }
    ],
    "userList": [
      {
        "$ref": ".."
      }
    ],
    "userName": "adam.gibson",
    "nickName": "shannon.williamson",
    "userAddress": "6133 Alfredo Knoll， North Stormyfort， WV 13566-4252",
    "userAge": 49,
    "phone": "586.908.7202",
    "createTime": 1628321943837,
    "small": 75.81,
    "money": 70.06,
    "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
    "telephone": "586.908.7202"
  }
}'
```

**Response-example:**
```
Doesn't return a value.
```

## Test @RequestBody List
**URL:** `http://localhost:8080/testRequestBodyList`

**Type:** `POST`

**Author:** yu 2019/9/28.

**Content-Type:** `application/json; charset=utf-8`

**Description:** Test @RequestBody List




**Body-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
ids|array|array of user id,[array of string]|false|

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/testRequestBodyList --data '[
  "apc30b",
  "jyv8sb"
]'
```

**Response-example:**
```
Doesn't return a value.
```

## Test Array Params
**URL:** `http://localhost:8080/testArray`

**Type:** `POST`

**Author:** yu 2019/9/28.

**Content-Type:** `application/json; charset=utf-8`

**Description:** Test Array Params




**Body-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
success|boolean|是否成功|false|-
message|string|错误提示(成功succeed)|false|-
data|object|处理成功返回的业务数据|false|-
└─dataExpressionEnum|enum|枚举<br/>SENSIRION -("2101",null)<br/>|false|-
└─menuPermissionCodes|array|菜单/权限编码<br/>WAIT_PAY -("0","已支付")<br/>PAID -("1","已支付")<br/>EXPIRED -("2","已经失效")<br/>|false|-
└─date|string|学好|false|-
└─username|string|用户名|false|-
└─idCard|string|身份证号|false|-
└─age|int32|No comments found.|false|-
└─age2|int32|No comments found.|false|-
code|string|错误代码|false|-
timestamp|string|响应时间|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/testArray --data '[
  {
    "success": true,
    "message": "success",
    "data": {
      "dataExpressionEnum": "SENSIRION",
      "menuPermissionCodes": [
        "WAIT_PAY"
      ],
      "date": "2019-01-01",
      "username": "adam.gibson",
      "idCard": "420912197503134437",
      "age": 49,
      "age2": 953
    },
    "code": "62125",
    "timestamp": "2021-08-07 15:39:03"
  }
]'
```

**Response-example:**
```
string
```

## Test @PathVariable
**URL:** `http://localhost:8080/test/{name}/{no}/info`

**Type:** `GET`

**Author:** yu 2019/9/28.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** Test @PathVariable


**Path-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
name|string|name|true|-
no|string|  no|true|-



**Request-example:**
```
curl -X GET -i http://localhost:8080/test/adam.gibson/vwqcpb/info
```

**Response-example:**
```
Doesn't return a value.
```

## Test @RequestParam
**URL:** `http://localhost:8080/testRequestParam`

**Type:** `GET`

**Author:** yu 2019/9/28.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** Test @RequestParam



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
author|string|author|true|-
type|string|  type|true|-


**Request-example:**
```
curl -X GET -i http://localhost:8080/testRequestParam?author=詹姆斯&type=irvpqz
```

**Response-example:**
```
Doesn't return a value.
```

## Test @RequestParam with value
**URL:** `http://localhost:8080/testRequestParamWithValue`

**Type:** `GET`

**Author:** yu 2019/9/28.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** Use@RequestParam binding value is name,but method param name is userName



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
name|string|user name|true|-


**Request-example:**
```
curl -X GET -i http://localhost:8080/testRequestParamWithValue?name=adam.gibson
```

**Response-example:**
```
Doesn't return a value.
```

## Test @RequestParam with default value
**URL:** `http://localhost:8080/testRequestParamWithDefaultVal`

**Type:** `GET`

**Author:** yu 2019/9/28.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** Use@RequestParam binding default value Jordan



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
userName|string|user name|true|-


**Request-example:**
```
curl -X GET -i http://localhost:8080/testRequestParamWithDefaultVal?userName=Jordan
```

**Response-example:**
```
Doesn't return a value.
```

## Test much path
**URL:** `http://localhost:8080/testMuchPath/get/{userId};	http:/localhost:8080/testMuchPath/find/{userId}`

**Type:** `GET`

**Author:** yu 2019/9/28.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** giteeissues #I1545A


**Path-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
userId|int64|userId|true|-



**Request-example:**
```
curl -X GET -i http://localhost:8080/testMuchPath/get/969
```

**Response-example:**
```
Doesn't return a value.
```

## Test much path much parameter
**URL:** `http://localhost:8080/get/{deptId}/{userId};	http:/localhost:8080/find/{deptId}/{userId}`

**Type:** `POST`

**Author:** yu 2019/9/28.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** Test much path much parameter


**Path-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
userId|int64|userId|true|-
deptId|int64|deptId|true|-



**Request-example:**
```
curl -X POST -i http://localhost:8080/get/847/707
```

**Response-example:**
```
Doesn't return a value.
```

## Test Constants
**URL:** `http://localhost:8080/testConstants`

**Type:** `GET`

**Author:** yu 2019/9/28.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** Test Constants



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
page|int32|页码|false|-


**Request-example:**
```
curl -X GET -i http://localhost:8080/testConstants?page=0
```

**Response-example:**
```
Doesn't return a value.
```

## 测试mapping中的
**URL:** `http://localhost:8080/ex/bars`

**Type:** `GET`

**Author:** yu 2019/9/28.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 测试mapping中的



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
id|int32|parameter condition|true|-


**Request-example:**
```
curl -X GET -i http://localhost:8080/ex/bars?id=67
```

**Response-example:**
```
string
```

## 测试mapping中的2
**URL:** `http://localhost:8080/ex/bars`

**Type:** `GET`

**Author:** yu 2019/9/28.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 测试mapping中的2



**Query-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
id|int32|parameter condition|true|-
second|string|parameter condition|true|-


**Request-example:**
```
curl -X GET -i http://localhost:8080/ex/bars?id=67&second=01s192
```

**Response-example:**
```
string
```

