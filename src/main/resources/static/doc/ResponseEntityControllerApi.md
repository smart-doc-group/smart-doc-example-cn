
# Test ResponseEntity
## ResponseEntity return List
**URL:** `http://localhost:8080/responseEntity/list`

**Type:** `GET`

**Author:** yu 2019/10/19.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** ResponseEntity return List





**Request-example:**
```
curl -X GET -i http://localhost:8080/responseEntity/list
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
userDetails|array|用户详情|-
└─githubAddress|string|测试|-
userList|array|用户列表|-
userName|string|用户名|-
nickName|string|昵称|-
userAddress|string|用户地址|-
userAge|int32|用户年龄|-
phone|string|手机号|-
createTime|int64|创建时间|-
small|float|钱少|-
money|double|钱太多了|-
ipv6|string|ipv6|-
telephone|string|固定电话|-

**Response-example:**
```
[
  {
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
    "small": 35.16,
    "money": 67.37,
    "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
    "telephone": "586.908.7202"
  }
]
```

