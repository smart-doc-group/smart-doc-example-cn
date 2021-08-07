
# mybatis-plus分页测试
## mybatis-plus原始分页类测试
**URL:** `http://localhost:8080/mybatis/plus/page`

**Type:** `GET`

**Author:** yu 2020/6/30.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** mybatis-plus原始分页类测试





**Request-example:**
```
curl -X GET -i http://localhost:8080/mybatis/plus/page
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|处理成功返回的业务数据|-
└─searchCount|boolean|是否进行 count 查询|-
└─pages|int64|当前分页总页数|-
└─hitCount|boolean|是否命中count缓存|-
└─records|array|查询数据列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─roleId|int32|角色id|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─roleName|string|角色名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─age|int32|年龄|-
└─total|int64|总数|-
└─size|int64|每页显示条数，默认 10|-
└─current|int64|当前页|-
└─orders|array|排序字段信息|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─column|string|需要进行排序的字段|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─asc|boolean|是否正序排列，默认 true|-
└─optimizeCountSql|boolean|自动优化 COUNT SQL|-
└─countId|string|countId|-
└─maxLimit|int64|countId|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
  "success": true,
  "message": "success",
  "data": {
    "searchCount": true,
    "pages": 855,
    "hitCount": true,
    "records": [
      {
        "roleId": 846,
        "roleName": "adam.gibson",
        "age": 49
      }
    ],
    "total": 122,
    "size": 350,
    "current": 523,
    "orders": [
      {
        "column": "53xkav",
        "asc": true
      }
    ],
    "optimizeCountSql": true,
    "countId": "67",
    "maxLimit": 331
  },
  "code": "62125",
  "timestamp": "2021-08-07 15:39:03"
}
```

## mybatis-plus分页自定义处理测试
**URL:** `http://localhost:8080/mybatis/plus/page2`

**Type:** `GET`

**Author:** yu 2020/6/30.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** mybatis-plus分页自定义处理测试





**Request-example:**
```
curl -X GET -i http://localhost:8080/mybatis/plus/page2
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|处理成功返回的业务数据|-
└─records|array|分页数据|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─roleId|int32|角色id|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─roleName|string|角色名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─age|int32|年龄|-
└─total|int64|获取总记录|-
└─size|int64|每页显示条数|-
└─count|int64|总数|-
└─page|int64|当前页码|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
  "success": true,
  "message": "success",
  "data": {
    "records": [
      {
        "roleId": 300,
        "roleName": "adam.gibson",
        "age": 49
      }
    ],
    "total": 202,
    "size": 911,
    "count": 560,
    "page": 574
  },
  "code": "62125",
  "timestamp": "2021-08-07 15:39:03"
}
```

## mybatis-plus分页自定义处理测试2
**URL:** `http://localhost:8080/mybatis/plus/page3`

**Type:** `GET`

**Author:** yu 2020/6/30.

**Content-Type:** `application/x-www-form-urlencoded;charset=utf-8`

**Description:** mybatis-plus分页自定义处理测试2





**Request-example:**
```
curl -X GET -i http://localhost:8080/mybatis/plus/page3
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|处理成功返回的业务数据|-
└─records|array|查询数据列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─roleId|int32|角色id|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─roleName|string|角色名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─age|int32|年龄|-
└─total|int64|总数|-
└─countId|string|countId|-
└─maxLimit|int64|countId|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
  "success": true,
  "message": "success",
  "data": {
    "records": [
      {
        "roleId": 641,
        "roleName": "adam.gibson",
        "age": 49
      }
    ],
    "total": 36,
    "countId": "67",
    "maxLimit": 343
  },
  "code": "62125",
  "timestamp": "2021-08-07 15:39:03"
}
```

