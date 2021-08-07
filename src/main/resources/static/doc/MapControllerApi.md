
# Map返回型接口api文档测试
## Map&lt;String,Integer&gt;结构
**URL:** `http://localhost:8080/map/primitive`

**Type:** `GET`

**Author:** yu 2018/06/27.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** Map&lt;String,Integer&gt;结构





**Request-example:**
```
curl -X GET -i http://localhost:8080/map/primitive
```

**Response-example:**
```
{
  "mapKey1": 612,
  "mapKey2": 508
}
```

## Map&lt;String,Object&gt;结构
**URL:** `http://localhost:8080/map/objectValue`

**Type:** `GET`

**Author:** yu 2018/06/27.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** Map&lt;String,Object&gt;结构





**Request-example:**
```
curl -X GET -i http://localhost:8080/map/objectValue
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{
  "mapKey": {
    "waring": "You may use java.util.Object for Map value; smart-doc can't be handle."
  }
}
```

## Map&lt;String,User&gt;结构
**URL:** `http://localhost:8080/map/object`

**Type:** `GET`

**Author:** yu 2018/06/27.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** Map&lt;String,User&gt;结构





**Request-example:**
```
curl -X GET -i http://localhost:8080/map/object
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
    "small": 41.75,
    "money": 43.36,
    "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
    "telephone": "586.908.7202"
  }
}
```

## Map&lt;String,Student&gt;结构
**URL:** `http://localhost:8080/map/test1`

**Type:** `GET`

**Author:** yu 2018/06/27.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** Map&lt;String,Student&gt;结构





**Request-example:**
```
curl -X GET -i http://localhost:8080/map/test1
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
      "small": 78.39,
      "money": 47.82,
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
        "small": 58.23,
        "money": 91.55,
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
        "small": 93.81,
        "money": 97.35,
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
      "small": 12.54,
      "money": 2.27,
      "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
      "telephone": "586.908.7202"
    }
  }
}
```

## Map&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构
**URL:** `http://localhost:8080/map/test2`

**Type:** `GET`

**Author:** yu 2018/06/27.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** Map&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构





**Request-example:**
```
curl -X GET -i http://localhost:8080/map/test2
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
  "mapKey": {
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
        "small": 89.77,
        "money": 27.44,
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
        "small": 51.65,
        "money": 34.19,
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
          "small": 47.38,
          "money": 25.48,
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
          "small": 89.38,
          "money": 62.95,
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
        "small": 22.18,
        "money": 83.99,
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
      "small": 74.22,
      "money": 95.97,
      "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
      "telephone": "586.908.7202"
    },
    "age": 49
  }
}
```

## TreeMap&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构
**URL:** `http://localhost:8080/map/test3`

**Type:** `GET`

**Author:** yu 2018/06/27.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** TreeMap&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构





**Request-example:**
```
curl -X GET -i http://localhost:8080/map/test3
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
  "mapKey": {
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
        "small": 26.17,
        "money": 1.42,
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
        "small": 47.14,
        "money": 2.27,
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
          "small": 23.95,
          "money": 45.87,
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
          "small": 98.32,
          "money": 57.41,
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
        "small": 97.18,
        "money": 46.23,
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
      "small": 95.72,
      "money": 72.31,
      "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
      "telephone": "586.908.7202"
    },
    "age": 49
  }
}
```

## Map&lt;String,Teacher&lt;Map&lt;String,User&gt;,Map&lt;String,User&gt;,Map&lt;String,User&gt;&gt;&gt;超复杂结构
**URL:** `http://localhost:8080/map/test4`

**Type:** `GET`

**Author:** yu 2018/06/27.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** Map&lt;String,Teacher&lt;Map&lt;String,User&gt;,Map&lt;String,User&gt;,Map&lt;String,User&gt;&gt;&gt;超复杂结构





**Request-example:**
```
curl -X GET -i http://localhost:8080/map/test4
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
data|object|泛型data|-
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
{
  "mapKey": {
    "data": {
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
        "small": 35.74,
        "money": 89.39,
        "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
        "telephone": "586.908.7202"
      }
    },
    "data1": {
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
        "small": 18.60,
        "money": 84.93,
        "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
        "telephone": "586.908.7202"
      }
    },
    "data2": {
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
        "small": 71.64,
        "money": 99.13,
        "ipv6": "88fc:6f30:77d0:9707:b6dd:d973:1870:8c8e",
        "telephone": "586.908.7202"
      }
    },
    "age": 49
  }
}
```

