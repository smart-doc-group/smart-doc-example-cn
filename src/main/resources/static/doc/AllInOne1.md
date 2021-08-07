# smartdoc
Version |  Update Time  | Status | Author |  Description
---|---|---|---|---
v2021-08-07 17:14:28|2021-08-07 17:14:28|auto|@chenqi|Created by smart-doc



# default
## feign测试
### 解析路径
**URL:** http://localhost:8080/APP/www.baidu.com/{id}/{name}

**Type:** GET

**Author:** yu 2020/6/21.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 解析路径

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|string|标识|true|-
name|string|姓名|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/APP/www.baidu.com/102/leoma.mcglynn
```

**Response-example:**
```
string
```

### 模具
**URL:** http://localhost:8080/APP/www.baidu.com/enum

**Type:** GET

**Author:** yu 2020/6/21.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 模具

**Request-example:**
```
curl -X GET -i http://localhost:8080/APP/www.baidu.com/enum
```

**Response-example:**
```
string
```

## smart-doc调试入口
### Test Constants
**URL:** http://localhost:8080/testConstants/1.0

**Type:** GET

**Author:** boxer

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Test Constants

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
page|int32|页码|false|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/testConstants/1.0?page=0
```

**Response-example:**
```
Doesn't return a value.
```

## 异步返回信息测试
### 返回Callable&lt;CommonResult&gt;
**URL:** http://localhost:8080/testCallable

**Type:** GET

**Author:** yu 2019/9/22.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回Callable&lt;CommonResult&gt;

**Request-example:**
```
curl -X GET -i http://localhost:8080/testCallable
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
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### 返回DeferredResult&lt;CommonResult&lt;String&gt;&gt;
**URL:** http://localhost:8080/async-deferredresult

**Type:** GET

**Author:** yu 2019/9/22.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回DeferredResult&lt;CommonResult&lt;String&gt;&gt;

**Request-example:**
```
curl -X GET -i http://localhost:8080/async-deferredresult
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
  "data": "qtpjs3",
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### 返回WebAsyncTask&lt;CommonResult&gt;
**URL:** http://localhost:8080/WebAsync/timeout

**Type:** GET

**Author:** yu 2019/9/22.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回WebAsyncTask&lt;CommonResult&gt;

**Request-example:**
```
curl -X GET -i http://localhost:8080/WebAsync/timeout
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
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### 返回Future&lt;CommonResult&lt;String&gt;&gt;
**URL:** http://localhost:8080/future

**Type:** GET

**Author:** yu 2019/9/22.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回Future&lt;CommonResult&lt;String&gt;&gt;

**Request-example:**
```
curl -X GET -i http://localhost:8080/future
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
  "data": "mbskzc",
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### 返回CompletableFuture&lt;CommonResult&lt;String&gt;&gt;
**URL:** http://localhost:8080/completableFuture

**Type:** GET

**Author:** yu 2019/9/22.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回CompletableFuture&lt;CommonResult&lt;String&gt;&gt;

**Request-example:**
```
curl -X GET -i http://localhost:8080/completableFuture
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
  "data": "zcsdd1",
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

## 循环引用依赖测试
### 循环依赖参数推导
**URL:** http://localhost:8080/circularReference

**Type:** GET

**Author:** yu 2019/10/24.

**Content-Type:** application/json; charset=utf-8

**Description:** 循环依赖参数推导(不建议使用)

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
a|string|属性a|false|-
b|object|对象b|false|-
└─b|string|属性b|false|-
└─c|object|对象c|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─c|string|属性c|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─a|object|对象A|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─a|string|属性a|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─b|object|对象b|false|-

**Request-example:**
```
curl -X GET -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/circularReference --data '{
  "a": "ge18j7",
  "b": {
    "b": "eplwrs",
    "c": {
      "c": "6q4ss2",
      "a": {
        "a": "me3p56",
        "b": {
          "$ref": "..."
        }
      }
    }
  }
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
a|string|属性a|-
b|object|对象b|-
└─b|string|属性b|-
└─c|object|对象c|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─c|string|属性c|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─a|object|对象A|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─a|string|属性a|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─b|object|对象b|-

**Response-example:**
```
{
  "a": "3ewdrg",
  "b": {
    "b": "o986qf",
    "c": {
      "c": "kuzo5y",
      "a": {
        "a": "bscejc",
        "b": {
          "$ref": "..."
        }
      }
    }
  }
}
```

## json文件配置全局参数测试
### get请求测试query参数
**URL:** http://localhost:8080/configQueryParamGet

**Type:** GET

**Author:** "cqmike"

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** get请求测试query参数

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
configQueryParam|string|No comments found.|false|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/configQueryParamGet?configQueryParam=s7jnuz
```

**Response-example:**
```
Doesn't return a value.
```

### post请求测试query参数
**URL:** http://localhost:8080/configQueryParamPost

**Type:** POST

**Author:** "cqmike"

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** post请求测试query参数

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
configQueryParam|string|No comments found.|false|-

**Request-example:**
```
curl -X POST -i http://localhost:8080/configQueryParamPost --data 'configQueryParam=mxtnlh'
```

**Response-example:**
```
Doesn't return a value.
```

### get请求测试query参数和path参数
**URL:** http://localhost:8080/configParamGet/{configPathParam}

**Type:** GET

**Author:** "cqmike"

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** get请求测试query参数和path参数

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
configPathParam|string|No comments found.|true|-

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
configQueryParam|string|No comments found.|false|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/configParamGet/iplmz3?configQueryParam=0v3b6g
```

**Response-example:**
```
Doesn't return a value.
```

### post请求测试query参数和path参数
**URL:** http://localhost:8080/configParamPost/{configPathParam}

**Type:** POST

**Author:** "cqmike"

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** post请求测试query参数和path参数

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
configPathParam|string|No comments found.|true|-

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
configQueryParam|string|No comments found.|false|-

**Request-example:**
```
curl -X POST -i http://localhost:8080/configParamPost/fbo5o1 --data 'configQueryParam=svzlc9'
```

**Response-example:**
```
Doesn't return a value.
```

## 枚举参数测试
### 获取枚举参数1
**URL:** http://localhost:8080/enum

**Type:** GET

**Author:** yu 2019/11/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 获取枚举参数1

**Query-parameters:**

Parameter | Type|Description|Required|Since
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

### 获取枚举参数2
**URL:** http://localhost:8080/enum/{orderEnum}

**Type:** GET

**Author:** yu 2019/11/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 获取枚举参数2

**Path-parameters:**

Parameter | Type|Description|Required|Since
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

### 获取枚举参数3
**URL:** http://localhost:8080/enum/{simpleEnum}

**Type:** GET

**Author:** yu 2019/11/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 获取枚举参数3

**Path-parameters:**

Parameter | Type|Description|Required|Since
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

### 获取枚举参数4
**URL:** http://localhost:8080/enum/test1

**Type:** POST

**Author:** yu 2019/11/28.

**Content-Type:** application/json; charset=utf-8

**Description:** 获取枚举参数4

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
orderId|int32|订单id|false|-
orderType|enum|订单类型<br/>WAIT_PAY -("0","已支付")<br/>PAID -("1","已支付")<br/>EXPIRED -("2","已经失效")<br/>|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/enum/test1 --data '{
  "orderId": 910,
  "orderType": "WAIT_PAY"
}'
```

**Response-example:**
```
string
```

### 枚举响应
**URL:** http://localhost:8080/enum/resp

**Type:** GET

**Author:** yu 2019/11/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 枚举响应

**Request-example:**
```
curl -X GET -i http://localhost:8080/enum/resp
```

**Response-example:**
```
RED
```

## 文件下载
### 下载文件
**URL:** http://localhost:8080/download1/{filename}

**Type:** POST

**Author:** yu 2021/5/29.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** smart-doc自动识别文件流对象，不需要做文件下载标记

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
filename|string|文件名|true|-

**Request-example:**
```
curl -X POST -i http://localhost:8080/download1/me
```

**Response-example:**
```
File download.
```

### 下载普通文件文件
**URL:** http://localhost:8080/text/

**Type:** POST

**Author:** yu 2021/5/29.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 方法没有返回对象可以识别，需要做download标记

**Request-example:**
```
curl -X POST -i http://localhost:8080/text/
```

**Response-example:**
```
Doesn't return a value.
```

### 分页查询
**URL:** http://localhost:8080/list

**Type:** POST

**Author:** yu 2021/5/29.

**Content-Type:** application/json; charset=utf-8

**Description:** 分页查询

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/list --data '{}'
```

**Response-example:**
```
{}
```

## 文件上传测试
### 上传单个文件
**URL:** http://localhost:8080/upload

**Type:** POST

**Author:** yu 2019/10/31.

**Content-Type:** multipart/form-data

**Description:** 上传单个文件

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|string|用户id|false|-
file|file|文件|true|-

**Request-example:**
```
curl -X POST -H 'Content-Type: multipart/form-data' -i http://localhost:8080/upload --data 'userId=102'
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
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### 批量上传文件
**URL:** http://localhost:8080/batchUpload

**Type:** POST

**Author:** yu 2019/10/31.

**Content-Type:** multipart/form-data

**Description:** 批量上传文件

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
file|file|文件(array of file)|true|-

**Request-example:**
```
curl -X POST -H 'Content-Type: multipart/form-data' -i http://localhost:8080/batchUpload
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
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### 批量上传文件1
**URL:** http://localhost:8080/batchUpload1

**Type:** POST

**Author:** yu 2019/10/31.

**Content-Type:** multipart/form-data

**Description:** 批量上传文件1

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
file|file|文件(array of file)|true|-

**Request-example:**
```
curl -X POST -H 'Content-Type: multipart/form-data' -i http://localhost:8080/batchUpload1
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
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### 批量上传文件2
**URL:** http://localhost:8080/batchUpload2

**Type:** POST

**Author:** yu 2019/10/31.

**Content-Type:** multipart/form-data

**Description:** 批量上传文件2

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
files|file|批量文件(array of file)|true|-

**Request-example:**
```
curl -X POST -H 'Content-Type: multipart/form-data' -i http://localhost:8080/batchUpload2
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
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### 批量上传文件3
**URL:** http://localhost:8080/batchUpload3

**Type:** POST

**Author:** yu 2019/10/31.

**Content-Type:** multipart/form-data

**Description:** 批量上传文件3

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
files|file|批量文件(array of file)|true|-

**Request-example:**
```
curl -X POST -H 'Content-Type: multipart/form-data' -i http://localhost:8080/batchUpload3
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
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

## 接收表单参数
### Post请求发表单文件
**URL:** http://localhost:8080/formData2

**Type:** POST

**Author:** yu 2019/10/29.

**Content-Type:** multipart/form-data

**Description:** Post请求发表单文件

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|string|No comments found.|false|-
userData|string|No comments found.|false|-
file|file|No comments found.|true|-

**Request-example:**
```
curl -X POST -H 'Content-Type: multipart/form-data' -i http://localhost:8080/formData2 --data 'userId=102&userData=0mo4uc'
```

**Response-example:**
```
Doesn't return a value.
```

### Get请求发表单文件 暂不支持完全解析
**URL:** http://localhost:8080/formData2

**Type:** GET

**Author:** yu 2019/10/29.

**Content-Type:** multipart/form-data

**Description:** Get请求发表单文件 暂不支持完全解析

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|string|No comments found.|false|-
userData|string|No comments found.|false|-
file|file|No comments found.|true|-

**Request-example:**
```
curl -X GET -H 'Content-Type: multipart/form-data' -i http://localhost:8080/formData2?userData=rju3bm&userId=102
```

**Response-example:**
```
Doesn't return a value.
```

### 表单 包含复杂对象的Get 暂不支持完全解析
**URL:** http://localhost:8080/formData4

**Type:** GET

**Author:** yu 2019/10/29.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 表单 包含复杂对象的Get 暂不支持完全解析

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|string|No comments found.|false|-
userData|string|No comments found.|false|-
MAX_SPEED|int32|No comments found.|false|-
gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|false|-
simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|false|-
username|string|用户名|false|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
roles|array|用户角色信息|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─userId|string|No comments found.|false|-
└─roleId|string|No comments found.|false|-
└─roleName|string|No comments found.|false|-
extend|map|用户扩展项|false|-
listMap|array|ListMap效果展示|false|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/formData4?userId=102&mobile=424-812-6883&roles[0].userId=102&userData=1hkl3n&MAX_SPEED=169&gender=WOMAN&simpleEnum=RED&nickName=karen.orn&roles[0].updateTime=2021-08-07 17:14:30&username=leoma.mcglynn&roles[0].roleName=leoma.mcglynn&password=v99tph&roles[0].roleId=102&roles[0].createBy=x0azrq&roles[0].delFlag=6&roles[0].id=102&roles[0].updateBy=sztw1d&roles[0].createTime=2021-08-07 17:14:30
```

**Response-example:**
```
Doesn't return a value.
```

### 测试formData带路径参数
**URL:** http://localhost:8080/formData7/{id}

**Type:** POST

**Author:** yu 2019/10/29.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试formData带路径参数

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|string|No comments found.|true|-

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
MAX_SPEED|int32|No comments found.|false|-
gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|false|-
simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|false|-
username|string|用户名|false|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
roles|array|用户角色信息|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─userId|string|No comments found.|false|-
└─roleId|string|No comments found.|false|-
└─roleName|string|No comments found.|false|-
extend|map|用户扩展项|false|-
listMap|array|ListMap效果展示|false|-

**Request-example:**
```
curl -X POST -i http://localhost:8080/formData7/102 --data 'roles[0].roleName=leoma.mcglynn&mobile=424-812-6883&roles[0].updateTime=2021-08-07 17:14:30&roles[0].createBy=mb5y7u&roles[0].createTime=2021-08-07 17:14:30&gender=WOMAN&password=34s7ny&username=leoma.mcglynn&roles[0].id=102&roles[0].updateBy=1ge2dt&roles[0].delFlag=6&nickName=karen.orn&MAX_SPEED=877&roles[0].userId=102&roles[0].roleId=102&simpleEnum=RED'
```

**Response-example:**
```
Doesn't return a value.
```

### 测试formData带路多个路径参数
**URL:** http://localhost:8080/formData8/{id}/{age}

**Type:** POST

**Author:** yu 2019/10/29.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试formData带路多个路径参数

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|string|No comments found.|true|-
age|int32|No comments found.|true|-

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
MAX_SPEED|int32|No comments found.|false|-
gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|false|-
simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|false|-
username|string|用户名|false|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
roles|array|用户角色信息|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─userId|string|No comments found.|false|-
└─roleId|string|No comments found.|false|-
└─roleName|string|No comments found.|false|-
extend|map|用户扩展项|false|-
listMap|array|ListMap效果展示|false|-

**Request-example:**
```
curl -X POST -i http://localhost:8080/formData8/102/21 --data 'password=nv9apm&roles[0].id=102&roles[0].userId=102&roles[0].roleId=102&roles[0].roleName=leoma.mcglynn&roles[0].createTime=2021-08-07 17:14:30&roles[0].delFlag=6&roles[0].updateTime=2021-08-07 17:14:30&roles[0].createBy=me0het&simpleEnum=RED&username=leoma.mcglynn&nickName=karen.orn&mobile=424-812-6883&gender=WOMAN&MAX_SPEED=467&roles[0].updateBy=i3wbic'
```

**Response-example:**
```
Doesn't return a value.
```

## java泛型解析测试
### 测试多泛型1
**URL:** http://localhost:8080/generics/test1

**Type:** GET

**Author:** yu 2020/7/2.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试多泛型1

**Request-example:**
```
curl -X GET -i http://localhost:8080/generics/test1
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
test|string|托尔斯泰|-
value|object|value|-
└─MAX_SPEED|int32|No comments found.|-
└─gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|-
└─simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|-
└─username|string|用户名|v1.0
└─password|string|密码|v1.0
└─nickName|string|昵称|v1.0
└─mobile|string|电话|v1.0
└─roles|array|用户角色信息|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userId|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─roleId|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─roleName|string|No comments found.|-
└─extend|map|用户扩展项|-
└─listMap|array|ListMap效果展示|-
key|object|key|-
└─roleId|int32|角色id|-
└─roleName|string|角色名称|-
└─age|int32|年龄|-

**Response-example:**
```
{"test":"w57q3l","value":{"MAX_SPEED":274,"gender":0,"simpleEnum":"RED","username":"leoma.mcglynn","password":"t2s0ui","nickName":"karen.orn","mobile":"424-812-6883","roles":[{"id":"102","createBy":"6yw0y5","createTime":"2021-08-07 17:14:30","updateBy":"dzzplf","updateTime":"2021-08-07 17:14:30","delFlag":6,"userId":"102","roleId":"102","roleName":"leoma.mcglynn"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}},"key":{"roleId":320,"roleName":"leoma.mcglynn","age":21}}
```

### 测试多泛型2
**URL:** http://localhost:8080/generics/test2

**Type:** GET

**Author:** yu 2020/7/2.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试多泛型2

**Request-example:**
```
curl -X GET -i http://localhost:8080/generics/test2
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
total|int32|总条数|-
other|object|其他信息|-
└─MAX_SPEED|int32|No comments found.|-
└─gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|-
└─simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|-
└─username|string|用户名|v1.0
└─password|string|密码|v1.0
└─nickName|string|昵称|v1.0
└─mobile|string|电话|v1.0
└─roles|array|用户角色信息|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userId|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─roleId|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─roleName|string|No comments found.|-
└─extend|map|用户扩展项|-
└─listMap|array|ListMap效果展示|-
rows|array|数据列表|-
└─roleId|int32|角色id|-
└─roleName|string|角色名称|-
└─age|int32|年龄|-

**Response-example:**
```
{"total":830,"other":{"MAX_SPEED":925,"gender":0,"simpleEnum":"RED","username":"leoma.mcglynn","password":"q7p5ty","nickName":"karen.orn","mobile":"424-812-6883","roles":[{"id":"102","createBy":"wceorc","createTime":"2021-08-07 17:14:30","updateBy":"ybufjq","updateTime":"2021-08-07 17:14:30","delFlag":6,"userId":"102","roleId":"102","roleName":"leoma.mcglynn"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}},"rows":[{"roleId":837,"roleName":"leoma.mcglynn","age":21}]}
```

### 测试单泛型嵌套
**URL:** http://localhost:8080/generics/test3

**Type:** GET

**Author:** yu 2020/7/2.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试单泛型嵌套

**Request-example:**
```
curl -X GET -i http://localhost:8080/generics/test3
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|处理成功返回的业务数据|-
└─roleId|int32|角色id|-
└─roleName|string|角色名称|-
└─age|int32|年龄|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
  "success": true,
  "message": "success",
  "data": {
    "roleId": 504,
    "roleName": "leoma.mcglynn",
    "age": 21
  },
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

## https测试
### 测试https
**URL:** http://localhost:8080/testHttps

**Type:** GET

**Author:** yu 2018/12/20.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试https

**Request-example:**
```
curl -X GET -i http://localhost:8080/testHttps
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
  "data": "oingfa",
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### 测试http
**URL:** http://localhost:8080/testHttp

**Type:** GET

**Author:** yu 2018/12/20.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试http

**Request-example:**
```
curl -X GET -i http://localhost:8080/testHttp
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
  "data": "8it46h",
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

## Test inner class
### Return A object contains Inner class
**URL:** http://localhost:8080/inner/class

**Type:** GET

**Author:** yu 2019/10/19.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Return A object contains Inner class

**Request-example:**
```
curl -X GET -i http://localhost:8080/inner/class
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|姓名|-
innerClass|object|内部类|-
└─phone|string|电话|-

**Response-example:**
```
{
  "name": "leoma.mcglynn",
  "innerClass": {
    "phone": "1-773-920-9761"
  }
}
```

## JDK8的时间测试
### LocalDate和LocalDateTime测试
**URL:** http://localhost:8080/dateEntity

**Type:** POST

**Author:** yu 2019/9/22.

**Content-Type:** application/json; charset=utf-8

**Description:** LocalDate和LocalDateTime测试

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
createDate|string|创建时间|false|v1.0
localDate|string|创建日期|false|v1.0
localDateTime|string|创建时间|false|v1.0
localTime|string|jdk8 LocalTime|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/dateEntity --data '{
  "createDate": "2021-08-07 17:14:30",
  "localDate": "2021-08-07",
  "localDateTime": "2021-08-07 17:14:30",
  "localTime": "2021-08-07 17:14:29"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
createDate|string|创建时间|v1.0
localDate|string|创建日期|v1.0
localDateTime|string|创建时间|v1.0
localTime|string|jdk8 LocalTime|-

**Response-example:**
```
{
  "createDate": "2021-08-07 17:14:30",
  "localDate": "2021-08-07",
  "localDateTime": "2021-08-07 17:14:30",
  "localTime": "2021-08-07 17:14:29"
}
```

## Jpa代码测试
### ~~Jpa Page~~
**URL:** http://localhost:8080/test

**Type:** POST

**Author:** "cht"

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 用于测试Jpa的分页查询

**Request-example:**
```
curl -X POST -i http://localhost:8080/test
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
totalPages|int32|Returns the number of total pages.|-
totalElements|int64|Returns the total amount of elements.|-
number|int32|Returns the number of the current {@link Slice}. Is always non-negative.|-
size|int32|Returns the size of the {@link Slice}.|-
numberOfElements|int32|Returns the number of elements currently on this {@link Slice}.|-
content|array|Returns the page content as {@link List}.|-
└─roleId|int32|角色id|-
└─roleName|string|角色名称|-
└─age|int32|年龄|-
sort|object|Returns the sorting parameters for the {@link Slice}.|-
└─empty|boolean|Returns whether the current {@link Streamable} is empty.|-
└─orders|array|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─direction|enum|null<br/>ASC<br/>DESC<br/>|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─property|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ignoreCase|boolean|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nullHandling|enum|null<br/>NATIVE<br/>NULLS_FIRST<br/>NULLS_LAST<br/>|-
first|boolean|Returns whether the current {@link Slice} is the first one.|-
last|boolean|Returns whether the current {@link Slice} is the last one.|-
pageable|object|Returns the {@link Pageable} that's been used to request the current {@link Slice}.|2.0
└─paged|boolean|Returns whether the current {@link Pageable} contains pagination information.|-
└─unpaged|boolean|Returns whether the current {@link Pageable} does not contain pagination information.|-
└─pageNumber|int32|Returns the page to be returned.|-
└─pageSize|int32|Returns the number of items to be returned.|-
└─offset|int64|Returns the offset to be taken according to the underlying page and page size.|-
└─sort|object|Returns the sorting parameters.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─empty|boolean|Returns whether the current {@link Streamable} is empty.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─orders|array|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─direction|enum|null<br/>ASC<br/>DESC<br/>|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─property|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ignoreCase|boolean|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nullHandling|enum|null<br/>NATIVE<br/>NULLS_FIRST<br/>NULLS_LAST<br/>|-
empty|boolean|Returns whether the current {@link Streamable} is empty.|-

**Response-example:**
```
{
  "totalPages": 410,
  "totalElements": 935,
  "number": 935,
  "size": 10,
  "numberOfElements": 477,
  "content": [
    {
      "roleId": 860,
      "roleName": "leoma.mcglynn",
      "age": 21
    }
  ],
  "sort": {
    "empty": true,
    "orders": [
      {
        "direction": "ASC",
        "property": "ba66vl",
        "ignoreCase": true,
        "nullHandling": "NATIVE"
      }
    ]
  },
  "first": true,
  "last": true,
  "pageable": {
    "paged": true,
    "unpaged": true,
    "pageNumber": 26,
    "pageSize": 10,
    "offset": 1,
    "sort": {
      "empty": true,
      "orders": [
        {
          "direction": "ASC",
          "property": "n6ix0y",
          "ignoreCase": true,
          "nullHandling": "NATIVE"
        }
      ]
    }
  },
  "empty": true
}
```

### Jpa Pageable查询参数重渲染
**URL:** http://localhost:8080/pageableParam

**Type:** POST

**Author:** yu 2020/5/15.

**Content-Type:** application/json; charset=utf-8

**Description:** 测试让smart-doc使用自定义对象来渲染生成文档

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
result|object|返回结果|false|-
└─data|object|业务数据|false|-
└─encrypt|string|加密方式 NONE\RSA\AES|false|-
page|int32|页码|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/pageableParam --data '{
  "result": {
    "data": {},
    "encrypt": "n3vfhn"
  },
  "page": 1
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
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

## 测试json
### RequestParam+json
**URL:** http://localhost:8080/getUserJson

**Type:** POST

**Author:** yu 2020/11/17.

**Content-Type:** application/json; charset=utf-8

**Description:** RequestParam+json

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|No comments found.|true|-

**Body-parameters:**

Parameter | Type|Description|Required|Since
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
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/getUserJson?name=leoma.mcglynn --data '{
  "dataExpressionEnum": "SENSIRION",
  "menuPermissionCodes": [
    "WAIT_PAY"
  ],
  "date": "2019-01-01",
  "username": "leoma.mcglynn",
  "idCard": "340507200011133694",
  "age": 21,
  "age2": 31
}'
```

**Response-example:**
```
string
```

## FastJson和Jackson注解支持测试
### Jackson注解支持测试
**URL:** http://localhost:8080/json/jacksonTest

**Type:** GET

**Author:** yu 2018/7/10.

**Content-Type:** application/json; charset=utf-8

**Description:** Jackson注解支持测试

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|用户名|false|-

**Request-example:**
```
curl -X GET -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/json/jacksonTest --data '{
  "name": "leoma.mcglynn"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|用户名|-

**Response-example:**
```
{
  "name": "leoma.mcglynn"
}
```

### FastJson注解支持测试
**URL:** http://localhost:8080/json/fastJsonTest

**Type:** GET

**Author:** yu 2018/7/10.

**Content-Type:** application/json; charset=utf-8

**Description:** FastJson注解支持测试

**Body-parameters:**

Parameter | Type|Description|Required|Since
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
  "username": "leoma.mcglynn",
  "idCard": "340507200011133694",
  "age": 21,
  "age2": 35
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
  "username": "leoma.mcglynn",
  "idCard": "340507200011133694",
  "age": 21,
  "age2": 793
}
```

## List返回接口Api文档测试
### List&lt;String&gt;结构
**URL:** http://localhost:8080/list/listString

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;String&gt;结构

**Request-example:**
```
curl -X GET -i http://localhost:8080/list/listString
```

**Response-example:**
```
[
  "ud2h5d",
  "9noyg5"
]
```

### List&lt;Map&lt;String,String&gt;&gt;结构
**URL:** http://localhost:8080/list/listMap

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

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
    "mapKey1": "wj0bv9",
    "mapKey2": "hb9kfp"
  }
]
```

### List&lt;自动义对象&gt;
**URL:** http://localhost:8080/list/listObject

**Type:** POST

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

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
        "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
      }
    ],
    "userList": [
      {
        "$ref": ".."
      }
    ],
    "userName": "leoma.mcglynn",
    "nickName": "karen.orn",
    "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
    "userAge": 21,
    "phone": "1-773-920-9761",
    "createTime": 1628327669799,
    "small": 33.84,
    "money": 84.21,
    "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
    "telephone": "1-773-920-9761"
  }
]
```

### List&lt;Map&lt;String,T&gt;&gt;结构
**URL:** http://localhost:8080/list/listMap2

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

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
      "stuName": "leoma.mcglynn",
      "stuAge": true,
      "stuAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
      "user": {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 68.18,
        "money": 8.09,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      },
      "userMap": {
        "mapKey": {
          "userDetails": [
            {
              "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
            }
          ],
          "userList": [
            {
              "$ref": ".."
            }
          ],
          "userName": "leoma.mcglynn",
          "nickName": "karen.orn",
          "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
          "userAge": 21,
          "phone": "1-773-920-9761",
          "createTime": 1628327669799,
          "small": 25.75,
          "money": 60.23,
          "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
          "telephone": "1-773-920-9761"
        }
      },
      "userTreeSet": [
        {
          "userDetails": [
            {
              "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
            }
          ],
          "userList": [
            {
              "$ref": ".."
            }
          ],
          "userName": "leoma.mcglynn",
          "nickName": "karen.orn",
          "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
          "userAge": 21,
          "phone": "1-773-920-9761",
          "createTime": 1628327669799,
          "small": 34.44,
          "money": 10.44,
          "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
          "telephone": "1-773-920-9761"
        }
      ],
      "user1": {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 93.29,
        "money": 23.42,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      }
    }
  }
]
```

### List&lt;Map&lt;M,N&lt;P,k&gt;&gt;&gt;超复杂结构
**URL:** http://localhost:8080/list/listMap3

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

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
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 97.59,
        "money": 21.12,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      },
      "data1": {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 28.91,
        "money": 59.26,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      },
      "data2": {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 8.98,
        "money": 57.70,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      },
      "age": 21
    }
  }
]
```

### List&lt;T&lt;List&lt;M&gt;,List&lt;M&gt;,List&lt;M&gt;&gt;&gt;超复杂结构
**URL:** http://localhost:8080/list/listTeacher

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

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
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 57.91,
        "money": 29.79,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      }
    ],
    "data1": [
      {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 34.16,
        "money": 4.98,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      }
    ],
    "data2": [
      {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 23.95,
        "money": 58.43,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      }
    ],
    "age": 21
  }
]
```

### List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,User,User&gt;&gt;结构
**URL:** http://localhost:8080/list/listString1

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

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
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 60.24,
        "money": 23.64,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      },
      "data1": {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 31.70,
        "money": 51.26,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      },
      "data2": {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 3.66,
        "money": 85.66,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      },
      "age": 21
    },
    "data1": {
      "userDetails": [
        {
          "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "leoma.mcglynn",
      "nickName": "karen.orn",
      "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
      "userAge": 21,
      "phone": "1-773-920-9761",
      "createTime": 1628327669799,
      "small": 16.66,
      "money": 81.80,
      "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
      "telephone": "1-773-920-9761"
    },
    "data2": {
      "userDetails": [
        {
          "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "leoma.mcglynn",
      "nickName": "karen.orn",
      "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
      "userAge": 21,
      "phone": "1-773-920-9761",
      "createTime": 1628327669799,
      "small": 43.20,
      "money": 30.91,
      "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
      "telephone": "1-773-920-9761"
    },
    "age": 21
  }
]
```

### List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;&gt;
**URL:** http://localhost:8080/list/listString2

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

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
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 11.26,
        "money": 43.08,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      },
      "data1": {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 38.50,
        "money": 55.86,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      },
      "data2": {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 16.93,
        "money": 6.58,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      },
      "age": 21
    },
    "data1": {
      "data": {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 51.58,
        "money": 21.42,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      },
      "data1": {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 60.77,
        "money": 28.50,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      },
      "data2": {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 64.48,
        "money": 67.69,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      },
      "age": 21
    },
    "data2": {
      "data": {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 79.61,
        "money": 22.88,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      },
      "data1": {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 16.59,
        "money": 95.98,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      },
      "data2": {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 27.29,
        "money": 92.06,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      },
      "age": 21
    },
    "age": 21
  }
]
```

### CommonResult&lt;List&lt;UserDto&gt;&gt;
**URL:** http://localhost:8080/list/listUserDto

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

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
      "token": "jizxuv",
      "LoginList": [
        {
          "userName": "leoma.mcglynn",
          "password": "k8469y"
        }
      ]
    }
  ],
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

## Map返回型接口api文档测试
### Map&lt;String,Integer&gt;结构
**URL:** http://localhost:8080/map/primitive

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,Integer&gt;结构

**Request-example:**
```
curl -X GET -i http://localhost:8080/map/primitive
```

**Response-example:**
```
{
  "mapKey1": 196,
  "mapKey2": 605
}
```

### Map&lt;String,Object&gt;结构
**URL:** http://localhost:8080/map/objectValue

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

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

### Map&lt;String,User&gt;结构
**URL:** http://localhost:8080/map/object

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

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
        "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
      }
    ],
    "userList": [
      {
        "$ref": ".."
      }
    ],
    "userName": "leoma.mcglynn",
    "nickName": "karen.orn",
    "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
    "userAge": 21,
    "phone": "1-773-920-9761",
    "createTime": 1628327669799,
    "small": 43.18,
    "money": 55.33,
    "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
    "telephone": "1-773-920-9761"
  }
}
```

### Map&lt;String,Student&gt;结构
**URL:** http://localhost:8080/map/test1

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

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
    "stuName": "leoma.mcglynn",
    "stuAge": true,
    "stuAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
    "user": {
      "userDetails": [
        {
          "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "leoma.mcglynn",
      "nickName": "karen.orn",
      "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
      "userAge": 21,
      "phone": "1-773-920-9761",
      "createTime": 1628327669799,
      "small": 8.86,
      "money": 49.71,
      "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
      "telephone": "1-773-920-9761"
    },
    "userMap": {
      "mapKey": {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 25.73,
        "money": 81.23,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      }
    },
    "userTreeSet": [
      {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 38.43,
        "money": 87.28,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      }
    ],
    "user1": {
      "userDetails": [
        {
          "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "leoma.mcglynn",
      "nickName": "karen.orn",
      "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
      "userAge": 21,
      "phone": "1-773-920-9761",
      "createTime": 1628327669799,
      "small": 22.34,
      "money": 26.58,
      "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
      "telephone": "1-773-920-9761"
    }
  }
}
```

### Map&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构
**URL:** http://localhost:8080/map/test2

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

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
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 5.80,
        "money": 36.17,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      }
    ],
    "data1": {
      "stuName": "leoma.mcglynn",
      "stuAge": true,
      "stuAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
      "user": {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 5.06,
        "money": 11.55,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      },
      "userMap": {
        "mapKey": {
          "userDetails": [
            {
              "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
            }
          ],
          "userList": [
            {
              "$ref": ".."
            }
          ],
          "userName": "leoma.mcglynn",
          "nickName": "karen.orn",
          "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
          "userAge": 21,
          "phone": "1-773-920-9761",
          "createTime": 1628327669799,
          "small": 23.32,
          "money": 78.48,
          "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
          "telephone": "1-773-920-9761"
        }
      },
      "userTreeSet": [
        {
          "userDetails": [
            {
              "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
            }
          ],
          "userList": [
            {
              "$ref": ".."
            }
          ],
          "userName": "leoma.mcglynn",
          "nickName": "karen.orn",
          "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
          "userAge": 21,
          "phone": "1-773-920-9761",
          "createTime": 1628327669799,
          "small": 26.64,
          "money": 30.95,
          "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
          "telephone": "1-773-920-9761"
        }
      ],
      "user1": {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 69.48,
        "money": 57.47,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      }
    },
    "data2": {
      "userDetails": [
        {
          "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "leoma.mcglynn",
      "nickName": "karen.orn",
      "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
      "userAge": 21,
      "phone": "1-773-920-9761",
      "createTime": 1628327669799,
      "small": 45.60,
      "money": 13.28,
      "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
      "telephone": "1-773-920-9761"
    },
    "age": 21
  }
}
```

### TreeMap&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构
**URL:** http://localhost:8080/map/test3

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

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
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 0.57,
        "money": 95.61,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      }
    ],
    "data1": {
      "stuName": "leoma.mcglynn",
      "stuAge": true,
      "stuAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
      "user": {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 14.79,
        "money": 87.91,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      },
      "userMap": {
        "mapKey": {
          "userDetails": [
            {
              "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
            }
          ],
          "userList": [
            {
              "$ref": ".."
            }
          ],
          "userName": "leoma.mcglynn",
          "nickName": "karen.orn",
          "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
          "userAge": 21,
          "phone": "1-773-920-9761",
          "createTime": 1628327669799,
          "small": 76.54,
          "money": 87.91,
          "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
          "telephone": "1-773-920-9761"
        }
      },
      "userTreeSet": [
        {
          "userDetails": [
            {
              "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
            }
          ],
          "userList": [
            {
              "$ref": ".."
            }
          ],
          "userName": "leoma.mcglynn",
          "nickName": "karen.orn",
          "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
          "userAge": 21,
          "phone": "1-773-920-9761",
          "createTime": 1628327669799,
          "small": 17.89,
          "money": 67.48,
          "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
          "telephone": "1-773-920-9761"
        }
      ],
      "user1": {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 41.29,
        "money": 22.91,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      }
    },
    "data2": {
      "userDetails": [
        {
          "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "leoma.mcglynn",
      "nickName": "karen.orn",
      "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
      "userAge": 21,
      "phone": "1-773-920-9761",
      "createTime": 1628327669799,
      "small": 69.25,
      "money": 91.68,
      "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
      "telephone": "1-773-920-9761"
    },
    "age": 21
  }
}
```

### Map&lt;String,Teacher&lt;Map&lt;String,User&gt;,Map&lt;String,User&gt;,Map&lt;String,User&gt;&gt;&gt;超复杂结构
**URL:** http://localhost:8080/map/test4

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

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
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 33.54,
        "money": 45.07,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      }
    },
    "data1": {
      "mapKey": {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 25.26,
        "money": 99.30,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      }
    },
    "data2": {
      "mapKey": {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 21.47,
        "money": 16.92,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      }
    },
    "age": 21
  }
}
```

## 多泛型测试
### 数组
**URL:** http://localhost:8080/mulGenric/test/

**Type:** POST

**Author:** xingzi  2020/07/08  10:22

**Content-Type:** application/json; charset=utf-8

**Description:** 数组

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
page|object|No comments found.|false|-
└─roleId|int32|角色id|false|-
└─roleName|string|角色名称|false|-
└─age|int32|年龄|false|-
data1|array|No comments found.|false|-
└─total|int32|记录总数|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/mulGenric/test/ --data '{
  "page": {
    "roleId": 586,
    "roleName": "leoma.mcglynn",
    "age": 21
  },
  "data1": [
    {
      "total": 796
    }
  ]
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
page|object|No comments found.|-
└─roleId|int32|角色id|-
└─roleName|string|角色名称|-
└─age|int32|年龄|-
data1|array|No comments found.|-
└─concurrentPage|int32|当前页|-
└─pageSize|int32|当前page|-
└─total|int32|记录总数|-

**Response-example:**
```
{
  "page": {
    "roleId": 222,
    "roleName": "leoma.mcglynn",
    "age": 21
  },
  "data1": [
    {
      "concurrentPage": 1,
      "pageSize": 10,
      "total": 319
    }
  ]
}
```

### gitee #I1S8W验证
**URL:** http://localhost:8080/mulGenric/test2

**Type:** GET

**Author:** xingzi  2020/07/08  10:22

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** gitee #I1S8W验证

**Request-example:**
```
curl -X GET -i http://localhost:8080/mulGenric/test2
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|处理成功返回的业务数据|-
└─page|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─searchCount|boolean|是否进行 count 查询|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─pages|int64|当前分页总页数|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─hitCount|boolean|是否命中count缓存|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─records|array|查询数据列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─username|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─password|string|密码|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─mobile|string|电话|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─email|string|邮箱|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─address|string|地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─sex|int32|性别(男1 女 2)|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─avatar|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─type|int32|类型|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─status|int32|状态|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─description|string|描述|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─roles|array|用户拥有角色|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|角色名 以ROLE_开头|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─defaultRole|boolean|是否为注册默认角色|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─permissions|array|拥有权限|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|菜单/权限名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─level|int32|层级|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─type|int32|类型 0页面 1具体操作|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─title|string|菜单标题|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─path|string|页面路径/资源链接url|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─component|string|前端组件|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─icon|string|图标|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─buttonType|string|按钮权限类型|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─parentId|string|父id|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─description|string|说明备注|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─sortOrder|number|排序值|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─status|int32|是否启用 0启用 -1禁用|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─children|array|子菜单/权限|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─permTypes|array|页面拥有的权限类型|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─expand|boolean|节点展开 前端所需|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─checked|boolean|是否勾选 前端所需|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─selected|boolean|是否选中 前端所需|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─permissions|array|用户拥有的权限|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|菜单/权限名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─level|int32|层级|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─type|int32|类型 0页面 1具体操作|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─title|string|菜单标题|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─path|string|页面路径/资源链接url|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─component|string|前端组件|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─icon|string|图标|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─buttonType|string|按钮权限类型|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─parentId|string|父id|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─description|string|说明备注|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─sortOrder|number|排序值|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─status|int32|是否启用 0启用 -1禁用|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─children|array|子菜单/权限|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─permTypes|array|页面拥有的权限类型|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─expand|boolean|节点展开 前端所需|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─checked|boolean|是否勾选 前端所需|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─selected|boolean|是否选中 前端所需|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─total|int64|总数|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─size|int64|每页显示条数，默认 10|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─current|int64|当前页|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─orders|array|排序字段信息|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─column|string|需要进行排序的字段|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─asc|boolean|是否正序排列，默认 true|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─optimizeCountSql|boolean|自动优化 COUNT SQL|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─countId|string|countId|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─maxLimit|int64|countId|-
└─data1|array|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─username|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─password|string|密码|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nickName|string|昵称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─mobile|string|电话|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─email|string|邮箱|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─address|string|地址|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─sex|int32|性别(男1 女 2)|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─avatar|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─type|int32|类型|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─status|int32|状态|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─description|string|描述|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─roles|array|用户拥有角色|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|角色名 以ROLE_开头|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─defaultRole|boolean|是否为注册默认角色|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─permissions|array|拥有权限|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|菜单/权限名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─level|int32|层级|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─type|int32|类型 0页面 1具体操作|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─title|string|菜单标题|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─path|string|页面路径/资源链接url|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─component|string|前端组件|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─icon|string|图标|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─buttonType|string|按钮权限类型|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─parentId|string|父id|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─description|string|说明备注|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─sortOrder|number|排序值|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─status|int32|是否启用 0启用 -1禁用|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─children|array|子菜单/权限|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─permTypes|array|页面拥有的权限类型|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─expand|boolean|节点展开 前端所需|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─checked|boolean|是否勾选 前端所需|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─selected|boolean|是否选中 前端所需|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─permissions|array|用户拥有的权限|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|菜单/权限名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─level|int32|层级|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─type|int32|类型 0页面 1具体操作|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─title|string|菜单标题|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─path|string|页面路径/资源链接url|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─component|string|前端组件|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─icon|string|图标|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─buttonType|string|按钮权限类型|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─parentId|string|父id|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─description|string|说明备注|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─sortOrder|number|排序值|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─status|int32|是否启用 0启用 -1禁用|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─children|array|子菜单/权限|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─permTypes|array|页面拥有的权限类型|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─expand|boolean|节点展开 前端所需|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─checked|boolean|是否勾选 前端所需|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─selected|boolean|是否选中 前端所需|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
  "success": true,
  "message": "success",
  "data": {
    "page": {
      "searchCount": true,
      "pages": 905,
      "hitCount": true,
      "records": [
        {
          "id": "102",
          "createBy": "t418zg",
          "createTime": "2021-08-07 17:14:30",
          "updateBy": "3jiz8m",
          "updateTime": "2021-08-07 17:14:30",
          "delFlag": 6,
          "username": "leoma.mcglynn",
          "password": "tbtj8t",
          "nickName": "karen.orn",
          "mobile": "424-812-6883",
          "email": "darline.dach@gmail.com",
          "address": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
          "sex": 1,
          "avatar": "ne9e93",
          "type": 729,
          "status": 987,
          "description": "dmqi1w",
          "roles": [
            {
              "id": "102",
              "createBy": "etkr1n",
              "createTime": "2021-08-07 17:14:30",
              "updateBy": "8vxudo",
              "updateTime": "2021-08-07 17:14:30",
              "delFlag": 6,
              "name": "leoma.mcglynn",
              "defaultRole": true,
              "permissions": [
                {
                  "id": "102",
                  "createBy": "uscsyt",
                  "createTime": "2021-08-07 17:14:30",
                  "updateBy": "mha5t0",
                  "updateTime": "2021-08-07 17:14:30",
                  "delFlag": 6,
                  "name": "leoma.mcglynn",
                  "level": 379,
                  "type": 56,
                  "title": "e5105n",
                  "path": "5o2hf7",
                  "component": "cbiz7i",
                  "icon": "00e67g",
                  "buttonType": "wa656n",
                  "parentId": "102",
                  "description": "rveejf",
                  "sortOrder": 520,
                  "status": 26,
                  "children": [
                    {
                      "$ref": ".."
                    }
                  ],
                  "permTypes": [
                    "60kxlu"
                  ],
                  "expand": true,
                  "checked": true,
                  "selected": true
                }
              ]
            }
          ],
          "permissions": [
            {
              "id": "102",
              "createBy": "6tyqer",
              "createTime": "2021-08-07 17:14:30",
              "updateBy": "bas74a",
              "updateTime": "2021-08-07 17:14:30",
              "delFlag": 6,
              "name": "leoma.mcglynn",
              "level": 825,
              "type": 680,
              "title": "vnu6t9",
              "path": "xt8m14",
              "component": "wldjzy",
              "icon": "uqc3ek",
              "buttonType": "zg91wr",
              "parentId": "102",
              "description": "oriqbq",
              "sortOrder": 626,
              "status": 169,
              "children": [
                {
                  "$ref": ".."
                }
              ],
              "permTypes": [
                "exg799"
              ],
              "expand": true,
              "checked": true,
              "selected": true
            }
          ]
        }
      ],
      "total": 1,
      "size": 734,
      "current": 728,
      "orders": [
        {
          "column": "ctkwqd",
          "asc": true
        }
      ],
      "optimizeCountSql": true,
      "countId": "102",
      "maxLimit": 436
    },
    "data1": [
      {
        "id": "102",
        "createBy": "m04soz",
        "createTime": "2021-08-07 17:14:30",
        "updateBy": "bwulkg",
        "updateTime": "2021-08-07 17:14:30",
        "delFlag": 6,
        "username": "leoma.mcglynn",
        "password": "8kwpii",
        "nickName": "karen.orn",
        "mobile": "424-812-6883",
        "email": "darline.dach@gmail.com",
        "address": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "sex": 1,
        "avatar": "74asvg",
        "type": 41,
        "status": 130,
        "description": "aw9ugs",
        "roles": [
          {
            "id": "102",
            "createBy": "78aj4p",
            "createTime": "2021-08-07 17:14:30",
            "updateBy": "6oa8fb",
            "updateTime": "2021-08-07 17:14:30",
            "delFlag": 6,
            "name": "leoma.mcglynn",
            "defaultRole": true,
            "permissions": [
              {
                "id": "102",
                "createBy": "h60c5p",
                "createTime": "2021-08-07 17:14:30",
                "updateBy": "0lcplt",
                "updateTime": "2021-08-07 17:14:30",
                "delFlag": 6,
                "name": "leoma.mcglynn",
                "level": 221,
                "type": 244,
                "title": "0dvc98",
                "path": "gjdoea",
                "component": "gf86ox",
                "icon": "6xoqm6",
                "buttonType": "lc3l5z",
                "parentId": "102",
                "description": "zeptkq",
                "sortOrder": 27,
                "status": 745,
                "children": [
                  {
                    "$ref": ".."
                  }
                ],
                "permTypes": [
                  "misx34"
                ],
                "expand": true,
                "checked": true,
                "selected": true
              }
            ]
          }
        ],
        "permissions": [
          {
            "id": "102",
            "createBy": "my4u7m",
            "createTime": "2021-08-07 17:14:30",
            "updateBy": "ba49u8",
            "updateTime": "2021-08-07 17:14:30",
            "delFlag": 6,
            "name": "leoma.mcglynn",
            "level": 179,
            "type": 433,
            "title": "oq5jfd",
            "path": "3mza0v",
            "component": "dc54su",
            "icon": "70pqk8",
            "buttonType": "xjht5c",
            "parentId": "102",
            "description": "nndd0w",
            "sortOrder": 41,
            "status": 641,
            "children": [
              {
                "$ref": ".."
              }
            ],
            "permTypes": [
              "0toqca"
            ],
            "expand": true,
            "checked": true,
            "selected": true
          }
        ]
      }
    ]
  },
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

## mybatis-plus分页测试
### mybatis-plus原始分页类测试
**URL:** http://localhost:8080/mybatis/plus/page

**Type:** GET

**Author:** yu 2020/6/30.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

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
    "pages": 314,
    "hitCount": true,
    "records": [
      {
        "roleId": 74,
        "roleName": "leoma.mcglynn",
        "age": 21
      }
    ],
    "total": 909,
    "size": 562,
    "current": 564,
    "orders": [
      {
        "column": "3qyimq",
        "asc": true
      }
    ],
    "optimizeCountSql": true,
    "countId": "102",
    "maxLimit": 67
  },
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### mybatis-plus分页自定义处理测试
**URL:** http://localhost:8080/mybatis/plus/page2

**Type:** GET

**Author:** yu 2020/6/30.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

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
        "roleId": 269,
        "roleName": "leoma.mcglynn",
        "age": 21
      }
    ],
    "total": 182,
    "size": 238,
    "count": 678,
    "page": 94
  },
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### mybatis-plus分页自定义处理测试2
**URL:** http://localhost:8080/mybatis/plus/page3

**Type:** GET

**Author:** yu 2020/6/30.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

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
        "roleId": 631,
        "roleName": "leoma.mcglynn",
        "age": 21
      }
    ],
    "total": 184,
    "countId": "102",
    "maxLimit": 305
  },
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

## 继承接口测试
### 继承接口测试
**URL:** http://localhost:8080/parentExtends/update

**Type:** GET

**Author:** xingzi

**Content-Type:** application/json; charset=utf-8

**Description:** 继承接口测试

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
MAX_SPEED|int32|No comments found.|false|-
gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|false|-
simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|false|-
username|string|用户名|false|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
roles|array|用户角色信息|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─userId|string|No comments found.|false|-
└─roleId|string|No comments found.|false|-
└─roleName|string|No comments found.|false|-
extend|map|用户扩展项|false|-
listMap|array|ListMap效果展示|false|-

**Request-example:**
```
curl -X GET -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/parentExtends/update --data '{"MAX_SPEED":694,"gender":0,"simpleEnum":"RED","username":"leoma.mcglynn","password":"gdgvlm","nickName":"karen.orn","mobile":"424-812-6883","roles":[{"id":"102","createBy":"raa6k0","createTime":"2021-08-07 17:14:30","updateBy":"bh0mp8","updateTime":"2021-08-07 17:14:30","delFlag":6,"userId":"102","roleId":"102","roleName":"leoma.mcglynn"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|处理成功返回的业务数据|-
└─MAX_SPEED|int32|No comments found.|-
└─gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|-
└─simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|-
└─username|string|用户名|v1.0
└─password|string|密码|v1.0
└─nickName|string|昵称|v1.0
└─mobile|string|电话|v1.0
└─roles|array|用户角色信息|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userId|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─roleId|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─roleName|string|No comments found.|-
└─extend|map|用户扩展项|-
└─listMap|array|ListMap效果展示|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{"success":true,"message":"success","data":{"MAX_SPEED":129,"gender":0,"simpleEnum":"RED","username":"leoma.mcglynn","password":"ird2mx","nickName":"karen.orn","mobile":"424-812-6883","roles":[{"id":"102","createBy":"u8gx8h","createTime":"2021-08-07 17:14:30","updateBy":"2r2od2","updateTime":"2021-08-07 17:14:30","delFlag":6,"userId":"102","roleId":"102","roleName":"leoma.mcglynn"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}},"code":"35031","timestamp":"2021-08-07 17:14:29"}
```

### 根据Id删除
**URL:** http://localhost:8080/parentExtends/deleteById/{id}

**Type:** DELETE

**Author:** xingzi

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 根据Id删除

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|object|id|false|-

**Request-example:**
```
curl -X DELETE -i http://localhost:8080/parentExtends/deleteById/{id}?id=arg3r4
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
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### 根据Id更新
**URL:** http://localhost:8080/parentExtends/updateById

**Type:** PUT

**Author:** xingzi

**Content-Type:** application/json; charset=utf-8

**Description:** 根据Id更新

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
MAX_SPEED|int32|No comments found.|false|-
gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|false|-
simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|false|-
username|string|用户名|false|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
roles|array|用户角色信息|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─userId|string|No comments found.|false|-
└─roleId|string|No comments found.|false|-
└─roleName|string|No comments found.|false|-
extend|map|用户扩展项|false|-
listMap|array|ListMap效果展示|false|-

**Request-example:**
```
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/parentExtends/updateById --data '{"MAX_SPEED":736,"gender":0,"simpleEnum":"RED","username":"leoma.mcglynn","password":"26esm1","nickName":"karen.orn","mobile":"424-812-6883","roles":[{"id":"102","createBy":"yqw1l4","createTime":"2021-08-07 17:14:30","updateBy":"4vqhlg","updateTime":"2021-08-07 17:14:30","delFlag":6,"userId":"102","roleId":"102","roleName":"leoma.mcglynn"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}}'
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
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

## Path参数测试
### 接收数组类型pathVariable
**URL:** http://localhost:8080/pathVariable/test/{id}

**Type:** GET

**Author:** xingzi

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 接收数组类型pathVariable

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|array|No comments found.,[array of string]|true|

**Request-example:**
```
curl -X GET -i http://localhost:8080/pathVariable/test/
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
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### Path正则测试1
**URL:** http://localhost:8080/pathVariable/download/{fileId:^[A-Za-z0-9_-]{10,50}$}

**Type:** GET

**Author:** xingzi

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Path正则测试1

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
fileId|string|文件id|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/pathVariable/download/^wuO-W-Is75hfh8-$
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
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### Path正则测试2
**URL:** http://localhost:8080/pathVariable/download/{fileId:^[A-Za-z0-9_-]{10,50}$}/file

**Type:** GET

**Author:** xingzi

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Path正则测试2

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
fileId|string|文件id|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/pathVariable/download/^-_w---lN-6$/file
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
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### Path正则测试3
**URL:** http://localhost:8080/pathVariable/download/{fileId:^A-Za-z0-9_-{10,50}$}/file;	http:/localhost:8080/pathVariable/download/file/{fileId:^A-Za-z0-9_-{10,50}$}

**Type:** GET

**Author:** xingzi

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Path正则测试3

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
fileId|string|文件id|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/pathVariable/download/^A-Za-z0-9_----------$/file
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
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

## RequestHeader注解测试
### 测试RequestHeader常规使用
**URL:** http://localhost:8080/testRequestHeader

**Type:** GET

**Author:** xingzi

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试RequestHeader常规使用

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
name|string|请求头(name)|true|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
age|int32| 年龄|false|-

**Request-example:**
```
curl -X GET -H 'name' -i http://localhost:8080/testRequestHeader?age=21
```

**Response-example:**
```
Doesn't return a value.
```

### 测试RequestHeader绑定参数名
**URL:** http://localhost:8080/testRequestHeader/value

**Type:** GET

**Author:** xingzi

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试RequestHeader绑定参数名

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|请求头(name)|false|-
age|int32| 年龄|true|-


**Request-example:**
```
curl -X GET -H 'token' -H 'age' -i http://localhost:8080/testRequestHeader/value
```

**Response-example:**
```
Doesn't return a value.
```

### 测试RequestHeader绑定默认值
**URL:** http://localhost:8080/testRequestHeader/DefaultVal

**Type:** GET

**Author:** xingzi

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试RequestHeader绑定默认值

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|请求头(name)(defaultValue: da)|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
age|int32| 年龄|false|-

**Request-example:**
```
curl -X GET -H 'token:da' -i http://localhost:8080/testRequestHeader/DefaultVal?age=21
```

**Response-example:**
```
Doesn't return a value.
```

### 测试Mapping中的headers属性
**URL:** http://localhost:8080/testRequestHeader/foos

**Type:** GET

**Author:** xingzi

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试Mapping中的headers属性

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
key1|string|header condition|true|-
key2|string|header condition|true|-


**Request-example:**
```
curl -X GET -H 'key1:val1' -H 'key2:val2' -i http://localhost:8080/testRequestHeader/foos
```

**Response-example:**
```
string
```

### 测试Mapping header属性
**URL:** http://localhost:8080/ex/foos

**Type:** GET

**Author:** xingzi

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试Mapping header属性

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
key|string|header condition|true|-


**Request-example:**
```
curl -X GET -H 'key:val' -i http://localhost:8080/ex/foos
```

**Response-example:**
```
string
```

### 测试常量请求头1
**URL:** http://localhost:8080/testRequestHeader/constants1

**Type:** GET

**Author:** xingzi

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试常量请求头1

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
HeaderConstants.TOKEN|string|请求头|true|-


**Request-example:**
```
curl -X GET -H 'HeaderConstants.TOKEN' -i http://localhost:8080/testRequestHeader/constants1
```

**Response-example:**
```
string
```

### 测试常量请求头2
**URL:** http://localhost:8080/testRequestHeader/constant2

**Type:** GET

**Author:** xingzi

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试常量请求头2

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
HeaderConstants.TOKEN|string|请求头|true|-


**Request-example:**
```
curl -X GET -H 'HeaderConstants.TOKEN' -i http://localhost:8080/testRequestHeader/constant2
```

**Response-example:**
```
string
```

### 测试常量请求头3
**URL:** http://localhost:8080/testRequestHeader/constant3

**Type:** GET

**Author:** xingzi

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试常量请求头3

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|请求头|true|-


**Request-example:**
```
curl -X GET -H 'token' -i http://localhost:8080/testRequestHeader/constant3
```

**Response-example:**
```
string
```

## Spring boot params test
### Test Normal param binding
**URL:** http://localhost:8080/testNormalParams/binding

**Type:** GET

**Author:** yu 2019/9/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Test Normal param binding

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|name|true|-
age|int32| age|false|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/testNormalParams/binding?name=leoma.mcglynn&age=21
```

**Response-example:**
```
Doesn't return a value.
```

### Test @RequestBody User
**URL:** http://localhost:8080/testRequestBody

**Type:** POST

**Author:** yu 2019/9/28.

**Content-Type:** application/json; charset=utf-8

**Description:** Test @RequestBody User

**Body-parameters:**

Parameter | Type|Description|Required|Since
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
      "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
    }
  ],
  "userList": [
    {
      "$ref": ".."
    }
  ],
  "userName": "leoma.mcglynn",
  "nickName": "karen.orn",
  "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
  "userAge": 21,
  "phone": "1-773-920-9761",
  "createTime": 1628327669799,
  "small": 82.49,
  "money": 31.92,
  "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
  "telephone": "1-773-920-9761"
}'
```

**Response-example:**
```
Doesn't return a value.
```

### Test @RequestBody Map
**URL:** http://localhost:8080/testRequestBodyMap

**Type:** POST

**Author:** yu 2019/9/28.

**Content-Type:** application/json; charset=utf-8

**Description:** Test @RequestBody Map

**Body-parameters:**

Parameter | Type|Description|Required|Since
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
        "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
      }
    ],
    "userList": [
      {
        "$ref": ".."
      }
    ],
    "userName": "leoma.mcglynn",
    "nickName": "karen.orn",
    "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
    "userAge": 21,
    "phone": "1-773-920-9761",
    "createTime": 1628327669799,
    "small": 88.20,
    "money": 29.53,
    "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
    "telephone": "1-773-920-9761"
  }
}'
```

**Response-example:**
```
Doesn't return a value.
```

### Test @RequestBody List
**URL:** http://localhost:8080/testRequestBodyList

**Type:** POST

**Author:** yu 2019/9/28.

**Content-Type:** application/json; charset=utf-8

**Description:** Test @RequestBody List

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
ids|array|array of user id,[array of string]|false|

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/testRequestBodyList --data '[
  "m1fljg",
  "4qku3x"
]'
```

**Response-example:**
```
Doesn't return a value.
```

### Test Array Params
**URL:** http://localhost:8080/testArray

**Type:** POST

**Author:** yu 2019/9/28.

**Content-Type:** application/json; charset=utf-8

**Description:** Test Array Params

**Body-parameters:**

Parameter | Type|Description|Required|Since
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
      "username": "leoma.mcglynn",
      "idCard": "340507200011133694",
      "age": 21,
      "age2": 101
    },
    "code": "35031",
    "timestamp": "2021-08-07 17:14:29"
  }
]'
```

**Response-example:**
```
string
```

### Test @PathVariable
**URL:** http://localhost:8080/test/{name}/{no}/info

**Type:** GET

**Author:** yu 2019/9/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Test @PathVariable

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|name|true|-
no|string|  no|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/test/leoma.mcglynn/3ezb3d/info
```

**Response-example:**
```
Doesn't return a value.
```

### Test @RequestParam
**URL:** http://localhost:8080/testRequestParam

**Type:** GET

**Author:** yu 2019/9/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Test @RequestParam

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
author|string|author|true|-
type|string|  type|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/testRequestParam?author=詹姆斯&type=hxiiqm
```

**Response-example:**
```
Doesn't return a value.
```

### Test @RequestParam with value
**URL:** http://localhost:8080/testRequestParamWithValue

**Type:** GET

**Author:** yu 2019/9/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Use@RequestParam binding value is name,but method param name is userName

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|user name|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/testRequestParamWithValue?name=leoma.mcglynn
```

**Response-example:**
```
Doesn't return a value.
```

### Test @RequestParam with default value
**URL:** http://localhost:8080/testRequestParamWithDefaultVal

**Type:** GET

**Author:** yu 2019/9/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Use@RequestParam binding default value Jordan

**Query-parameters:**

Parameter | Type|Description|Required|Since
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

### Test much path
**URL:** http://localhost:8080/testMuchPath/get/{userId};	http:/localhost:8080/testMuchPath/find/{userId}

**Type:** GET

**Author:** yu 2019/9/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** giteeissues #I1545A

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|int64|userId|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/testMuchPath/get/855
```

**Response-example:**
```
Doesn't return a value.
```

### Test much path much parameter
**URL:** http://localhost:8080/get/{deptId}/{userId};	http:/localhost:8080/find/{deptId}/{userId}

**Type:** POST

**Author:** yu 2019/9/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Test much path much parameter

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|int64|userId|true|-
deptId|int64|deptId|true|-

**Request-example:**
```
curl -X POST -i http://localhost:8080/get/912/424
```

**Response-example:**
```
Doesn't return a value.
```

### Test Constants
**URL:** http://localhost:8080/testConstants

**Type:** GET

**Author:** yu 2019/9/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Test Constants

**Query-parameters:**

Parameter | Type|Description|Required|Since
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

### 测试mapping中的
**URL:** http://localhost:8080/ex/bars

**Type:** GET

**Author:** yu 2019/9/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试mapping中的

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int32|parameter condition|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/ex/bars?id=102
```

**Response-example:**
```
string
```

### 测试mapping中的2
**URL:** http://localhost:8080/ex/bars

**Type:** GET

**Author:** yu 2019/9/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试mapping中的2

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int32|parameter condition|true|-
second|string|parameter condition|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/ex/bars?id=102&second=jl2sii
```

**Response-example:**
```
string
```

## 请求类型测试
### 测试GetMapping 无参数
**URL:** http://localhost:8080/getMapping1

**Type:** GET

**Author:** zhangsan, wangwu

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试GetMapping 无参数

**Request-example:**
```
curl -X GET -i http://localhost:8080/getMapping1
```

**Response-example:**
```
Doesn't return a value.
```

### 测试PostMapping 无参数
**URL:** http://localhost:8080/PostMapping1

**Type:** POST

**Author:** "songhaozhi"

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试PostMapping 无参数

**Request-example:**
```
curl -X POST -i http://localhost:8080/PostMapping1
```

**Response-example:**
```
Doesn't return a value.
```

### 测试PutMapping 无参数
**URL:** http://localhost:8080/PutMapping1

**Type:** PUT

**Author:** songhaozhi,test

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试PutMapping 无参数

**Request-example:**
```
curl -X PUT -i http://localhost:8080/PutMapping1
```

**Response-example:**
```
Doesn't return a value.
```

### DeleteMapping 无参数
**URL:** http://localhost:8080/DeleteMapping1

**Type:** DELETE

**Author:** songhaozhi,test

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** DeleteMapping 无参数

**Request-example:**
```
curl -X DELETE -i http://localhost:8080/DeleteMapping1
```

**Response-example:**
```
Doesn't return a value.
```

### 测试GetMapping
**URL:** http://localhost:8080/getMapping

**Type:** GET

**Author:** songhaozhi,test

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试GetMapping

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|int64|userId|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/getMapping?userId=689
```

**Response-example:**
```
Doesn't return a value.
```

### 测试PostMapping json
**URL:** http://localhost:8080/postMapping

**Type:** POST

**Author:** songhaozhi,test

**Content-Type:** application/json; charset=utf-8

**Description:** 测试PostMapping json

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|string|自增编号|false|v1.0
createBy|string|创建人|false|v1.2
createTime|string|创建时间|false|v1.0
updateBy|string|修改人|false|v1.1
updateTime|string|修改时间|false|v1.1
delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
username|string|用户名|false|-
password|string|密码|false|-
nickName|string|昵称|false|-
mobile|string|电话|false|-
email|string|邮箱|false|-
address|string|地址|false|-
sex|int32|性别(男1 女 2)|false|-
avatar|string|No comments found.|false|-
type|int32|类型|false|-
status|int32|状态|false|-
description|string|描述|false|-
roles|array|用户拥有角色|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─name|string|角色名 以ROLE_开头|false|v1.0
└─defaultRole|boolean|是否为注册默认角色|false|v1.0
└─permissions|array|拥有权限|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|false|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|菜单/权限名称|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─level|int32|层级|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─type|int32|类型 0页面 1具体操作|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─title|string|菜单标题|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─path|string|页面路径/资源链接url|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─component|string|前端组件|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─icon|string|图标|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─buttonType|string|按钮权限类型|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─parentId|string|父id|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─description|string|说明备注|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─sortOrder|number|排序值|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─status|int32|是否启用 0启用 -1禁用|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─children|array|子菜单/权限|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─permTypes|array|页面拥有的权限类型|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─expand|boolean|节点展开 前端所需|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─checked|boolean|是否勾选 前端所需|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─selected|boolean|是否选中 前端所需|false|-
permissions|array|用户拥有的权限|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─name|string|菜单/权限名称|false|-
└─level|int32|层级|false|-
└─type|int32|类型 0页面 1具体操作|false|-
└─title|string|菜单标题|false|-
└─path|string|页面路径/资源链接url|false|-
└─component|string|前端组件|false|-
└─icon|string|图标|false|-
└─buttonType|string|按钮权限类型|false|-
└─parentId|string|父id|false|-
└─description|string|说明备注|false|-
└─sortOrder|number|排序值|false|-
└─status|int32|是否启用 0启用 -1禁用|false|-
└─children|array|子菜单/权限|false|-
└─permTypes|array|页面拥有的权限类型|false|-
└─expand|boolean|节点展开 前端所需|false|-
└─checked|boolean|是否勾选 前端所需|false|-
└─selected|boolean|是否选中 前端所需|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/postMapping --data '{
  "id": "102",
  "createBy": "0xculh",
  "createTime": "2021-08-07 17:14:31",
  "updateBy": "8jl5uj",
  "updateTime": "2021-08-07 17:14:31",
  "delFlag": 6,
  "username": "leoma.mcglynn",
  "password": "geeljj",
  "nickName": "karen.orn",
  "mobile": "424-812-6883",
  "email": "darline.dach@gmail.com",
  "address": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
  "sex": 1,
  "avatar": "dfs830",
  "type": 688,
  "status": 993,
  "description": "wlq0jv",
  "roles": [
    {
      "id": "102",
      "createBy": "rq9h43",
      "createTime": "2021-08-07 17:14:31",
      "updateBy": "tgye0j",
      "updateTime": "2021-08-07 17:14:31",
      "delFlag": 6,
      "name": "leoma.mcglynn",
      "defaultRole": true,
      "permissions": [
        {
          "id": "102",
          "createBy": "gc8oaa",
          "createTime": "2021-08-07 17:14:31",
          "updateBy": "2go51y",
          "updateTime": "2021-08-07 17:14:31",
          "delFlag": 6,
          "name": "leoma.mcglynn",
          "level": 910,
          "type": 110,
          "title": "760ful",
          "path": "zoz2no",
          "component": "bzwks1",
          "icon": "gm126z",
          "buttonType": "ycv7tl",
          "parentId": "102",
          "description": "78dihg",
          "sortOrder": 415,
          "status": 855,
          "children": [
            {
              "$ref": ".."
            }
          ],
          "permTypes": [
            "6unffg"
          ],
          "expand": true,
          "checked": true,
          "selected": true
        }
      ]
    }
  ],
  "permissions": [
    {
      "id": "102",
      "createBy": "j2b760",
      "createTime": "2021-08-07 17:14:31",
      "updateBy": "z4kdt7",
      "updateTime": "2021-08-07 17:14:31",
      "delFlag": 6,
      "name": "leoma.mcglynn",
      "level": 124,
      "type": 205,
      "title": "8yqhef",
      "path": "wtpz5v",
      "component": "dobc3q",
      "icon": "h46frw",
      "buttonType": "ixyjdp",
      "parentId": "102",
      "description": "ocfx2d",
      "sortOrder": 350,
      "status": 567,
      "children": [
        {
          "$ref": ".."
        }
      ],
      "permTypes": [
        "3n1vmr"
      ],
      "expand": true,
      "checked": true,
      "selected": true
    }
  ]
}'
```

**Response-example:**
```
Doesn't return a value.
```

### 测试PostMapping表单
**URL:** http://localhost:8080/postMapping2

**Type:** POST

**Author:** songhaozhi,test

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试PostMapping表单

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|string|自增编号|false|v1.0
createBy|string|创建人|false|v1.2
createTime|string|创建时间|false|v1.0
updateBy|string|修改人|false|v1.1
updateTime|string|修改时间|false|v1.1
delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
username|string|用户名|false|-
password|string|密码|false|-
nickName|string|昵称|false|-
mobile|string|电话|false|-
email|string|邮箱|false|-
address|string|地址|false|-
sex|int32|性别(男1 女 2)|false|-
avatar|string|No comments found.|false|-
type|int32|类型|false|-
status|int32|状态|false|-
description|string|描述|false|-
roles|array|用户拥有角色|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─name|string|角色名 以ROLE_开头|false|v1.0
└─defaultRole|boolean|是否为注册默认角色|false|v1.0
└─permissions|array|拥有权限|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|false|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|菜单/权限名称|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─level|int32|层级|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─type|int32|类型 0页面 1具体操作|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─title|string|菜单标题|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─path|string|页面路径/资源链接url|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─component|string|前端组件|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─icon|string|图标|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─buttonType|string|按钮权限类型|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─parentId|string|父id|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─description|string|说明备注|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─sortOrder|number|排序值|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─status|int32|是否启用 0启用 -1禁用|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─children|array|子菜单/权限|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─permTypes|array|页面拥有的权限类型|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─expand|boolean|节点展开 前端所需|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─checked|boolean|是否勾选 前端所需|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─selected|boolean|是否选中 前端所需|false|-
permissions|array|用户拥有的权限|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─name|string|菜单/权限名称|false|-
└─level|int32|层级|false|-
└─type|int32|类型 0页面 1具体操作|false|-
└─title|string|菜单标题|false|-
└─path|string|页面路径/资源链接url|false|-
└─component|string|前端组件|false|-
└─icon|string|图标|false|-
└─buttonType|string|按钮权限类型|false|-
└─parentId|string|父id|false|-
└─description|string|说明备注|false|-
└─sortOrder|number|排序值|false|-
└─status|int32|是否启用 0启用 -1禁用|false|-
└─children|array|子菜单/权限|false|-
└─permTypes|array|页面拥有的权限类型|false|-
└─expand|boolean|节点展开 前端所需|false|-
└─checked|boolean|是否勾选 前端所需|false|-
└─selected|boolean|是否选中 前端所需|false|-

**Request-example:**
```
curl -X POST -i http://localhost:8080/postMapping2 --data 'permissions[0].updateTime=2021-08-07 17:14:31&permissions[0].level=716&permissions[0].createTime=2021-08-07 17:14:31&roles[0].permissions[0].delFlag=6&permissions[0].status=837&id=102&roles[0].permissions[0].checked=true&roles[0].permissions[0].createBy=km4lql&createTime=2021-08-07 17:14:31&roles[0].permissions[0].updateTime=2021-08-07 17:14:31&email=darline.dach@gmail.com&permissions[0].id=102&roles[0].createBy=278mmd&roles[0].permissions[0].component=1l1d7b&permissions[0].createBy=fzm519&delFlag=6&permissions[0].component=p81d61&permissions[0].description=n7tll7&roles[0].permissions[0].title=9tnnyi&roles[0].updateBy=mxn5z7&permissions[0].selected=true&address=Suite 106 773 Wisoky Ports， East Kylee， OR 31948&roles[0].permissions[0].updateBy=nk5j4s&nickName=karen.orn&updateTime=2021-08-07 17:14:31&permissions[0].path=fqk6gw&permissions[0].expand=true&roles[0].permissions[0].parentId=102&status=411&roles[0].delFlag=6&roles[0].createTime=2021-08-07 17:14:31&description=fol966&sex=1&roles[0].permissions[0].description=57kx56&type=511&roles[0].name=leoma.mcglynn&permissions[0].updateBy=m442jn&permissions[0].buttonType=blrk6l&password=3ipnjp&roles[0].permissions[0].path=w5loxg&permissions[0].delFlag=6&permissions[0].title=6ktmhg&permissions[0].type=935&roles[0].id=102&roles[0].permissions[0].createTime=2021-08-07 17:14:31&roles[0].permissions[0].type=690&roles[0].updateTime=2021-08-07 17:14:31&roles[0].permissions[0].expand=true&createBy=qc0wpk&permissions[0].sortOrder=296&username=leoma.mcglynn&roles[0].permissions[0].name=leoma.mcglynn&permissions[0].icon=rdxbj8&permissions[0].checked=true&permissions[0].name=leoma.mcglynn&roles[0].permissions[0].icon=7ivj0m&roles[0].permissions[0].status=869&roles[0].permissions[0].sortOrder=351&updateBy=q4sxv8&roles[0].permissions[0].buttonType=c7ab5t&roles[0].permissions[0].id=102&permissions[0].parentId=102&avatar=bfww7f&roles[0].permissions[0].selected=true&roles[0].permissions[0].level=53&mobile=424-812-6883&roles[0].defaultRole=true'
```

**Response-example:**
```
Doesn't return a value.
```

### 测试PutMapping json
**URL:** http://localhost:8080/putMapping

**Type:** PUT

**Author:** songhaozhi,test

**Content-Type:** application/json; charset=utf-8

**Description:** 测试PutMapping json

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|string|自增编号|false|v1.0
createBy|string|创建人|false|v1.2
createTime|string|创建时间|false|v1.0
updateBy|string|修改人|false|v1.1
updateTime|string|修改时间|false|v1.1
delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
username|string|用户名|false|-
password|string|密码|false|-
nickName|string|昵称|false|-
mobile|string|电话|false|-
email|string|邮箱|false|-
address|string|地址|false|-
sex|int32|性别(男1 女 2)|false|-
avatar|string|No comments found.|false|-
type|int32|类型|false|-
status|int32|状态|false|-
description|string|描述|false|-
roles|array|用户拥有角色|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─name|string|角色名 以ROLE_开头|false|v1.0
└─defaultRole|boolean|是否为注册默认角色|false|v1.0
└─permissions|array|拥有权限|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|false|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|菜单/权限名称|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─level|int32|层级|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─type|int32|类型 0页面 1具体操作|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─title|string|菜单标题|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─path|string|页面路径/资源链接url|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─component|string|前端组件|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─icon|string|图标|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─buttonType|string|按钮权限类型|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─parentId|string|父id|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─description|string|说明备注|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─sortOrder|number|排序值|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─status|int32|是否启用 0启用 -1禁用|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─children|array|子菜单/权限|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─permTypes|array|页面拥有的权限类型|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─expand|boolean|节点展开 前端所需|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─checked|boolean|是否勾选 前端所需|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─selected|boolean|是否选中 前端所需|false|-
permissions|array|用户拥有的权限|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─name|string|菜单/权限名称|false|-
└─level|int32|层级|false|-
└─type|int32|类型 0页面 1具体操作|false|-
└─title|string|菜单标题|false|-
└─path|string|页面路径/资源链接url|false|-
└─component|string|前端组件|false|-
└─icon|string|图标|false|-
└─buttonType|string|按钮权限类型|false|-
└─parentId|string|父id|false|-
└─description|string|说明备注|false|-
└─sortOrder|number|排序值|false|-
└─status|int32|是否启用 0启用 -1禁用|false|-
└─children|array|子菜单/权限|false|-
└─permTypes|array|页面拥有的权限类型|false|-
└─expand|boolean|节点展开 前端所需|false|-
└─checked|boolean|是否勾选 前端所需|false|-
└─selected|boolean|是否选中 前端所需|false|-

**Request-example:**
```
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/putMapping --data '{
  "id": "102",
  "createBy": "zfnuul",
  "createTime": "2021-08-07 17:14:31",
  "updateBy": "n58k7m",
  "updateTime": "2021-08-07 17:14:31",
  "delFlag": 6,
  "username": "leoma.mcglynn",
  "password": "hcwwwf",
  "nickName": "karen.orn",
  "mobile": "424-812-6883",
  "email": "darline.dach@gmail.com",
  "address": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
  "sex": 1,
  "avatar": "ztiwom",
  "type": 79,
  "status": 442,
  "description": "ukexvq",
  "roles": [
    {
      "id": "102",
      "createBy": "ofsz4o",
      "createTime": "2021-08-07 17:14:31",
      "updateBy": "dvauva",
      "updateTime": "2021-08-07 17:14:31",
      "delFlag": 6,
      "name": "leoma.mcglynn",
      "defaultRole": true,
      "permissions": [
        {
          "id": "102",
          "createBy": "6gwd0k",
          "createTime": "2021-08-07 17:14:31",
          "updateBy": "xy9pni",
          "updateTime": "2021-08-07 17:14:31",
          "delFlag": 6,
          "name": "leoma.mcglynn",
          "level": 748,
          "type": 704,
          "title": "3ewu44",
          "path": "nev8d0",
          "component": "ab6lbj",
          "icon": "dkble2",
          "buttonType": "3g8a3n",
          "parentId": "102",
          "description": "rbabaw",
          "sortOrder": 332,
          "status": 733,
          "children": [
            {
              "$ref": ".."
            }
          ],
          "permTypes": [
            "nc11ff"
          ],
          "expand": true,
          "checked": true,
          "selected": true
        }
      ]
    }
  ],
  "permissions": [
    {
      "id": "102",
      "createBy": "uytdqx",
      "createTime": "2021-08-07 17:14:31",
      "updateBy": "su6wo6",
      "updateTime": "2021-08-07 17:14:31",
      "delFlag": 6,
      "name": "leoma.mcglynn",
      "level": 31,
      "type": 630,
      "title": "vgw1xi",
      "path": "y7l4rz",
      "component": "citp3k",
      "icon": "h7ilcf",
      "buttonType": "t3enio",
      "parentId": "102",
      "description": "ka1diy",
      "sortOrder": 980,
      "status": 602,
      "children": [
        {
          "$ref": ".."
        }
      ],
      "permTypes": [
        "s5pwyx"
      ],
      "expand": true,
      "checked": true,
      "selected": true
    }
  ]
}'
```

**Response-example:**
```
Doesn't return a value.
```

### 测试PutMapping表单
**URL:** http://localhost:8080/putMapping2

**Type:** PUT

**Author:** songhaozhi,test

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试PutMapping表单

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|string|自增编号|false|v1.0
createBy|string|创建人|false|v1.2
createTime|string|创建时间|false|v1.0
updateBy|string|修改人|false|v1.1
updateTime|string|修改时间|false|v1.1
delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
username|string|用户名|false|-
password|string|密码|false|-
nickName|string|昵称|false|-
mobile|string|电话|false|-
email|string|邮箱|false|-
address|string|地址|false|-
sex|int32|性别(男1 女 2)|false|-
avatar|string|No comments found.|false|-
type|int32|类型|false|-
status|int32|状态|false|-
description|string|描述|false|-
roles|array|用户拥有角色|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─name|string|角色名 以ROLE_开头|false|v1.0
└─defaultRole|boolean|是否为注册默认角色|false|v1.0
└─permissions|array|拥有权限|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|false|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|false|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|菜单/权限名称|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─level|int32|层级|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─type|int32|类型 0页面 1具体操作|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─title|string|菜单标题|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─path|string|页面路径/资源链接url|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─component|string|前端组件|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─icon|string|图标|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─buttonType|string|按钮权限类型|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─parentId|string|父id|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─description|string|说明备注|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─sortOrder|number|排序值|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─status|int32|是否启用 0启用 -1禁用|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─children|array|子菜单/权限|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─permTypes|array|页面拥有的权限类型|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─expand|boolean|节点展开 前端所需|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─checked|boolean|是否勾选 前端所需|false|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─selected|boolean|是否选中 前端所需|false|-
permissions|array|用户拥有的权限|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─name|string|菜单/权限名称|false|-
└─level|int32|层级|false|-
└─type|int32|类型 0页面 1具体操作|false|-
└─title|string|菜单标题|false|-
└─path|string|页面路径/资源链接url|false|-
└─component|string|前端组件|false|-
└─icon|string|图标|false|-
└─buttonType|string|按钮权限类型|false|-
└─parentId|string|父id|false|-
└─description|string|说明备注|false|-
└─sortOrder|number|排序值|false|-
└─status|int32|是否启用 0启用 -1禁用|false|-
└─children|array|子菜单/权限|false|-
└─permTypes|array|页面拥有的权限类型|false|-
└─expand|boolean|节点展开 前端所需|false|-
└─checked|boolean|是否勾选 前端所需|false|-
└─selected|boolean|是否选中 前端所需|false|-

**Request-example:**
```
curl -X PUT -i http://localhost:8080/putMapping2 --data 'roles[0].permissions[0].updateBy=0yicur&email=darline.dach@gmail.com&roles[0].permissions[0].expand=true&roles[0].permissions[0].buttonType=737z5i&permissions[0].parentId=102&roles[0].permissions[0].path=9l7vtw&roles[0].permissions[0].createTime=2021-08-07 17:14:31&roles[0].delFlag=6&permissions[0].level=172&updateBy=1n3tkp&permissions[0].title=o445w2&description=8lthws&password=m9eimw&roles[0].permissions[0].type=910&permissions[0].path=piiy12&roles[0].id=102&roles[0].permissions[0].title=39kbji&nickName=karen.orn&roles[0].permissions[0].delFlag=6&roles[0].permissions[0].status=302&roles[0].updateTime=2021-08-07 17:14:31&roles[0].permissions[0].description=z0d0mt&roles[0].permissions[0].sortOrder=267&permissions[0].id=102&permissions[0].component=v5ycbo&type=163&permissions[0].createTime=2021-08-07 17:14:31&status=272&avatar=r6rsh7&permissions[0].description=uvlk8d&mobile=424-812-6883&address=Suite 106 773 Wisoky Ports， East Kylee， OR 31948&roles[0].permissions[0].id=102&roles[0].createBy=2q71ap&roles[0].permissions[0].name=leoma.mcglynn&permissions[0].name=leoma.mcglynn&permissions[0].sortOrder=374&permissions[0].type=841&roles[0].permissions[0].createBy=2tvxzh&roles[0].permissions[0].updateTime=2021-08-07 17:14:31&updateTime=2021-08-07 17:14:31&delFlag=6&sex=1&permissions[0].updateTime=2021-08-07 17:14:31&permissions[0].status=304&roles[0].permissions[0].level=185&roles[0].defaultRole=true&permissions[0].createBy=zr61kc&roles[0].permissions[0].selected=true&id=102&roles[0].permissions[0].checked=true&username=leoma.mcglynn&permissions[0].delFlag=6&permissions[0].icon=kwatia&roles[0].name=leoma.mcglynn&permissions[0].buttonType=7wpwce&createBy=x77zuk&permissions[0].updateBy=nrx13g&roles[0].permissions[0].component=j38ecz&roles[0].updateBy=cqc3qu&roles[0].permissions[0].icon=eh1vdi&roles[0].createTime=2021-08-07 17:14:31&permissions[0].selected=true&createTime=2021-08-07 17:14:31&permissions[0].checked=true&permissions[0].expand=true&roles[0].permissions[0].parentId=102'
```

**Response-example:**
```
Doesn't return a value.
```

### 测试DeleteMapping
**URL:** http://localhost:8080/deleteMapping

**Type:** DELETE

**Author:** songhaozhi,test

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试DeleteMapping

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|int64|userId|true|-

**Request-example:**
```
curl -X DELETE -i http://localhost:8080/deleteMapping?userId=838
```

**Response-example:**
```
Doesn't return a value.
```

## Test ResponseEntity
### ResponseEntity return List
**URL:** http://localhost:8080/responseEntity/list

**Type:** GET

**Author:** yu 2019/10/19.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

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
        "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
      }
    ],
    "userList": [
      {
        "$ref": ".."
      }
    ],
    "userName": "leoma.mcglynn",
    "nickName": "karen.orn",
    "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
    "userAge": 21,
    "phone": "1-773-920-9761",
    "createTime": 1628327669799,
    "small": 83.95,
    "money": 3.64,
    "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
    "telephone": "1-773-920-9761"
  }
]
```

## 普通java对象api文档测试
### 返回普通String测试
**URL:** http://localhost:8080/simple/str

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回普通String测试

**Request-example:**
```
curl -X GET -i http://localhost:8080/simple/str
```

**Response-example:**
```
string
```

### 返回普通javabean
**URL:** http://localhost:8080/simple/user

**Type:** POST

**Author:** yu 2018/06/27.

**Content-Type:** application/json; charset=utf-8

**Description:** 返回普通javabean

**Body-parameters:**

Parameter | Type|Description|Required|Since
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
      "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
    }
  ],
  "userList": [
    {
      "$ref": ".."
    }
  ],
  "userName": "leoma.mcglynn",
  "nickName": "karen.orn",
  "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
  "userAge": 21,
  "phone": "1-773-920-9761",
  "createTime": 1628327669799,
  "small": 37.80,
  "money": 72.04,
  "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
  "telephone": "1-773-920-9761"
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
      "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
    }
  ],
  "userList": [
    {
      "$ref": ".."
    }
  ],
  "userName": "leoma.mcglynn",
  "nickName": "karen.orn",
  "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
  "userAge": 21,
  "phone": "1-773-920-9761",
  "createTime": 1628327669799,
  "small": 86.33,
  "money": 57.66,
  "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
  "telephone": "1-773-920-9761"
}
```

### 返回复杂实体数据
**URL:** http://localhost:8080/simple/stu

**Type:** POST

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

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
  "stuName": "leoma.mcglynn",
  "stuAge": true,
  "stuAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
  "user": {
    "userDetails": [
      {
        "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
      }
    ],
    "userList": [
      {
        "$ref": ".."
      }
    ],
    "userName": "leoma.mcglynn",
    "nickName": "karen.orn",
    "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
    "userAge": 21,
    "phone": "1-773-920-9761",
    "createTime": 1628327669799,
    "small": 23.22,
    "money": 13.57,
    "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
    "telephone": "1-773-920-9761"
  },
  "userMap": {
    "mapKey": {
      "userDetails": [
        {
          "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "leoma.mcglynn",
      "nickName": "karen.orn",
      "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
      "userAge": 21,
      "phone": "1-773-920-9761",
      "createTime": 1628327669799,
      "small": 94.20,
      "money": 74.16,
      "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
      "telephone": "1-773-920-9761"
    }
  },
  "userTreeSet": [
    {
      "userDetails": [
        {
          "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "leoma.mcglynn",
      "nickName": "karen.orn",
      "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
      "userAge": 21,
      "phone": "1-773-920-9761",
      "createTime": 1628327669799,
      "small": 9.29,
      "money": 5.87,
      "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
      "telephone": "1-773-920-9761"
    }
  ],
  "user1": {
    "userDetails": [
      {
        "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
      }
    ],
    "userList": [
      {
        "$ref": ".."
      }
    ],
    "userName": "leoma.mcglynn",
    "nickName": "karen.orn",
    "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
    "userAge": 21,
    "phone": "1-773-920-9761",
    "createTime": 1628327669799,
    "small": 64.04,
    "money": 14.82,
    "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
    "telephone": "1-773-920-9761"
  }
}
```

### Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;结构
**URL:** http://localhost:8080/simple/teacher

**Type:** POST

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

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
          "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "leoma.mcglynn",
      "nickName": "karen.orn",
      "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
      "userAge": 21,
      "phone": "1-773-920-9761",
      "createTime": 1628327669799,
      "small": 9.84,
      "money": 52.57,
      "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
      "telephone": "1-773-920-9761"
    },
    "data1": {
      "userDetails": [
        {
          "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "leoma.mcglynn",
      "nickName": "karen.orn",
      "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
      "userAge": 21,
      "phone": "1-773-920-9761",
      "createTime": 1628327669799,
      "small": 87.06,
      "money": 97.02,
      "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
      "telephone": "1-773-920-9761"
    },
    "data2": {
      "userDetails": [
        {
          "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "leoma.mcglynn",
      "nickName": "karen.orn",
      "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
      "userAge": 21,
      "phone": "1-773-920-9761",
      "createTime": 1628327669799,
      "small": 1.42,
      "money": 68.73,
      "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
      "telephone": "1-773-920-9761"
    },
    "age": 21
  },
  "data1": {
    "data": {
      "userDetails": [
        {
          "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "leoma.mcglynn",
      "nickName": "karen.orn",
      "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
      "userAge": 21,
      "phone": "1-773-920-9761",
      "createTime": 1628327669799,
      "small": 15.54,
      "money": 12.08,
      "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
      "telephone": "1-773-920-9761"
    },
    "data1": {
      "userDetails": [
        {
          "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "leoma.mcglynn",
      "nickName": "karen.orn",
      "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
      "userAge": 21,
      "phone": "1-773-920-9761",
      "createTime": 1628327669799,
      "small": 89.71,
      "money": 63.60,
      "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
      "telephone": "1-773-920-9761"
    },
    "data2": {
      "userDetails": [
        {
          "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "leoma.mcglynn",
      "nickName": "karen.orn",
      "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
      "userAge": 21,
      "phone": "1-773-920-9761",
      "createTime": 1628327669799,
      "small": 96.84,
      "money": 67.43,
      "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
      "telephone": "1-773-920-9761"
    },
    "age": 21
  },
  "data2": {
    "data": {
      "userDetails": [
        {
          "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "leoma.mcglynn",
      "nickName": "karen.orn",
      "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
      "userAge": 21,
      "phone": "1-773-920-9761",
      "createTime": 1628327669799,
      "small": 4.00,
      "money": 35.84,
      "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
      "telephone": "1-773-920-9761"
    },
    "data1": {
      "userDetails": [
        {
          "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "leoma.mcglynn",
      "nickName": "karen.orn",
      "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
      "userAge": 21,
      "phone": "1-773-920-9761",
      "createTime": 1628327669799,
      "small": 28.16,
      "money": 4.28,
      "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
      "telephone": "1-773-920-9761"
    },
    "data2": {
      "userDetails": [
        {
          "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "leoma.mcglynn",
      "nickName": "karen.orn",
      "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
      "userAge": 21,
      "phone": "1-773-920-9761",
      "createTime": 1628327669799,
      "small": 85.95,
      "money": 86.26,
      "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
      "telephone": "1-773-920-9761"
    },
    "age": 21
  },
  "age": 21
}
```

### Teacher&lt;List&lt;User&gt;, User, Student&gt;
**URL:** http://localhost:8080/simple/teacher2

**Type:** POST

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

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
          "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "leoma.mcglynn",
      "nickName": "karen.orn",
      "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
      "userAge": 21,
      "phone": "1-773-920-9761",
      "createTime": 1628327669799,
      "small": 20.56,
      "money": 48.66,
      "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
      "telephone": "1-773-920-9761"
    }
  ],
  "data1": {
    "stuName": "leoma.mcglynn",
    "stuAge": true,
    "stuAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
    "user": {
      "userDetails": [
        {
          "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "leoma.mcglynn",
      "nickName": "karen.orn",
      "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
      "userAge": 21,
      "phone": "1-773-920-9761",
      "createTime": 1628327669799,
      "small": 5.49,
      "money": 42.40,
      "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
      "telephone": "1-773-920-9761"
    },
    "userMap": {
      "mapKey": {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 54.78,
        "money": 63.00,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      }
    },
    "userTreeSet": [
      {
        "userDetails": [
          {
            "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "leoma.mcglynn",
        "nickName": "karen.orn",
        "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
        "userAge": 21,
        "phone": "1-773-920-9761",
        "createTime": 1628327669799,
        "small": 87.70,
        "money": 32.99,
        "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
        "telephone": "1-773-920-9761"
      }
    ],
    "user1": {
      "userDetails": [
        {
          "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "leoma.mcglynn",
      "nickName": "karen.orn",
      "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
      "userAge": 21,
      "phone": "1-773-920-9761",
      "createTime": 1628327669799,
      "small": 72.80,
      "money": 59.42,
      "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
      "telephone": "1-773-920-9761"
    }
  },
  "data2": {
    "userDetails": [
      {
        "githubAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948"
      }
    ],
    "userList": [
      {
        "$ref": ".."
      }
    ],
    "userName": "leoma.mcglynn",
    "nickName": "karen.orn",
    "userAddress": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
    "userAge": 21,
    "phone": "1-773-920-9761",
    "createTime": 1628327669799,
    "small": 50.31,
    "money": 62.16,
    "ipv6": "8e0d:6f09:0348:2bf1:83dc:d506:54f0:a440",
    "telephone": "1-773-920-9761"
  },
  "age": 21
}
```

### 测试SubUser
**URL:** http://localhost:8080/simple/subUser

**Type:** POST

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

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
  "numbers": 394
}
```

### 返回CommonResult&lt;SubUser&gt;
**URL:** http://localhost:8080/simple/subUser/result

**Type:** POST

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

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
    "numbers": 924
  },
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

## 简单对象测试2
### CommonResult&lt;String&gt;
**URL:** http://localhost:8080/stringCommonResult

**Type:** POST

**Author:** yu 2018/06/30.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** CommonResult&lt;String&gt;

**Request-example:**
```
curl -X POST -i http://localhost:8080/stringCommonResult
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
  "data": "457jwb",
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### 返回Staff&lt;Staff&lt;Staff&gt;&gt;
**URL:** http://localhost:8080/staff

**Type:** POST

**Author:** yu 2018/06/30.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回Staff&lt;Staff&lt;Staff&gt;&gt;

**Request-example:**
```
curl -X POST -i http://localhost:8080/staff
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|职工名称|-
annyObject|object|任何信息对象|-
└─name|string|职工名称|-
└─annyObject|object|任何信息对象|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|职工名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─annyObject|object|任何信息对象|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─data|array|泛型数据|-
└─data|array|泛型数据|-
data|array|泛型数据|-
└─name|string|职工名称|-
└─annyObject|object|任何信息对象|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|职工名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─annyObject|object|任何信息对象|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─data|array|泛型数据|-
└─data|array|泛型数据|-

**Response-example:**
```
{
  "name": "leoma.mcglynn",
  "annyObject": {
    "name": "leoma.mcglynn",
    "annyObject": {
      "$ref": "..."
    },
    "data": [
      {
        "$ref": ".."
      }
    ]
  },
  "data": [
    {
      "name": "leoma.mcglynn",
      "annyObject": {
        "$ref": "..."
      },
      "data": [
        {
          "$ref": ".."
        }
      ]
    }
  ]
}
```

### 返回Staff&lt;String&gt;
**URL:** http://localhost:8080/staffStr

**Type:** POST

**Author:** yu 2018/06/30.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回Staff&lt;String&gt;

**Request-example:**
```
curl -X POST -i http://localhost:8080/staffStr
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|职工名称|-
annyObject|object|任何信息对象|-
data|array|泛型数据|-

**Response-example:**
```
{
  "name": "leoma.mcglynn",
  "annyObject": "jrij6f",
  "data": [
    "cl8cto"
  ]
}
```

### JAVA继承测试
**URL:** http://localhost:8080/children

**Type:** POST

**Author:** yu 2018/06/30.

**Content-Type:** application/json; charset=utf-8

**Description:** JAVA继承测试

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
age|int32|年龄|false|-
name|string|姓名|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/children --data '{
  "age": 21,
  "name": "leoma.mcglynn"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
age|int32|年龄|-
name|string|姓名|-

**Response-example:**
```
{
  "age": 21,
  "name": "leoma.mcglynn"
}
```

## 注释tag用例
### ~~测试apiNote tag~~
**URL:** http://localhost:8080/tags/apiNote

**Type:** POST

**Author:** "cht"

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Thismethod returns a List instead of a Collection or Stream,<br>because processing of multiple Wombats usually involves traversing<br>the list in alternating forward and reverse directions.

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
user|array|No comments found.,[array of string]|false|

**Request-example:**
```
curl -X POST -i http://localhost:8080/tags/apiNote --data 'user=hekvo1&user=hekvo1'
```

**Response-example:**
```
string
```

### 自定义mock tag获取mock值
**URL:** http://localhost:8080/tags/mock

**Type:** POST

**Author:** yu 2020/7/2.

**Content-Type:** application/json; charset=utf-8

**Description:** 自定义mock tag获取mock值

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
subUserName|string|用户名称|true|-
numbers|number|bigInteger|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/tags/mock --data '{
  "subUserName": "张三",
  "numbers": 87
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|处理成功返回的业务数据|-
└─MAX_SPEED|int32|No comments found.|-
└─gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|-
└─simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|-
└─username|string|用户名|v1.0
└─password|string|密码|v1.0
└─nickName|string|昵称|v1.0
└─mobile|string|电话|v1.0
└─roles|array|用户角色信息|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userId|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─roleId|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─roleName|string|No comments found.|-
└─extend|map|用户扩展项|-
└─listMap|array|ListMap效果展示|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{"success":true,"message":"success","data":{"MAX_SPEED":153,"gender":0,"simpleEnum":"RED","username":"leoma.mcglynn","password":"99esf8","nickName":"karen.orn","mobile":"424-812-6883","roles":[{"id":"102","createBy":"fj1u7q","createTime":"2021-08-07 17:14:31","updateBy":"wgnf4e","updateTime":"2021-08-07 17:14:31","delFlag":6,"userId":"102","roleId":"102","roleName":"leoma.mcglynn"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}},"code":"35031","timestamp":"2021-08-07 17:14:29"}
```

### 测试@ignore tag
**URL:** http://localhost:8080/tags/ignore

**Type:** GET

**Author:** yu 2020/7/2.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试@ignore tag

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
total|int32|记录总数|false|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/tags/ignore?total=658
```

**Response-example:**
```
string
```

## 用户信息操作接口
### 添加用户
**URL:** http://localhost:8080/user/add

**Type:** POST

**Author:** yu 2018/8/4.

**Content-Type:** application/json; charset=utf-8

**Description:** 添加用户

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
MAX_SPEED|int32|No comments found.|false|-
gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|false|-
simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|false|-
username|string|用户名|false|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
roles|array|用户角色信息|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─userId|string|No comments found.|false|-
└─roleId|string|No comments found.|false|-
└─roleName|string|No comments found.|false|-
extend|map|用户扩展项|false|-
listMap|array|ListMap效果展示|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/user/add --data '{"MAX_SPEED":462,"gender":0,"simpleEnum":"RED","username":"leoma.mcglynn","password":"i4d5a0","nickName":"karen.orn","mobile":"424-812-6883","roles":[{"id":"102","createBy":"bpkodj","createTime":"2021-08-07 17:14:31","updateBy":"hxyap6","updateTime":"2021-08-07 17:14:31","delFlag":6,"userId":"102","roleId":"102","roleName":"leoma.mcglynn"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
id|string|自增编号|v1.0
createBy|string|创建人|v1.2
createTime|string|创建时间|v1.0
updateBy|string|修改人|v1.1
updateTime|string|修改时间|v1.1
delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
username|string|用户名|-
password|string|密码|-
nickName|string|昵称|-
mobile|string|电话|-
email|string|邮箱|-
address|string|地址|-
sex|int32|性别(男1 女 2)|-
avatar|string|No comments found.|-
type|int32|类型|-
status|int32|状态|-
description|string|描述|-
roles|array|用户拥有角色|-
└─id|string|自增编号|v1.0
└─createBy|string|创建人|v1.2
└─createTime|string|创建时间|v1.0
└─updateBy|string|修改人|v1.1
└─updateTime|string|修改时间|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
└─name|string|角色名 以ROLE_开头|v1.0
└─defaultRole|boolean|是否为注册默认角色|v1.0
└─permissions|array|拥有权限|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|菜单/权限名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─level|int32|层级|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─type|int32|类型 0页面 1具体操作|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─title|string|菜单标题|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─path|string|页面路径/资源链接url|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─component|string|前端组件|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─icon|string|图标|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─buttonType|string|按钮权限类型|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─parentId|string|父id|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─description|string|说明备注|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─sortOrder|number|排序值|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─status|int32|是否启用 0启用 -1禁用|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─children|array|子菜单/权限|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─permTypes|array|页面拥有的权限类型|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─expand|boolean|节点展开 前端所需|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─checked|boolean|是否勾选 前端所需|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─selected|boolean|是否选中 前端所需|-
permissions|array|用户拥有的权限|-
└─id|string|自增编号|v1.0
└─createBy|string|创建人|v1.2
└─createTime|string|创建时间|v1.0
└─updateBy|string|修改人|v1.1
└─updateTime|string|修改时间|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
└─name|string|菜单/权限名称|-
└─level|int32|层级|-
└─type|int32|类型 0页面 1具体操作|-
└─title|string|菜单标题|-
└─path|string|页面路径/资源链接url|-
└─component|string|前端组件|-
└─icon|string|图标|-
└─buttonType|string|按钮权限类型|-
└─parentId|string|父id|-
└─description|string|说明备注|-
└─sortOrder|number|排序值|-
└─status|int32|是否启用 0启用 -1禁用|-
└─children|array|子菜单/权限|-
└─permTypes|array|页面拥有的权限类型|-
└─expand|boolean|节点展开 前端所需|-
└─checked|boolean|是否勾选 前端所需|-
└─selected|boolean|是否选中 前端所需|-

**Response-example:**
```
{
  "id": "102",
  "createBy": "lx3058",
  "createTime": "2021-08-07 17:14:31",
  "updateBy": "3siwpt",
  "updateTime": "2021-08-07 17:14:31",
  "delFlag": 6,
  "username": "leoma.mcglynn",
  "password": "3a3ove",
  "nickName": "karen.orn",
  "mobile": "424-812-6883",
  "email": "darline.dach@gmail.com",
  "address": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
  "sex": 1,
  "avatar": "geig4h",
  "type": 23,
  "status": 488,
  "description": "gr2dus",
  "roles": [
    {
      "id": "102",
      "createBy": "zrqrei",
      "createTime": "2021-08-07 17:14:31",
      "updateBy": "o2y4x7",
      "updateTime": "2021-08-07 17:14:31",
      "delFlag": 6,
      "name": "leoma.mcglynn",
      "defaultRole": true,
      "permissions": [
        {
          "id": "102",
          "createBy": "9n5y97",
          "createTime": "2021-08-07 17:14:31",
          "updateBy": "scayac",
          "updateTime": "2021-08-07 17:14:31",
          "delFlag": 6,
          "name": "leoma.mcglynn",
          "level": 411,
          "type": 989,
          "title": "ibno67",
          "path": "2ng9px",
          "component": "4ws36h",
          "icon": "ypwamw",
          "buttonType": "h3qe9v",
          "parentId": "102",
          "description": "2pl3em",
          "sortOrder": 750,
          "status": 611,
          "children": [
            {
              "$ref": ".."
            }
          ],
          "permTypes": [
            "r2sqrg"
          ],
          "expand": true,
          "checked": true,
          "selected": true
        }
      ]
    }
  ],
  "permissions": [
    {
      "id": "102",
      "createBy": "w0xlaq",
      "createTime": "2021-08-07 17:14:31",
      "updateBy": "f0bc8t",
      "updateTime": "2021-08-07 17:14:31",
      "delFlag": 6,
      "name": "leoma.mcglynn",
      "level": 669,
      "type": 904,
      "title": "qpu1cs",
      "path": "baa8x4",
      "component": "yeo9f0",
      "icon": "bs9uyq",
      "buttonType": "jxnslm",
      "parentId": "102",
      "description": "etezhx",
      "sortOrder": 733,
      "status": 403,
      "children": [
        {
          "$ref": ".."
        }
      ],
      "permTypes": [
        "rxr2xy"
      ],
      "expand": true,
      "checked": true,
      "selected": true
    }
  ]
}
```

### 更新用户
**URL:** http://localhost:8080/user/update

**Type:** PUT

**Author:** yu 2018/8/4.

**Content-Type:** application/json; charset=utf-8

**Description:** 更新用户

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
MAX_SPEED|int32|No comments found.|false|-
gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|false|-
simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|false|-
username|string|用户名|false|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
roles|array|用户角色信息|false|-
└─id|string|自增编号|false|v1.0
└─createBy|string|创建人|false|v1.2
└─createTime|string|创建时间|false|v1.0
└─updateBy|string|修改人|false|v1.1
└─updateTime|string|修改时间|false|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|false|v1.1
└─userId|string|No comments found.|false|-
└─roleId|string|No comments found.|false|-
└─roleName|string|No comments found.|false|-
extend|map|用户扩展项|false|-
listMap|array|ListMap效果展示|false|-

**Request-example:**
```
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/user/update --data '{"MAX_SPEED":812,"gender":0,"simpleEnum":"RED","username":"leoma.mcglynn","password":"jbgrpn","nickName":"karen.orn","mobile":"424-812-6883","roles":[{"id":"102","createBy":"8p1r41","createTime":"2021-08-07 17:14:31","updateBy":"q50wv2","updateTime":"2021-08-07 17:14:31","delFlag":6,"userId":"102","roleId":"102","roleName":"leoma.mcglynn"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
id|string|自增编号|v1.0
createBy|string|创建人|v1.2
createTime|string|创建时间|v1.0
updateBy|string|修改人|v1.1
updateTime|string|修改时间|v1.1
delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
username|string|用户名|-
password|string|密码|-
nickName|string|昵称|-
mobile|string|电话|-
email|string|邮箱|-
address|string|地址|-
sex|int32|性别(男1 女 2)|-
avatar|string|No comments found.|-
type|int32|类型|-
status|int32|状态|-
description|string|描述|-
roles|array|用户拥有角色|-
└─id|string|自增编号|v1.0
└─createBy|string|创建人|v1.2
└─createTime|string|创建时间|v1.0
└─updateBy|string|修改人|v1.1
└─updateTime|string|修改时间|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
└─name|string|角色名 以ROLE_开头|v1.0
└─defaultRole|boolean|是否为注册默认角色|v1.0
└─permissions|array|拥有权限|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─id|string|自增编号|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createBy|string|创建人|v1.2
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─createTime|string|创建时间|v1.0
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateBy|string|修改人|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─updateTime|string|修改时间|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─name|string|菜单/权限名称|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─level|int32|层级|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─type|int32|类型 0页面 1具体操作|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─title|string|菜单标题|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─path|string|页面路径/资源链接url|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─component|string|前端组件|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─icon|string|图标|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─buttonType|string|按钮权限类型|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─parentId|string|父id|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─description|string|说明备注|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─sortOrder|number|排序值|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─status|int32|是否启用 0启用 -1禁用|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─children|array|子菜单/权限|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─permTypes|array|页面拥有的权限类型|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─expand|boolean|节点展开 前端所需|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─checked|boolean|是否勾选 前端所需|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─selected|boolean|是否选中 前端所需|-
permissions|array|用户拥有的权限|-
└─id|string|自增编号|v1.0
└─createBy|string|创建人|v1.2
└─createTime|string|创建时间|v1.0
└─updateBy|string|修改人|v1.1
└─updateTime|string|修改时间|v1.1
└─delFlag|int32|删除标记[1表示已删除，默认值0]|v1.1
└─name|string|菜单/权限名称|-
└─level|int32|层级|-
└─type|int32|类型 0页面 1具体操作|-
└─title|string|菜单标题|-
└─path|string|页面路径/资源链接url|-
└─component|string|前端组件|-
└─icon|string|图标|-
└─buttonType|string|按钮权限类型|-
└─parentId|string|父id|-
└─description|string|说明备注|-
└─sortOrder|number|排序值|-
└─status|int32|是否启用 0启用 -1禁用|-
└─children|array|子菜单/权限|-
└─permTypes|array|页面拥有的权限类型|-
└─expand|boolean|节点展开 前端所需|-
└─checked|boolean|是否勾选 前端所需|-
└─selected|boolean|是否选中 前端所需|-

**Response-example:**
```
{
  "id": "102",
  "createBy": "6xpa59",
  "createTime": "2021-08-07 17:14:31",
  "updateBy": "oraneg",
  "updateTime": "2021-08-07 17:14:31",
  "delFlag": 6,
  "username": "leoma.mcglynn",
  "password": "wfsx8t",
  "nickName": "karen.orn",
  "mobile": "424-812-6883",
  "email": "darline.dach@gmail.com",
  "address": "Suite 106 773 Wisoky Ports， East Kylee， OR 31948",
  "sex": 1,
  "avatar": "r088ba",
  "type": 751,
  "status": 215,
  "description": "lfgfyt",
  "roles": [
    {
      "id": "102",
      "createBy": "tz3x45",
      "createTime": "2021-08-07 17:14:31",
      "updateBy": "dla5ej",
      "updateTime": "2021-08-07 17:14:31",
      "delFlag": 6,
      "name": "leoma.mcglynn",
      "defaultRole": true,
      "permissions": [
        {
          "id": "102",
          "createBy": "cdbxbe",
          "createTime": "2021-08-07 17:14:31",
          "updateBy": "ja3twf",
          "updateTime": "2021-08-07 17:14:31",
          "delFlag": 6,
          "name": "leoma.mcglynn",
          "level": 399,
          "type": 674,
          "title": "2oho9j",
          "path": "5mm70b",
          "component": "z0o6u1",
          "icon": "qy3rpc",
          "buttonType": "icxbog",
          "parentId": "102",
          "description": "62jxaa",
          "sortOrder": 382,
          "status": 864,
          "children": [
            {
              "$ref": ".."
            }
          ],
          "permTypes": [
            "72mcmt"
          ],
          "expand": true,
          "checked": true,
          "selected": true
        }
      ]
    }
  ],
  "permissions": [
    {
      "id": "102",
      "createBy": "tk88k3",
      "createTime": "2021-08-07 17:14:31",
      "updateBy": "bn9v2u",
      "updateTime": "2021-08-07 17:14:31",
      "delFlag": 6,
      "name": "leoma.mcglynn",
      "level": 593,
      "type": 745,
      "title": "r5mk28",
      "path": "jdfzvt",
      "component": "lmtfxh",
      "icon": "gdu7b5",
      "buttonType": "axq1eh",
      "parentId": "102",
      "description": "qr188b",
      "sortOrder": 937,
      "status": 280,
      "children": [
        {
          "$ref": ".."
        }
      ],
      "permTypes": [
        "m2tius"
      ],
      "expand": true,
      "checked": true,
      "selected": true
    }
  ]
}
```

## JSR303参数验证规范测试
### 验证validate
**URL:** http://localhost:8080/validator/test

**Type:** POST

**Author:** yu 2018/06/28.

**Content-Type:** application/json; charset=utf-8

**Description:** 验证validate

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|true|-
birthday|string|生日|true|-
age|int32|年龄|false|-
subject|object|科目|true|-
└─subjectName|string|科目名称|true|-
└─core|int32|分数|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/validator/test --data '{
  "name": "leoma.mcglynn",
  "birthday": "2021-08-07",
  "age": 21,
  "subject": {
    "subjectName": "leoma.mcglynn",
    "core": 692
  }
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
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### 验证通用参数
**URL:** http://localhost:8080/validator/valid

**Type:** POST

**Author:** yu 2018/06/28.

**Content-Type:** application/json; charset=utf-8

**Description:** 验证通用参数

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
token|string|token|true|-
sequenceNo|string|序列号|true|-
parameter|object|No comments found.|false|-
└─subUserName|string|用户名称|true|-
└─numbers|number|bigInteger|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/validator/valid --data '{
  "token": "8t681l",
  "sequenceNo": "tpy09t",
  "parameter": {
    "subUserName": "张三",
    "numbers": 318
  }
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
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### 分组验证1
**URL:** http://localhost:8080/validator/save

**Type:** POST

**Author:** yu 2018/06/28.

**Content-Type:** application/json; charset=utf-8

**Description:** 分组验证1

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|主键id|false|-
name|string|名称|false|-
mobile|string|电话|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/validator/save --data '{
  "id": 918,
  "name": "leoma.mcglynn",
  "mobile": "424-812-6883"
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
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### 分组验证2
**URL:** http://localhost:8080/validator/update

**Type:** POST

**Author:** yu 2018/06/28.

**Content-Type:** application/json; charset=utf-8

**Description:** 分组验证2

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|主键id|false|-
name|string|名称|false|-
mobile|string|电话|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/validator/update --data '{
  "id": 574,
  "name": "leoma.mcglynn",
  "mobile": "424-812-6883"
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
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### 分组验证3
**URL:** http://localhost:8080/validator/login

**Type:** POST

**Author:** yu 2018/06/28.

**Content-Type:** application/json; charset=utf-8

**Description:** 分组验证3

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|主键id|false|-
name|string|名称|false|-
mobile|string|电话|true|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/validator/login --data '{
  "id": 65,
  "name": "leoma.mcglynn",
  "mobile": "424-812-6883"
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
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### 分页查询
**URL:** http://localhost:8080/validator/list

**Type:** POST

**Author:** yu 2018/06/28.

**Content-Type:** application/json; charset=utf-8

**Description:** 分页查询

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|true|-
birthday|string|生日|true|-
age|int32|年龄|false|-
subject|object|科目|true|-
└─subjectName|string|科目名称|true|-
└─core|int32|分数|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/validator/list --data '{
  "name": "leoma.mcglynn",
  "birthday": "2021-08-07",
  "age": 21,
  "subject": {
    "subjectName": "leoma.mcglynn",
    "core": 145
  }
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|姓名|-
birthday|string|生日|-
age|int32|年龄|-
subject|object|科目|-
└─subjectName|string|科目名称|-
└─core|int32|分数|-

**Response-example:**
```
{
  "name": "leoma.mcglynn",
  "birthday": "2021-08-07",
  "age": 21,
  "subject": {
    "subjectName": "leoma.mcglynn",
    "core": 639
  }
}
```

## xss拦击测试
### xss过滤普通post请求
**URL:** http://localhost:8080/xss/text

**Type:** POST

**Author:** yu 2019/1/20.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** xss过滤普通post请求

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
text|string|请求文本|false|-

**Request-example:**
```
curl -X POST -i http://localhost:8080/xss/text --data 'text=ky99r6'
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
  "data": "htjgnz",
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### xss过滤get请求
**URL:** http://localhost:8080/xss/query

**Type:** GET

**Author:** yu 2019/1/20.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** xss过滤get请求

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
query|string|请求参数|false|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/xss/query?query=r7wvz3
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
  "data": "x51ulw",
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### xss过滤json数据
**URL:** http://localhost:8080/xss/json

**Type:** POST

**Author:** yu 2019/1/20.

**Content-Type:** application/json; charset=utf-8

**Description:** xss过滤json数据

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
age|int32|年龄|false|-
name|string|姓名|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/xss/json --data '{
  "age": 21,
  "name": "leoma.mcglynn"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|处理成功返回的业务数据|-
└─age|int32|年龄|-
└─name|string|姓名|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
  "success": true,
  "message": "success",
  "data": {
    "age": 21,
    "name": "leoma.mcglynn"
  },
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

## 顶顶顶到达
### get请求测试query参数
**URL:** http://localhost:8080/configQueryParamGet

**Type:** GET

**Author:** "cqmike"

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** get请求测试query参数

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
configQueryParam|string|No comments found.|false|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/configQueryParamGet?configQueryParam=s7jnuz
```

**Response-example:**
```
Doesn't return a value.
```

### post请求测试query参数
**URL:** http://localhost:8080/configQueryParamPost

**Type:** POST

**Author:** "cqmike"

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** post请求测试query参数

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
configQueryParam|string|No comments found.|false|-

**Request-example:**
```
curl -X POST -i http://localhost:8080/configQueryParamPost --data 'configQueryParam=mxtnlh'
```

**Response-example:**
```
Doesn't return a value.
```

## 顶顶顶到达1
### get请求测试query参数和path参数
**URL:** http://localhost:8080/configParamGet/{configPathParam}

**Type:** GET

**Author:** "cqmike"

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** get请求测试query参数和path参数

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
configPathParam|string|No comments found.|true|-

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
configQueryParam|string|No comments found.|false|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/configParamGet/iplmz3?configQueryParam=0v3b6g
```

**Response-example:**
```
Doesn't return a value.
```

# 测试分组
## app端接口测试
### 创建人员
**URL:** http://localhost:8080/app/

**Type:** POST

**Author:** yu 2018/9/4.

**Content-Type:** application/json; charset=utf-8

**Description:** 如果创建成功将会发送MQTT消息：person/{id}/create

**Body-parameters:**

Parameter | Type|Description|Required|Since
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
    961
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
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### Test Constants
**URL:** http://localhost:8080/app/admin/testConstants/1.0

**Type:** GET

**Author:** yu 2018/9/4.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Test Constants

**Query-parameters:**

Parameter | Type|Description|Required|Since
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

### 分页查询订单信息
**URL:** http://localhost:8080/app/page/{pageIndex}/{pageSize}

**Type:** GET

**Author:** yu 2018/9/4.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 分页查询订单信息

**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
pageIndex|int32|当前页码|true|-
pageSize|int32|页面大小|true|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/app/page/103/10
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
      "orderId": 307,
      "orderType": "WAIT_PAY"
    }
  ],
  "total": 510,
  "size": 29,
  "count": 1,
  "page": 133
}
```

### app测试
**URL:** http://localhost:8080/app/test

**Type:** POST

**Author:** yu 2018/9/4.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** app测试

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|false|-
beginTime|string|开始时间|false|-
endTime|string|结束时间|false|-

**Request-example:**
```
curl -X POST -i http://localhost:8080/app/test --data 'name=zhangsan&endTime=2021-08-07 17:14:29&beginTime=2021-08-07 17:14:29'
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
  "code": "35031",
  "timestamp": "2021-08-07 17:14:29"
}
```

### app测试2
**URL:** http://localhost:8080/app/test2

**Type:** GET

**Author:** yu 2018/9/4.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** app测试2

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|false|-
beginTime|string|开始时间|false|-
endTime|string|结束时间|false|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/app/test2?beginTime=2021-08-07 17:14:29&name=leoma.mcglynn&endTime=2021-08-07 17:14:29
```

**Response-example:**
```
string
```

### app测试3
**URL:** http://localhost:8080/app/test3

**Type:** GET

**Author:** yu 2018/9/4.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** app测试3

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|false|-
beginTime|string|开始时间|false|-
endTime|string|结束时间|false|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/app/test3?name=leoma.mcglynn&beginTime=2021-08-07 17:14:29&endTime=2021-08-07 17:14:29
```

**Response-example:**
```
string
```

## * 部门操作 * * @author jdkleo * @since 1.0
### * 获得部门     * @param deptId 部门ID     * @return
**URL:** http://localhost:8080/sail/dept/get/{deptId}

**Type:** GET


**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** * 获得部门     * @param deptId 部门ID     * @return

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
deptId|int64|No comments found.|false|-

**Request-example:**
```
curl -X GET -i http://localhost:8080/sail/dept/get/{deptId}?deptId=926
```

**Response-example:**
```
Doesn't return a value.
```

## 错误码列表
Error code |Description
---|---
200|ok
400|Bad Request
401|Unauthorized
403|Forbidden
404|Not Found
415|Unsupported Media Type
500|Internal Server Error
502|Bad Gateway
503|Service Unavailable

