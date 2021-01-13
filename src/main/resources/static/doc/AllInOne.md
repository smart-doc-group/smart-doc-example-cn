# smart-doc


## smart-doc调试入口
### Test Constants
**URL:** http://127.0.0.1:8080/testConstants/1.0

**Type:** GET

**Author:** boxer

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Test Constants

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
page|int32|页码|false|-

**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/testConstants/1.0?page=0
```

**Response-example:**
```
Doesn't return a value.
```

## app端接口测试
### RequestParam+json
**URL:** http://127.0.0.1:8080/app/getUserJson

**Type:** POST

**Author:** yu 2018/9/4.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** RequestParam+json

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X POST -H 'token:kk' -i http://127.0.0.1:8080/app/getUserJson
```

**Response-example:**
```
Doesn't return a value.
```

### 分页查询订单信息
**URL:** http://127.0.0.1:8080/app/page/{pageIndex}/{pageSize}

**Type:** GET

**Author:** yu 2018/9/4.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 分页查询订单信息

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
pageIndex|int32|当前页码|true|-
pageSize|int32|页面大小|true|-

**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/app/page/114/10
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
searchCount|boolean|进行 count 查询 【 默认: true 】|-
pages|int64|当前分页总页数|-
hitCount|boolean|是否命中count缓存|3.3.1
records|array|分页记录列表|-
└─orderId|int32|订单id|-
└─orderType|enum|订单类型<br/>WAIT_PAY -("0","已支付")<br/>PAID -("1","已支付")<br/>EXPIRED -("2","已经失效")<br/>|-
total|int64|当前满足条件总行数|-
size|int64|获取每页显示条数|-
current|int64|当前页|-
count|int64|总数|-
page|int64|当前页码|-

**Response-example:**
```
{
	"searchCount":true,
	"pages":408,
	"hitCount":true,
	"records":[
		{
			"orderId":16,
			"orderType":"WAIT_PAY"
		}
	],
	"total":707,
	"size":46,
	"current":254,
	"count":70,
	"page":237
}
```

### app测试
**URL:** http://127.0.0.1:8080/app/test

**Type:** POST

**Author:** yu 2018/9/4.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** app测试

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|false|-
beginTime|string|开始时间|false|-
endTime|string|结束时间|false|-

**Request-example:**
```
curl -X POST -H 'token:kk' -i http://127.0.0.1:8080/app/test --data 'name=zhangsan&endTime=2020-12-27 01:05:23&beginTime=2020-12-27 01:05:23'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"waring":"You may have used non-display generics."
	},
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

### app测试2
**URL:** http://127.0.0.1:8080/app/test2

**Type:** GET

**Author:** yu 2018/9/4.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** app测试2

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|false|-
beginTime|string|开始时间|false|-
endTime|string|结束时间|false|-

**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/app/test2?name=明.陈&beginTime=2020-12-27 01:05:23&endTime=2020-12-27 01:05:23
```

**Response-example:**
```
string
```

### app测试3
**URL:** http://127.0.0.1:8080/app/test3

**Type:** GET

**Author:** yu 2018/9/4.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** app测试3

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|false|-
beginTime|string|开始时间|false|-
endTime|string|结束时间|false|-

**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/app/test3?endTime=2020-12-27 01:05:23&name=明.陈&beginTime=2020-12-27 01:05:23
```

**Response-example:**
```
string
```

## 异步返回信息测试
### 返回Callable&lt;CommonResult&gt;
**URL:** http://127.0.0.1:8080/testCallable

**Type:** GET

**Author:** yu 2019/9/22.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回Callable&lt;CommonResult&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/testCallable
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"waring":"You may have used non-display generics."
	},
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

### 返回DeferredResult&lt;CommonResult&lt;String&gt;&gt;
**URL:** http://127.0.0.1:8080/async-deferredresult

**Type:** GET

**Author:** yu 2019/9/22.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回DeferredResult&lt;CommonResult&lt;String&gt;&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/async-deferredresult
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"rnilry",
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

### 返回WebAsyncTask&lt;CommonResult&gt;
**URL:** http://127.0.0.1:8080/WebAsync/timeout

**Type:** GET

**Author:** yu 2019/9/22.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回WebAsyncTask&lt;CommonResult&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/WebAsync/timeout
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"waring":"You may have used non-display generics."
	},
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

### 返回Future&lt;CommonResult&lt;String&gt;&gt;
**URL:** http://127.0.0.1:8080/future

**Type:** GET

**Author:** yu 2019/9/22.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回Future&lt;CommonResult&lt;String&gt;&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/future
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"f787td",
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

### 返回CompletableFuture&lt;CommonResult&lt;String&gt;&gt;
**URL:** http://127.0.0.1:8080/completableFuture

**Type:** GET

**Author:** yu 2019/9/22.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回CompletableFuture&lt;CommonResult&lt;String&gt;&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/completableFuture
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"gpx83m",
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

## 循环引用依赖测试
### 循环依赖参数推导
**URL:** http://127.0.0.1:8080/circularReference

**Type:** GET

**Author:** ,yu 2019/10/24.

**Content-Type:** application/json; charset=utf-8

**Description:** 循环依赖参数推导(不建议使用)

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


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
curl -X GET -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/circularReference --data '{
	"a":"r9fa6c",
	"b":{
		"b":"h9voso",
		"c":{
			"c":"skkzmq",
			"a":{
				"a":"mho1ii",
				"b":{
					"$ref":"..."
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
	"a":"ljo44n",
	"b":{
		"b":"tf6byn",
		"c":{
			"c":"29lcxj",
			"a":{
				"a":"wybrqx",
				"b":{
					"$ref":"..."
				}
			}
		}
	}
}
```

## 枚举参数测试
### 获取枚举参数1
**URL:** http://127.0.0.1:8080/enum

**Type:** GET

**Author:** yu 2019/11/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 获取枚举参数1

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
simpleEnum|enum|RED<br/>BLUE<br/>|false|-

**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/enum?simpleEnum=RED
```

**Response-example:**
```
string
```

### 获取枚举参数2
**URL:** http://127.0.0.1:8080/enum/{orderEnum}

**Type:** GET

**Author:** yu 2019/11/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 获取枚举参数2

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
orderEnum|enum|WAIT_PAY -(0,已支付)<br/>PAID -(1,已支付)<br/>EXPIRED -(2,已经失效)<br/>|true|-

**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/enum/WAIT_PAY
```

**Response-example:**
```
string
```

### 获取枚举参数3
**URL:** http://127.0.0.1:8080/enum/{simpleEnum}

**Type:** GET

**Author:** yu 2019/11/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 获取枚举参数3

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
simpleEnum|enum|RED<br/>BLUE<br/>|true|-

**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/enum/RED
```

**Response-example:**
```
string
```

### 获取枚举参数4
**URL:** http://127.0.0.1:8080/enum/test1

**Type:** GET

**Author:** yu 2019/11/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 获取枚举参数4

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
orderId|int32|订单id|false|-
orderType|enum|订单类型<br/>WAIT_PAY -("0","已支付")<br/>PAID -("1","已支付")<br/>EXPIRED -("2","已经失效")<br/>|false|-

**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/enum/test1?order=
```

**Response-example:**
```
string
```

### 枚举响应
**URL:** http://127.0.0.1:8080/enum/resp

**Type:** GET

**Author:** yu 2019/11/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 枚举响应

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/enum/resp
```

**Response-example:**
```
"RED"
```

## 文件上传测试
### 上传单个文件
**URL:** http://127.0.0.1:8080/upload

**Type:** POST

**Author:** yu 2019/10/31.

**Content-Type:** multipart/form-data

**Description:** 上传单个文件

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|string|用户id|false|-
file|file||true|-

**Request-example:**
```
curl -X POST -H 'Content-Type: multipart/form-data' -H 'token:kk' -i http://127.0.0.1:8080/upload --data 'userId=95'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"waring":"You may have used non-display generics."
	},
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

### 批量上传文件
**URL:** http://127.0.0.1:8080/batchUpload

**Type:** POST

**Author:** yu 2019/10/31.

**Content-Type:** multipart/form-data

**Description:** 批量上传文件

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
file|file|文件(array of file)|true|-

**Request-example:**
```
curl -X POST -H 'Content-Type: multipart/form-data' -H 'token:kk' -i http://127.0.0.1:8080/batchUpload
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"waring":"You may have used non-display generics."
	},
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

## 接收表单参数
### 测试formData
**URL:** http://127.0.0.1:8080/formData1

**Type:** POST

**Author:** yu 2019/10/29.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试formData

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
MAX_SPEED|int32|No comments found.|false|-
simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|false|-
username|string|用户名|true|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|false|-

**Request-example:**
```
curl -X POST -H 'token:kk' -i http://127.0.0.1:8080/formData1 --data 'password=5q99c5&mobile=15525817715&simpleEnum=RED&MAX_SPEED=311&username=明.陈&nickName=dylan.bednar&gender=WOMAN'
```

**Response-example:**
```
Doesn't return a value.
```

### Post请求发表单文件
**URL:** http://127.0.0.1:8080/formData2

**Type:** POST

**Author:** yu 2019/10/29.

**Content-Type:** multipart/form-data

**Description:** Post请求发表单文件

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|string|No comments found.|false|-
userData|string|No comments found.|false|-
file|file||true|-

**Request-example:**
```
curl -X POST -H 'Content-Type: multipart/form-data' -H 'token:kk' -i http://127.0.0.1:8080/formData2 --data 'userId=95&userData=qeitxe'
```

**Response-example:**
```
Doesn't return a value.
```

### Get请求发表单文件 暂不支持完全解析
**URL:** http://127.0.0.1:8080/formData2

**Type:** GET

**Author:** yu 2019/10/29.

**Content-Type:** multipart/form-data

**Description:** Get请求发表单文件 暂不支持完全解析

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|string|No comments found.|false|-
userData|string|No comments found.|false|-
file|file||true|-

**Request-example:**
```
curl -X GET -H 'Content-Type: multipart/form-data' -H 'token:kk' -i http://127.0.0.1:8080/formData2?userId=95&userData=yzulzh
```

**Response-example:**
```
Doesn't return a value.
```

### 表单 包含复杂对象的Get 暂不支持完全解析
**URL:** http://127.0.0.1:8080/formData4

**Type:** GET

**Author:** yu 2019/10/29.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 表单 包含复杂对象的Get 暂不支持完全解析

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|string|No comments found.|false|-
userData|string|No comments found.|false|-
MAX_SPEED|int32|No comments found.|false|-
simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|false|-
username|string|用户名|true|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|false|-

**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/formData4?simpleEnum=RED&userData=7y84we&username=明.陈&MAX_SPEED=548&nickName=dylan.bednar&mobile=15525817715&userId=95&gender=WOMAN&password=ogaz4i
```

**Response-example:**
```
Doesn't return a value.
```

### 表单 包含复杂对象
**URL:** http://127.0.0.1:8080/formData5

**Type:** POST

**Author:** yu 2019/10/29.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 表单 包含复杂对象

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|string|No comments found.|false|-
userData|string|No comments found.|false|-
MAX_SPEED|int32|No comments found.|false|-
simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|false|-
username|string|用户名|true|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|false|-

**Request-example:**
```
curl -X POST -H 'token:kk' -i http://127.0.0.1:8080/formData5 --data 'mobile=15525817715&userId=95&gender=WOMAN&userData=swdnrz&MAX_SPEED=662&nickName=dylan.bednar&simpleEnum=RED&password=7zpbcv&username=明.陈'
```

**Response-example:**
```
Doesn't return a value.
```

### 表单 枚举
**URL:** http://127.0.0.1:8080/formData6

**Type:** GET

**Author:** yu 2019/10/29.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 表单 枚举

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|string|No comments found.|false|-
userData|string|No comments found.|false|-
simpleUser|enum|RED<br/>BLUE<br/>|false|-

**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/formData6?userId=95&userData=5feppd&simpleUser=RED
```

**Response-example:**
```
Doesn't return a value.
```

### 测试formData带路径参数
**URL:** http://127.0.0.1:8080/formData1/{id}

**Type:** POST

**Author:** yu 2019/10/29.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试formData带路径参数

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|string|No comments found.|true|-

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
MAX_SPEED|int32|No comments found.|false|-
simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|false|-
username|string|用户名|true|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|false|-

**Request-example:**
```
curl -X POST -H 'token:kk' -i http://127.0.0.1:8080/formData1/95 --data 'mobile=15525817715&MAX_SPEED=471&nickName=dylan.bednar&gender=WOMAN&password=6cqpk0&simpleEnum=RED&username=明.陈'
```

**Response-example:**
```
Doesn't return a value.
```

### 测试formData带路多个路径参数
**URL:** http://127.0.0.1:8080/formData1/{id}/{age}

**Type:** POST

**Author:** yu 2019/10/29.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试formData带路多个路径参数

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|string|No comments found.|true|-
age|int32|No comments found.|true|-

**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
MAX_SPEED|int32|No comments found.|false|-
simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|false|-
username|string|用户名|true|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|false|-

**Request-example:**
```
curl -X POST -H 'token:kk' -i http://127.0.0.1:8080/formData1/95/24 --data 'simpleEnum=RED&username=明.陈&gender=WOMAN&nickName=dylan.bednar&mobile=15525817715&password=etto6q&MAX_SPEED=209'
```

**Response-example:**
```
Doesn't return a value.
```

## java泛型解析测试
### 测试多泛型1
**URL:** http://127.0.0.1:8080/generics/test1

**Type:** GET

**Author:** yu 2020/7/2.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试多泛型1

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/generics/test1
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
test|string|托尔斯泰|-
value|object|value|-
└─MAX_SPEED|int32|No comments found.|-
└─simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|-
└─username|string|用户名|v1.0
└─password|string|密码|v1.0
└─nickName|string|昵称|v1.0
└─mobile|string|电话|v1.0
└─gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|-
key|object|key|-
└─roleId|int32|角色id|-
└─roleName|string|角色名称|-

**Response-example:**
```
{
	"test":"fz8qq1",
	"value":{
		"MAX_SPEED":43,
		"simpleEnum":"RED",
		"username":"明.陈",
		"password":"bsszyg",
		"nickName":"dylan.bednar",
		"mobile":"15525817715",
		"gender":0
	},
	"key":{
		"roleId":724,
		"roleName":"明.陈"
	}
}
```

### 测试多泛型2
**URL:** http://127.0.0.1:8080/generics/test2

**Type:** GET

**Author:** yu 2020/7/2.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试多泛型2

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/generics/test2
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
total|int32|总条数|-
other|object|其他信息|-
└─MAX_SPEED|int32|No comments found.|-
└─simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|-
└─username|string|用户名|v1.0
└─password|string|密码|v1.0
└─nickName|string|昵称|v1.0
└─mobile|string|电话|v1.0
└─gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|-
rows|array|数据列表|-
└─roleId|int32|角色id|-
└─roleName|string|角色名称|-

**Response-example:**
```
{
	"total":712,
	"other":{
		"MAX_SPEED":727,
		"simpleEnum":"RED",
		"username":"明.陈",
		"password":"sykgpo",
		"nickName":"dylan.bednar",
		"mobile":"15525817715",
		"gender":0
	},
	"rows":[
		{
			"roleId":404,
			"roleName":"明.陈"
		}
	]
}
```

### 测试单泛型嵌套
**URL:** http://127.0.0.1:8080/generics/test3

**Type:** GET

**Author:** yu 2020/7/2.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试单泛型嵌套

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/generics/test3
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
└─roleId|int32|角色id|-
└─roleName|string|角色名称|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"roleId":14,
		"roleName":"明.陈"
	},
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

## https测试
### 测试https
**URL:** http://127.0.0.1:8080/testHttps

**Type:** GET

**Author:** yu 2018/12/20.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试https

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/testHttps
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"lzw82v",
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

### 测试http
**URL:** http://127.0.0.1:8080/testHttp

**Type:** GET

**Author:** yu 2018/12/20.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试http

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/testHttp
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"743p1b",
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

## Test inner class
### Return A object contains Inner class
**URL:** http://127.0.0.1:8080/inner/class

**Type:** GET

**Author:** yu 2019/10/19.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Return A object contains Inner class

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/inner/class
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
	"name":"明.陈",
	"innerClass":{
		"phone":"15711804595"
	}
}
```

## JDK8的时间测试
### LocalDate和LocalDateTime测试
**URL:** http://127.0.0.1:8080/dateEntity

**Type:** POST

**Author:** yu 2019/9/22.

**Content-Type:** application/json; charset=utf-8

**Description:** LocalDate和LocalDateTime测试

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
localDate|string|创建日期|false|v1.0
localDateTime|string|创建时间|false|v1.0
localTime|string|jdk8 LocalTime|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/dateEntity? --data '{
	"localDate":"2020-12-27",
	"localDateTime":"2020-12-27 01:05:24",
	"localTime":"2020-12-27 01:05:23"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
localDate|string|创建日期|v1.0
localDateTime|string|创建时间|v1.0
localTime|string|jdk8 LocalTime|-

**Response-example:**
```
{
	"localDate":"2020-12-27",
	"localDateTime":"2020-12-27 01:05:24",
	"localTime":"2020-12-27 01:05:23"
}
```

## Jpa代码测试
### ~~Jpa Page~~
**URL:** http://127.0.0.1:8080/test

**Type:** POST

**Author:** cht

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 用于测试Jpa的分页查询

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X POST -H 'token:kk' -i http://127.0.0.1:8080/test
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
sort|object|Returns the sorting parameters for the {@link Slice}.|-
└─empty|boolean|Returns whether the current {@link Streamable} is empty.|-
└─orders|array|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─direction|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─property|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ignoreCase|boolean|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nullHandling|object|No comments found.|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─direction|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─property|string|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─ignoreCase|boolean|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─nullHandling|object|No comments found.|-
empty|boolean|Returns whether the current {@link Streamable} is empty.|-

**Response-example:**
```
{
	"totalPages":57,
	"totalElements":390,
	"number":611,
	"size":10,
	"numberOfElements":29,
	"content":[
		{
			"roleId":381,
			"roleName":"明.陈"
		}
	],
	"sort":{
		"empty":true,
		"orders":[
			{
				"direction":{
					
				},
				"property":"dldwu8",
				"ignoreCase":true,
				"nullHandling":{
					
				}
			}
		]
	},
	"first":true,
	"last":true,
	"pageable":{
		"paged":true,
		"unpaged":true,
		"pageNumber":458,
		"pageSize":10,
		"offset":1,
		"sort":{
			"empty":true,
			"orders":[
				{
					"direction":{
						
					},
					"property":"454ob3",
					"ignoreCase":true,
					"nullHandling":{
						
					}
				}
			]
		}
	},
	"empty":true
}
```

### Jpa Pageable查询参数重渲染
**URL:** http://127.0.0.1:8080/pageableParam

**Type:** POST

**Author:** yu 2020/5/15.

**Content-Type:** application/json; charset=utf-8

**Description:** 测试让smart-doc使用自定义对象来渲染生成文档

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
page|int32|页码|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/pageableParam? --data '{
	"page":1
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"waring":"You may have used non-display generics."
	},
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

## 测试json
### RequestParam+json
**URL:** http://127.0.0.1:8080/getUserJson

**Type:** POST

**Author:** yu 2020/11/17.

**Content-Type:** application/json; charset=utf-8

**Description:** RequestParam+json

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|No comments found.|true|-

**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
dataExpressionEnum|enum|枚举<br/>SENSIRION<br/>|false|-
menuPermissionCodes|array|菜单/权限编码<br/>WAIT_PAY -("0","已支付")<br/>PAID -("1","已支付")<br/>EXPIRED -("2","已经失效")<br/>|false|-
date|string|学好|false|-
username|string|用户名|false|-
idCard|string|身份证号|false|-
age|int32|No comments found.|false|-
age2|int32|No comments found.|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/getUserJson?name=明.陈 --data '{
	"dataExpressionEnum":"SENSIRION",
	"menuPermissionCodes":[
		"WAIT_PAY"
	],
	"date":"2019-01-01",
	"username":"明.陈",
	"idCard":"811523197205067912",
	"age":24,
	"age2":840
}'
```

**Response-example:**
```
string
```

## FastJson和Jackson注解支持测试
### Jackson注解支持测试
**URL:** http://127.0.0.1:8080/json/jacksonTest

**Type:** GET

**Author:** yu 2018/7/10.

**Content-Type:** application/json; charset=utf-8

**Description:** Jackson注解支持测试

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|用户名|false|-

**Request-example:**
```
curl -X GET -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/json/jacksonTest --data '{
	"name":"明.陈"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
name|string|用户名|-

**Response-example:**
```
{
	"name":"明.陈"
}
```

### FastJson注解支持测试
**URL:** http://127.0.0.1:8080/json/fastJsonTest

**Type:** GET

**Author:** yu 2018/7/10.

**Content-Type:** application/json; charset=utf-8

**Description:** FastJson注解支持测试

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
dataExpressionEnum|enum|枚举<br/>SENSIRION<br/>|false|-
menuPermissionCodes|array|菜单/权限编码<br/>WAIT_PAY -("0","已支付")<br/>PAID -("1","已支付")<br/>EXPIRED -("2","已经失效")<br/>|false|-
date|string|学好|false|-
username|string|用户名|false|-
idCard|string|身份证号|false|-
age|int32|No comments found.|false|-
age2|int32|No comments found.|false|-

**Request-example:**
```
curl -X GET -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/json/fastJsonTest --data '{
	"dataExpressionEnum":"SENSIRION",
	"menuPermissionCodes":[
		"WAIT_PAY"
	],
	"date":"2019-01-01",
	"username":"明.陈",
	"idCard":"811523197205067912",
	"age":24,
	"age2":440
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
dataExpressionEnum|enum|枚举<br/>SENSIRION<br/>|-
menuPermissionCodes|array|菜单/权限编码<br/>WAIT_PAY -("0","已支付")<br/>PAID -("1","已支付")<br/>EXPIRED -("2","已经失效")<br/>|-
date|string|学好|-
username|string|用户名|-
idCard|string|身份证号|-
age|int32|No comments found.|-
age2|int32|No comments found.|-

**Response-example:**
```
{
	"dataExpressionEnum":"SENSIRION",
	"menuPermissionCodes":[
		"WAIT_PAY"
	],
	"date":"2019-01-01",
	"username":"明.陈",
	"idCard":"811523197205067912",
	"age":24,
	"age2":869
}
```

## List返回接口Api文档测试
### List&lt;String&gt;结构
**URL:** http://127.0.0.1:8080/list/listString

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;String&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/list/listString
```

**Response-example:**
```
[
	"a51dal",
	"4ij06p"
]
```

### List&lt;Map&lt;String,String&gt;&gt;结构
**URL:** http://127.0.0.1:8080/list/listMap

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;Map&lt;String,String&gt;&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/list/listMap
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
-|object|Return object.|-

**Response-example:**
```
[
	{
		"mapKey1":"6n638d",
		"mapKey2":"ep9tnv"
	}
]
```

### List&lt;自动义对象&gt;
**URL:** http://127.0.0.1:8080/list/listObject

**Type:** POST

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;自动义对象&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X POST -H 'token:kk' -i http://127.0.0.1:8080/list/listObject
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
		"userDetails":[
			{
				"githubAddress":"韦桥3号， 绵阳， 甘 383932"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"明.陈",
		"nickName":"dylan.bednar",
		"userAddress":"韦桥3号， 绵阳， 甘 383932",
		"userAge":24,
		"phone":"15711804595",
		"createTime":1609002323037,
		"small":55.49,
		"money":33.84,
		"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
		"telephone":"15711804595"
	}
]
```

### List&lt;Map&lt;String,T&gt;&gt;结构
**URL:** http://127.0.0.1:8080/list/listMap2

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;Map&lt;String,T&gt;&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/list/listMap2
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
		"mapKey":{
			"stuName":"明.陈",
			"stuAge":true,
			"stuAddress":"韦桥3号， 绵阳， 甘 383932",
			"user":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":18.80,
				"money":35.27,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			},
			"userMap":{
				"mapKey":{
					"userDetails":[
						{
							"githubAddress":"韦桥3号， 绵阳， 甘 383932"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"明.陈",
					"nickName":"dylan.bednar",
					"userAddress":"韦桥3号， 绵阳， 甘 383932",
					"userAge":24,
					"phone":"15711804595",
					"createTime":1609002323037,
					"small":92.94,
					"money":1.39,
					"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
					"telephone":"15711804595"
				}
			},
			"userTreeSet":[
				{
					"userDetails":[
						{
							"githubAddress":"韦桥3号， 绵阳， 甘 383932"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"明.陈",
					"nickName":"dylan.bednar",
					"userAddress":"韦桥3号， 绵阳， 甘 383932",
					"userAge":24,
					"phone":"15711804595",
					"createTime":1609002323037,
					"small":28.79,
					"money":18.47,
					"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
					"telephone":"15711804595"
				}
			],
			"user1":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":92.30,
				"money":11.81,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			}
		}
	}
]
```

### List&lt;Map&lt;M,N&lt;P,k&gt;&gt;&gt;超复杂结构
**URL:** http://127.0.0.1:8080/list/listMap3

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;Map&lt;M,N&lt;P,k&gt;&gt;&gt;超复杂结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/list/listMap3
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
		"mapKey":{
			"data":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":88.46,
				"money":57.70,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":48.29,
				"money":48.61,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":71.82,
				"money":49.58,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			},
			"age":24
		}
	}
]
```

### List&lt;T&lt;List&lt;M&gt;,List&lt;M&gt;,List&lt;M&gt;&gt;&gt;超复杂结构
**URL:** http://127.0.0.1:8080/list/listTeacher

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;T&lt;List&lt;M&gt;,List&lt;M&gt;,List&lt;M&gt;&gt;&gt;超复杂结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/list/listTeacher
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
[
	{
		"data":[
			{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":71.42,
				"money":69.96,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			}
		],
		"data1":[
			{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":34.35,
				"money":26.84,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			}
		],
		"data2":[
			{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":31.57,
				"money":21.31,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			}
		],
		"age":24
	}
]
```

### List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,User,User&gt;&gt;结构
**URL:** http://127.0.0.1:8080/list/listString1

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,User,User&gt;&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/list/listString1
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
		"data":{
			"data":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":38.97,
				"money":65.85,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":61.50,
				"money":45.00,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":79.76,
				"money":49.39,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			},
			"age":24
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"韦桥3号， 绵阳， 甘 383932"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"明.陈",
			"nickName":"dylan.bednar",
			"userAddress":"韦桥3号， 绵阳， 甘 383932",
			"userAge":24,
			"phone":"15711804595",
			"createTime":1609002323037,
			"small":29.79,
			"money":31.67,
			"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
			"telephone":"15711804595"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"韦桥3号， 绵阳， 甘 383932"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"明.陈",
			"nickName":"dylan.bednar",
			"userAddress":"韦桥3号， 绵阳， 甘 383932",
			"userAge":24,
			"phone":"15711804595",
			"createTime":1609002323037,
			"small":53.10,
			"money":35.88,
			"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
			"telephone":"15711804595"
		},
		"age":24
	}
]
```

### List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;&gt;
**URL:** http://127.0.0.1:8080/list/listString2

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/list/listString2
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
		"data":{
			"data":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":31.63,
				"money":2.23,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":51.49,
				"money":13.81,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":87.80,
				"money":72.63,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			},
			"age":24
		},
		"data1":{
			"data":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":16.70,
				"money":11.03,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":15.61,
				"money":67.53,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":68.92,
				"money":4.07,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			},
			"age":24
		},
		"data2":{
			"data":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":35.80,
				"money":4.49,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			},
			"data1":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":60.99,
				"money":81.89,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			},
			"data2":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":48.67,
				"money":32.61,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			},
			"age":24
		},
		"age":24
	}
]
```

### CommonResult&lt;List&lt;UserDto&gt;&gt;
**URL:** http://127.0.0.1:8080/list/listUserDto

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** CommonResult&lt;List&lt;UserDto&gt;&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/list/listUserDto
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
└─token|string|token|-
└─LoginList|array|UserDto 用户信息列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─userName|string|用户名|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─password|string|密码|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":[
		{
			"token":"kh495h",
			"LoginList":[
				{
					"userName":"明.陈",
					"password":"luafdy"
				}
			]
		}
	],
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

## Map返回型接口api文档测试
### Map&lt;String,Integer&gt;结构
**URL:** http://127.0.0.1:8080/map/primitive

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,Integer&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/map/primitive
```

**Response-example:**
```
{
	"mapKey1":641,
	"mapKey2":728
}
```

### Map&lt;String,Object&gt;结构
**URL:** http://127.0.0.1:8080/map/objectValue

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,Object&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/map/objectValue
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
any object|object|any object.|-

**Response-example:**
```
{
	"mapKey":{
		"waring":"You may use java.util.Object for Map value; smart-doc can't be handle."
	}
}
```

### Map&lt;String,User&gt;结构
**URL:** http://127.0.0.1:8080/map/object

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,User&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/map/object
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
	"mapKey":{
		"userDetails":[
			{
				"githubAddress":"韦桥3号， 绵阳， 甘 383932"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"明.陈",
		"nickName":"dylan.bednar",
		"userAddress":"韦桥3号， 绵阳， 甘 383932",
		"userAge":24,
		"phone":"15711804595",
		"createTime":1609002323037,
		"small":64.78,
		"money":88.92,
		"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
		"telephone":"15711804595"
	}
}
```

### Map&lt;String,Student&gt;结构
**URL:** http://127.0.0.1:8080/map/test1

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,Student&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/map/test1
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
	"mapKey":{
		"stuName":"明.陈",
		"stuAge":true,
		"stuAddress":"韦桥3号， 绵阳， 甘 383932",
		"user":{
			"userDetails":[
				{
					"githubAddress":"韦桥3号， 绵阳， 甘 383932"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"明.陈",
			"nickName":"dylan.bednar",
			"userAddress":"韦桥3号， 绵阳， 甘 383932",
			"userAge":24,
			"phone":"15711804595",
			"createTime":1609002323037,
			"small":60.64,
			"money":43.73,
			"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
			"telephone":"15711804595"
		},
		"userMap":{
			"mapKey":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":64.28,
				"money":79.82,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			}
		},
		"userTreeSet":[
			{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":16.29,
				"money":41.71,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			}
		],
		"user1":{
			"userDetails":[
				{
					"githubAddress":"韦桥3号， 绵阳， 甘 383932"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"明.陈",
			"nickName":"dylan.bednar",
			"userAddress":"韦桥3号， 绵阳， 甘 383932",
			"userAge":24,
			"phone":"15711804595",
			"createTime":1609002323037,
			"small":44.57,
			"money":63.18,
			"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
			"telephone":"15711804595"
		}
	}
}
```

### Map&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构
**URL:** http://127.0.0.1:8080/map/test2

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/map/test2
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
	"mapKey":{
		"data":[
			{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":28.20,
				"money":27.23,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			}
		],
		"data1":{
			"stuName":"明.陈",
			"stuAge":true,
			"stuAddress":"韦桥3号， 绵阳， 甘 383932",
			"user":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":32.36,
				"money":67.63,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			},
			"userMap":{
				"mapKey":{
					"userDetails":[
						{
							"githubAddress":"韦桥3号， 绵阳， 甘 383932"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"明.陈",
					"nickName":"dylan.bednar",
					"userAddress":"韦桥3号， 绵阳， 甘 383932",
					"userAge":24,
					"phone":"15711804595",
					"createTime":1609002323037,
					"small":28.78,
					"money":41.23,
					"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
					"telephone":"15711804595"
				}
			},
			"userTreeSet":[
				{
					"userDetails":[
						{
							"githubAddress":"韦桥3号， 绵阳， 甘 383932"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"明.陈",
					"nickName":"dylan.bednar",
					"userAddress":"韦桥3号， 绵阳， 甘 383932",
					"userAge":24,
					"phone":"15711804595",
					"createTime":1609002323037,
					"small":16.37,
					"money":72.50,
					"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
					"telephone":"15711804595"
				}
			],
			"user1":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":39.35,
				"money":37.60,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			}
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"韦桥3号， 绵阳， 甘 383932"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"明.陈",
			"nickName":"dylan.bednar",
			"userAddress":"韦桥3号， 绵阳， 甘 383932",
			"userAge":24,
			"phone":"15711804595",
			"createTime":1609002323037,
			"small":65.83,
			"money":95.57,
			"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
			"telephone":"15711804595"
		},
		"age":24
	}
}
```

### TreeMap&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构
**URL:** http://127.0.0.1:8080/map/test3

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** TreeMap&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/map/test3
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
	"mapKey":{
		"data":[
			{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":17.25,
				"money":96.69,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			}
		],
		"data1":{
			"stuName":"明.陈",
			"stuAge":true,
			"stuAddress":"韦桥3号， 绵阳， 甘 383932",
			"user":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":52.87,
				"money":95.92,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			},
			"userMap":{
				"mapKey":{
					"userDetails":[
						{
							"githubAddress":"韦桥3号， 绵阳， 甘 383932"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"明.陈",
					"nickName":"dylan.bednar",
					"userAddress":"韦桥3号， 绵阳， 甘 383932",
					"userAge":24,
					"phone":"15711804595",
					"createTime":1609002323037,
					"small":17.50,
					"money":8.90,
					"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
					"telephone":"15711804595"
				}
			},
			"userTreeSet":[
				{
					"userDetails":[
						{
							"githubAddress":"韦桥3号， 绵阳， 甘 383932"
						}
					],
					"userList":[
						{
							"$ref":".."
						}
					],
					"userName":"明.陈",
					"nickName":"dylan.bednar",
					"userAddress":"韦桥3号， 绵阳， 甘 383932",
					"userAge":24,
					"phone":"15711804595",
					"createTime":1609002323037,
					"small":0.08,
					"money":58.47,
					"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
					"telephone":"15711804595"
				}
			],
			"user1":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":88.64,
				"money":88.62,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			}
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"韦桥3号， 绵阳， 甘 383932"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"明.陈",
			"nickName":"dylan.bednar",
			"userAddress":"韦桥3号， 绵阳， 甘 383932",
			"userAge":24,
			"phone":"15711804595",
			"createTime":1609002323037,
			"small":54.82,
			"money":80.93,
			"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
			"telephone":"15711804595"
		},
		"age":24
	}
}
```

### Map&lt;String,Teacher&lt;Map&lt;String,User&gt;,Map&lt;String,User&gt;,Map&lt;String,User&gt;&gt;&gt;超复杂结构
**URL:** http://127.0.0.1:8080/map/test4

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Map&lt;String,Teacher&lt;Map&lt;String,User&gt;,Map&lt;String,User&gt;,Map&lt;String,User&gt;&gt;&gt;超复杂结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/map/test4
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
	"mapKey":{
		"data":{
			"mapKey":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":11.10,
				"money":75.65,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			}
		},
		"data1":{
			"mapKey":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":21.23,
				"money":84.13,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			}
		},
		"data2":{
			"mapKey":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":73.05,
				"money":51.69,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			}
		},
		"age":24
	}
}
```

## 多泛型测试
### 数组
**URL:** http://127.0.0.1:8080/mulGenric/test/

**Type:** POST

**Author:** xingzi  2020/07/08  10:22

**Content-Type:** application/json; charset=utf-8

**Description:** 数组

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
page|object|No comments found.|false|-
└─roleId|int32|角色id|false|-
└─roleName|string|角色名称|false|-
data1|array|No comments found.|false|-
└─total|int32|记录总数|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/mulGenric/test/? --data '{
	"page":{
		"roleId":501,
		"roleName":"明.陈"
	},
	"data1":[
		{
			"total":744
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
data1|array|No comments found.|-
└─concurrentPage|int32|当前页|-
└─pageSize|int32|当前page|-
└─total|int32|记录总数|-

**Response-example:**
```
{
	"page":{
		"roleId":705,
		"roleName":"明.陈"
	},
	"data1":[
		{
			"concurrentPage":1,
			"pageSize":10,
			"total":713
		}
	]
}
```

### gitee #I1S8W验证
**URL:** http://127.0.0.1:8080/mulGenric/test2

**Type:** GET

**Author:** xingzi  2020/07/08  10:22

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** gitee #I1S8W验证

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/mulGenric/test2
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
└─page|object|No comments found.|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─searchCount|boolean|进行 count 查询 【 默认: true 】|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─pages|int64|当前分页总页数|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─hitCount|boolean|是否命中count缓存|3.3.1
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─records|array|分页记录列表|-
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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─total|int64|当前满足条件总行数|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─size|int64|获取每页显示条数|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─current|int64|当前页|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─orders|array|排序字段信息|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─column|string|需要进行排序的字段|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─asc|boolean|是否正序排列，默认 true|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─optimizeCountSql|boolean|自动优化 COUNT SQL|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─isSearchCount|boolean|是否进行 count 查询|-
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
	"success":true,
	"message":"success",
	"data":{
		"page":{
			"searchCount":true,
			"pages":972,
			"hitCount":true,
			"records":[
				{
					"id":"95",
					"createBy":"0agm23",
					"createTime":"2020-12-27",
					"updateBy":"bd6se5",
					"updateTime":"2020-12-27",
					"delFlag":0,
					"username":"明.陈",
					"password":"abfwxk",
					"nickName":"dylan.bednar",
					"mobile":"15525817715",
					"email":"正豪.李@gmail.com",
					"address":"韦桥3号， 绵阳， 甘 383932",
					"sex":0,
					"avatar":"4efb3b",
					"type":16,
					"status":334,
					"description":"64v2bz",
					"roles":[
						{
							"id":"95",
							"createBy":"l1djlb",
							"createTime":"2020-12-27",
							"updateBy":"mmnb5e",
							"updateTime":"2020-12-27",
							"delFlag":0,
							"name":"明.陈",
							"defaultRole":true,
							"permissions":[
								{
									"id":"95",
									"createBy":"4ccz50",
									"createTime":"2020-12-27",
									"updateBy":"j0bg3u",
									"updateTime":"2020-12-27",
									"delFlag":0,
									"name":"明.陈",
									"level":680,
									"type":115,
									"title":"mm9x4i",
									"path":"n0za43",
									"component":"s95evr",
									"icon":"za5b9a",
									"buttonType":"pexbsb",
									"parentId":"95",
									"description":"1oye14",
									"sortOrder":112,
									"status":470,
									"children":[
										{
											"$ref":".."
										}
									],
									"permTypes":[
										"16usea"
									],
									"expand":true,
									"checked":true,
									"selected":true
								}
							]
						}
					],
					"permissions":[
						{
							"id":"95",
							"createBy":"946y2z",
							"createTime":"2020-12-27",
							"updateBy":"a2ibfe",
							"updateTime":"2020-12-27",
							"delFlag":0,
							"name":"明.陈",
							"level":563,
							"type":471,
							"title":"whm9ct",
							"path":"ic7ln7",
							"component":"wkidra",
							"icon":"qe4ajs",
							"buttonType":"pawsvn",
							"parentId":"95",
							"description":"19c86c",
							"sortOrder":508,
							"status":823,
							"children":[
								{
									"$ref":".."
								}
							],
							"permTypes":[
								"drkpfh"
							],
							"expand":true,
							"checked":true,
							"selected":true
						}
					]
				}
			],
			"total":325,
			"size":315,
			"current":296,
			"orders":[
				{
					"column":"hn6inc",
					"asc":true
				}
			],
			"optimizeCountSql":true,
			"isSearchCount":true,
			"countId":"95",
			"maxLimit":1
		},
		"data1":[
			{
				"id":"95",
				"createBy":"u44z65",
				"createTime":"2020-12-27",
				"updateBy":"yhgpih",
				"updateTime":"2020-12-27",
				"delFlag":0,
				"username":"明.陈",
				"password":"kwgwtx",
				"nickName":"dylan.bednar",
				"mobile":"15525817715",
				"email":"正豪.李@gmail.com",
				"address":"韦桥3号， 绵阳， 甘 383932",
				"sex":0,
				"avatar":"f5xany",
				"type":322,
				"status":721,
				"description":"vee0hp",
				"roles":[
					{
						"id":"95",
						"createBy":"v73apu",
						"createTime":"2020-12-27",
						"updateBy":"oxpf01",
						"updateTime":"2020-12-27",
						"delFlag":0,
						"name":"明.陈",
						"defaultRole":true,
						"permissions":[
							{
								"id":"95",
								"createBy":"7qulkk",
								"createTime":"2020-12-27",
								"updateBy":"wbd0ov",
								"updateTime":"2020-12-27",
								"delFlag":0,
								"name":"明.陈",
								"level":56,
								"type":34,
								"title":"9elz8q",
								"path":"6f7t4z",
								"component":"57e1c2",
								"icon":"3dj9nl",
								"buttonType":"zlolqv",
								"parentId":"95",
								"description":"yc7ezj",
								"sortOrder":183,
								"status":763,
								"children":[
									{
										"$ref":".."
									}
								],
								"permTypes":[
									"bqm2bp"
								],
								"expand":true,
								"checked":true,
								"selected":true
							}
						]
					}
				],
				"permissions":[
					{
						"id":"95",
						"createBy":"caxw41",
						"createTime":"2020-12-27",
						"updateBy":"0t4v24",
						"updateTime":"2020-12-27",
						"delFlag":0,
						"name":"明.陈",
						"level":10,
						"type":355,
						"title":"dpga63",
						"path":"85x9v0",
						"component":"xpa7zq",
						"icon":"mvjbmb",
						"buttonType":"rbt068",
						"parentId":"95",
						"description":"ndg2ul",
						"sortOrder":697,
						"status":87,
						"children":[
							{
								"$ref":".."
							}
						],
						"permTypes":[
							"g52z3n"
						],
						"expand":true,
						"checked":true,
						"selected":true
					}
				]
			}
		]
	},
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

## mybatis-plus测试
### mybatis-plus分页类测试
**URL:** http://127.0.0.1:8080/mybatis/plus/page

**Type:** POST

**Author:** yu 2020/6/30.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** mybatis-plus分页类测试

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X POST -H 'token:kk' -i http://127.0.0.1:8080/mybatis/plus/page
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
└─searchCount|boolean|进行 count 查询 【 默认: true 】|-
└─pages|int64|当前分页总页数|-
└─hitCount|boolean|是否命中count缓存|3.3.1
└─records|array|分页记录列表|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─roleId|int32|角色id|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─roleName|string|角色名称|-
└─total|int64|当前满足条件总行数|-
└─size|int64|获取每页显示条数|-
└─current|int64|当前页|-
└─orders|array|排序字段信息|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─column|string|需要进行排序的字段|-
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└─asc|boolean|是否正序排列，默认 true|-
└─optimizeCountSql|boolean|自动优化 COUNT SQL|-
└─isSearchCount|boolean|是否进行 count 查询|-
└─countId|string|countId|-
└─maxLimit|int64|countId|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"searchCount":true,
		"pages":665,
		"hitCount":true,
		"records":[
			{
				"roleId":622,
				"roleName":"明.陈"
			}
		],
		"total":25,
		"size":36,
		"current":215,
		"orders":[
			{
				"column":"xp5rio",
				"asc":true
			}
		],
		"optimizeCountSql":true,
		"isSearchCount":true,
		"countId":"95",
		"maxLimit":209
	},
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

## 数组类型pathVariable
### 接收数组类型pathVariable
**URL:** http://127.0.0.1:8080/pathVariable/test/{id}

**Type:** GET

**Author:** xingzi

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 接收数组类型pathVariable

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|array|No comments found.,[array of string]|true|

**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/pathVariable/test/
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"waring":"You may have used non-display generics."
	},
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

## RequestHeader注解测试
### 测试RequestHeader常规使用
**URL:** http://127.0.0.1:8080/testRequestHeader

**Type:** GET

**Author:** xingzi

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试RequestHeader常规使用

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-
name|string|请求头(name)|true|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
age|int32|  年龄|false|-

**Request-example:**
```
curl -X GET -H 'token:kk' -H 'name' -i http://127.0.0.1:8080/testRequestHeader?age=24
```

**Response-example:**
```
Doesn't return a value.
```

### 测试RequestHeader绑定参数名
**URL:** http://127.0.0.1:8080/testRequestHeader/value

**Type:** GET

**Author:** xingzi

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试RequestHeader绑定参数名

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-
age|int32|  年龄|true|-


**Request-example:**
```
curl -X GET -H 'token:kk' -H 'age' -i http://127.0.0.1:8080/testRequestHeader/value
```

**Response-example:**
```
Doesn't return a value.
```

### 测试RequestHeader绑定默认值
**URL:** http://127.0.0.1:8080/testRequestHeader/DefaultVal

**Type:** GET

**Author:** xingzi

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试RequestHeader绑定默认值

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
age|int32|  年龄|false|-

**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/testRequestHeader/DefaultVal?age=24
```

**Response-example:**
```
Doesn't return a value.
```

## Spring boot params test
### Test Normal param binding
**URL:** http://127.0.0.1:8080/testNormalParams/binding

**Type:** GET

**Author:** yu 2019/9/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Test Normal param binding

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|name|true|-
age|int32| age|false|-

**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/testNormalParams/binding?name=明.陈&age=24
```

**Response-example:**
```
Doesn't return a value.
```

### Test @RequestBody User
**URL:** http://127.0.0.1:8080/testRequestBody

**Type:** POST

**Author:** yu 2019/9/28.

**Content-Type:** application/json; charset=utf-8

**Description:** Test @RequestBody User

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


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
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/testRequestBody? --data '{
	"userDetails":[
		{
			"githubAddress":"韦桥3号， 绵阳， 甘 383932"
		}
	],
	"userList":[
		{
			"$ref":".."
		}
	],
	"userName":"明.陈",
	"nickName":"dylan.bednar",
	"userAddress":"韦桥3号， 绵阳， 甘 383932",
	"userAge":24,
	"phone":"15711804595",
	"createTime":1609002323037,
	"small":31.68,
	"money":65.69,
	"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
	"telephone":"15711804595"
}'
```

**Response-example:**
```
Doesn't return a value.
```

### Test @RequestBody Map
**URL:** http://127.0.0.1:8080/testRequestBodyMap

**Type:** POST

**Author:** yu 2019/9/28.

**Content-Type:** application/json; charset=utf-8

**Description:** Test @RequestBody Map

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


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
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/testRequestBodyMap? --data '{
	"mapKey":{
		"userDetails":[
			{
				"githubAddress":"韦桥3号， 绵阳， 甘 383932"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"明.陈",
		"nickName":"dylan.bednar",
		"userAddress":"韦桥3号， 绵阳， 甘 383932",
		"userAge":24,
		"phone":"15711804595",
		"createTime":1609002323037,
		"small":26.11,
		"money":46.21,
		"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
		"telephone":"15711804595"
	}
}'
```

**Response-example:**
```
Doesn't return a value.
```

### Test @RequestBody List
**URL:** http://127.0.0.1:8080/testRequestBodyList

**Type:** POST

**Author:** yu 2019/9/28.

**Content-Type:** application/json; charset=utf-8

**Description:** Test @RequestBody List

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
ids|array|array of user id,[array of string]|false|

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/testRequestBodyList? --data '[
	"jga9dq",
	"yvmc3w"
]'
```

**Response-example:**
```
Doesn't return a value.
```

### Test Array Params
**URL:** http://127.0.0.1:8080/testArray

**Type:** POST

**Author:** yu 2019/9/28.

**Content-Type:** application/json; charset=utf-8

**Description:** Test Array Params

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
success|boolean|是否成功|false|-
message|string|错误提示(成功succeed)|false|-
data|object|成功返回的数据|false|-
└─dataExpressionEnum|enum|枚举<br/>SENSIRION<br/>|false|-
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
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/testArray? --data '[
	{
		"success":true,
		"message":"success",
		"data":{
			"dataExpressionEnum":"SENSIRION",
			"menuPermissionCodes":[
				"WAIT_PAY"
			],
			"date":"2019-01-01",
			"username":"明.陈",
			"idCard":"811523197205067912",
			"age":24,
			"age2":159
		},
		"code":"6689",
		"timestamp":"2020-12-27 01:05:23"
	}
]'
```

**Response-example:**
```
string
```

### Test @PathVariable
**URL:** http://127.0.0.1:8080/test/{name}/{no}/info

**Type:** GET

**Author:** yu 2019/9/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Test @PathVariable

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|name|true|-
no|string|  no|true|-

**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/test/明.陈/qkpjoe/info
```

**Response-example:**
```
Doesn't return a value.
```

### Test @RequestParam
**URL:** http://127.0.0.1:8080/testRequestParam

**Type:** GET

**Author:** yu 2019/9/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Test @RequestParam

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
author|string|author|true|-
type|string|  type|true|-

**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/testRequestParam?type=bvjp69&author=詹姆斯
```

**Response-example:**
```
Doesn't return a value.
```

### Test @RequestParam with value
**URL:** http://127.0.0.1:8080/testRequestParamWithValue

**Type:** GET

**Author:** yu 2019/9/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Use@RequestParam binding value is name,but method param name is userName

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|user name|true|-

**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/testRequestParamWithValue?name=明.陈
```

**Response-example:**
```
Doesn't return a value.
```

### Test @RequestParam with default value
**URL:** http://127.0.0.1:8080/testRequestParamWithDefaultVal

**Type:** GET

**Author:** yu 2019/9/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Use@RequestParam binding default value Jordan

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userName|string|user name|true|-

**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/testRequestParamWithDefaultVal?userName=Jordan
```

**Response-example:**
```
Doesn't return a value.
```

### Test much path
**URL:** http://127.0.0.1:8080/testMuchPath/get/{userId};	http://127.0.0.1:8080/testMuchPath/find/{userId}

**Type:** GET

**Author:** yu 2019/9/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** giteeissues #I1545A

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|int64|userId|true|-

**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/testMuchPath/get/767
```

**Response-example:**
```
Doesn't return a value.
```

### Test much path much parameter
**URL:** http://127.0.0.1:8080/get/{deptId}/{userId};	http://127.0.0.1:8080/find/{deptId}/{userId}

**Type:** POST

**Author:** yu 2019/9/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Test much path much parameter

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Path-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|int64|userId|true|-
deptId|int64|deptId|true|-

**Request-example:**
```
curl -X POST -H 'token:kk' -i http://127.0.0.1:8080/get/859/862
```

**Response-example:**
```
Doesn't return a value.
```

### Test Constants
**URL:** http://127.0.0.1:8080/testConstants

**Type:** GET

**Author:** yu 2019/9/28.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Test Constants

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
page|int32|页码|false|-

**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/testConstants?page=0
```

**Response-example:**
```
Doesn't return a value.
```

## 请求类型测试
### 测试GetMapping 无参数
**URL:** http://127.0.0.1:8080/getMapping1

**Type:** GET

**Author:** zhangsan, wangwu

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试GetMapping 无参数

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/getMapping1
```

**Response-example:**
```
Doesn't return a value.
```

### 测试PostMapping 无参数
**URL:** http://127.0.0.1:8080/PostMapping1

**Type:** POST

**Author:** songhaozhi

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试PostMapping 无参数

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X POST -H 'token:kk' -i http://127.0.0.1:8080/PostMapping1
```

**Response-example:**
```
Doesn't return a value.
```

### 测试PutMapping 无参数
**URL:** http://127.0.0.1:8080/PutMapping1

**Type:** PUT

**Author:** songhaozhi,test

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试PutMapping 无参数

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X PUT -H 'token:kk' -i http://127.0.0.1:8080/PutMapping1
```

**Response-example:**
```
Doesn't return a value.
```

### DeleteMapping 无参数
**URL:** http://127.0.0.1:8080/DeleteMapping1

**Type:** DELETE

**Author:** songhaozhi,test

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** DeleteMapping 无参数

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X DELETE -H 'token:kk' -i http://127.0.0.1:8080/DeleteMapping1
```

**Response-example:**
```
Doesn't return a value.
```

### 测试GetMapping
**URL:** http://127.0.0.1:8080/getMapping

**Type:** GET

**Author:** songhaozhi,test

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试GetMapping

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|int64|userId|true|-

**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/getMapping?userId=703
```

**Response-example:**
```
Doesn't return a value.
```

### 测试PostMapping json
**URL:** http://127.0.0.1:8080/postMapping

**Type:** POST

**Author:** songhaozhi,test

**Content-Type:** application/json; charset=utf-8

**Description:** 测试PostMapping json

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


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
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/postMapping? --data '{
	"id":"95",
	"createBy":"i6o7o4",
	"createTime":"2020-12-27",
	"updateBy":"o9g3hx",
	"updateTime":"2020-12-27",
	"delFlag":0,
	"username":"明.陈",
	"password":"vrgam3",
	"nickName":"dylan.bednar",
	"mobile":"15525817715",
	"email":"正豪.李@gmail.com",
	"address":"韦桥3号， 绵阳， 甘 383932",
	"sex":0,
	"avatar":"19u4zn",
	"type":501,
	"status":494,
	"description":"u4tva3",
	"roles":[
		{
			"id":"95",
			"createBy":"jjh2v7",
			"createTime":"2020-12-27",
			"updateBy":"1o7ffa",
			"updateTime":"2020-12-27",
			"delFlag":0,
			"name":"明.陈",
			"defaultRole":true,
			"permissions":[
				{
					"id":"95",
					"createBy":"eask81",
					"createTime":"2020-12-27",
					"updateBy":"mvosog",
					"updateTime":"2020-12-27",
					"delFlag":0,
					"name":"明.陈",
					"level":726,
					"type":933,
					"title":"cmn729",
					"path":"b3q7ye",
					"component":"f4vfr3",
					"icon":"lnqjbn",
					"buttonType":"2o4qp8",
					"parentId":"95",
					"description":"ff2u4y",
					"sortOrder":233,
					"status":372,
					"children":[
						{
							"$ref":".."
						}
					],
					"permTypes":[
						"es4xw1"
					],
					"expand":true,
					"checked":true,
					"selected":true
				}
			]
		}
	],
	"permissions":[
		{
			"id":"95",
			"createBy":"exngna",
			"createTime":"2020-12-27",
			"updateBy":"5qi409",
			"updateTime":"2020-12-27",
			"delFlag":0,
			"name":"明.陈",
			"level":117,
			"type":235,
			"title":"278upc",
			"path":"fyc8bj",
			"component":"8vzmzc",
			"icon":"ipvtm8",
			"buttonType":"ulwmdy",
			"parentId":"95",
			"description":"kum2i2",
			"sortOrder":799,
			"status":159,
			"children":[
				{
					"$ref":".."
				}
			],
			"permTypes":[
				"kfjmcr"
			],
			"expand":true,
			"checked":true,
			"selected":true
		}
	]
}'
```

**Response-example:**
```
Doesn't return a value.
```

### 测试PostMapping表单
**URL:** http://127.0.0.1:8080/postMapping2

**Type:** POST

**Author:** songhaozhi,test

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试PostMapping表单

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


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
curl -X POST -H 'token:kk' -i http://127.0.0.1:8080/postMapping2 --data 'roles[0].permissions[0].status=717&roles[0].id=95&permissions[0].path=8vs3lz&permissions[0].selected=true&permissions[0].sortOrder=595&roles[0].permissions[0].sortOrder=904&address=韦桥3号， 绵阳， 甘 383932&createBy=30fk5l&permissions[0].status=205&updateBy=cv7cgz&permissions[0].type=281&mobile=15525817715&permissions[0].parentId=95&roles[0].permissions[0].updateTime=2020-12-27&permissions[0].createBy=8yxswi&permissions[0].delFlag=0&roles[0].permissions[0].name=明.陈&permissions[0].description=jen9u0&nickName=dylan.bednar&roles[0].permissions[0].level=508&permissions[0].updateBy=wxljen&roles[0].updateTime=2020-12-27&permissions[0].title=fdpcbe&roles[0].permissions[0].icon=v13rlj&status=303&description=vbb9j3&permissions[0].name=明.陈&roles[0].createBy=h0fr7y&avatar=hqpb8m&roles[0].permissions[0].expand=true&roles[0].permissions[0].description=d1mkd3&roles[0].permissions[0].type=451&username=明.陈&email=正豪.李@gmail.com&roles[0].permissions[0].selected=true&permissions[0].level=498&roles[0].permissions[0].delFlag=0&roles[0].permissions[0].title=sn5ge3&permissions[0].component=2vvtt7&id=95&roles[0].updateBy=ytu5xf&roles[0].permissions[0].createTime=2020-12-27&roles[0].permissions[0].checked=true&updateTime=2020-12-27&permissions[0].buttonType=1q11n2&permissions[0].checked=true&roles[0].permissions[0].component=n9049r&roles[0].createTime=2020-12-27&createTime=2020-12-27&roles[0].permissions[0].parentId=95&permissions[0].expand=true&roles[0].permissions[0].updateBy=pa3i55&roles[0].defaultRole=true&type=6&roles[0].delFlag=0&permissions[0].id=95&delFlag=0&roles[0].permissions[0].createBy=jt8jhj&permissions[0].icon=fg7ig1&permissions[0].createTime=2020-12-27&permissions[0].updateTime=2020-12-27&roles[0].permissions[0].buttonType=h2droe&roles[0].permissions[0].id=95&roles[0].name=明.陈&roles[0].permissions[0].path=29b92k&password=1veike&sex=0'
```

**Response-example:**
```
Doesn't return a value.
```

### 测试PutMapping json
**URL:** http://127.0.0.1:8080/putMapping

**Type:** PUT

**Author:** songhaozhi,test

**Content-Type:** application/json; charset=utf-8

**Description:** 测试PutMapping json

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


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
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/putMapping? --data '{
	"id":"95",
	"createBy":"uh0vd0",
	"createTime":"2020-12-27",
	"updateBy":"ucjyq9",
	"updateTime":"2020-12-27",
	"delFlag":0,
	"username":"明.陈",
	"password":"h1ha5a",
	"nickName":"dylan.bednar",
	"mobile":"15525817715",
	"email":"正豪.李@gmail.com",
	"address":"韦桥3号， 绵阳， 甘 383932",
	"sex":0,
	"avatar":"jwdaqv",
	"type":109,
	"status":888,
	"description":"89q2tt",
	"roles":[
		{
			"id":"95",
			"createBy":"6y1eol",
			"createTime":"2020-12-27",
			"updateBy":"p3mwuc",
			"updateTime":"2020-12-27",
			"delFlag":0,
			"name":"明.陈",
			"defaultRole":true,
			"permissions":[
				{
					"id":"95",
					"createBy":"eosbmc",
					"createTime":"2020-12-27",
					"updateBy":"60oxi2",
					"updateTime":"2020-12-27",
					"delFlag":0,
					"name":"明.陈",
					"level":969,
					"type":293,
					"title":"mw25zd",
					"path":"tu21ro",
					"component":"1g46ww",
					"icon":"79hqwb",
					"buttonType":"bu3hmu",
					"parentId":"95",
					"description":"lfwqs6",
					"sortOrder":485,
					"status":863,
					"children":[
						{
							"$ref":".."
						}
					],
					"permTypes":[
						"whgb1p"
					],
					"expand":true,
					"checked":true,
					"selected":true
				}
			]
		}
	],
	"permissions":[
		{
			"id":"95",
			"createBy":"xnfcfs",
			"createTime":"2020-12-27",
			"updateBy":"sx71rv",
			"updateTime":"2020-12-27",
			"delFlag":0,
			"name":"明.陈",
			"level":607,
			"type":643,
			"title":"g8cldg",
			"path":"1hpjbn",
			"component":"kn5om3",
			"icon":"ej1ybt",
			"buttonType":"dcqqzo",
			"parentId":"95",
			"description":"uqqygc",
			"sortOrder":496,
			"status":610,
			"children":[
				{
					"$ref":".."
				}
			],
			"permTypes":[
				"h8cgrh"
			],
			"expand":true,
			"checked":true,
			"selected":true
		}
	]
}'
```

**Response-example:**
```
Doesn't return a value.
```

### 测试PutMapping表单
**URL:** http://127.0.0.1:8080/putMapping2

**Type:** PUT

**Author:** songhaozhi,test

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试PutMapping表单

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


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
curl -X PUT -H 'token:kk' -i http://127.0.0.1:8080/putMapping2 --data 'roles[0].permissions[0].component=xihu0r&roles[0].permissions[0].type=644&permissions[0].checked=true&permissions[0].type=56&roles[0].createBy=93k2p8&roles[0].createTime=2020-12-27&delFlag=0&updateBy=xn22nz&roles[0].name=明.陈&roles[0].updateTime=2020-12-27&password=ojdtg0&roles[0].permissions[0].createBy=4n2qoa&roles[0].permissions[0].buttonType=zy2h2v&sex=0&permissions[0].icon=a2nlgz&permissions[0].description=mry7ch&roles[0].permissions[0].delFlag=0&roles[0].permissions[0].icon=rbfj3h&permissions[0].name=明.陈&permissions[0].sortOrder=581&address=韦桥3号， 绵阳， 甘 383932&permissions[0].selected=true&roles[0].permissions[0].updateBy=u2yuyj&updateTime=2020-12-27&avatar=i8d6zg&roles[0].permissions[0].updateTime=2020-12-27&email=正豪.李@gmail.com&roles[0].id=95&permissions[0].createBy=lrbrb7&createTime=2020-12-27&roles[0].delFlag=0&description=v8ah54&roles[0].permissions[0].level=13&roles[0].permissions[0].status=848&permissions[0].createTime=2020-12-27&permissions[0].expand=true&permissions[0].title=l7umx8&permissions[0].id=95&permissions[0].updateTime=2020-12-27&permissions[0].updateBy=54fx4t&roles[0].defaultRole=true&roles[0].permissions[0].description=e25i99&permissions[0].status=902&username=明.陈&createBy=sm1ndf&mobile=15525817715&roles[0].permissions[0].createTime=2020-12-27&roles[0].permissions[0].name=明.陈&roles[0].permissions[0].path=gfncry&roles[0].permissions[0].title=txvesm&type=281&permissions[0].level=603&roles[0].permissions[0].checked=true&permissions[0].parentId=95&status=435&roles[0].permissions[0].sortOrder=583&permissions[0].component=eaw0sw&roles[0].permissions[0].parentId=95&roles[0].permissions[0].expand=true&permissions[0].buttonType=ov6psr&roles[0].updateBy=rv6okq&roles[0].permissions[0].id=95&nickName=dylan.bednar&roles[0].permissions[0].selected=true&permissions[0].delFlag=0&permissions[0].path=md43qd&id=95'
```

**Response-example:**
```
Doesn't return a value.
```

### 测试DeleteMapping
**URL:** http://127.0.0.1:8080/deleteMapping

**Type:** DELETE

**Author:** songhaozhi,test

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试DeleteMapping

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
userId|int64|userId|true|-

**Request-example:**
```
curl -X DELETE -H 'token:kk' -i http://127.0.0.1:8080/deleteMapping?userId=362
```

**Response-example:**
```
Doesn't return a value.
```

## Test ResponseEntity
### ResponseEntity return List
**URL:** http://127.0.0.1:8080/responseEntity/list

**Type:** GET

**Author:** yu 2019/10/19.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** ResponseEntity return List

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/responseEntity/list
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
		"userDetails":[
			{
				"githubAddress":"韦桥3号， 绵阳， 甘 383932"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"明.陈",
		"nickName":"dylan.bednar",
		"userAddress":"韦桥3号， 绵阳， 甘 383932",
		"userAge":24,
		"phone":"15711804595",
		"createTime":1609002323037,
		"small":78.08,
		"money":20.54,
		"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
		"telephone":"15711804595"
	}
]
```

## 普通java对象api文档测试
### 返回普通String测试
**URL:** http://127.0.0.1:8080/simple/str

**Type:** GET

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回普通String测试

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/simple/str
```

**Response-example:**
```
string
```

### 返回普通javabean
**URL:** http://127.0.0.1:8080/simple/user

**Type:** POST

**Author:** yu 2018/06/27.

**Content-Type:** application/json; charset=utf-8

**Description:** 返回普通javabean

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


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
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/simple/user? --data '{
	"userDetails":[
		{
			"githubAddress":"韦桥3号， 绵阳， 甘 383932"
		}
	],
	"userList":[
		{
			"$ref":".."
		}
	],
	"userName":"明.陈",
	"nickName":"dylan.bednar",
	"userAddress":"韦桥3号， 绵阳， 甘 383932",
	"userAge":24,
	"phone":"15711804595",
	"createTime":1609002323037,
	"small":13.39,
	"money":28.39,
	"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
	"telephone":"15711804595"
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
	"userDetails":[
		{
			"githubAddress":"韦桥3号， 绵阳， 甘 383932"
		}
	],
	"userList":[
		{
			"$ref":".."
		}
	],
	"userName":"明.陈",
	"nickName":"dylan.bednar",
	"userAddress":"韦桥3号， 绵阳， 甘 383932",
	"userAge":24,
	"phone":"15711804595",
	"createTime":1609002323037,
	"small":89.63,
	"money":13.90,
	"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
	"telephone":"15711804595"
}
```

### 返回复杂实体数据
**URL:** http://127.0.0.1:8080/simple/stu

**Type:** POST

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回复杂实体数据

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X POST -H 'token:kk' -i http://127.0.0.1:8080/simple/stu
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
	"stuName":"明.陈",
	"stuAge":true,
	"stuAddress":"韦桥3号， 绵阳， 甘 383932",
	"user":{
		"userDetails":[
			{
				"githubAddress":"韦桥3号， 绵阳， 甘 383932"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"明.陈",
		"nickName":"dylan.bednar",
		"userAddress":"韦桥3号， 绵阳， 甘 383932",
		"userAge":24,
		"phone":"15711804595",
		"createTime":1609002323037,
		"small":90.83,
		"money":96.38,
		"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
		"telephone":"15711804595"
	},
	"userMap":{
		"mapKey":{
			"userDetails":[
				{
					"githubAddress":"韦桥3号， 绵阳， 甘 383932"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"明.陈",
			"nickName":"dylan.bednar",
			"userAddress":"韦桥3号， 绵阳， 甘 383932",
			"userAge":24,
			"phone":"15711804595",
			"createTime":1609002323037,
			"small":23.84,
			"money":75.50,
			"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
			"telephone":"15711804595"
		}
	},
	"userTreeSet":[
		{
			"userDetails":[
				{
					"githubAddress":"韦桥3号， 绵阳， 甘 383932"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"明.陈",
			"nickName":"dylan.bednar",
			"userAddress":"韦桥3号， 绵阳， 甘 383932",
			"userAge":24,
			"phone":"15711804595",
			"createTime":1609002323037,
			"small":49.56,
			"money":95.09,
			"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
			"telephone":"15711804595"
		}
	],
	"user1":{
		"userDetails":[
			{
				"githubAddress":"韦桥3号， 绵阳， 甘 383932"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"明.陈",
		"nickName":"dylan.bednar",
		"userAddress":"韦桥3号， 绵阳， 甘 383932",
		"userAge":24,
		"phone":"15711804595",
		"createTime":1609002323037,
		"small":12.76,
		"money":2.14,
		"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
		"telephone":"15711804595"
	}
}
```

### Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;结构
**URL:** http://127.0.0.1:8080/simple/teacher

**Type:** POST

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;结构

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X POST -H 'token:kk' -i http://127.0.0.1:8080/simple/teacher
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
	"data":{
		"data":{
			"userDetails":[
				{
					"githubAddress":"韦桥3号， 绵阳， 甘 383932"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"明.陈",
			"nickName":"dylan.bednar",
			"userAddress":"韦桥3号， 绵阳， 甘 383932",
			"userAge":24,
			"phone":"15711804595",
			"createTime":1609002323037,
			"small":69.13,
			"money":6.89,
			"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
			"telephone":"15711804595"
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"韦桥3号， 绵阳， 甘 383932"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"明.陈",
			"nickName":"dylan.bednar",
			"userAddress":"韦桥3号， 绵阳， 甘 383932",
			"userAge":24,
			"phone":"15711804595",
			"createTime":1609002323037,
			"small":82.10,
			"money":39.81,
			"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
			"telephone":"15711804595"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"韦桥3号， 绵阳， 甘 383932"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"明.陈",
			"nickName":"dylan.bednar",
			"userAddress":"韦桥3号， 绵阳， 甘 383932",
			"userAge":24,
			"phone":"15711804595",
			"createTime":1609002323037,
			"small":78.32,
			"money":5.39,
			"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
			"telephone":"15711804595"
		},
		"age":24
	},
	"data1":{
		"data":{
			"userDetails":[
				{
					"githubAddress":"韦桥3号， 绵阳， 甘 383932"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"明.陈",
			"nickName":"dylan.bednar",
			"userAddress":"韦桥3号， 绵阳， 甘 383932",
			"userAge":24,
			"phone":"15711804595",
			"createTime":1609002323037,
			"small":6.26,
			"money":17.18,
			"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
			"telephone":"15711804595"
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"韦桥3号， 绵阳， 甘 383932"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"明.陈",
			"nickName":"dylan.bednar",
			"userAddress":"韦桥3号， 绵阳， 甘 383932",
			"userAge":24,
			"phone":"15711804595",
			"createTime":1609002323037,
			"small":46.61,
			"money":77.63,
			"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
			"telephone":"15711804595"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"韦桥3号， 绵阳， 甘 383932"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"明.陈",
			"nickName":"dylan.bednar",
			"userAddress":"韦桥3号， 绵阳， 甘 383932",
			"userAge":24,
			"phone":"15711804595",
			"createTime":1609002323037,
			"small":3.74,
			"money":28.59,
			"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
			"telephone":"15711804595"
		},
		"age":24
	},
	"data2":{
		"data":{
			"userDetails":[
				{
					"githubAddress":"韦桥3号， 绵阳， 甘 383932"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"明.陈",
			"nickName":"dylan.bednar",
			"userAddress":"韦桥3号， 绵阳， 甘 383932",
			"userAge":24,
			"phone":"15711804595",
			"createTime":1609002323037,
			"small":6.02,
			"money":36.24,
			"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
			"telephone":"15711804595"
		},
		"data1":{
			"userDetails":[
				{
					"githubAddress":"韦桥3号， 绵阳， 甘 383932"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"明.陈",
			"nickName":"dylan.bednar",
			"userAddress":"韦桥3号， 绵阳， 甘 383932",
			"userAge":24,
			"phone":"15711804595",
			"createTime":1609002323037,
			"small":21.15,
			"money":58.18,
			"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
			"telephone":"15711804595"
		},
		"data2":{
			"userDetails":[
				{
					"githubAddress":"韦桥3号， 绵阳， 甘 383932"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"明.陈",
			"nickName":"dylan.bednar",
			"userAddress":"韦桥3号， 绵阳， 甘 383932",
			"userAge":24,
			"phone":"15711804595",
			"createTime":1609002323037,
			"small":45.96,
			"money":34.38,
			"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
			"telephone":"15711804595"
		},
		"age":24
	},
	"age":24
}
```

### Teacher&lt;List&lt;User&gt;, User, Student&gt;
**URL:** http://127.0.0.1:8080/simple/teacher2

**Type:** POST

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** Teacher&lt;List&lt;User&gt;, User, Student&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X POST -H 'token:kk' -i http://127.0.0.1:8080/simple/teacher2
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
	"data":[
		{
			"userDetails":[
				{
					"githubAddress":"韦桥3号， 绵阳， 甘 383932"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"明.陈",
			"nickName":"dylan.bednar",
			"userAddress":"韦桥3号， 绵阳， 甘 383932",
			"userAge":24,
			"phone":"15711804595",
			"createTime":1609002323037,
			"small":90.71,
			"money":29.36,
			"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
			"telephone":"15711804595"
		}
	],
	"data1":{
		"stuName":"明.陈",
		"stuAge":true,
		"stuAddress":"韦桥3号， 绵阳， 甘 383932",
		"user":{
			"userDetails":[
				{
					"githubAddress":"韦桥3号， 绵阳， 甘 383932"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"明.陈",
			"nickName":"dylan.bednar",
			"userAddress":"韦桥3号， 绵阳， 甘 383932",
			"userAge":24,
			"phone":"15711804595",
			"createTime":1609002323037,
			"small":51.34,
			"money":10.68,
			"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
			"telephone":"15711804595"
		},
		"userMap":{
			"mapKey":{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":10.91,
				"money":50.16,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			}
		},
		"userTreeSet":[
			{
				"userDetails":[
					{
						"githubAddress":"韦桥3号， 绵阳， 甘 383932"
					}
				],
				"userList":[
					{
						"$ref":".."
					}
				],
				"userName":"明.陈",
				"nickName":"dylan.bednar",
				"userAddress":"韦桥3号， 绵阳， 甘 383932",
				"userAge":24,
				"phone":"15711804595",
				"createTime":1609002323037,
				"small":84.28,
				"money":83.32,
				"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
				"telephone":"15711804595"
			}
		],
		"user1":{
			"userDetails":[
				{
					"githubAddress":"韦桥3号， 绵阳， 甘 383932"
				}
			],
			"userList":[
				{
					"$ref":".."
				}
			],
			"userName":"明.陈",
			"nickName":"dylan.bednar",
			"userAddress":"韦桥3号， 绵阳， 甘 383932",
			"userAge":24,
			"phone":"15711804595",
			"createTime":1609002323037,
			"small":57.95,
			"money":57.51,
			"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
			"telephone":"15711804595"
		}
	},
	"data2":{
		"userDetails":[
			{
				"githubAddress":"韦桥3号， 绵阳， 甘 383932"
			}
		],
		"userList":[
			{
				"$ref":".."
			}
		],
		"userName":"明.陈",
		"nickName":"dylan.bednar",
		"userAddress":"韦桥3号， 绵阳， 甘 383932",
		"userAge":24,
		"phone":"15711804595",
		"createTime":1609002323037,
		"small":61.23,
		"money":14.50,
		"ipv6":"173c:44f1:337b:18c4:8d4e:e865:dff3:34d3",
		"telephone":"15711804595"
	},
	"age":24
}
```

### 测试SubUser
**URL:** http://127.0.0.1:8080/simple/subUser

**Type:** POST

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试SubUser

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X POST -H 'token:kk' -i http://127.0.0.1:8080/simple/subUser
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
subUserName|string|用户名称|-
numbers|number|bigInteger|-

**Response-example:**
```
{
	"subUserName":"张三",
	"numbers":156
}
```

### 返回CommonResult&lt;SubUser&gt;
**URL:** http://127.0.0.1:8080/simple/subUser/result

**Type:** POST

**Author:** yu 2018/06/27.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回CommonResult&lt;SubUser&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X POST -H 'token:kk' -i http://127.0.0.1:8080/simple/subUser/result
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
└─subUserName|string|用户名称|-
└─numbers|number|bigInteger|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"subUserName":"张三",
		"numbers":773
	},
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

## 简单对象测试2
### CommonResult&lt;String&gt;
**URL:** http://127.0.0.1:8080/stringCommonResult

**Type:** POST

**Author:** yu 2018/06/30.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** CommonResult&lt;String&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X POST -H 'token:kk' -i http://127.0.0.1:8080/stringCommonResult
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"nlcssn",
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

### 返回Staff&lt;Staff&lt;Staff&gt;&gt;
**URL:** http://127.0.0.1:8080/staff

**Type:** POST

**Author:** yu 2018/06/30.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回Staff&lt;Staff&lt;Staff&gt;&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X POST -H 'token:kk' -i http://127.0.0.1:8080/staff
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
	"name":"明.陈",
	"annyObject":{
		"name":"明.陈",
		"annyObject":{
			"$ref":"..."
		},
		"data":[
			{
				"$ref":".."
			}
		]
	},
	"data":[
		{
			"name":"明.陈",
			"annyObject":{
				"$ref":"..."
			},
			"data":[
				{
					"$ref":".."
				}
			]
		}
	]
}
```

### 返回Staff&lt;String&gt;
**URL:** http://127.0.0.1:8080/staffStr

**Type:** POST

**Author:** yu 2018/06/30.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 返回Staff&lt;String&gt;

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X POST -H 'token:kk' -i http://127.0.0.1:8080/staffStr
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
	"name":"明.陈",
	"annyObject":"rd6s1u",
	"data":[
		"krqbyc"
	]
}
```

### JAVA继承测试
**URL:** http://127.0.0.1:8080/children

**Type:** POST

**Author:** yu 2018/06/30.

**Content-Type:** application/json; charset=utf-8

**Description:** JAVA继承测试

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
age|int32|No comments found.|false|-
name|string|姓名|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/children? --data '{
	"age":24,
	"name":"明.陈"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
age|int32|No comments found.|-
name|string|姓名|-

**Response-example:**
```
{
	"age":24,
	"name":"明.陈"
}
```

## 注释tag用例
### ~~测试apiNote tag~~
**URL:** http://127.0.0.1:8080/tags/apiNote

**Type:** POST

**Author:** cht

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** This method returns a List instead of a Collection or Stream,because processing of multiple Wombats usually involves traversing<br>the list in alternating forward and reverse directions.

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
user|array|No comments found.,[array of string]|false|

**Request-example:**
```
curl -X POST -H 'token:kk' -i http://127.0.0.1:8080/tags/apiNote --data 'user=l7uwul&user=l7uwul'
```

**Response-example:**
```
string
```

### 自定义mock tag获取mock值
**URL:** http://127.0.0.1:8080/tags/mock

**Type:** POST

**Author:** yu 2020/7/2.

**Content-Type:** application/json; charset=utf-8

**Description:** 自定义mock tag获取mock值

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
subUserName|string|用户名称|true|-
numbers|number|bigInteger|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/tags/mock? --data '{
	"subUserName":"张三",
	"numbers":862
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
└─MAX_SPEED|int32|No comments found.|-
└─simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|-
└─username|string|用户名|v1.0
└─password|string|密码|v1.0
└─nickName|string|昵称|v1.0
└─mobile|string|电话|v1.0
└─gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"MAX_SPEED":667,
		"simpleEnum":"RED",
		"username":"明.陈",
		"password":"1ap3cw",
		"nickName":"dylan.bednar",
		"mobile":"15525817715",
		"gender":0
	},
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

### 测试@ignore tag
**URL:** http://127.0.0.1:8080/tags/ignore

**Type:** GET

**Author:** yu 2020/7/2.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** 测试@ignore tag

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
total|int32|记录总数|false|-

**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/tags/ignore?total=799
```

**Response-example:**
```
string
```

## 用户信息操作接口
### 添加用户
**URL:** http://127.0.0.1:8080/user/add

**Type:** POST

**Author:** yu 2018/8/4.

**Content-Type:** application/json; charset=utf-8

**Description:** 添加用户

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
MAX_SPEED|int32|No comments found.|false|-
simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|false|-
username|string|用户名|true|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/user/add? --data '{
	"MAX_SPEED":77,
	"simpleEnum":"RED",
	"username":"明.陈",
	"password":"6g5d6i",
	"nickName":"dylan.bednar",
	"mobile":"15525817715",
	"gender":0
}'
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
	"id":"95",
	"createBy":"49hdy8",
	"createTime":"2020-12-27",
	"updateBy":"th78rz",
	"updateTime":"2020-12-27",
	"delFlag":0,
	"username":"明.陈",
	"password":"sps4us",
	"nickName":"dylan.bednar",
	"mobile":"15525817715",
	"email":"正豪.李@gmail.com",
	"address":"韦桥3号， 绵阳， 甘 383932",
	"sex":0,
	"avatar":"iwo66t",
	"type":933,
	"status":318,
	"description":"0qmrjr",
	"roles":[
		{
			"id":"95",
			"createBy":"izb4cm",
			"createTime":"2020-12-27",
			"updateBy":"xib7wy",
			"updateTime":"2020-12-27",
			"delFlag":0,
			"name":"明.陈",
			"defaultRole":true,
			"permissions":[
				{
					"id":"95",
					"createBy":"1kvpxx",
					"createTime":"2020-12-27",
					"updateBy":"odbedv",
					"updateTime":"2020-12-27",
					"delFlag":0,
					"name":"明.陈",
					"level":533,
					"type":39,
					"title":"ypam1v",
					"path":"v4ylqe",
					"component":"3ldelb",
					"icon":"n5al4g",
					"buttonType":"um4v4b",
					"parentId":"95",
					"description":"59dm3r",
					"sortOrder":483,
					"status":688,
					"children":[
						{
							"$ref":".."
						}
					],
					"permTypes":[
						"eq7bmo"
					],
					"expand":true,
					"checked":true,
					"selected":true
				}
			]
		}
	],
	"permissions":[
		{
			"id":"95",
			"createBy":"4f4zof",
			"createTime":"2020-12-27",
			"updateBy":"ta3uod",
			"updateTime":"2020-12-27",
			"delFlag":0,
			"name":"明.陈",
			"level":665,
			"type":697,
			"title":"1kztl7",
			"path":"anexya",
			"component":"zb6cqp",
			"icon":"fva4yr",
			"buttonType":"jf1p8f",
			"parentId":"95",
			"description":"dh4pze",
			"sortOrder":968,
			"status":626,
			"children":[
				{
					"$ref":".."
				}
			],
			"permTypes":[
				"y2w1wl"
			],
			"expand":true,
			"checked":true,
			"selected":true
		}
	]
}
```

### 更新用户
**URL:** http://127.0.0.1:8080/user/update

**Type:** PUT

**Author:** yu 2018/8/4.

**Content-Type:** application/json; charset=utf-8

**Description:** 更新用户

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
MAX_SPEED|int32|No comments found.|false|-
simpleEnum|enum|简单枚举<br/>RED<br/>BLUE<br/>|false|-
username|string|用户名|true|v1.0
password|string|密码|false|v1.0
nickName|string|昵称|false|v1.0
mobile|string|电话|false|v1.0
gender|enum|性别<br/>WOMAN -(0,"女人")<br/>MAN -(2,"男人")<br/>|false|-

**Request-example:**
```
curl -X PUT -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/user/update? --data '{
	"MAX_SPEED":607,
	"simpleEnum":"RED",
	"username":"明.陈",
	"password":"l8nvft",
	"nickName":"dylan.bednar",
	"mobile":"15525817715",
	"gender":0
}'
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
	"id":"95",
	"createBy":"50y7h5",
	"createTime":"2020-12-27",
	"updateBy":"r01kv5",
	"updateTime":"2020-12-27",
	"delFlag":0,
	"username":"明.陈",
	"password":"40is4q",
	"nickName":"dylan.bednar",
	"mobile":"15525817715",
	"email":"正豪.李@gmail.com",
	"address":"韦桥3号， 绵阳， 甘 383932",
	"sex":0,
	"avatar":"9uaetu",
	"type":562,
	"status":537,
	"description":"z0x46e",
	"roles":[
		{
			"id":"95",
			"createBy":"pgzpfd",
			"createTime":"2020-12-27",
			"updateBy":"qve5h9",
			"updateTime":"2020-12-27",
			"delFlag":0,
			"name":"明.陈",
			"defaultRole":true,
			"permissions":[
				{
					"id":"95",
					"createBy":"cyecg5",
					"createTime":"2020-12-27",
					"updateBy":"aacudn",
					"updateTime":"2020-12-27",
					"delFlag":0,
					"name":"明.陈",
					"level":425,
					"type":152,
					"title":"uqgt8i",
					"path":"eand1y",
					"component":"wkuy7x",
					"icon":"gmr2zz",
					"buttonType":"936oro",
					"parentId":"95",
					"description":"a2c8p1",
					"sortOrder":922,
					"status":101,
					"children":[
						{
							"$ref":".."
						}
					],
					"permTypes":[
						"t3en0b"
					],
					"expand":true,
					"checked":true,
					"selected":true
				}
			]
		}
	],
	"permissions":[
		{
			"id":"95",
			"createBy":"2dlehk",
			"createTime":"2020-12-27",
			"updateBy":"nw4eru",
			"updateTime":"2020-12-27",
			"delFlag":0,
			"name":"明.陈",
			"level":615,
			"type":34,
			"title":"49efa3",
			"path":"c56hbr",
			"component":"6dvwel",
			"icon":"7gz2b6",
			"buttonType":"x3aky2",
			"parentId":"95",
			"description":"ai6h2a",
			"sortOrder":56,
			"status":739,
			"children":[
				{
					"$ref":".."
				}
			],
			"permTypes":[
				"1qhppn"
			],
			"expand":true,
			"checked":true,
			"selected":true
		}
	]
}
```

## JSR303参数验证规范测试
### 验证validate
**URL:** http://127.0.0.1:8080/validator/test

**Type:** POST

**Author:** yu 2018/06/28.

**Content-Type:** application/json; charset=utf-8

**Description:** 验证validate

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|true|-
birthday|string|生日|true|-
age|int32|年龄|false|-
subject|object|科目|true|-
└─subjectName|string|科目名称|true|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/validator/test? --data '{
	"name":"明.陈",
	"birthday":"2020-12-27",
	"age":24,
	"subject":{
		"subjectName":"明.陈"
	}
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"waring":"You may have used non-display generics."
	},
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

### 验证通用参数
**URL:** http://127.0.0.1:8080/validator/valid

**Type:** POST

**Author:** yu 2018/06/28.

**Content-Type:** application/json; charset=utf-8

**Description:** 验证通用参数

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


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
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/validator/valid? --data '{
	"token":"eyj0bd",
	"sequenceNo":"ytz9lp",
	"parameter":{
		"subUserName":"张三",
		"numbers":160
	}
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"waring":"You may have used non-display generics."
	},
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

### 分组验证1
**URL:** http://127.0.0.1:8080/validator/save

**Type:** POST

**Author:** yu 2018/06/28.

**Content-Type:** application/json; charset=utf-8

**Description:** 分组验证1

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|主键id|false|-
name|string|名称|false|-
mobile|string|电话|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/validator/save? --data '{
	"id":409,
	"name":"明.陈",
	"mobile":"15525817715"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"waring":"You may have used non-display generics."
	},
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

### 分组验证2
**URL:** http://127.0.0.1:8080/validator/update

**Type:** POST

**Author:** yu 2018/06/28.

**Content-Type:** application/json; charset=utf-8

**Description:** 分组验证2

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|主键id|false|-
name|string|名称|false|-
mobile|string|电话|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/validator/update? --data '{
	"id":202,
	"name":"明.陈",
	"mobile":"15525817715"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"waring":"You may have used non-display generics."
	},
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

### 分组验证3
**URL:** http://127.0.0.1:8080/validator/login

**Type:** POST

**Author:** yu 2018/06/28.

**Content-Type:** application/json; charset=utf-8

**Description:** 分组验证3

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
id|int64|主键id|false|-
name|string|名称|false|-
mobile|string|电话|true|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/validator/login? --data '{
	"id":85,
	"name":"明.陈",
	"mobile":"15525817715"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"waring":"You may have used non-display generics."
	},
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

### 分页查询
**URL:** http://127.0.0.1:8080/validator/list

**Type:** POST

**Author:** yu 2018/06/28.

**Content-Type:** application/json; charset=utf-8

**Description:** 分页查询

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/validator/list? --data '{
	
}'
```

**Response-example:**
```
{
	
}
```

## xss拦击测试
### xss过滤普通post请求
**URL:** http://127.0.0.1:8080/xss/text

**Type:** POST

**Author:** yu 2019/1/20.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** xss过滤普通post请求

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
text|string|请求文本|false|-

**Request-example:**
```
curl -X POST -H 'token:kk' -i http://127.0.0.1:8080/xss/text --data 'text=qi77jn'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"t85t6u",
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

### xss过滤get请求
**URL:** http://127.0.0.1:8080/xss/query

**Type:** GET

**Author:** yu 2019/1/20.

**Content-Type:** application/x-www-form-urlencoded;charset=utf-8

**Description:** xss过滤get请求

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Query-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
query|string|请求参数|false|-

**Request-example:**
```
curl -X GET -H 'token:kk' -i http://127.0.0.1:8080/xss/query?query=udtuyk
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":"wzrm1g",
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```

### xss过滤json数据
**URL:** http://127.0.0.1:8080/xss/json

**Type:** POST

**Author:** yu 2019/1/20.

**Content-Type:** application/json; charset=utf-8

**Description:** xss过滤json数据

**Request-headers:**

Header | Type|Description|Required|Since
---|---|---|---|----
token|string|desc|false|-


**Body-parameters:**

Parameter | Type|Description|Required|Since
---|---|---|---|---
age|int32|No comments found.|false|-
name|string|姓名|false|-

**Request-example:**
```
curl -X POST -H 'Content-Type: application/json; charset=utf-8' -H 'token:kk' -i http://127.0.0.1:8080/xss/json? --data '{
	"age":24,
	"name":"明.陈"
}'
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
success|boolean|是否成功|-
message|string|错误提示(成功succeed)|-
data|object|成功返回的数据|-
└─age|int32|No comments found.|-
└─name|string|姓名|-
code|string|错误代码|-
timestamp|string|响应时间|-

**Response-example:**
```
{
	"success":true,
	"message":"success",
	"data":{
		"age":24,
		"name":"明.陈"
	},
	"code":"6689",
	"timestamp":"2020-12-27 01:05:23"
}
```


