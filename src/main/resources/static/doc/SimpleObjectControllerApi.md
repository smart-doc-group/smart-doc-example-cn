
# 普通java对象api文档测试
## 返回普通String测试
**URL:** `http://localhost:8080/simple/str`

**Type:** `GET`

**Author:** yu 2018/06/27.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 返回普通String测试





**Request-example:**
```
curl -X GET -i http://localhost:8080/simple/str
```

**Response-example:**
```
string
```

## 返回普通javabean
**URL:** `http://localhost:8080/simple/user`

**Type:** `POST`

**Author:** yu 2018/06/27.

**Content-Type:** `application/json; charset=utf-8`

**Description:** 返回普通javabean




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
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/simple/user --data '{
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
  "small": 97.64,
  "money": 83.24,
  "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
  "telephone": "586.908.7202"
}'
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
  "small": 20.67,
  "money": 23.35,
  "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
  "telephone": "586.908.7202"
}
```

## 返回复杂实体数据
**URL:** `http://localhost:8080/simple/stu`

**Type:** `POST`

**Author:** yu 2018/06/27.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 返回复杂实体数据





**Request-example:**
```
curl -X POST -i http://localhost:8080/simple/stu
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
stuName|string|姓名|-
stuAge|boolean|年龄|-
stuAddress|string|地址|-
user|object|用户对象|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
userMap|map|map用户信息|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
userTreeSet|array|用户列表|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
user1|object|用户对象2|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-

**Response-example:**
```
{
  "stuName": "adam.gibson",
  "stuAge": true,
  "stuAddress": "6133 Alfredo Knoll， North Stormyfort， WV 13566-4252",
  "user": {
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
    "small": 73.50,
    "money": 77.64,
    "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
    "telephone": "586.908.7202"
  },
  "userMap": {
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
      "small": 79.43,
      "money": 98.43,
      "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
      "telephone": "586.908.7202"
    }
  },
  "userTreeSet": [
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
      "small": 37.87,
      "money": 68.73,
      "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
      "telephone": "586.908.7202"
    }
  ],
  "user1": {
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
    "small": 62.78,
    "money": 96.60,
    "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
    "telephone": "586.908.7202"
  }
}
```

## Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;结构
**URL:** `http://localhost:8080/simple/teacher`

**Type:** `POST`

**Author:** yu 2018/06/27.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;结构





**Request-example:**
```
curl -X POST -i http://localhost:8080/simple/teacher
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
data|object|泛型data|-
└─data|object|泛型data|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─data1|object|泛型data1|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─data2|object|data2|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─age|int32|年龄|-
data1|object|泛型data1|-
└─data|object|泛型data|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─data1|object|泛型data1|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─data2|object|data2|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─age|int32|年龄|-
data2|object|data2|-
└─data|object|泛型data|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─data1|object|泛型data1|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─data2|object|data2|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─age|int32|年龄|-
age|int32|年龄|-

**Response-example:**
```
{
  "data": {
    "data": {
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
      "small": 85.35,
      "money": 61.16,
      "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
      "telephone": "586.908.7202"
    },
    "data1": {
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
      "small": 65.10,
      "money": 90.84,
      "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
      "telephone": "586.908.7202"
    },
    "data2": {
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
      "small": 2.38,
      "money": 61.59,
      "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
      "telephone": "586.908.7202"
    },
    "age": 49
  },
  "data1": {
    "data": {
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
      "small": 94.04,
      "money": 39.55,
      "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
      "telephone": "586.908.7202"
    },
    "data1": {
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
      "small": 80.79,
      "money": 34.61,
      "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
      "telephone": "586.908.7202"
    },
    "data2": {
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
      "small": 67.94,
      "money": 81.02,
      "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
      "telephone": "586.908.7202"
    },
    "age": 49
  },
  "data2": {
    "data": {
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
      "small": 91.80,
      "money": 95.38,
      "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
      "telephone": "586.908.7202"
    },
    "data1": {
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
      "small": 84.98,
      "money": 90.17,
      "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
      "telephone": "586.908.7202"
    },
    "data2": {
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
      "small": 96.81,
      "money": 71.42,
      "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
      "telephone": "586.908.7202"
    },
    "age": 49
  },
  "age": 49
}
```

## Teacher&lt;List&lt;User&gt;, User, Student&gt;
**URL:** `http://localhost:8080/simple/teacher2`

**Type:** `POST`

**Author:** yu 2018/06/27.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** Teacher&lt;List&lt;User&gt;, User, Student&gt;





**Request-example:**
```
curl -X POST -i http://localhost:8080/simple/teacher2
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
data|array|泛型data|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
data1|object|泛型data1|-
└─stuName|string|姓名|-
└─stuAge|boolean|年龄|-
└─stuAddress|string|地址|-
└─user|object|用户对象|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─userMap|map|map用户信息|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─userTreeSet|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
└─user1|object|用户对象2|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userList|array|用户列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAddress|string|用户地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userAge|int32|用户年龄|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─phone|string|手机号|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|int64|创建时间|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─small|float|钱少|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─money|double|钱太多了|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ipv6|string|ipv6|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─telephone|string|固定电话|-
data2|object|data2|-
└─userDetails|array|用户详情|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─githubAddress|string|测试|-
└─userList|array|用户列表|-
└─userName|string|用户名|-
└─nickName|string|昵称|-
└─userAddress|string|用户地址|-
└─userAge|int32|用户年龄|-
└─phone|string|手机号|-
└─createTime|int64|创建时间|-
└─small|float|钱少|-
└─money|double|钱太多了|-
└─ipv6|string|ipv6|-
└─telephone|string|固定电话|-
age|int32|年龄|-

**Response-example:**
```
{
  "data": [
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
      "small": 91.99,
      "money": 53.10,
      "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
      "telephone": "586.908.7202"
    }
  ],
  "data1": {
    "stuName": "adam.gibson",
    "stuAge": true,
    "stuAddress": "6133 Alfredo Knoll， North Stormyfort， WV 13566-4252",
    "user": {
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
      "small": 79.61,
      "money": 32.57,
      "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
      "telephone": "586.908.7202"
    },
    "userMap": {
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
        "small": 34.83,
        "money": 69.38,
        "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
        "telephone": "586.908.7202"
      }
    },
    "userTreeSet": [
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
        "small": 56.08,
        "money": 50.67,
        "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
        "telephone": "586.908.7202"
      }
    ],
    "user1": {
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
      "small": 37.22,
      "money": 11.87,
      "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
      "telephone": "586.908.7202"
    }
  },
  "data2": {
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
    "small": 67.87,
    "money": 18.11,
    "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
    "telephone": "586.908.7202"
  },
  "age": 49
}
```

## 测试SubUser
**URL:** `http://localhost:8080/simple/subUser`

**Type:** `POST`

**Author:** yu 2018/06/27.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 测试SubUser





**Request-example:**
```
curl -X POST -i http://localhost:8080/simple/subUser
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
subUserName|string|用户名称|-
numbers|number|bigInteger|-

**Response-example:**
```
{
  "subUserName": "张三",
  "numbers": 983
}
```

## 返回CommonResult&lt;SubUser&gt;
**URL:** `http://localhost:8080/simple/subUser/result`

**Type:** `POST`

**Author:** yu 2018/06/27.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** 返回CommonResult&lt;SubUser&gt;





**Request-example:**
```
curl -X POST -i http://localhost:8080/simple/subUser/result
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|处理成功返回的业务数据|-
└─subUserName|string|用户名称|-
└─numbers|number|bigInteger|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
  "success": true,
  "message": "success",
  "data": {
    "subUserName": "张三",
    "numbers": 152
  },
  "code": "62125",
  "timestamp": "2021-08-07 15:39:03"
}
```

