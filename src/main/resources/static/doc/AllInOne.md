# smartdoc
Version |  Update Time  | Status | Author |  Description
---|---|---|---|---
v2021-08-23 23:02:52|2021-08-23 23:02:52|auto|@chenqi|Created by smart-doc



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
curl -X GET -i http://localhost:8080/APP/www.baidu.com/163/ricky.nitzsche
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
    298
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
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
curl -X GET -i http://localhost:8080/app/page/346/10
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
      "orderId": 404,
      "orderType": "WAIT_PAY"
    }
  ],
  "total": 980,
  "size": 465,
  "count": 905,
  "page": 881
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
curl -X POST -i http://localhost:8080/app/test --data 'name=zhangsan&endTime=2021-08-23 23:02:54&beginTime=2021-08-23 23:02:54'
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
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
curl -X GET -i http://localhost:8080/app/test2?beginTime=2021-08-23 23:02:54&endTime=2021-08-23 23:02:54&name=ricky.nitzsche
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
curl -X GET -i http://localhost:8080/app/test3?beginTime=2021-08-23 23:02:54&name=ricky.nitzsche&endTime=2021-08-23 23:02:54
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
curl -X GET -i http://localhost:8080/sail/dept/get/{deptId}?deptId=915
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
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
  "data": "iaw6ik",
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
  "data": "5hse9e",
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
  "data": "r5602z",
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
  "a": "ix9rww",
  "b": {
    "b": "tfrfpk",
    "c": {
      "c": "dw8jwa",
      "a": {
        "a": "ytvw77",
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
  "a": "of0azr",
  "b": {
    "b": "zu9cgf",
    "c": {
      "c": "4y0syi",
      "a": {
        "a": "1oaskq",
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
curl -X GET -i http://localhost:8080/configQueryParamGet?configQueryParam=v0ba1d
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
curl -X POST -i http://localhost:8080/configQueryParamPost --data 'configQueryParam=y0vkxr'
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
curl -X GET -i http://localhost:8080/configParamGet/zscc7o?configQueryParam=252xh4
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
curl -X POST -i http://localhost:8080/configParamPost/pmyvkt --data 'configQueryParam=r43cii'
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
  "orderId": 898,
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
curl -X POST -H 'Content-Type: multipart/form-data' -i http://localhost:8080/upload --data 'userId=163'
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
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
curl -X POST -H 'Content-Type: multipart/form-data' -i http://localhost:8080/formData2 --data 'userData=ye6818&userId=163'
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
curl -X GET -H 'Content-Type: multipart/form-data' -i http://localhost:8080/formData2?userData=ukgsvm&userId=163
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
curl -X GET -i http://localhost:8080/formData4?password=qy4n4h&roles[0].updateTime=2021-08-23 23:02:54&userId=163&username=ricky.nitzsche&userData=ruxvbo&MAX_SPEED=255&roles[0].createTime=2021-08-23 23:02:54&gender=WOMAN&roles[0].roleName=ricky.nitzsche&roles[0].userId=163&simpleEnum=RED&roles[0].delFlag=1&mobile=(806) 262-2209&roles[0].updateBy=jqm9nu&nickName=morgan.wolff&roles[0].createBy=24mkd1&roles[0].roleId=163&roles[0].id=163
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
curl -X POST -i http://localhost:8080/formData7/163 --data 'roles[0].userId=163&password=bwgbei&roles[0].createTime=2021-08-23 23:02:54&mobile=(806) 262-2209&roles[0].id=163&simpleEnum=RED&gender=WOMAN&nickName=morgan.wolff&roles[0].createBy=bah9ke&roles[0].updateBy=ikgdl3&username=ricky.nitzsche&roles[0].updateTime=2021-08-23 23:02:54&roles[0].delFlag=1&roles[0].roleName=ricky.nitzsche&roles[0].roleId=163&MAX_SPEED=443'
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
curl -X POST -i http://localhost:8080/formData8/163/32 --data 'simpleEnum=RED&nickName=morgan.wolff&roles[0].updateTime=2021-08-23 23:02:54&roles[0].delFlag=1&roles[0].userId=163&roles[0].id=163&roles[0].updateBy=tpmh9v&roles[0].createTime=2021-08-23 23:02:54&mobile=(806) 262-2209&MAX_SPEED=114&roles[0].roleId=163&roles[0].roleName=ricky.nitzsche&gender=WOMAN&username=ricky.nitzsche&password=92x4p3&roles[0].createBy=jpnkvm'
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
{"test":"c5v0wu","value":{"MAX_SPEED":434,"gender":0,"simpleEnum":"RED","username":"ricky.nitzsche","password":"5xurwv","nickName":"morgan.wolff","mobile":"(806) 262-2209","roles":[{"id":"163","createBy":"26sxv8","createTime":"2021-08-23 23:02:54","updateBy":"290b4n","updateTime":"2021-08-23 23:02:54","delFlag":1,"userId":"163","roleId":"163","roleName":"ricky.nitzsche"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}},"key":{"roleId":127,"roleName":"ricky.nitzsche","age":32}}
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
{"total":33,"other":{"MAX_SPEED":762,"gender":0,"simpleEnum":"RED","username":"ricky.nitzsche","password":"ujrgb4","nickName":"morgan.wolff","mobile":"(806) 262-2209","roles":[{"id":"163","createBy":"bpe81n","createTime":"2021-08-23 23:02:54","updateBy":"iip44t","updateTime":"2021-08-23 23:02:54","delFlag":1,"userId":"163","roleId":"163","roleName":"ricky.nitzsche"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}},"rows":[{"roleId":461,"roleName":"ricky.nitzsche","age":32}]}
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
    "roleId": 547,
    "roleName": "ricky.nitzsche",
    "age": 32
  },
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
  "data": "2q8ze7",
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
  "data": "8sidpz",
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
  "name": "ricky.nitzsche",
  "innerClass": {
    "phone": "260-954-1407"
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
  "createDate": "2021-08-23 23:02:54",
  "localDate": "2021-08-23",
  "localDateTime": "2021-08-23 23:02:54",
  "localTime": "2021-08-23 23:02:54"
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
  "createDate": "2021-08-23 23:02:54",
  "localDate": "2021-08-23",
  "localDateTime": "2021-08-23 23:02:54",
  "localTime": "2021-08-23 23:02:54"
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
  "totalPages": 727,
  "totalElements": 305,
  "number": 309,
  "size": 10,
  "numberOfElements": 597,
  "content": [
    {
      "roleId": 859,
      "roleName": "ricky.nitzsche",
      "age": 32
    }
  ],
  "sort": {
    "empty": true,
    "orders": [
      {
        "direction": "ASC",
        "property": "1wiqck",
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
    "pageNumber": 137,
    "pageSize": 10,
    "offset": 1,
    "sort": {
      "empty": true,
      "orders": [
        {
          "direction": "ASC",
          "property": "7ovbqk",
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
    "encrypt": "rzz5ma"
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
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/getUserJson?name=ricky.nitzsche --data '{
  "dataExpressionEnum": "SENSIRION",
  "menuPermissionCodes": [
    "WAIT_PAY"
  ],
  "date": "2019-01-01",
  "username": "ricky.nitzsche",
  "idCard": "141227199611258483",
  "age": 32,
  "age2": 558
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
  "name": "ricky.nitzsche"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|用户名|-

**Response-example:**
```
{
  "name": "ricky.nitzsche"
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
  "username": "ricky.nitzsche",
  "idCard": "141227199611258483",
  "age": 32,
  "age2": 443
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
  "username": "ricky.nitzsche",
  "idCard": "141227199611258483",
  "age": 32,
  "age2": 65
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
  "vkvda1",
  "e7ray4"
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
    "mapKey1": "m89mxz",
    "mapKey2": "ie9v8a"
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
        "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
      }
    ],
    "userList": [
      {
        "$ref": ".."
      }
    ],
    "userName": "ricky.nitzsche",
    "nickName": "morgan.wolff",
    "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
    "userAge": 32,
    "phone": "260-954-1407",
    "createTime": 1629730974133,
    "small": 95.24,
    "money": 28.39,
    "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
    "telephone": "260-954-1407"
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
      "stuName": "ricky.nitzsche",
      "stuAge": true,
      "stuAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
      "user": {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 19.84,
        "money": 71.37,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      },
      "userMap": {
        "mapKey": {
          "userDetails": [
            {
              "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
            }
          ],
          "userList": [
            {
              "$ref": ".."
            }
          ],
          "userName": "ricky.nitzsche",
          "nickName": "morgan.wolff",
          "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
          "userAge": 32,
          "phone": "260-954-1407",
          "createTime": 1629730974133,
          "small": 77.15,
          "money": 36.94,
          "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
          "telephone": "260-954-1407"
        }
      },
      "userTreeSet": [
        {
          "userDetails": [
            {
              "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
            }
          ],
          "userList": [
            {
              "$ref": ".."
            }
          ],
          "userName": "ricky.nitzsche",
          "nickName": "morgan.wolff",
          "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
          "userAge": 32,
          "phone": "260-954-1407",
          "createTime": 1629730974133,
          "small": 32.58,
          "money": 78.76,
          "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
          "telephone": "260-954-1407"
        }
      ],
      "user1": {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 14.76,
        "money": 0.19,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
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
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 79.61,
        "money": 55.25,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      },
      "data1": {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 49.64,
        "money": 9.01,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      },
      "data2": {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 57.41,
        "money": 55.21,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      },
      "age": 32
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
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 95.64,
        "money": 66.83,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      }
    ],
    "data1": [
      {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 89.79,
        "money": 32.58,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      }
    ],
    "data2": [
      {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 76.74,
        "money": 47.55,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      }
    ],
    "age": 32
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
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 12.22,
        "money": 25.81,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      },
      "data1": {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 46.24,
        "money": 6.42,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      },
      "data2": {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 74.54,
        "money": 36.32,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      },
      "age": 32
    },
    "data1": {
      "userDetails": [
        {
          "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "ricky.nitzsche",
      "nickName": "morgan.wolff",
      "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
      "userAge": 32,
      "phone": "260-954-1407",
      "createTime": 1629730974133,
      "small": 70.10,
      "money": 89.62,
      "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
      "telephone": "260-954-1407"
    },
    "data2": {
      "userDetails": [
        {
          "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "ricky.nitzsche",
      "nickName": "morgan.wolff",
      "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
      "userAge": 32,
      "phone": "260-954-1407",
      "createTime": 1629730974133,
      "small": 36.20,
      "money": 31.15,
      "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
      "telephone": "260-954-1407"
    },
    "age": 32
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
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 38.15,
        "money": 76.69,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      },
      "data1": {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 13.80,
        "money": 7.56,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      },
      "data2": {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 40.08,
        "money": 58.59,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      },
      "age": 32
    },
    "data1": {
      "data": {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 63.46,
        "money": 19.07,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      },
      "data1": {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 16.91,
        "money": 17.93,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      },
      "data2": {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 45.21,
        "money": 86.65,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      },
      "age": 32
    },
    "data2": {
      "data": {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 11.47,
        "money": 2.71,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      },
      "data1": {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 52.85,
        "money": 19.42,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      },
      "data2": {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 22.21,
        "money": 29.88,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      },
      "age": 32
    },
    "age": 32
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
      "token": "3qyz1j",
      "LoginList": [
        {
          "userName": "ricky.nitzsche",
          "password": "jp9pjr"
        }
      ]
    }
  ],
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
  "mapKey1": 921,
  "mapKey2": 938
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
        "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
      }
    ],
    "userList": [
      {
        "$ref": ".."
      }
    ],
    "userName": "ricky.nitzsche",
    "nickName": "morgan.wolff",
    "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
    "userAge": 32,
    "phone": "260-954-1407",
    "createTime": 1629730974133,
    "small": 37.44,
    "money": 53.69,
    "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
    "telephone": "260-954-1407"
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
    "stuName": "ricky.nitzsche",
    "stuAge": true,
    "stuAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
    "user": {
      "userDetails": [
        {
          "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "ricky.nitzsche",
      "nickName": "morgan.wolff",
      "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
      "userAge": 32,
      "phone": "260-954-1407",
      "createTime": 1629730974133,
      "small": 53.77,
      "money": 71.44,
      "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
      "telephone": "260-954-1407"
    },
    "userMap": {
      "mapKey": {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 69.49,
        "money": 81.61,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      }
    },
    "userTreeSet": [
      {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 88.56,
        "money": 17.91,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      }
    ],
    "user1": {
      "userDetails": [
        {
          "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "ricky.nitzsche",
      "nickName": "morgan.wolff",
      "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
      "userAge": 32,
      "phone": "260-954-1407",
      "createTime": 1629730974133,
      "small": 47.48,
      "money": 79.93,
      "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
      "telephone": "260-954-1407"
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
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 53.37,
        "money": 87.52,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      }
    ],
    "data1": {
      "stuName": "ricky.nitzsche",
      "stuAge": true,
      "stuAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
      "user": {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 31.05,
        "money": 4.60,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      },
      "userMap": {
        "mapKey": {
          "userDetails": [
            {
              "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
            }
          ],
          "userList": [
            {
              "$ref": ".."
            }
          ],
          "userName": "ricky.nitzsche",
          "nickName": "morgan.wolff",
          "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
          "userAge": 32,
          "phone": "260-954-1407",
          "createTime": 1629730974133,
          "small": 89.16,
          "money": 33.29,
          "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
          "telephone": "260-954-1407"
        }
      },
      "userTreeSet": [
        {
          "userDetails": [
            {
              "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
            }
          ],
          "userList": [
            {
              "$ref": ".."
            }
          ],
          "userName": "ricky.nitzsche",
          "nickName": "morgan.wolff",
          "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
          "userAge": 32,
          "phone": "260-954-1407",
          "createTime": 1629730974133,
          "small": 50.13,
          "money": 51.79,
          "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
          "telephone": "260-954-1407"
        }
      ],
      "user1": {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 93.07,
        "money": 76.32,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      }
    },
    "data2": {
      "userDetails": [
        {
          "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "ricky.nitzsche",
      "nickName": "morgan.wolff",
      "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
      "userAge": 32,
      "phone": "260-954-1407",
      "createTime": 1629730974133,
      "small": 59.17,
      "money": 57.83,
      "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
      "telephone": "260-954-1407"
    },
    "age": 32
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
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 86.36,
        "money": 93.02,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      }
    ],
    "data1": {
      "stuName": "ricky.nitzsche",
      "stuAge": true,
      "stuAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
      "user": {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 56.60,
        "money": 79.88,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      },
      "userMap": {
        "mapKey": {
          "userDetails": [
            {
              "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
            }
          ],
          "userList": [
            {
              "$ref": ".."
            }
          ],
          "userName": "ricky.nitzsche",
          "nickName": "morgan.wolff",
          "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
          "userAge": 32,
          "phone": "260-954-1407",
          "createTime": 1629730974133,
          "small": 36.60,
          "money": 22.99,
          "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
          "telephone": "260-954-1407"
        }
      },
      "userTreeSet": [
        {
          "userDetails": [
            {
              "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
            }
          ],
          "userList": [
            {
              "$ref": ".."
            }
          ],
          "userName": "ricky.nitzsche",
          "nickName": "morgan.wolff",
          "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
          "userAge": 32,
          "phone": "260-954-1407",
          "createTime": 1629730974133,
          "small": 47.14,
          "money": 50.64,
          "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
          "telephone": "260-954-1407"
        }
      ],
      "user1": {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 82.70,
        "money": 49.81,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      }
    },
    "data2": {
      "userDetails": [
        {
          "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "ricky.nitzsche",
      "nickName": "morgan.wolff",
      "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
      "userAge": 32,
      "phone": "260-954-1407",
      "createTime": 1629730974133,
      "small": 70.84,
      "money": 4.65,
      "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
      "telephone": "260-954-1407"
    },
    "age": 32
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
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 72.40,
        "money": 45.99,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      }
    },
    "data1": {
      "mapKey": {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 82.13,
        "money": 71.91,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      }
    },
    "data2": {
      "mapKey": {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 4.14,
        "money": 43.45,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      }
    },
    "age": 32
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
    "roleId": 312,
    "roleName": "ricky.nitzsche",
    "age": 32
  },
  "data1": [
    {
      "total": 159
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
    "roleId": 721,
    "roleName": "ricky.nitzsche",
    "age": 32
  },
  "data1": [
    {
      "concurrentPage": 1,
      "pageSize": 10,
      "total": 974
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
      "pages": 71,
      "hitCount": true,
      "records": [
        {
          "id": "163",
          "createBy": "3xlzip",
          "createTime": "2021-08-23 23:02:55",
          "updateBy": "76m0lg",
          "updateTime": "2021-08-23 23:02:55",
          "delFlag": 1,
          "username": "ricky.nitzsche",
          "password": "w79u9d",
          "nickName": "morgan.wolff",
          "mobile": "(806) 262-2209",
          "email": "jamal.greenholt@gmail.com",
          "address": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
          "sex": 1,
          "avatar": "sek5uz",
          "type": 540,
          "status": 936,
          "description": "h1mzce",
          "roles": [
            {
              "id": "163",
              "createBy": "06vb0r",
              "createTime": "2021-08-23 23:02:55",
              "updateBy": "8xae8w",
              "updateTime": "2021-08-23 23:02:55",
              "delFlag": 1,
              "name": "ricky.nitzsche",
              "defaultRole": true,
              "permissions": [
                {
                  "id": "163",
                  "createBy": "kxkqg9",
                  "createTime": "2021-08-23 23:02:55",
                  "updateBy": "3likiq",
                  "updateTime": "2021-08-23 23:02:55",
                  "delFlag": 1,
                  "name": "ricky.nitzsche",
                  "level": 608,
                  "type": 613,
                  "title": "jppq3a",
                  "path": "a977po",
                  "component": "282v1x",
                  "icon": "vz4yl4",
                  "buttonType": "xl6fbq",
                  "parentId": "163",
                  "description": "ttuz1r",
                  "sortOrder": 791,
                  "status": 690,
                  "children": [
                    {
                      "$ref": ".."
                    }
                  ],
                  "permTypes": [
                    "7qxxvi"
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
              "id": "163",
              "createBy": "8fw32t",
              "createTime": "2021-08-23 23:02:55",
              "updateBy": "lvazgr",
              "updateTime": "2021-08-23 23:02:55",
              "delFlag": 1,
              "name": "ricky.nitzsche",
              "level": 166,
              "type": 328,
              "title": "5mk8eo",
              "path": "63vdnh",
              "component": "185ulb",
              "icon": "ghep2e",
              "buttonType": "fzhdsu",
              "parentId": "163",
              "description": "zk1evz",
              "sortOrder": 612,
              "status": 305,
              "children": [
                {
                  "$ref": ".."
                }
              ],
              "permTypes": [
                "nx6sxk"
              ],
              "expand": true,
              "checked": true,
              "selected": true
            }
          ]
        }
      ],
      "total": 588,
      "size": 94,
      "current": 826,
      "orders": [
        {
          "column": "242rmx",
          "asc": true
        }
      ],
      "optimizeCountSql": true,
      "countId": "163",
      "maxLimit": 388
    },
    "data1": [
      {
        "id": "163",
        "createBy": "pilr6j",
        "createTime": "2021-08-23 23:02:55",
        "updateBy": "jca41e",
        "updateTime": "2021-08-23 23:02:55",
        "delFlag": 1,
        "username": "ricky.nitzsche",
        "password": "ocijt9",
        "nickName": "morgan.wolff",
        "mobile": "(806) 262-2209",
        "email": "jamal.greenholt@gmail.com",
        "address": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "sex": 1,
        "avatar": "6oze7y",
        "type": 554,
        "status": 107,
        "description": "i00k2y",
        "roles": [
          {
            "id": "163",
            "createBy": "gf15h1",
            "createTime": "2021-08-23 23:02:55",
            "updateBy": "kyts66",
            "updateTime": "2021-08-23 23:02:55",
            "delFlag": 1,
            "name": "ricky.nitzsche",
            "defaultRole": true,
            "permissions": [
              {
                "id": "163",
                "createBy": "560kor",
                "createTime": "2021-08-23 23:02:55",
                "updateBy": "kisqs2",
                "updateTime": "2021-08-23 23:02:55",
                "delFlag": 1,
                "name": "ricky.nitzsche",
                "level": 269,
                "type": 326,
                "title": "bnpo3d",
                "path": "xcuf29",
                "component": "ixw1fm",
                "icon": "cqpq1w",
                "buttonType": "ol5plv",
                "parentId": "163",
                "description": "w1ah78",
                "sortOrder": 123,
                "status": 853,
                "children": [
                  {
                    "$ref": ".."
                  }
                ],
                "permTypes": [
                  "mo9c0s"
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
            "id": "163",
            "createBy": "nuoz9r",
            "createTime": "2021-08-23 23:02:55",
            "updateBy": "lktcqi",
            "updateTime": "2021-08-23 23:02:55",
            "delFlag": 1,
            "name": "ricky.nitzsche",
            "level": 47,
            "type": 952,
            "title": "5jajf9",
            "path": "j2i4gj",
            "component": "51w1g9",
            "icon": "5gsbjz",
            "buttonType": "ufo3pi",
            "parentId": "163",
            "description": "7bdvuw",
            "sortOrder": 794,
            "status": 406,
            "children": [
              {
                "$ref": ".."
              }
            ],
            "permTypes": [
              "bg1r4a"
            ],
            "expand": true,
            "checked": true,
            "selected": true
          }
        ]
      }
    ]
  },
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
    "pages": 232,
    "hitCount": true,
    "records": [
      {
        "roleId": 512,
        "roleName": "ricky.nitzsche",
        "age": 32
      }
    ],
    "total": 755,
    "size": 223,
    "current": 117,
    "orders": [
      {
        "column": "cnmwda",
        "asc": true
      }
    ],
    "optimizeCountSql": true,
    "countId": "163",
    "maxLimit": 764
  },
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
        "roleId": 91,
        "roleName": "ricky.nitzsche",
        "age": 32
      }
    ],
    "total": 788,
    "size": 116,
    "count": 235,
    "page": 650
  },
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
        "roleId": 514,
        "roleName": "ricky.nitzsche",
        "age": 32
      }
    ],
    "total": 974,
    "countId": "163",
    "maxLimit": 356
  },
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
curl -X GET -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/parentExtends/update --data '{"MAX_SPEED":742,"gender":0,"simpleEnum":"RED","username":"ricky.nitzsche","password":"ntyss7","nickName":"morgan.wolff","mobile":"(806) 262-2209","roles":[{"id":"163","createBy":"09g7xh","createTime":"2021-08-23 23:02:55","updateBy":"i99iuy","updateTime":"2021-08-23 23:02:55","delFlag":1,"userId":"163","roleId":"163","roleName":"ricky.nitzsche"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}}'
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
{"success":true,"message":"success","data":{"MAX_SPEED":48,"gender":0,"simpleEnum":"RED","username":"ricky.nitzsche","password":"hsf07h","nickName":"morgan.wolff","mobile":"(806) 262-2209","roles":[{"id":"163","createBy":"4ea76o","createTime":"2021-08-23 23:02:55","updateBy":"llk3eh","updateTime":"2021-08-23 23:02:55","delFlag":1,"userId":"163","roleId":"163","roleName":"ricky.nitzsche"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}},"code":"39323","timestamp":"2021-08-23 23:02:54"}
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
curl -X DELETE -i http://localhost:8080/parentExtends/deleteById/{id}?id=geankf
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
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/parentExtends/updateById --data '{"MAX_SPEED":256,"gender":0,"simpleEnum":"RED","username":"ricky.nitzsche","password":"upi4rp","nickName":"morgan.wolff","mobile":"(806) 262-2209","roles":[{"id":"163","createBy":"clu85c","createTime":"2021-08-23 23:02:55","updateBy":"zhykbm","updateTime":"2021-08-23 23:02:55","delFlag":1,"userId":"163","roleId":"163","roleName":"ricky.nitzsche"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}}'
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
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
curl -X GET -i http://localhost:8080/pathVariable/download/^--Z--1z2H_YO-S_l4_-_ln__j-Y8$
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
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
curl -X GET -i http://localhost:8080/pathVariable/download/^__q-6Nv-Z8_3$/file
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
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
curl -X GET -H 'name' -i http://localhost:8080/testRequestHeader?age=32
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
curl -X GET -H 'token:da' -i http://localhost:8080/testRequestHeader/DefaultVal?age=32
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
curl -X GET -i http://localhost:8080/testNormalParams/binding?name=ricky.nitzsche&age=32
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
      "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
    }
  ],
  "userList": [
    {
      "$ref": ".."
    }
  ],
  "userName": "ricky.nitzsche",
  "nickName": "morgan.wolff",
  "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
  "userAge": 32,
  "phone": "260-954-1407",
  "createTime": 1629730974133,
  "small": 10.60,
  "money": 33.30,
  "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
  "telephone": "260-954-1407"
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
        "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
      }
    ],
    "userList": [
      {
        "$ref": ".."
      }
    ],
    "userName": "ricky.nitzsche",
    "nickName": "morgan.wolff",
    "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
    "userAge": 32,
    "phone": "260-954-1407",
    "createTime": 1629730974133,
    "small": 98.13,
    "money": 15.22,
    "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
    "telephone": "260-954-1407"
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
  "du2zmj",
  "2tilev"
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
      "username": "ricky.nitzsche",
      "idCard": "141227199611258483",
      "age": 32,
      "age2": 540
    },
    "code": "39323",
    "timestamp": "2021-08-23 23:02:54"
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
curl -X GET -i http://localhost:8080/test/ricky.nitzsche/mhwpy5/info
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
curl -X GET -i http://localhost:8080/testRequestParam?author=詹姆斯&type=f3x3rx
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
curl -X GET -i http://localhost:8080/testRequestParamWithValue?name=ricky.nitzsche
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
curl -X GET -i http://localhost:8080/testMuchPath/get/145
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
curl -X POST -i http://localhost:8080/get/683/230
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
curl -X GET -i http://localhost:8080/ex/bars?id=163
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
curl -X GET -i http://localhost:8080/ex/bars?id=163&second=ee6g5i
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
curl -X GET -i http://localhost:8080/getMapping?userId=409
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
  "id": "163",
  "createBy": "lzisps",
  "createTime": "2021-08-23 23:02:55",
  "updateBy": "8tu0vt",
  "updateTime": "2021-08-23 23:02:55",
  "delFlag": 1,
  "username": "ricky.nitzsche",
  "password": "s5fivd",
  "nickName": "morgan.wolff",
  "mobile": "(806) 262-2209",
  "email": "jamal.greenholt@gmail.com",
  "address": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
  "sex": 1,
  "avatar": "nyvv7c",
  "type": 479,
  "status": 230,
  "description": "846xip",
  "roles": [
    {
      "id": "163",
      "createBy": "67m9hy",
      "createTime": "2021-08-23 23:02:55",
      "updateBy": "3levbc",
      "updateTime": "2021-08-23 23:02:55",
      "delFlag": 1,
      "name": "ricky.nitzsche",
      "defaultRole": true,
      "permissions": [
        {
          "id": "163",
          "createBy": "ldo33m",
          "createTime": "2021-08-23 23:02:55",
          "updateBy": "6rx4tm",
          "updateTime": "2021-08-23 23:02:55",
          "delFlag": 1,
          "name": "ricky.nitzsche",
          "level": 156,
          "type": 676,
          "title": "zz1lie",
          "path": "vqot6a",
          "component": "pro1eq",
          "icon": "gq1ie0",
          "buttonType": "k4izrc",
          "parentId": "163",
          "description": "9269xu",
          "sortOrder": 422,
          "status": 678,
          "children": [
            {
              "$ref": ".."
            }
          ],
          "permTypes": [
            "w7vh4a"
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
      "id": "163",
      "createBy": "wmvngg",
      "createTime": "2021-08-23 23:02:55",
      "updateBy": "w6cjyy",
      "updateTime": "2021-08-23 23:02:55",
      "delFlag": 1,
      "name": "ricky.nitzsche",
      "level": 844,
      "type": 708,
      "title": "e1498r",
      "path": "qhwai2",
      "component": "pr0nv7",
      "icon": "9u390i",
      "buttonType": "3cqfpd",
      "parentId": "163",
      "description": "zl03ei",
      "sortOrder": 212,
      "status": 353,
      "children": [
        {
          "$ref": ".."
        }
      ],
      "permTypes": [
        "bibi5l"
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
curl -X POST -i http://localhost:8080/postMapping2 --data 'permissions[0].createTime=2021-08-23 23:02:55&permissions[0].delFlag=1&permissions[0].id=163&roles[0].permissions[0].updateBy=liezn0&permissions[0].description=x979rw&roles[0].permissions[0].status=181&roles[0].defaultRole=true&id=163&roles[0].permissions[0].createTime=2021-08-23 23:02:55&nickName=morgan.wolff&roles[0].permissions[0].checked=true&description=movcet&roles[0].permissions[0].title=v05rya&roles[0].permissions[0].selected=true&updateBy=kmuzh5&permissions[0].title=98qu9y&permissions[0].buttonType=dlr80j&roles[0].permissions[0].level=714&roles[0].createBy=66vhqj&permissions[0].expand=true&mobile=(806) 262-2209&roles[0].permissions[0].createBy=y3rt8u&username=ricky.nitzsche&createTime=2021-08-23 23:02:55&permissions[0].type=143&permissions[0].sortOrder=501&roles[0].permissions[0].icon=6zcmq4&avatar=3puxe7&roles[0].updateBy=y8g6a1&roles[0].id=163&type=701&email=jamal.greenholt@gmail.com&roles[0].permissions[0].buttonType=p8mj58&sex=1&roles[0].updateTime=2021-08-23 23:02:55&permissions[0].createBy=5mr2bg&permissions[0].component=gr6cy8&delFlag=1&roles[0].permissions[0].type=531&permissions[0].updateBy=hlkvqw&permissions[0].level=456&permissions[0].name=ricky.nitzsche&status=124&roles[0].permissions[0].id=163&roles[0].permissions[0].name=ricky.nitzsche&roles[0].createTime=2021-08-23 23:02:55&permissions[0].checked=true&roles[0].permissions[0].sortOrder=899&permissions[0].parentId=163&updateTime=2021-08-23 23:02:55&roles[0].permissions[0].updateTime=2021-08-23 23:02:55&permissions[0].path=21uc9y&permissions[0].selected=true&permissions[0].status=371&permissions[0].updateTime=2021-08-23 23:02:55&roles[0].permissions[0].path=jdmd3r&roles[0].permissions[0].description=2tfd5i&roles[0].permissions[0].parentId=163&createBy=rtcpb8&roles[0].permissions[0].component=4e1dc1&roles[0].name=ricky.nitzsche&permissions[0].icon=6icugt&address=Suite 447 600 Kennith Corner， South Gail， OR 13527&roles[0].permissions[0].expand=true&roles[0].permissions[0].delFlag=1&password=sw36zd&roles[0].delFlag=1'
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
  "id": "163",
  "createBy": "xc7s3f",
  "createTime": "2021-08-23 23:02:55",
  "updateBy": "qtn5xm",
  "updateTime": "2021-08-23 23:02:55",
  "delFlag": 1,
  "username": "ricky.nitzsche",
  "password": "vq74zs",
  "nickName": "morgan.wolff",
  "mobile": "(806) 262-2209",
  "email": "jamal.greenholt@gmail.com",
  "address": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
  "sex": 1,
  "avatar": "6pveyb",
  "type": 818,
  "status": 552,
  "description": "nnvnyh",
  "roles": [
    {
      "id": "163",
      "createBy": "l6h5dx",
      "createTime": "2021-08-23 23:02:55",
      "updateBy": "74t17l",
      "updateTime": "2021-08-23 23:02:55",
      "delFlag": 1,
      "name": "ricky.nitzsche",
      "defaultRole": true,
      "permissions": [
        {
          "id": "163",
          "createBy": "114pqb",
          "createTime": "2021-08-23 23:02:55",
          "updateBy": "3qx9fx",
          "updateTime": "2021-08-23 23:02:55",
          "delFlag": 1,
          "name": "ricky.nitzsche",
          "level": 418,
          "type": 742,
          "title": "1lan35",
          "path": "kzm4t0",
          "component": "wryfhj",
          "icon": "fq3h1u",
          "buttonType": "1k0st7",
          "parentId": "163",
          "description": "6k5ofy",
          "sortOrder": 913,
          "status": 895,
          "children": [
            {
              "$ref": ".."
            }
          ],
          "permTypes": [
            "sqhxr3"
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
      "id": "163",
      "createBy": "dbllvo",
      "createTime": "2021-08-23 23:02:55",
      "updateBy": "bdljf2",
      "updateTime": "2021-08-23 23:02:55",
      "delFlag": 1,
      "name": "ricky.nitzsche",
      "level": 366,
      "type": 512,
      "title": "r9wv0w",
      "path": "elktq5",
      "component": "uz8p87",
      "icon": "c8jteh",
      "buttonType": "j1xqqh",
      "parentId": "163",
      "description": "wdat5e",
      "sortOrder": 313,
      "status": 16,
      "children": [
        {
          "$ref": ".."
        }
      ],
      "permTypes": [
        "a7jkr1"
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
curl -X PUT -i http://localhost:8080/putMapping2 --data 'roles[0].permissions[0].createBy=q3eb8w&nickName=morgan.wolff&roles[0].permissions[0].sortOrder=286&roles[0].permissions[0].component=8xibt0&permissions[0].icon=tz72ve&roles[0].permissions[0].type=493&roles[0].permissions[0].id=163&roles[0].updateBy=o3hy8p&permissions[0].delFlag=1&createBy=7hkkgm&permissions[0].level=968&type=402&delFlag=1&roles[0].permissions[0].name=ricky.nitzsche&permissions[0].type=428&status=20&roles[0].permissions[0].level=613&username=ricky.nitzsche&roles[0].permissions[0].updateBy=1ufd58&roles[0].permissions[0].description=k5igoy&roles[0].createTime=2021-08-23 23:02:55&roles[0].permissions[0].buttonType=jahqnx&roles[0].permissions[0].parentId=163&roles[0].permissions[0].checked=true&permissions[0].title=sfjbix&sex=1&permissions[0].id=163&avatar=mr7ni5&address=Suite 447 600 Kennith Corner， South Gail， OR 13527&permissions[0].buttonType=cmi5c1&password=u508cc&mobile=(806) 262-2209&roles[0].name=ricky.nitzsche&description=mmgb3t&roles[0].permissions[0].updateTime=2021-08-23 23:02:55&permissions[0].updateTime=2021-08-23 23:02:55&permissions[0].parentId=163&permissions[0].name=ricky.nitzsche&roles[0].defaultRole=true&permissions[0].selected=true&roles[0].permissions[0].createTime=2021-08-23 23:02:55&createTime=2021-08-23 23:02:55&updateBy=l6groy&email=jamal.greenholt@gmail.com&permissions[0].createTime=2021-08-23 23:02:55&permissions[0].description=xso3bb&roles[0].permissions[0].delFlag=1&roles[0].delFlag=1&roles[0].permissions[0].selected=true&roles[0].permissions[0].expand=true&permissions[0].updateBy=9rkrch&roles[0].permissions[0].status=730&updateTime=2021-08-23 23:02:55&permissions[0].component=xe2a2j&permissions[0].path=d8cdzn&roles[0].updateTime=2021-08-23 23:02:55&permissions[0].createBy=9amgq1&roles[0].permissions[0].title=2qtl91&roles[0].createBy=x9f81z&roles[0].permissions[0].path=wvqbuc&roles[0].id=163&permissions[0].expand=true&id=163&permissions[0].checked=true&permissions[0].status=442&permissions[0].sortOrder=55&roles[0].permissions[0].icon=cum01g'
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
curl -X DELETE -i http://localhost:8080/deleteMapping?userId=763
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
        "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
      }
    ],
    "userList": [
      {
        "$ref": ".."
      }
    ],
    "userName": "ricky.nitzsche",
    "nickName": "morgan.wolff",
    "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
    "userAge": 32,
    "phone": "260-954-1407",
    "createTime": 1629730974133,
    "small": 46.42,
    "money": 82.33,
    "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
    "telephone": "260-954-1407"
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
      "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
    }
  ],
  "userList": [
    {
      "$ref": ".."
    }
  ],
  "userName": "ricky.nitzsche",
  "nickName": "morgan.wolff",
  "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
  "userAge": 32,
  "phone": "260-954-1407",
  "createTime": 1629730974133,
  "small": 68.31,
  "money": 69.60,
  "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
  "telephone": "260-954-1407"
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
      "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
    }
  ],
  "userList": [
    {
      "$ref": ".."
    }
  ],
  "userName": "ricky.nitzsche",
  "nickName": "morgan.wolff",
  "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
  "userAge": 32,
  "phone": "260-954-1407",
  "createTime": 1629730974133,
  "small": 11.65,
  "money": 59.86,
  "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
  "telephone": "260-954-1407"
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
  "stuName": "ricky.nitzsche",
  "stuAge": true,
  "stuAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
  "user": {
    "userDetails": [
      {
        "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
      }
    ],
    "userList": [
      {
        "$ref": ".."
      }
    ],
    "userName": "ricky.nitzsche",
    "nickName": "morgan.wolff",
    "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
    "userAge": 32,
    "phone": "260-954-1407",
    "createTime": 1629730974133,
    "small": 21.18,
    "money": 57.40,
    "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
    "telephone": "260-954-1407"
  },
  "userMap": {
    "mapKey": {
      "userDetails": [
        {
          "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "ricky.nitzsche",
      "nickName": "morgan.wolff",
      "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
      "userAge": 32,
      "phone": "260-954-1407",
      "createTime": 1629730974133,
      "small": 70.66,
      "money": 17.29,
      "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
      "telephone": "260-954-1407"
    }
  },
  "userTreeSet": [
    {
      "userDetails": [
        {
          "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "ricky.nitzsche",
      "nickName": "morgan.wolff",
      "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
      "userAge": 32,
      "phone": "260-954-1407",
      "createTime": 1629730974133,
      "small": 27.34,
      "money": 49.92,
      "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
      "telephone": "260-954-1407"
    }
  ],
  "user1": {
    "userDetails": [
      {
        "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
      }
    ],
    "userList": [
      {
        "$ref": ".."
      }
    ],
    "userName": "ricky.nitzsche",
    "nickName": "morgan.wolff",
    "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
    "userAge": 32,
    "phone": "260-954-1407",
    "createTime": 1629730974133,
    "small": 91.21,
    "money": 8.01,
    "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
    "telephone": "260-954-1407"
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
          "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "ricky.nitzsche",
      "nickName": "morgan.wolff",
      "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
      "userAge": 32,
      "phone": "260-954-1407",
      "createTime": 1629730974133,
      "small": 55.13,
      "money": 27.46,
      "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
      "telephone": "260-954-1407"
    },
    "data1": {
      "userDetails": [
        {
          "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "ricky.nitzsche",
      "nickName": "morgan.wolff",
      "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
      "userAge": 32,
      "phone": "260-954-1407",
      "createTime": 1629730974133,
      "small": 58.66,
      "money": 85.08,
      "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
      "telephone": "260-954-1407"
    },
    "data2": {
      "userDetails": [
        {
          "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "ricky.nitzsche",
      "nickName": "morgan.wolff",
      "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
      "userAge": 32,
      "phone": "260-954-1407",
      "createTime": 1629730974133,
      "small": 72.20,
      "money": 39.29,
      "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
      "telephone": "260-954-1407"
    },
    "age": 32
  },
  "data1": {
    "data": {
      "userDetails": [
        {
          "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "ricky.nitzsche",
      "nickName": "morgan.wolff",
      "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
      "userAge": 32,
      "phone": "260-954-1407",
      "createTime": 1629730974133,
      "small": 59.63,
      "money": 32.56,
      "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
      "telephone": "260-954-1407"
    },
    "data1": {
      "userDetails": [
        {
          "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "ricky.nitzsche",
      "nickName": "morgan.wolff",
      "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
      "userAge": 32,
      "phone": "260-954-1407",
      "createTime": 1629730974133,
      "small": 65.75,
      "money": 19.15,
      "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
      "telephone": "260-954-1407"
    },
    "data2": {
      "userDetails": [
        {
          "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "ricky.nitzsche",
      "nickName": "morgan.wolff",
      "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
      "userAge": 32,
      "phone": "260-954-1407",
      "createTime": 1629730974133,
      "small": 28.42,
      "money": 62.18,
      "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
      "telephone": "260-954-1407"
    },
    "age": 32
  },
  "data2": {
    "data": {
      "userDetails": [
        {
          "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "ricky.nitzsche",
      "nickName": "morgan.wolff",
      "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
      "userAge": 32,
      "phone": "260-954-1407",
      "createTime": 1629730974133,
      "small": 70.87,
      "money": 37.15,
      "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
      "telephone": "260-954-1407"
    },
    "data1": {
      "userDetails": [
        {
          "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "ricky.nitzsche",
      "nickName": "morgan.wolff",
      "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
      "userAge": 32,
      "phone": "260-954-1407",
      "createTime": 1629730974133,
      "small": 34.05,
      "money": 5.98,
      "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
      "telephone": "260-954-1407"
    },
    "data2": {
      "userDetails": [
        {
          "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "ricky.nitzsche",
      "nickName": "morgan.wolff",
      "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
      "userAge": 32,
      "phone": "260-954-1407",
      "createTime": 1629730974133,
      "small": 64.71,
      "money": 59.51,
      "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
      "telephone": "260-954-1407"
    },
    "age": 32
  },
  "age": 32
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
          "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "ricky.nitzsche",
      "nickName": "morgan.wolff",
      "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
      "userAge": 32,
      "phone": "260-954-1407",
      "createTime": 1629730974133,
      "small": 27.54,
      "money": 12.82,
      "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
      "telephone": "260-954-1407"
    }
  ],
  "data1": {
    "stuName": "ricky.nitzsche",
    "stuAge": true,
    "stuAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
    "user": {
      "userDetails": [
        {
          "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "ricky.nitzsche",
      "nickName": "morgan.wolff",
      "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
      "userAge": 32,
      "phone": "260-954-1407",
      "createTime": 1629730974133,
      "small": 48.65,
      "money": 26.69,
      "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
      "telephone": "260-954-1407"
    },
    "userMap": {
      "mapKey": {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 10.43,
        "money": 71.07,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      }
    },
    "userTreeSet": [
      {
        "userDetails": [
          {
            "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
          }
        ],
        "userList": [
          {
            "$ref": ".."
          }
        ],
        "userName": "ricky.nitzsche",
        "nickName": "morgan.wolff",
        "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
        "userAge": 32,
        "phone": "260-954-1407",
        "createTime": 1629730974133,
        "small": 40.03,
        "money": 82.23,
        "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
        "telephone": "260-954-1407"
      }
    ],
    "user1": {
      "userDetails": [
        {
          "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
        }
      ],
      "userList": [
        {
          "$ref": ".."
        }
      ],
      "userName": "ricky.nitzsche",
      "nickName": "morgan.wolff",
      "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
      "userAge": 32,
      "phone": "260-954-1407",
      "createTime": 1629730974133,
      "small": 43.46,
      "money": 17.48,
      "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
      "telephone": "260-954-1407"
    }
  },
  "data2": {
    "userDetails": [
      {
        "githubAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527"
      }
    ],
    "userList": [
      {
        "$ref": ".."
      }
    ],
    "userName": "ricky.nitzsche",
    "nickName": "morgan.wolff",
    "userAddress": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
    "userAge": 32,
    "phone": "260-954-1407",
    "createTime": 1629730974133,
    "small": 19.47,
    "money": 24.68,
    "ipv6": "daa2:12e8:3d98:1779:27ea:e52c:61ff:df71",
    "telephone": "260-954-1407"
  },
  "age": 32
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
  "numbers": 849
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
    "numbers": 786
  },
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
  "data": "n3qkjw",
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
  "name": "ricky.nitzsche",
  "annyObject": {
    "name": "ricky.nitzsche",
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
      "name": "ricky.nitzsche",
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
  "name": "ricky.nitzsche",
  "annyObject": "hewsfb",
  "data": [
    "yhn79v"
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
  "age": 32,
  "name": "ricky.nitzsche"
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
  "age": 32,
  "name": "ricky.nitzsche"
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
curl -X POST -i http://localhost:8080/tags/apiNote --data 'user=euvf8x&user=euvf8x'
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
  "numbers": 118
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
{"success":true,"message":"success","data":{"MAX_SPEED":36,"gender":0,"simpleEnum":"RED","username":"ricky.nitzsche","password":"cn5qe9","nickName":"morgan.wolff","mobile":"(806) 262-2209","roles":[{"id":"163","createBy":"3pqtrz","createTime":"2021-08-23 23:02:55","updateBy":"81nltq","updateTime":"2021-08-23 23:02:55","delFlag":1,"userId":"163","roleId":"163","roleName":"ricky.nitzsche"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}},"code":"39323","timestamp":"2021-08-23 23:02:54"}
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
curl -X GET -i http://localhost:8080/tags/ignore?total=601
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
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/user/add --data '{"MAX_SPEED":686,"gender":0,"simpleEnum":"RED","username":"ricky.nitzsche","password":"6hxuta","nickName":"morgan.wolff","mobile":"(806) 262-2209","roles":[{"id":"163","createBy":"ywsufn","createTime":"2021-08-23 23:02:55","updateBy":"sji53e","updateTime":"2021-08-23 23:02:55","delFlag":1,"userId":"163","roleId":"163","roleName":"ricky.nitzsche"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}}'
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
  "id": "163",
  "createBy": "rdumj6",
  "createTime": "2021-08-23 23:02:55",
  "updateBy": "2usyfp",
  "updateTime": "2021-08-23 23:02:55",
  "delFlag": 1,
  "username": "ricky.nitzsche",
  "password": "6uf46n",
  "nickName": "morgan.wolff",
  "mobile": "(806) 262-2209",
  "email": "jamal.greenholt@gmail.com",
  "address": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
  "sex": 1,
  "avatar": "ozwphw",
  "type": 301,
  "status": 561,
  "description": "s5armh",
  "roles": [
    {
      "id": "163",
      "createBy": "z6437x",
      "createTime": "2021-08-23 23:02:55",
      "updateBy": "hahpdl",
      "updateTime": "2021-08-23 23:02:55",
      "delFlag": 1,
      "name": "ricky.nitzsche",
      "defaultRole": true,
      "permissions": [
        {
          "id": "163",
          "createBy": "85gv7q",
          "createTime": "2021-08-23 23:02:55",
          "updateBy": "ingb3z",
          "updateTime": "2021-08-23 23:02:55",
          "delFlag": 1,
          "name": "ricky.nitzsche",
          "level": 279,
          "type": 657,
          "title": "mnz4zy",
          "path": "udesr4",
          "component": "4i5aw6",
          "icon": "90j7lx",
          "buttonType": "06cawc",
          "parentId": "163",
          "description": "4qr9ee",
          "sortOrder": 622,
          "status": 427,
          "children": [
            {
              "$ref": ".."
            }
          ],
          "permTypes": [
            "3knq9t"
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
      "id": "163",
      "createBy": "vtw4sa",
      "createTime": "2021-08-23 23:02:55",
      "updateBy": "v43329",
      "updateTime": "2021-08-23 23:02:55",
      "delFlag": 1,
      "name": "ricky.nitzsche",
      "level": 379,
      "type": 174,
      "title": "hem6t8",
      "path": "y7rjb3",
      "component": "3snx6x",
      "icon": "23n0cn",
      "buttonType": "ofr34d",
      "parentId": "163",
      "description": "jdz8ri",
      "sortOrder": 356,
      "status": 253,
      "children": [
        {
          "$ref": ".."
        }
      ],
      "permTypes": [
        "s9qui7"
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
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -i http://localhost:8080/user/update --data '{"MAX_SPEED":148,"gender":0,"simpleEnum":"RED","username":"ricky.nitzsche","password":"agqqa5","nickName":"morgan.wolff","mobile":"(806) 262-2209","roles":[{"id":"163","createBy":"40w3jp","createTime":"2021-08-23 23:02:55","updateBy":"3jtpqg","updateTime":"2021-08-23 23:02:55","delFlag":1,"userId":"163","roleId":"163","roleName":"ricky.nitzsche"}],"extend":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2.0","1.5.6"]}},"listMap":{"address":"成都市","sex":1,"age":16,"name":"smart-doc","extends""{"version":1.0,"versionList":["1.2","1.5.6"]}}}'
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
  "id": "163",
  "createBy": "6dajnz",
  "createTime": "2021-08-23 23:02:55",
  "updateBy": "2psyib",
  "updateTime": "2021-08-23 23:02:55",
  "delFlag": 1,
  "username": "ricky.nitzsche",
  "password": "mv41n5",
  "nickName": "morgan.wolff",
  "mobile": "(806) 262-2209",
  "email": "jamal.greenholt@gmail.com",
  "address": "Suite 447 600 Kennith Corner， South Gail， OR 13527",
  "sex": 1,
  "avatar": "173m14",
  "type": 606,
  "status": 328,
  "description": "2gedep",
  "roles": [
    {
      "id": "163",
      "createBy": "4dm6gi",
      "createTime": "2021-08-23 23:02:55",
      "updateBy": "qtuj3f",
      "updateTime": "2021-08-23 23:02:55",
      "delFlag": 1,
      "name": "ricky.nitzsche",
      "defaultRole": true,
      "permissions": [
        {
          "id": "163",
          "createBy": "t6n3jk",
          "createTime": "2021-08-23 23:02:55",
          "updateBy": "rbzv5b",
          "updateTime": "2021-08-23 23:02:55",
          "delFlag": 1,
          "name": "ricky.nitzsche",
          "level": 778,
          "type": 390,
          "title": "94g5f0",
          "path": "gse232",
          "component": "vwnoia",
          "icon": "30i5f0",
          "buttonType": "0gazwn",
          "parentId": "163",
          "description": "ip4xfe",
          "sortOrder": 258,
          "status": 889,
          "children": [
            {
              "$ref": ".."
            }
          ],
          "permTypes": [
            "pi8bcc"
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
      "id": "163",
      "createBy": "6zehii",
      "createTime": "2021-08-23 23:02:55",
      "updateBy": "8c6c7l",
      "updateTime": "2021-08-23 23:02:55",
      "delFlag": 1,
      "name": "ricky.nitzsche",
      "level": 805,
      "type": 893,
      "title": "djnqc7",
      "path": "je3btz",
      "component": "c7i1vf",
      "icon": "9ikh4l",
      "buttonType": "4j9ft2",
      "parentId": "163",
      "description": "qtlyxa",
      "sortOrder": 460,
      "status": 797,
      "children": [
        {
          "$ref": ".."
        }
      ],
      "permTypes": [
        "y4886v"
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
  "name": "ricky.nitzsche",
  "birthday": "2021-08-23",
  "age": 32,
  "subject": {
    "subjectName": "ricky.nitzsche",
    "core": 559
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
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
  "token": "u0kcjx",
  "sequenceNo": "yttw0c",
  "parameter": {
    "subUserName": "张三",
    "numbers": 340
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
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
  "id": 298,
  "name": "ricky.nitzsche",
  "mobile": "(806) 262-2209"
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
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
  "id": 854,
  "name": "ricky.nitzsche",
  "mobile": "(806) 262-2209"
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
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
  "id": 198,
  "name": "ricky.nitzsche",
  "mobile": "(806) 262-2209"
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
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
  "name": "ricky.nitzsche",
  "birthday": "2021-08-23",
  "age": 32,
  "subject": {
    "subjectName": "ricky.nitzsche",
    "core": 909
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
  "name": "ricky.nitzsche",
  "birthday": "2021-08-23",
  "age": 32,
  "subject": {
    "subjectName": "ricky.nitzsche",
    "core": 735
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
curl -X POST -i http://localhost:8080/xss/text --data 'text=2t694g'
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
  "data": "g5wqi5",
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
curl -X GET -i http://localhost:8080/xss/query?query=i4pe5c
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
  "data": "ox8lls",
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
  "age": 32,
  "name": "ricky.nitzsche"
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
    "age": 32,
    "name": "ricky.nitzsche"
  },
  "code": "39323",
  "timestamp": "2021-08-23 23:02:54"
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
curl -X GET -i http://localhost:8080/configQueryParamGet?configQueryParam=v0ba1d
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
curl -X POST -i http://localhost:8080/configQueryParamPost --data 'configQueryParam=y0vkxr'
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
curl -X GET -i http://localhost:8080/configParamGet/zscc7o?configQueryParam=252xh4
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

