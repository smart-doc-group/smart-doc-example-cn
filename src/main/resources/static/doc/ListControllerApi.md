
# List返回接口Api文档测试
## List&lt;String&gt;结构
**URL:** `http://localhost:8080/list/listString`

**Type:** `GET`

**Author:** yu 2018/06/27.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** List&lt;String&gt;结构





**Request-example:**
```
curl -X GET -i http://localhost:8080/list/listString
```

**Response-example:**
```
[
  "emq8c9",
  "4dgppk"
]
```

## List&lt;Map&lt;String,String&gt;&gt;结构
**URL:** `http://localhost:8080/list/listMap`

**Type:** `GET`

**Author:** yu 2018/06/27.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** List&lt;Map&lt;String,String&gt;&gt;结构





**Request-example:**
```
curl -X GET -i http://localhost:8080/list/listMap
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
-|object|Return object.|-

**Response-example:**
```
[
  {
    "mapKey1": "nh94sb",
    "mapKey2": "69z5m8"
  }
]
```

## List&lt;自动义对象&gt;
**URL:** `http://localhost:8080/list/listObject`

**Type:** `POST`

**Author:** yu 2018/06/27.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** List&lt;自动义对象&gt;





**Request-example:**
```
curl -X POST -i http://localhost:8080/list/listObject
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
    "small": 35.59,
    "money": 28.36,
    "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
    "telephone": "586.908.7202"
  }
]
```

## List&lt;Map&lt;String,T&gt;&gt;结构
**URL:** `http://localhost:8080/list/listMap2`

**Type:** `GET`

**Author:** yu 2018/06/27.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** List&lt;Map&lt;String,T&gt;&gt;结构





**Request-example:**
```
curl -X GET -i http://localhost:8080/list/listMap2
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
stuName|string|姓名|-
stuAge|boolean|年龄|-
stuAddress|string|地址|-
user|object|用户对象|-
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
userMap|map|map用户信息|-
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
userTreeSet|array|用户列表|-
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
user1|object|用户对象2|-
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

**Response-example:**
```
[
  {
    "mapKey": {
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
        "small": 95.43,
        "money": 85.96,
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
          "small": 79.77,
          "money": 71.37,
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
          "small": 68.13,
          "money": 50.30,
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
        "small": 80.05,
        "money": 9.37,
        "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
        "telephone": "586.908.7202"
      }
    }
  }
]
```

## List&lt;Map&lt;M,N&lt;P,k&gt;&gt;&gt;超复杂结构
**URL:** `http://localhost:8080/list/listMap3`

**Type:** `GET`

**Author:** yu 2018/06/27.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** List&lt;Map&lt;M,N&lt;P,k&gt;&gt;&gt;超复杂结构





**Request-example:**
```
curl -X GET -i http://localhost:8080/list/listMap3
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
data|object|泛型data|-
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
data1|object|泛型data1|-
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
age|int32|年龄|-

**Response-example:**
```
[
  {
    "mapKey": {
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
        "small": 74.46,
        "money": 83.50,
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
        "small": 6.50,
        "money": 40.74,
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
        "small": 50.98,
        "money": 8.33,
        "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
        "telephone": "586.908.7202"
      },
      "age": 49
    }
  }
]
```

## List&lt;T&lt;List&lt;M&gt;,List&lt;M&gt;,List&lt;M&gt;&gt;&gt;超复杂结构
**URL:** `http://localhost:8080/list/listTeacher`

**Type:** `GET`

**Author:** yu 2018/06/27.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** List&lt;T&lt;List&lt;M&gt;,List&lt;M&gt;,List&lt;M&gt;&gt;&gt;超复杂结构





**Request-example:**
```
curl -X GET -i http://localhost:8080/list/listTeacher
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
data1|array|泛型data1|-
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
data2|array|data2|-
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
[
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
        "small": 85.40,
        "money": 94.72,
        "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
        "telephone": "586.908.7202"
      }
    ],
    "data1": [
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
        "small": 87.75,
        "money": 86.17,
        "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
        "telephone": "586.908.7202"
      }
    ],
    "data2": [
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
        "small": 83.38,
        "money": 71.58,
        "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
        "telephone": "586.908.7202"
      }
    ],
    "age": 49
  }
]
```

## List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,User,User&gt;&gt;结构
**URL:** `http://localhost:8080/list/listString1`

**Type:** `GET`

**Author:** yu 2018/06/27.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,User,User&gt;&gt;结构





**Request-example:**
```
curl -X GET -i http://localhost:8080/list/listString1
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
[
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
        "small": 58.73,
        "money": 12.86,
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
        "small": 8.71,
        "money": 5.88,
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
        "small": 25.78,
        "money": 5.16,
        "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
        "telephone": "586.908.7202"
      },
      "age": 49
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
      "small": 18.83,
      "money": 93.12,
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
      "small": 99.51,
      "money": 13.73,
      "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
      "telephone": "586.908.7202"
    },
    "age": 49
  }
]
```

## List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;&gt;
**URL:** `http://localhost:8080/list/listString2`

**Type:** `GET`

**Author:** yu 2018/06/27.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;&gt;





**Request-example:**
```
curl -X GET -i http://localhost:8080/list/listString2
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
[
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
        "small": 14.37,
        "money": 71.52,
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
        "small": 15.16,
        "money": 86.78,
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
        "small": 73.76,
        "money": 81.64,
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
        "small": 94.39,
        "money": 99.52,
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
        "small": 50.84,
        "money": 73.97,
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
        "small": 30.00,
        "money": 97.68,
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
        "small": 0.69,
        "money": 35.75,
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
        "small": 32.02,
        "money": 34.33,
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
        "small": 74.95,
        "money": 22.37,
        "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
        "telephone": "586.908.7202"
      },
      "age": 49
    },
    "age": 49
  }
]
```

## CommonResult&lt;List&lt;UserDto&gt;&gt;
**URL:** `http://localhost:8080/list/listUserDto`

**Type:** `GET`

**Author:** yu 2018/06/27.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** CommonResult&lt;List&lt;UserDto&gt;&gt;





**Request-example:**
```
curl -X GET -i http://localhost:8080/list/listUserDto
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|array|处理成功返回的业务数据|-
└─token|string|token|-
└─LoginList|array|UserDto 用户信息列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─password|string|密码|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
  "success": true,
  "message": "success",
  "data": [
    {
      "token": "vev8hy",
      "LoginList": [
        {
          "userName": "adam.gibson",
          "password": "wlm2mr"
        }
      ]
    }
  ],
  "code": "62125",
  "timestamp": "2021-08-07 15:39:03"
}
```

